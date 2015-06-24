package Lession3_Prefix_Sums.PassingCars

/**
 * Created by jianfeng on 16/06/2015.
 */
object Solution {
  def solution(A: Array[Int]): Int = {

    def loop(j: Int, acc: Int, oneCount: Int): Int = {
      if (acc > 1000000000) -1
      else if (j == A.size - 1 || j == 100000 - 1) acc
      else {
        if (A(j) == 0) loop(j + 1, acc + oneCount, oneCount)
        else loop(j + 1, acc, oneCount -1)
      }
    }
    loop(0, 0, A.count(_ == 1))
  }
}
