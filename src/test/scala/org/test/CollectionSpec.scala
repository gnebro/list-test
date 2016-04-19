package org.test

import org.scalatest.{Matchers, FlatSpec}

class CollectionSpec extends FlatSpec with Matchers {

  import CollectionSpec._

  "una lista di Int " should " risultare nella somma con foldLeft" in {
    val result = ListOfInt.foldLeft(0)(_ + _)
    result shouldBe 85
  }

}

object CollectionSpec {

  private val ListOfInt = 0 :: 1 :: 87 :: 0 :: -3 :: Nil
  private val ListOfString = "aa" :: "" :: "babbo" :: "none" :: "b" :: Nil
  private val ListOfOptionString = Some("aa") :: None :: Some("babbo") :: Some("none") :: None :: Nil
  private val ListOptionInt = None :: Some(1) :: Some(87) :: None :: Some(-3) :: Nil

}
