package com.mumu.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.binder.PollableMessageSource;
import org.springframework.messaging.MessageChannel;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2020/7/15
 */
public interface FiveMinutesChannel {
    /**
     * 输出通道
     *
     * @return 输出
     */
    @Output(Channels.FiveMinutes.OUTPUT)
    MessageChannel output();

    /**
     * 输入通道
     *
     * @return 输出
     */
    @Input(Channels.FiveMinutes.INPUT)
    PollableMessageSource input();
}
