package Lession4_Sorting.Distinct

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    var d = 0
    def loop(j: Int): Unit= {
      if (j < A.length) {
        if (A.indexOf(A(j), j + 1) == -1) d += 1
        loop(j + 1)
      }
    }
    loop(0)
    d

  }
}
