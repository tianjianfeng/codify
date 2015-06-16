package Lession2_Counting_Elements.FrogRiverOne

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(X: Int, A: Array[Int]): Int = {

    var t = 0

    def loop(j: Int): Int = {
      if (j > X) t
      else {
        val b = A.indexOf(j)
        if (b == -1) -1
        else {
          if (b > t) t = b
          loop(j + 1)
        }
      }
    }
    loop(1)
  }
}