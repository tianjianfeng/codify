package Lession3_Prefix_Sums.PassingCars

import scala.util.control.Breaks

/**
 * Created by jianfeng on 16/06/2015.
 */
object Solution {
  def solution(A: Array[Int]): Int = {

    var sum = 0

    def loop(B: Array[Int]): Int = {
      if (sum > 1000000000) -1
      else {
        val i = B.indexOf(0)
        if (i == -1) sum
        else {
          val subArr = B.drop(i + 1)
          sum += subArr.count(_ == 1)
          loop(subArr)
        }
      }
    }
    loop(A)
  }
}
