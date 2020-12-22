package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author PiaoBo
 * @create 2020-11-01 19:13
 */
@Service
public class PaymentService {
    /**
     * 正常访问，肯定ok
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池"+Thread.currentThread().getName()+"  paymentinfo_OK,id:  "+id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })//服务降级
    public String paymentInfo_TimeOut(Integer id)  {
        //int age=10/0; //运行报错降级
        //超时降级
       try { TimeUnit.MILLISECONDS.sleep(3000); }catch (InterruptedException e){ e.printStackTrace(); }
        return "线程池"+Thread.currentThread().getName()+"  paymentinfo_OK,id:  "+id+"\t"+" 耗时(秒)";
    }
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池"+Thread.currentThread().getName()+"  8001系统繁忙或运行报错，请稍后再试(paymentInfo_TimeOutHandler),id:  "+id+"\t";
    }
}
