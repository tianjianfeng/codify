package Lession4_Sorting.Distinct

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    var d = 0
    var B = A.toBuffer
    def loop(j: Int): Unit= {
      if (j < B.length) {
        if (B.indexOf(B(j), j + 1) == -1) {
          B = B.filterNot(_ == B(j))
          d += 1
          loop(0)
        }
        else loop(j+1)

      }
    }
    loop(0)
    d
  }
}
