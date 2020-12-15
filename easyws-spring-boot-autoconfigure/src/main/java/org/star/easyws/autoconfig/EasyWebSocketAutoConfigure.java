package org.star.easyws.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author Jaising
 * @description EasyWebSocket Configure
 * @date 2020/12/14
 */
@Configuration
@ConditionalOnClass(EasyWebSocketService.class)
@EnableConfigurationProperties(EasyWebSocketProperties.class)
public class EasyWebSocketAutoConfigure {

    @Resource
    private EasyWebSocketProperties easyWebSocketProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "easy.websocket", value = "enabled", havingValue = "true")
    EasyWebSocketService easyWebSocketService() {
        return new EasyWebSocketService(
                easyWebSocketProperties.getEndpoint(),
                easyWebSocketProperties.getAllowOrigins()
        );
    }
}
