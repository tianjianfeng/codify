package Lession3_Prefix_Sums.PassingCars

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 16/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers {

  it should "test" in {
    Solution.solution(Array(0, 1, 0, 1, 1)) should be(5)
  }

}
