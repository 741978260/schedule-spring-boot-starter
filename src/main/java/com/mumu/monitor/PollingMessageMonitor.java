package com.mumu.monitor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2020/7/12
 */
@Slf4j
@Component
public class PollingMessageMonitor {
    @StreamListener(Sink.INPUT)
    public void process(Message<String> message) {
        String payload = message.getPayload();
        System.out.println(String.format("消费polling队列消息成功%s", payload));
    }
}
