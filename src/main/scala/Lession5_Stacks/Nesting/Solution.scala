package Lession5_Stacks.Nesting

import scala.collection.immutable.Stack

/**
 * Created by jianfeng on 30/06/2015.
 */
object Solution {

  def solution(S: String): Int = {

    val myStack = S.toCharArray.foldLeft(new Stack[Char]())((stack, a) => {
      if (a == '(') stack.push(a)
      else {
        if (!stack.isEmpty && stack.head == '(') stack.pop
        else stack.push(a)
      }
    })

    if (myStack.isEmpty) 1 else 0
  }
}
