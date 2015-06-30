package Lession1_Time_Complexity.TapeEquilibrium

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    val total = -(A.sum)
    val myMin = A.foldLeft(total)((min, a) => {
      val t = min + 2*a
      if (Math.abs(t) < Math.abs(min)) t
      else min
    })
    Math.abs(myMin)
  }
}