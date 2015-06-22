package BG

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 22/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers{

  it should "test" in {

    Solution.solution(Array(2,1,3,5,4)) should be(3)
  }
}
