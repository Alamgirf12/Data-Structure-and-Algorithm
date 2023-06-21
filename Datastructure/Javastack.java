
package Datastructure;

import java.util.Stack;
public class Javastack {
      public static void main(String[]args){
          Stack<Integer> stk = new Stack<>();
          boolean result = stk.empty();
          System.out.println("IS stack empty?=>"+result);
          stk.push(350);
          stk.push(220);
          stk.push(129);
          stk.push(100);
          System.out.println("Stack is :"+stk);
      }
}
