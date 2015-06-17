package Lession4_Sorting.Triangle

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 17/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers {

  it should "test" in {
    Solution.solution(Array(10, 2, 5, 1, 8, 20)) should be (1)
    Solution.solution(Array(10, 50, 5, 1)) should be (0)
  }
}
