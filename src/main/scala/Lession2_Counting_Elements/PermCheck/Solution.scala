package Lession2_Counting_Elements.PermCheck

/**
 * Created by jianfeng on 16/06/2015.
 */
object Solution {

  def solution(A: Array[Int]): Int = {
    val size = A.size
    def loop(i: Int, acc: Int): Int = {
      if (i <= size)
        loop(i + 1, acc + i)
      else acc
    }
    val total = loop(1, 0)
    if (total == A.distinct.sum) 1 else 0
  }
}
