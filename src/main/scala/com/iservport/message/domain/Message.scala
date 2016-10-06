package com.iservport.message.domain

case class Message
( subject: String
, senderEmail: String
, senderName: String
, recipientEmail: String
, recipientFirstName: String
, title: String = "Title"
, entityName: String = "entityName"
, callBackUri: String = "localhost"
, onlineCaption: String = "See on-line"
, greeting: String = "Hello, "
, procedure: String = "Please, do something."
, actionCaption: String = "Use this button"
, actionUri: String = "localhost/doit"
, fallBack: String = "Otherwise"
, trailingInfo: String = "") {

  val template = "4853b17b-e5f2-4b8f-b313-7067088fb3c5"

  val headers: Map[String, String] = Map("template_id" -> template
    , "${recipientEmail}" -> recipientEmail
    , "${title}" -> title
    , "${recipientFirstName}" -> recipientFirstName
    , "${entityName}" -> entityName
    , "${callBackUri}" -> callBackUri
    , "${greeting}" -> greeting
    , "${procedure}" -> procedure
    , "${actionCaption}" -> actionCaption
    , "${actionUri}" -> actionUri
    , "${fallBack}" -> fallBack
  )

}

