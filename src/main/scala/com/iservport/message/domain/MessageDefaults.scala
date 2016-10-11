package com.iservport.message.domain

import scala.beans.BeanProperty

/**
  * Message defaults.
  */
case class MessageDefaults
(@BeanProperty greeting: String = "Hello, "
 , @BeanProperty apiHome: String = "https://localhost:8443"
 , @BeanProperty seeOnline: String = "See on-line"
 , @BeanProperty sentByText: String = "Sent by "
 , @BeanProperty disclaimer: String = ""
 , @BeanProperty unsubscribeText: String = ""
 , @BeanProperty unsubscribeCaption: String = ""
 , @BeanProperty unsubscribeService: String = "unsubscribe"
 , @BeanProperty ensure: String = ""
 , @BeanProperty copyright: String = ""
)
