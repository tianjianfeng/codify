package Lession1_Time_Complexity.PermMissingElem

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 16/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers{

  it should "test" in {

    val a = Array(2, 3, 1, 5)
    Solution.solution(a) should be (4)
  }

}
