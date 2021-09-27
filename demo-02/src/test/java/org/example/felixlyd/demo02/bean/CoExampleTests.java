package org.example.felixlyd.demo02.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * class CoExampleTests
 *
 * @author : liuyaodong
 * @date 2021/9/27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CoExampleTests {
    @Autowired
    private CoExample coExample;
    @Test
    public void getName(){
        System.out.println(coExample.getName());
    }
    @Test
    public void getAge(){
        System.out.println(coExample.getAge());
    }
    @Test
    public void getAddress(){
        System.out.println(coExample.getAddress());
    }
}
