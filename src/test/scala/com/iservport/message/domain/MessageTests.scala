package com.iservport.message.domain

import org.scalatest.{FlatSpec, Matchers}


class MessageTests extends FlatSpec with Matchers {

  "Message headers" should "not contain empty fields" in {
    val message = Message(ContactData("a", "b"), ContactData("c", "d"), "service")
    message.headers should not contain key ("${title}")
    message.headers should not contain key ("${fallBack}")
    message.headers should not contain key ("${trailingInfo}")
    val other = message.copy(config=MessageConfig("s", "t", "p", "a", "f", "t"))
    other.headers should contain key ("${fallBack}")
    other.headers should contain key ("${trailingInfo}")
  }

}
