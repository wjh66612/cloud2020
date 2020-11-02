package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author PiaoBo
 * @create 2020-11-01 19:13
 */
@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id){
        return "线程池"+Thread.currentThread().getName()+"  paymentinfo_OK,id:  "+id;
    }

    public String paymentInfo_TimeOut(Integer id)  {
        int timeNumber=3;
       try {
           TimeUnit.SECONDS.sleep(3);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
        return "线程池"+Thread.currentThread().getName()+"  paymentinfo_OK,id:  "+id+"\t"+" 耗时(秒)"+timeNumber;
    }

}
