package com.atguigu.springcloud.alibaba.service;

/**
 * TODO
 * Date: 2021-03-09
 *
 * @author: 漂泊
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}
