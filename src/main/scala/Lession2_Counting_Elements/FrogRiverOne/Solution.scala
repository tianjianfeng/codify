package Lession2_Counting_Elements.FrogRiverOne

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(X: Int, A: Array[Int]): Int = {

    def loop(j: Int, arr: Array[Int]): Array[Int] = {
      if (j > X) arr
      else loop(j + 1, arr.+:(A.indexOf(j)))
    }
    val steps = loop(1, Array[Int]())

    if (steps.indexOf(-1) != -1) -1 else steps.max
  }
}