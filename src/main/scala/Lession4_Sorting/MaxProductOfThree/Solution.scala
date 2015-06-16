package Lession4_Sorting.MaxProductOfThree

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    val arrBuffer = A.toBuffer

    val a = arrBuffer.max
    arrBuffer -= a
    val b = arrBuffer.max
    arrBuffer -= b
    val c = arrBuffer.max
    a * b * c
  }
}
