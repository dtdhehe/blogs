package com.dtdhehe.blogs.vo;

import lombok.Data;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/4 22:10
 * @description
 **/
@Data
public class ResultVO {

    private Integer code;

    private String msg;

    private Object obj;

    public ResultVO() {
    }

    public ResultVO(Integer code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }
}
