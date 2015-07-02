package Lession2_Counting_Elements.PermCheck

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 16/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers {

  it should "test" in {
    Solution.solution(Array(4,1,3,2)) should be (1)
    Solution.solution(Array(4,1,3)) should be (0)
    Solution.solution(Array(1,3)) should be (0)
    Solution.solution(Array(1,1, 3)) should be (0)
  }
}
