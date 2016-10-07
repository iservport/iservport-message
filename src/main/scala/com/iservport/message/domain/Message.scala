package com.iservport.message.domain

import java.util.UUID

case class Message
( sender: ContactData
, recipient: ContactData
, config: MessageConfig = MessageConfig("")) {

  val id = UUID.randomUUID().toString.replaceAll("-", "")

  val template = "4853b17b-e5f2-4b8f-b313-7067088fb3c5"

  val getSenderEmail = sender.contactEmail

  val getSenderName = sender.contactName

  val headers: Map[String, String] = Map("template_id" -> template
    , "${recipientEmail}" -> recipient.contactEmail
    , "${title}" -> config.title
    , "${recipientFirstName}" -> recipient.contactName
    , "${entityName}" -> recipient.entityName
    , "${callBackUri}" -> config.callBackUri
    , "${greeting}" -> config.greeting
    , "${procedure}" -> config.procedure
    , "${actionCaption}" -> config.actionCaption
    , "${actionUri}" -> config.actionUri
    , "${fallBack}" -> config.fallBack
  )

  val getBody = s"${config.apiUrl}/static/template/${template}?logId=${id}"

}

