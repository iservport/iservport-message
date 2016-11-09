package com.iservport.message.domain;

import lombok.Data;

import java.util.UUID;

/**
 * Simple message.
 */
@Data
public class Message {

    private ContactData sender;
    private ContactData recipient;
    private String servicePath;
    private MessageData messageData = new MessageData();
    private MessageDefaults defaults = new MessageDefaults();
    private String id = UUID.randomUUID().toString().replaceAll("-", "");
    private String template = "4853b17b-e5f2-4b8f-b313-7067088fb3c5";

}
