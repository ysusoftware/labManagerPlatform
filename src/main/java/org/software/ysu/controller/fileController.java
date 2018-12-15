package org.software.ysu.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author Erisu
 * @date 2018/12/13 10:17
 * @Description 有关文件的操作
 * @Version 1.0
 **/
public class fileController {
    static public String serverPicUrl="http://47.105.187.18/pictures/";
    static public String uploadFile(String baseUrl,MultipartFile file) {
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
        fileName=fileName.insert(0,baseUrl+'/');
        System.out.println(fileName.toString());
        Client client = new Client();
        WebResource webresource = client.resource(serverPicUrl + fileName.toString());

        try {
            webresource.put(String.class, file.getBytes());
        } catch (UniformInterfaceException | ClientHandlerException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return fileName.toString();
    }
}
