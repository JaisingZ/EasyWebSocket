package org.star.easyws.autoconfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.star.easyws.broker.WebSocketConfigConstants;

/**
 * @author Jaising
 * @description EasyWebSocket Properties Load Service
 * @date 2020/12/14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EasyWebSocketService {

    /**
     * For more details about args, see {@link WebSocketConfigConstants}
     */
    private String endpoint;
    private String allowOrigins;
}
