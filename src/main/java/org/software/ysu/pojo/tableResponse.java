package org.software.ysu.pojo;

import lombok.Data;

/**
 * @author Erisu
 * @date 2018/12/14 16:27
 * @Description 表格的响应信息
 * @Version 1.0
 **/
@Data
public class tableResponse extends layuiResponse{
    private int count;
    public tableResponse(String code, String msg,int count, Object data) {
        super(code, msg, data);
        this.count=count;
    }

    @Override
    public String toString() {
        return "tableResponse{" +
                "count=" + count +
                '}';
    }
}
