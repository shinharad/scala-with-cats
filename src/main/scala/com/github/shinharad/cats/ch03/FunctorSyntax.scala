package com.github.shinharad.cats.ch03

import cats.instances.function._
import cats.syntax.functor._

object FunctorSyntax extends App {

  val func1 = (a: Int) => a + 1
  val func2 = (a: Int) => a * 2
  val func3 = (a: Int) => a + "!"
  val func4 = func1.map(func2).map(func3)

  println(func4(123))

}
