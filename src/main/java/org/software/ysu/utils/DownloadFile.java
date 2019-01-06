//package org.software.ysu.utils;
//
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.WebResource;
//import org.apache.commons.io.IOUtils;
//import org.ysu.ems.pojo.FilePathUrl;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLConnection;
//import java.util.List;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipOutputStream;
//
///**
// * Created by 韩建国 on 2018/8/29
// * 用于下载文件
// */
//public class DownloadFile {
//
//
//
//    /*用于单文件下载
//     * fileUrl 服务器上文件名 oldName 文件原名
//     * whichUrl 选择服务器地址 1 用于老师上传文件夹，2 用于学生上传文件夹
//     *
//     */
//    public static void downloadOne(HttpServletResponse response, String fileUrl, String oldName)
//            throws Exception {
//
//        String fileName = new String();
//        fileName=fileUrl;
//
//        System.out.println("fileName:" + fileName + ":");
//
//        BufferedInputStream bis = null;
//        OutputStream out = null;
//        // 建立链接
//        URL url = new URL(fileName);
//        HttpURLConnection httpUrl = (HttpURLConnection) url.openConnection();
//        // 连接指定的资源
//        httpUrl.connect();
//
//        // 获取网络输入流
//        bis = new BufferedInputStream(httpUrl.getInputStream());
//        response.reset();
//        //返回二进制流
//        response.setContentType("application/octet-stream");
//        //告诉浏览器是下载而不是打开该文件
//        response.setHeader("Content-Disposition", "attachment; filename="
//                + new String( oldName.getBytes("gb2312"), "ISO8859-1" ));
//        out = response.getOutputStream();
//        byte[] buf = new byte[1024];
//        int len = 0;
//        while ((len = bis.read(buf)) > 0) {
//            out.write(buf, 0, len);
//        }
//        out.flush();
//        if (null != bis) {
//            bis.close();
//        }
//        if (null != out) {
//            out.close();
//        }
//    }
//
//    /*用于多文件下载，会将各个文件打成压缩包下载
//     * urlList 服务器上文件名的List  nameList 文件原名的List
//     * whichUrl 选择服务器地址 1 用于老师上传文件夹，2 用于学生上传文件夹
//     *
//     */
////    public static void downloadAll(HttpServletResponse response, List<String> urlList, List<String> nameList, int whichUrl) throws IOException {
////
////        //需要下载的文件地址
////        //URL url = new URL("http://172.18.0.27/group1/M00/00/00/rBIAF1tw-L6AYGL6AABrIJOsf0c576.jpg");
////        // URL url2 = new URL("http://172.18.0.27/group1/M00/00/00/rBIAF1tw-L6AYGL6AABrIJOsf0c576.jpg");
////
////        //存入压缩包，fileName为压缩包文件名
////        String fileName = "资料.zip";
////       // response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
////        response.addHeader("Content-Disposition", "attachment; filename=\"" + new String( fileName.getBytes("gb2312"), "ISO8859-1" ) + "\"");
////        ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());
////        BufferedOutputStream bos = new BufferedOutputStream(zos);
////
////        for (int i = 0; i < urlList.size(); i++) {
////            String fileNamee = new String();
////            if (whichUrl == 1) {
////                fileNamee = URLTEA + urlList.get(i);
////            } else if (whichUrl == 2) {
////                fileNamee = URLSTU + urlList.get(i);
////            }
////            URL url = new URL(fileNamee);
////            URLConnection conn = url.openConnection();
////            InputStream inputStream = conn.getInputStream();
////            BufferedInputStream bis = new BufferedInputStream(inputStream);
////            zos.putNextEntry(new ZipEntry(nameList.get(i)));
////            IOUtils.copy(bis, bos);
////            bis.close();
////            bos.flush();
////        }
////        bos.close();
////    }
//
//    //测试删除服务器文件
//    //需启动Tomcat使用此方法
//    //测试删除文件，该方法可用
//   /* @RequestMapping("delete.do")
//    public String delete(){
//        DownloadFile.deleteFile("B.txt");
//        return "qqqqqq";
//    }*/
//    public static void deleteFile(String url,Integer c) {
//       String urlp="";
//        if(c==1){
//            //老师
//            urlp=URLTEA+url;
//        }else {
//            //学生
//            urlp=URLSTU + url;
//        }
//        Client client = new Client();
//        WebResource webResource = client.resource(urlp);
//        webResource.delete(urlp);
//
//    }
//
//    public static void main(String[] args) {
//       // deleteFile("B.txt");
//    }
//
//
//}
