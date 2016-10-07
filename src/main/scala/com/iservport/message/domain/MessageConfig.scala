package com.iservport.message.domain

/**
  * Created by mauriciofernandesdecastro on 06/10/16.
  */
case class MessageConfig
(subject: String
 , title: String = "Title"
 , callBackUri: String = "localhost"
 , onlineCaption: String = "See on-line"
 , greeting: String = "Hello, "
 , procedure: String = "Please, do something."
 , actionCaption: String = "Use this button"
 , actionUri: String = "localhost/doit"
 , fallBack: String = "Otherwise"
 , trailingInfo: String = "")
