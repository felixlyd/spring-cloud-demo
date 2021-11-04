package com.example.demo29sentinel.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.demo29sentinel.service.ChainService;
import org.springframework.stereotype.Service;

/**
 * class ChainServiceImpl
 *
 * @author : liuyaodong
 * @date 2021/11/3
 */
@Service
public class ChainServiceImpl implements ChainService {
    @Override
    @SentinelResource("chainTest")
    public void chainTest(){
        System.out.println("测试链路情况");
    }
}
