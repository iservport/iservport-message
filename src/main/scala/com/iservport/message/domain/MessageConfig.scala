package com.iservport.message.domain

import scala.beans.BeanProperty

/**
  * Message configuration
  */
case class MessageConfig
( @BeanProperty subject: String = ""
 , @BeanProperty title: String = ""
 , @BeanProperty procedure: String = ""
 , @BeanProperty callToAction: String = ""
 , @BeanProperty fallBack: String = ""
 , @BeanProperty trailingInfo: String = ""
)
