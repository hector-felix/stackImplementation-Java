/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc331;

/**
 *
 * @author mac
 */
public class Driver {

    public static void main(String[] args) {
        ArrayStack<Integer> stack1 = new ArrayStack<>();
int pusher =100;
        stack1.push(10);
        System.out.println(stack1);
        stack1.push(20);
        System.out.println(stack1);
        stack1.push(30);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.push(pusher++);
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);
        stack1.pop();
        stack1.pop();
        stack1.pop();
        
    }

}
