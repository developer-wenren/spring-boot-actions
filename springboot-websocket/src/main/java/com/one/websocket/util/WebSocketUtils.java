package com.one.websocket.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author One
 * @description
 * @date 2019/03/16
 */
public class WebSocketUtils {
    public static final Map<String, Session> ONLINE_USER_SESSIONS = new ConcurrentHashMap<>();

    private static Logger logger = LoggerFactory.getLogger(WebSocketUtils.class);

    public static void sendMessage(Session session, String message) {
        if (session == null) {

            return;
        }
        final RemoteEndpoint.Basic basic = session.getBasicRemote();
        if (basic == null) {

            return;
        }
        try {

            basic.sendText(message);
        } catch (IOException e) {
            logger.error("sendMessage IOException ", e);
        }

    }

    public static void sendMessageAll(String message) {

        ONLINE_USER_SESSIONS.forEach((sessionId, session) -> sendMessage(session, message));
    }
}
