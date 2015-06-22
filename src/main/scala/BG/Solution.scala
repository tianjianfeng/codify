package BG

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    // write your code in Scala 2.10
    A.size - A.foldLeft(0)((acc, a) => if (a > A.indexOf(a) + 1) acc + 1 else acc)
  }
}
