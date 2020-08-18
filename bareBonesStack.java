package csc331;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author: Hector Felix
 * @Date: 
 */


public interface bareBonesStack <E> {
    E push(E obj);           //Method to add to stack
    E pop();                    //Mehtod to remove from stack
    E peek();                   //Returns but does not remove to Top of Stack
    boolean isEmpty();          //Returns true if stack is empty
}
