package StackQueueDemo;

/*
Name: Lillian Vore
Date: 11/2/2022
Class: Intermediate Prog.
Instructions: Write a called SplitStack.java.
    Write a method splitStack that takes a stack of integers as a parameter and splits it into
    negatives and non-negatives. The numbers in the stack should be rearranged so that all the
    negatives appear on the bottom of the stack and all the non-negatives appear on the top. In
    other words, if after this method is called you were to pop numbers off the stack, you would
    first get all the non negative numbers and then get all the negative numbers. It does not
    matter what order the numbers appear in as long as all the negatives appear lower in the
    stack than all the non-negatives. You may use a single queue as auxiliary storage
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {

        public static void modify(Stack<Integer> s){
            Queue<Integer> t = new LinkedList<Integer>();
            int count = 0;
            while(s.size() != 0){
                Integer temp = s.pop();
                t.add(temp);
                if(temp.intValue() >= 0){
                    count++;
                }
            }
            while(t.size() != 0){
                Integer temp = t.remove();
                if(temp.intValue() < 0){
                    if(s.size() >= count){
                        s.push(temp);
                    }
                    else{
                        t.add(temp);

                    }
                }
                else{
                    s.push(temp);
                }
            }
        }

        public static void main(String args[]){
            Stack<Integer> s = new Stack<Integer>();
            //Integer(int) is deprecated so please rewrite the belows
            // like this s.push(5)  or s.push(Integer.valueOf(5));
            // as I am providing an example below.
            s.push(5); //this is an example.
            s.push(-5); //revise rest as above.
            s.push(67);//revise rest as above.
            s.push(-45);//revise rest as above.
            s.push(67);//revise rest as above.
            s.push(9);//revise rest as above.
            s.push(0);//revise rest as above.
            s.push(-42);//revise rest as above.
            s.push(56);//revise rest as above.
            s.push(-7);//revise rest as above.
            System.out.println(s);
            modify(s);
            System.out.println(s); //also output must have negative on the left
            // and positive on the right side.  Lower stack means you will need
            // to display the negative number on your left. Please revise your
            // program accordingly.

        }
    }
