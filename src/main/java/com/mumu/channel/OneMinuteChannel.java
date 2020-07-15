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
public interface OneMinuteChannel {
    /**
     * 输出通道
     *
     * @return 输出
     */
    @Output(Channels.OneMinute.OUTPUT)
    MessageChannel output();

    /**
     * 输入通道
     *
     * @return 输出
     */
    @Input(Channels.OneMinute.INPUT)
    PollableMessageSource input();
}
