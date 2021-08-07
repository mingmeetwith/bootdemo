package com.wm.demo.chapter3.config;

//import com.wm.demo.chapter3.pojo.User;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.wm.demo.chapter3.pojo.definition","com.wm.demo.chapter3.scope"})
public class AppConfig {
//    @Bean(name = "user")
//    public User initUser(){
//        User user = new User();
//        user.setId(2L);
//        user.setUserName("user_name_1");
//        user.setNote("note_1");
//        return user;
//    }
//
//    @Bean(name = "user")
//    public User initUser2(){
//        User user = new User();
//        user.setId(1L);
//        user.setUserName("user_name_1");
//        user.setNote("note_1");
//        return user;
//    }
}
