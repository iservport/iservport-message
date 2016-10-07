package com.iservport.message.domain

/**
  * Contact data.
  *
  * @param contactEmail
  * @param contactName
  * @param entityName
  * @param address
  */
case class ContactData(contactEmail: String, contactName: String, entityName: String = "", address: String = "")
