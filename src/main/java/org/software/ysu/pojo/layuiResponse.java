package org.software.ysu.pojo;

import lombok.Data;

/**
 * @author Erisu
 * @date 2018/12/13 10:53
 * @Description layuiResponse封装
 * @Version 1.0
 **/
@Data
public class layuiResponse {
    private String code;
    private String msg;
    private Object data;

    public layuiResponse(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "layuiResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
