package com.mediaai.javamiaosha.backend.service.impl;

import com.mediaai.javamiaosha.backend.mq.MQProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MqProducerTest {
    @Autowired
    private MQProducer mqProducer;

    @Test
    public void sendMessage() {
        for (int i=0;i<5;i++){
//            mqProducer.send("这是秒杀消息"+i);
        }
    }
}