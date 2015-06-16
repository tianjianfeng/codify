package Lession1_Time_Complexity.FrogJmp

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 16/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers{

  it should "test" in {

    Solution.solution(10, 85, 30) should be (3)
  }

}
