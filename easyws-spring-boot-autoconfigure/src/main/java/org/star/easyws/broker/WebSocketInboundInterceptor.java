package org.star.easyws.broker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.stereotype.Component;

/**
 * @author Jaising
 * @description WebSocket Inbound Interceptor
 * @date 2020/12/14
 */
@Slf4j
@Component
public class WebSocketInboundInterceptor implements ChannelInterceptor {

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        String simpSessionId = String.valueOf(message.getHeaders().get("simpSessionId"));
        log.info("Receive a client connect, simpSessionId:{}", simpSessionId);
        return null;
    }
}
