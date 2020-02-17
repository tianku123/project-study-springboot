package com.rh.xmlconfig;

import com.rh.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  spring 1.x时代：xml配置
 */
public class XmlConfigBootstrap {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
        applicationContext.close();

//        DefaultListableBeanFactory defaultListableBeanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
//        User user = defaultListableBeanFactory.getBean(User.class);
//        System.out.println(user);
    }
}
