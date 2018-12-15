package org.software.ysu.pojo;

/**
 * @author Erisu
 * @date 2018/12/14 16:27
 * @Description 表格的响应信息
 * @Version 1.0
 **/
public class tableResponse extends layuiResponse{
    private int count;
    public tableResponse(String code, String msg,int count, Object data) {
        super(code, msg, data);
        this.count=count;
    }
}
