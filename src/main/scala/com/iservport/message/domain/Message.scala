package com.iservport.message.domain

import java.util.UUID

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
( sender: ContactData
, recipient: ContactData
, servicePath: String
, config: MessageConfig = MessageConfig()
, defaults: MessageDefaults = MessageDefaults()) {

  val id = UUID.randomUUID().toString.replaceAll("-", "")

  val template = "4853b17b-e5f2-4b8f-b313-7067088fb3c5"

  val getSenderEmail = sender.contactEmail

  val getSenderName = sender.contactName

  val headers: Map[String, String] = Map("template_id" -> template
    , "${senderEmail}" -> sender.contactEmail
    , "${senderName}" -> sender.contactName
    , "${senderImageUrl}" -> sender.imageUrl
    , "${recipientEmail}" -> recipient.contactEmail
    , "${title}" -> config.title
    , "${recipientFirstName}" -> recipient.contactName
    , "${entityName}" -> recipient.entityName
    , "${greeting}" -> defaults.greeting
    , "${procedure}" -> config.procedure
    , "${callToAction}" -> config.procedure
    , "${fallBack}" -> config.fallBack
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
  )

  val getBody = s"${defaults.apiHome}/static/template/${template}?logId=${id}"

}

