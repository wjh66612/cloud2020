package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * TODO
 * Date: 2021-03-07
 *
 * @author: 漂泊
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息..global..CustomerBlockHandler");
    }
    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理信息..global..CustomerBlockHandler");
    }
}
