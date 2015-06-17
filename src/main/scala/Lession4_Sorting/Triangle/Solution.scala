package Lession4_Sorting.Triangle

import scala.collection.JavaConversions._
import scala.util.control.Breaks

// you can use println for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {

    val loop = new Breaks
    val B = A.toBuffer
    var result = 0

    loop.breakable {
      for (b <- B) {
        val C = B - b
        for (c <- C) {
          val D = C - c
          for (d <- D) {
            if (isTriangle(b, c, d)) {
              result = 1
              loop.break
            }
          }
        }
      }
    }
    result
  }


  def isTriangle(p: Int, q: Int, r: Int): Boolean = {
    p + q > r && p + r > q && q + r > p
  }
}
