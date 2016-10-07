package com.iservport.message.domain

/**
  * Message configuration
  */
case class MessageConfig
(subject: String
 , title: String = "Title"
 , apiHost: String = "localhost"
 , apiPort: Int = 8443
 , apiScheme: String = "https://"
 , onlineCaption: String = "See on-line"
 , greeting: String = "Hello, "
 , procedure: String = "Please, do something."
 , actionCaption: String = "Use this button"
 , fallBack: String = "Otherwise"
 , trailingInfo: String = ""
 , sentByText: String = "Sent by "
 , disclaimer: String = ""
 , unsubscribeText: String = "If you do not want to receive messages like this one, please "
 , unsubscribeCaption: String = "unsubscribe"
 , unsubscribeService: String = "unsubscribe")
