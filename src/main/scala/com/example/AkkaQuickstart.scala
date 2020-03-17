//#full-example
package com.example

import com.typesafe.config.ConfigFactory

//#main-class
object AkkaQuickstart extends App {
  //#actor-system
  val config = ConfigFactory.load()
  println("test1: " + config.getString("test1"))
  println("test2: " + config.getString("test2"))
}
//#main-class
//#full-example
