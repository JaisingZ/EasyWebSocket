package org.star.easyws.broker;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Jaising
 * @description User-oriented Session Entity
 * @date 2020/12/14
 */
@Data
public class LocalSession implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * SessionId, equals with Spring-Websocket Simple
     */
    private String simpSessionId;

    /**
     * User Alias SessionId, qualifier a certain user
     */
    private String userCode;

    /**
     * Mark a Session online or not
     */
    public Boolean alive;
}
