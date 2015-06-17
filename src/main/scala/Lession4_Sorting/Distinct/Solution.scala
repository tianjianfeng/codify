package Lession4_Sorting.Distinct

import scala.collection.JavaConversions._

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    A.foldLeft(Array[Int]())((distinctArr: Array[Int], a: Int) => {
      if (distinctArr.indexOf(a) == -1) distinctArr :+ (a)
      else distinctArr
    }).size
  }
}
