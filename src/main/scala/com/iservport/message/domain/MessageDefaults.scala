package com.iservport.message.domain

/**
  * Message defaults.
  */
case class MessageDefaults
(greeting: String = "Hello, "
 , apiHome: String = "https://localhost:8443"
 , seeOnline: String = "See on-line"
 , sentByText: String = "Sent by "
 , disclaimer: String = ""
 , unsubscribeText: String = ""
 , unsubscribeCaption: String = ""
 , unsubscribeService: String = "unsubscribe"
 , ensure: String = ""
 , copyright: String = ""
)
