package Lession5_Stacks.Nesting

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 30/06/2015.
 */
class SolutionTest extends FlatSpec with Matchers {

  it should "test" in {
    Solution.solution("(()(())())") should be (1)
  }
}
