package org.star.easyws.broker;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.stereotype.Component;

/**
 * @author Jaising
 * @description WebSocket Inbound Interceptor
 * @date 2020/12/14
 */
@Component
public class WebSocketInboundInterceptor implements ChannelInterceptor {

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        return null;
    }
}
