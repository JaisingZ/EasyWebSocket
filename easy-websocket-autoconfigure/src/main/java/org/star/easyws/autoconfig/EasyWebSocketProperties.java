package org.star.easyws.autoconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.star.easyws.broker.WebSocketConfigConstants;

/**
 * @author Jaising
 * @description EasyWebSocket Properties Support
 * @date 2020/12/14
 */
@Data
@ConfigurationProperties("easy.websocket")
public class EasyWebSocketProperties {

    /**
     * For more details about args, see {@link WebSocketConfigConstants}
     */
    private String endpoint;
    private String allowOrigins;
}
