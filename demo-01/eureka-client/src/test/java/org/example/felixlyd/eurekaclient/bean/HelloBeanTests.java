package org.example.felixlyd.eurekaclient.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * class HelloBeanTests
 *
 * @author : liuyaodong
 * @date 2021/9/27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloBeanTests {
    @Autowired
    private HelloBean helloBean;
    @Test
    public void getName(){
        System.out.println(helloBean.getName());
    }
    @Test
    public void getPort(){
        System.out.println(helloBean.getPort());
    }
}
