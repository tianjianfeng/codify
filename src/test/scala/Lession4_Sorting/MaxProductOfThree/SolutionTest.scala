package Lession4_Sorting.MaxProductOfThree

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 16/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers {
  it should "test" in {
    Solution.solution(Array(-3, 1, 2, -2, 5, 6)) should be (60)
  }

}
