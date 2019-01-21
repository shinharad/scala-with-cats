package com.github.shinharad.cats.ch01.meetcats

// Importing Interface Syntax
object ShowExample01 extends App {

  import cats.Show
  import cats.instances.int._
  import cats.instances.string._

  val showInt = Show.apply[Int]
  val showString = Show.apply[String]

  val intAsString: String = showInt.show(123)
  println(intAsString)

  val stringAsString: String = showString.show("abc")
  println(stringAsString)

}

// Importing All The Things!
object ShowExample02 extends App {

  import cats._
  import cats.implicits._

  val showInt = Show.apply[Int]
  val showString = Show.apply[String]

  val intAsString: String = showInt.show(123)
  println(intAsString)

  val stringAsString: String = showString.show("abc")
  println(stringAsString)

}

// Defining Custome Instances
object ShowExample03 extends App {
  import cats._
  import cats.syntax.show._
  import java.util.Date

//  implicit val dateShow: Show[Date] =
//    new Show[Date] {
//      def show(date: Date): String =
//        s"${date.getTime}ms since the epoch."
//    }

//  implicit val dateShow2: Show[Date] =
//    date => s"${date.getTime}ms since the epoch."

  implicit val dateShow: Show[Date] =
    Show.show(date => s"${date.getTime}ms since the epoch.")

  println(new Date().show)

}