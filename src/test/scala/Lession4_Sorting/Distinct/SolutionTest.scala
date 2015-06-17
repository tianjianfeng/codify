package Lession4_Sorting.Distinct

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 17/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers {
  it should "test" in {
    Solution.solution(Array(2,1,1,2,3,1)) should be(3)
  }

}
