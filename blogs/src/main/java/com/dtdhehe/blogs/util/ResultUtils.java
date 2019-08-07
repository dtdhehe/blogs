package com.dtdhehe.blogs.util;

import com.dtdhehe.blogs.vo.ResultVO;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/7 15:55
 * @description 返回工具类
 **/
public class ResultUtils {

    private static final Integer SUCCESS = 1;
    private static final Integer FAILED = 2;

    /**
     * 返回成功，带消息及数据
     * @param msg
     * @param object
     * @return
     */
    public static ResultVO success(String msg,Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(SUCCESS);
        resultVO.setMsg(msg);
        resultVO.setObj(object);
        return resultVO;
    }

    /**
     * 返回成功，带消息
     * @param msg
     * @return
     */
    public static ResultVO success(String msg){
        return success(msg, null);
    }

    /**
     * 返回成功
     * @return
     */
    public static ResultVO success(){
        return success(null, null);
    }

    /**
     * 返回失败
     * @param msg
     * @return
     */
    public static ResultVO failed(String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(FAILED);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
