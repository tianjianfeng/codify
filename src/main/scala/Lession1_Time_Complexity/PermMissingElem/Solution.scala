package Lession1_Time_Complexity.PermMissingElem

import scala.collection.JavaConversions._
import scala.util.control._


// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {

    val size = A.length
    val loop = new Breaks;
    var i = 1
    loop.breakable {
      for (a <- A) {
        if (!A.contains(i))
          loop.break;
        i += 1
      }
    }
    i
  }
}