package org.decaf.cliargs
import com.scautils.Zero

trait Monoid[A] {
  def zero: A
  def append(u: A): Monoid[A]
  def get: A
}

object Monoid {

  def apply[A: Monoid] = implicitly[Monoid[A]]

  // def apply[A: Zero](f: A => A) = new Monoid[A] {
  //   lazy val zero = implicitly[Zero[A]]
  //   def append(u: A) = f(u)
  //   def get = zreo
  // }

}

object Monoids {
  // implicit val IntZero = Monoid[Int](_ + _)(0)
}
