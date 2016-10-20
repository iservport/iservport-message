package com.iservport.message.domain

import java.util.UUID

import scala.beans.BeanProperty

/**
  * Message domain.
  *
  * @param sender
  * @param recipient
  * @param servicePath
  * @param config
  * @param defaults
  * @param id
  * @param template
  * @param attachments
  */
case class Message
( @BeanProperty sender: ContactData
, @BeanProperty recipient: ContactData
, @BeanProperty servicePath: String
, @BeanProperty config: MessageConfig = MessageConfig()
, @BeanProperty defaults: MessageDefaults = MessageDefaults()
, @BeanProperty id: String = UUID.randomUUID().toString.replaceAll("-", "")
, @BeanProperty template: String = "4853b17b-e5f2-4b8f-b313-7067088fb3c5"
, @BeanProperty attachments: java.util.List[MessageAttachment] = new java.util.ArrayList[MessageAttachment]()
) {

  def add(attachment: MessageAttachment) = attachments.add(attachment)

}

