package Lession1_Time_Complexity.TapeEquilibrium

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {

    val size = A.size
    def loop(sum: Int, min: Int, i: Int): Int = {
      if (i < size) {
        val t = sum + 2*A(i)
        if (Math.abs(t) < Math.abs(min)) loop(t, t, i+1)
        else loop(t, min, i+1)
      }
      else Math.abs(min)
    }

    val total = -(A.sum)
    loop(total, total, 0)

  }
}