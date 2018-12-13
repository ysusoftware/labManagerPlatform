package org.software.ysu.pojo;

/**
 * @author Erisu
 * @date 2018/12/13 10:53
 * @Description layuiResponse封装
 * @Version 1.0
 **/
public class layuiResponse {
    private String code;
    private String msg;
    private Object data;

    public layuiResponse(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
