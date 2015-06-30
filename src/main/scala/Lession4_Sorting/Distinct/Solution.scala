package Lession4_Sorting.Distinct

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {

    def loop(a: Int, acc: Int): Int = {
      if (a <= 1000000) {
        if (A.indexOf(a) != -1) loop(a + 1, acc + 1)
        else loop(a + 1, acc)
      }
      else acc
    }

    loop(-1000000, 0)
  }
}
