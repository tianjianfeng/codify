package Lession1_Time_Complexity.TapeEquilibrium

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 16/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers {

  it should "test" in {
    Solution.solution(Array(3,1,2,4,3)) should be (1)
    Solution.solution(Array(3,1)) should be (2)
  }


}
