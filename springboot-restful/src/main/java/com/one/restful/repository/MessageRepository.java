package com.one.restful.repository;

import com.one.restful.domain.Message;

import java.util.List;

/**
 * ${DESCRIPTION}
 * One on 2019-03-16.
 */
public interface MessageRepository {
    List<Message> findAll();

    Message save(Message message);

    Message update(Message message);

    Message updateText(Message message);

    Message findMessage(Long id);

    void deleteMessage(Long id);

}
