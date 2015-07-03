package Lession2_Counting_Elements.FrogRiverOne

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(X: Int, A: Array[Int]): Int = {

    def loop(j: Int, max: Int): Int = {
      if (j > X) max
      else {
        val index = A.indexOf(j)
        if (index == -1) -1
        else {
          if (index > max) loop(j + 1, index)
          else loop(j + 1, max)
        }
      }
    }
    loop(1, 0)
  }
}