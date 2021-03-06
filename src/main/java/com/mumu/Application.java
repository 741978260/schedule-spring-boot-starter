package com.mumu;

import com.mumu.channel.FiveMinutesChannel;
import com.mumu.channel.OneMinuteChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2020/7/12
 */
@EnableBinding({Sink.class, FiveMinutesChannel.class, OneMinuteChannel.class})
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
