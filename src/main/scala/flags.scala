package com.cliargs

sealed trait Flag {
  val names: Iterable[String]
  val isRequired: Boolean
}

// Restrict this to a List1? (List of one element)
case class SingleFlag(names: Iterable[String]) extends Flag {

  // def map[B](f: String => )

  val isRequired = false
}
case class MultipleOptionsFlag(names: Iterable[String]) extends Flag {
  val isRequired = false
}

object RequiredFlag {
  def apply(name: String) = SingleFlag(Iterable(name))
  def apply(names: Iterable[String]) = MultipleOptionsFlag(names)
}

// case class RequiredFlag(names: Iterable[String]) extends Flag {
//   val isRequired = true
// }

case class OptionalFlag(names: Iterable[String]) extends Flag {
  val isRequired = false
}
