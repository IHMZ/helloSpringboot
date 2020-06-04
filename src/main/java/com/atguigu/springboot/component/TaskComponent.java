package com.atguigu.springboot.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TaskComponent {

//    定时任务，作为一个组件，随服务器启动而启动
//    @Scheduled(fixedDelay = 3000)
//    public void schedulingTest(){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(simpleDateFormat.format(new Date()));
//    }
}
