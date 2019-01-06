package org.software.ysu.controller;

import com.alibaba.fastjson.JSONObject;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpRequestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Erisu
 * @date 2018/12/13 10:17
 * @Description 有关文件的操作
 * @Version 1.0
 **/
public class fileController {
    static public String serverPicUrl = "http://47.105.187.18/pictures/";

    static public String uploadFile(String baseUrl, MultipartFile file) {
        System.out.println(file.getOriginalFilename());
        //定义文件名
        StringBuilder fileName = new StringBuilder();
        //重命名规则   时间戳   年月日时分秒毫秒+4位随机数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        //获取当前日期和时间
        Date date = new Date();
        //当前日期和时间转换成指定的字符串格式
        fileName.append(sdf.format(date));
        //拼接4位随机数
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            fileName.append(String.valueOf(rd.nextInt(10)));
        }
        //获取文件的后缀名
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        //最后拼接文件的扩展名
        fileName.append(".").append(extension);
        fileName = fileName.insert(0, baseUrl + '/');
        System.out.println(fileName.toString());
        Client client = new Client();
        WebResource webresource = client.resource(serverPicUrl + fileName.toString());
        try {
            webresource.put(String.class, file.getBytes());
        } catch (UniformInterfaceException | ClientHandlerException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return serverPicUrl+fileName.toString();
    }

    static public void delFile(String url) {
        Client client = new Client();
        WebResource webresource = client.resource( url);
        webresource.delete(url);
    }
    static public void showFile(String baseUrl){
//        Client client = new Client();
//        WebResource webresource = client.resource(serverPicUrl + url);
//        webresource.get(serverPicUrl + url);
    }
    static String kindlResponse(String fileUrl){
        JSONObject json = new JSONObject();
        if (fileUrl != null) {
            json.put("error", 0);
            json.put("url",  fileUrl);
        } else {
            json.put("error", 1);
            json.put("message", "上传错误");
        }
        return json.toJSONString();

    }
    static String dealStr(String str) {
        StringBuilder pathString = new StringBuilder(str);
        int img1=-1;
        while(pathString.indexOf("<img",img1+1)!=-1) {
            img1 = pathString.indexOf("<img",img1+1);
            int src1=pathString.indexOf("src",img1);
            int doubleYin=pathString.indexOf("\"",src1);
            if(pathString.charAt(doubleYin+1)=='h'&&pathString.charAt(doubleYin+5)==':') {
                continue;
            }
            if(pathString.charAt(doubleYin+1)!='/') {
                pathString.insert(doubleYin+1, "http://47.105.187.18/");
            }
            else {
                pathString.insert(doubleYin+1, "http://47.105.187.18");
            }
        }
        return pathString.toString();
    }
    public static void downloadOne(HttpServletResponse response, String fileUrl, String oldName)
            throws Exception {

        String fileName = new String();
        fileName=fileUrl;

        System.out.println("fileName:" + fileName + ":");

        BufferedInputStream bis = null;
        OutputStream out = null;
        // 建立链接
        URL url = new URL(fileName);
        HttpURLConnection httpUrl = (HttpURLConnection) url.openConnection();
        // 连接指定的资源
        httpUrl.connect();

        // 获取网络输入流
        bis = new BufferedInputStream(httpUrl.getInputStream());
        response.reset();
        //返回二进制流
        response.setContentType("application/octet-stream");
        //告诉浏览器是下载而不是打开该文件
        response.setHeader("Content-Disposition", "attachment; filename="
                + new String( oldName.getBytes("gb2312"), "ISO8859-1" ));
        out = response.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = bis.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        out.flush();
        if (null != bis) {
            bis.close();
        }
        if (null != out) {
            out.close();
        }
    }

    /*用于多文件下载，会将各个文件打成压缩包下载
     * urlList 服务器上文件名的List  nameList 文件原名的List
     * whichUrl 选择服务器地址 1 用于老师上传文件夹，2 用于学生上传文件夹
     *
     */
    public static void downloadAll(HttpServletResponse response, List<String> urlList, List<String> nameList, int whichUrl) throws IOException {

        //需要下载的文件地址
        //URL url = new URL("http://172.18.0.27/group1/M00/00/00/rBIAF1tw-L6AYGL6AABrIJOsf0c576.jpg");
        // URL url2 = new URL("http://172.18.0.27/group1/M00/00/00/rBIAF1tw-L6AYGL6AABrIJOsf0c576.jpg");

        //存入压缩包，fileName为压缩包文件名
        String fileName = "资料.zip";
       // response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        response.addHeader("Content-Disposition", "attachment; filename=\"" + new String( fileName.getBytes("gb2312"), "ISO8859-1" ) + "\"");
        ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());
        BufferedOutputStream bos = new BufferedOutputStream(zos);

        for (int i = 0; i < urlList.size(); i++) {
            String fileNamee = new String();
            fileNamee=urlList.get(i);
            URL url = new URL(fileNamee);
            URLConnection conn = url.openConnection();
            InputStream inputStream = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            zos.putNextEntry(new ZipEntry(nameList.get(i)));
            IOUtils.copy(bis, bos);
            bis.close();
            bos.flush();
        }
        bos.close();
    }

   /*
   文件删除（清理服务器无效缓存）
    */
    public static void deleteFile(String url,Integer c) {
        String urlp="";
        urlp=url;
        Client client = new Client();
        WebResource webResource = client.resource(urlp);
        webResource.delete(urlp);
    }


}
