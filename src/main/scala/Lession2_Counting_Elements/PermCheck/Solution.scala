package Lession2_Counting_Elements.PermCheck

import scala.util.control.Breaks

/**
 * Created by jianfeng on 16/06/2015.
 */
object Solution {

  def solution(A: Array[Int]): Int = {
    val loop = new Breaks
    val size = A.length
    var r = 1
    var i = 0
    loop.breakable {
      for (a <- A) {
        if (a > size || (A.indexOf(a, i+ 1) != -1)) {
          r = 0
          loop.break()
        }
        i += 1
      }
    }
    r
  }

}
