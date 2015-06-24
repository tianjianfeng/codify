package Lession2_Counting_Elements.PermCheck

/**
 * Created by jianfeng on 16/06/2015.
 */
object Solution {

  def solution(A: Array[Int]): Int = {

    def loop(j: Int): Int = {
      if (j > A.size) 1
      else {
        if (A.indexOf((j)) == -1) 0
        else loop(j + 1)
      }
    }
    loop(1)
  }
}
