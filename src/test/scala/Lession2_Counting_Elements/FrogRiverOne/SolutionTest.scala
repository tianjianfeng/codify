package Lession2_Counting_Elements.FrogRiverOne

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 16/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers {

  it should "test" in {
    Solution.solution(5, Array(1, 3, 1, 4, 2, 3, 5, 4)) should be (6)
  }

}
