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
  */
case class Message
( @BeanProperty sender: ContactData
, @BeanProperty recipient: ContactData
, @BeanProperty servicePath: String
, @BeanProperty config: MessageConfig = MessageConfig()
, @BeanProperty defaults: MessageDefaults = MessageDefaults()) {

  @BeanProperty val template = "4853b17b-e5f2-4b8f-b313-7067088fb3c5"

  @BeanProperty val attachments = new java.util.ArrayList[MessageAttachment]()

  def add(attachment: MessageAttachment) = attachments.add(attachment)

  val id = UUID.randomUUID().toString.replaceAll("-", "")

  val getSenderEmail = sender.contactEmail

  val getSenderName = sender.contactName

  val headers: Map[String, String] = Map("template_id" -> template
    , "${senderEmail}" -> sender.contactEmail
    , "${senderName}" -> sender.contactName
    , "${entityName}" -> sender.entityName
    , "${senderImageUrl}" -> sender.imageUrl
    , "${recipientEmail}" -> recipient.contactEmail
    , "${title}" -> config.title
    , "${recipientFirstName}" -> recipient.contactName
    , "${entityName}" -> recipient.entityName
    , "${greeting}" -> defaults.greeting
    , "${procedure}" -> config.procedure
    , "${callToAction}" -> config.callToAction
    , "${fallBack}" -> config.fallBack
    , "${trailingInfo}" -> config.trailingInfo
    , "${callBackUri}" -> s"${defaults.apiHome}/${servicePath}"
    , "${seeOnline}" -> defaults.seeOnline
    , "${sentByText}" -> defaults.sentByText
    , "${senderAddress}" -> sender.address
    , "${disclaimer}" -> defaults.disclaimer
    , "${unsubscribeText}" -> defaults.unsubscribeText
    , "${unsubscribeCaption}" -> defaults.unsubscribeCaption
    , "${unsubscribeUri}" -> s"${defaults.apiHome}/${defaults.unsubscribeService}"
    , "${ensure}" -> defaults.ensure
    , "${copyright}" -> defaults.copyright
  ).filter(_._2.nonEmpty)

  val getBody = s"${defaults.apiHome}/static/template/${template}?logId=${id}"

}

