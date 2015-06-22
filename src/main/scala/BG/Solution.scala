package BG

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    // write your code in Scala 2.10

    var total = 0

    var arr: Array[Int] = Array()

    def isPermutation(C: Array[Int], i: Int): Boolean = {
      if (i > C.size) true
      else {
        if (C.indexOf(i) == -1) false
        else isPermutation(C, i + 1)
      }
    }

    for (a <- A) {
      arr = arr :+ a
      if (isPermutation(arr, 1)) total += 1
    }
    total
  }
}
