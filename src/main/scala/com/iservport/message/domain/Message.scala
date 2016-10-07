package com.iservport.message.domain

import java.util.UUID

/**
  * Message domain.
  *
  * @param sender
  * @param recipient
  * @param servicePath
  * @param config
  */
case class Message
( sender: ContactData
, recipient: ContactData
, servicePath: String
, config: MessageConfig = MessageConfig("")) {

  val id = UUID.randomUUID().toString.replaceAll("-", "")

  val template = "4853b17b-e5f2-4b8f-b313-7067088fb3c5"

  val getSenderEmail = sender.contactEmail

  val getSenderName = sender.contactName

  val apiLocation = s"${config.apiScheme}${config.apiHost}:${config.apiPort}"

  val headers: Map[String, String] = Map("template_id" -> template
    , "${recipientEmail}" -> recipient.contactEmail
    , "${title}" -> config.title
    , "${recipientFirstName}" -> recipient.contactName
    , "${entityName}" -> recipient.entityName
    , "${callBackUri}" -> s"${apiLocation}/${servicePath}"
    , "${greeting}" -> config.greeting
    , "${procedure}" -> config.procedure
    , "${actionCaption}" -> config.actionCaption
    , "${actionUri}" -> config.actionUri
    , "${fallBack}" -> config.fallBack
  )

  val getBody = s"${apiLocation}/static/template/${template}?logId=${id}"

}

