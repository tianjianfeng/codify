package Lession4_Sorting.Distinct

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {

    def loop(B: Array[Int], acc: Int): Int = {
      if (B.isEmpty) acc
      else loop(B.filterNot(_ == B(0)), acc + 1)

    }
    loop(A, 0)
  }
}
