package org.software.ysu.pojo;

import lombok.Data;

/**
 * @author Erisu
 * @date 2018/12/14 16:31
 * @Description 分页需要传入的数据
 * @Version 1.0
 **/
@Data
public class Page {
    private Integer page;
    private Integer limit;
    private String condition;
    private String context;
    private Integer withPage=0;

    @Override
    public String toString() {
        return "Page{" +
                "page=" + page +
                ", limit=" + limit +
                ", condition='" + condition + '\'' +
                ", context='" + context + '\'' +
                ", withPage=" + withPage +
                '}';
    }
}
