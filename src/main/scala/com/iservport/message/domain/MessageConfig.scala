package com.iservport.message.domain

/**
  * Message configuration
  */
case class MessageConfig
(subject: String = ""
 , title: String = ""
 , procedure: String = ""
 , callToAction: String = ""
 , fallBack: String = ""
 , trailingInfo: String = ""
)
