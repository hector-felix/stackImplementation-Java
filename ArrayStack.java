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
public class ArrayStack <E> implements bareBonesStack <E> {

    //Storage for stack
    private E[] theData;
    private int TOS;
    private static final int INITIAL_CAPACITY = 10;
    
    //default constructor
    public ArrayStack() {
        this.theData = (E[]) new Object[INITIAL_CAPACITY];
        this.TOS = -1;
    }
    
    
    @Override
    public E push(E obj) {
        //method to add elements to stack
        //First check if there is enough space to add elements
        if (TOS == this.theData.length - 1) { //Stack Full
            System.out.println("Stack Overflow");
            //We can now call reallocate to increase the capacity
            return null;
            
        }
//        TOS++; // Go to the proper index
//        this.theData[TOS] = obj;
//        return obj;
       return (this.theData[++TOS]=obj);
    }

    @Override
    public E pop() {
            //This method deleted an element from the stack
            //first chck if there is an element to delete
            if (!isEmpty()) {
//                E temp = this.theData[TOS]; //save the data first
//                TOS--;                      //then decrement the TOS
//                return temp;                //then return the element
                return this.theData[TOS--];
            }
            System.out.println("Stack Underflow!");
            return null;
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return (TOS == -1);
//        if (TOS == -1)
//            return true;
    }
    
    public String toString() {
        
        String s = "Stack: ";
        
        for (int i = 0; i <= TOS; i++) {
            s += this.theData[i] + " | ";
        }
        
        return s;
    }
    
}
