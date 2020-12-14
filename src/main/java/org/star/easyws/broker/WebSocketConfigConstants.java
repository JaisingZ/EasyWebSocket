package org.star.easyws.broker;

/**
 * @author Jaising
 * @description WebSocket Config Constant
 * @date 2020/12/14
 */
public class WebSocketConfigConstants {

    /**
     * Default Endpoint
     */
    public static final String DEFAULT_ENDPOINT = "/";

    /**
     * Default Allow Origins
     */
    public static final String DEFAULT_ALLOW_ORIGINS = "*";

    /**
     * Point-2-point Communication Model Proxy Destination Prefix
     */
    public static final String POINT_2_POINT_PROXY_PREFIXES = "/user";

    /**
     * Broadcast Communication Model Proxy Destination Prefix
     */
    public static final String BROADCAST_PROXY_PREFIXES = "/topic";
}
