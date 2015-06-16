package Lession1_Time_Complexity.FrogJmp

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(X: Int, Y: Int, D: Int): Int = {
    val c = Y-X
    val a = c / D
    val b = c % D
    if (b == 0) a else a+1
  }
}