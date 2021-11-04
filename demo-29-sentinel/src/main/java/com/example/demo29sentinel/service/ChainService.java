package com.example.demo29sentinel.service;

import org.springframework.stereotype.Service;

/**
 * class ChainService
 *
 * @author : liuyaodong
 * @date 2021/11/3
 */
@Service
public interface ChainService {
    /**
     *  链路流控测试
     */
    void chainTest();
}
