package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author PiaoBo
 * @create 2020-11-03 23:32
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut";
    }
}
