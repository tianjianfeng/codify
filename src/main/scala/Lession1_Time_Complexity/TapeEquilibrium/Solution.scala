package Lession1_Time_Complexity.TapeEquilibrium

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    A.foldLeft(Array[Int](A.sum))((arr, a) => arr :+ (arr.last - 2 * a)).map(Math.abs((_))).min
  }
}