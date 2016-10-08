package com.iservport.message.domain

/**
  * Contact data.
  *
  * @param contactEmail
  * @param contactName
  * @param entityName
  * @param imageUrl
  * @param address
  */
case class ContactData(contactEmail: String, contactName: String, entityName: String = "", imageUrl: String = "", address: String = "")
