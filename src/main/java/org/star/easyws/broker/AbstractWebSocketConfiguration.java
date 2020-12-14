package org.star.easyws.broker;

import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author Jaising
 * @description Abstract WebSocket Config
 * @date 2020/12/14
 */
public abstract class AbstractWebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

    @Override
    public abstract void registerStompEndpoints(StompEndpointRegistry registry);

    @Override
    public abstract void configureMessageBroker(MessageBrokerRegistry registry);

    @Override
    public abstract void configureClientInboundChannel(ChannelRegistration registration);
}
