package Lession3_Prefix_Sums.PassingCars

/**
 * Created by jianfeng on 16/06/2015.
 */
object Solution {
  def solution(A: Array[Int]): Int = {

    def loop(j: Int, arr: Array[Int], acc: Int): Int = {
      if (acc > 1000000000) -1
      else if (j == A.size - 1 || j == 100000 - 1) acc
      else {
        if (arr(0) == 0) loop(j + 1, arr.drop(1), acc + arr.count(_ == 1))
        else loop(j + 1, arr.drop(1), acc)
      }
    }
    loop(0, A, 0)



    //    var sum = 0
    //
    //    def loop(B: Array[Int]): Int = {
    //      if (sum > 1000000000) -1
    //      else {
    //        val i = B.indexOf(0)
    //        if (i == -1) sum
    //        else {
    //          val subArr = B.drop(i + 1)
    //          sum += subArr.count(_ == 1)
    //          loop(subArr)
    //        }
    //      }
    //    }
    //    loop(A)
  }
}
