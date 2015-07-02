package Lession2_Counting_Elements.PermCheck

/**
 * Created by jianfeng on 16/06/2015.
 */
object Solution {

  def solution(A: Array[Int]): Int = {
    if (A.size == A.distinct.size && A.max == A.distinct.size) 1 else 0
  }
}
