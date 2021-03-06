package org.example.felixlyd.demo03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * class propertyTests
 *
 * @author : liuyaodong
 * @date 2021/9/27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class propertyTests {
    @Value("${age}")
    private int age;
    @Value("${name}")
    private String name;
    @Test
    public void getAge(){
        System.out.println(age);
    }
    @Test
    public void getName(){
        System.out.println(name);
    }
    @Autowired
    private GetPersonInfoProperties getPersonInfoProperties;
    @Test
    public void getPersonProperties(){
        System.out.println(getPersonInfoProperties.getName()+getPersonInfoProperties.getAge());
    }
}
