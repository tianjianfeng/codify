package Lession1_Time_Complexity.TapeEquilibrium

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {

    var i = 0
    var arr: Array[Int] = new Array(A.length - 1)
    val sum = A.sum
    var tmpSum = 0
    do {
      tmpSum += A(i)
      arr(i) = Math.abs(tmpSum - (sum - tmpSum))
      i += 1
    }
    while (i < A.length)

    arr.min

  }
}