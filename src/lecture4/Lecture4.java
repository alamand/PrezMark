/*
 * Lecture 4 demo
 * @author northover
 */
package lecture4;

import lecture4.example1.*;
/**
 *
 * @author mandy northover
 * @since 24.02.2016
 */
public class Lecture4 { 

    /**
     * @param args the command line arguments
     * @author mandy
     */
    public static void main(String[] args) {
        Book b = new Book();
        b.getTitle(); //ok
        // b.setTitle("Title"); //is this also valid?
        
        ReferenceBook r = new ReferenceBook(); //default constructor for Book is called first, then constructor of ReferenceBook
        r.setTitle("ICT306"); //ok
        //r.borrow(1); why is this not allowed?
        System.out.println(r.getTitle()); //ok
        
        Book br = new ReferenceBook(); //upcast, dynamic binding
        br.getTitle(); //ok, polymorphism
        //what about this? br.setTitle("Is this valid?");
        br.borrow(); //dynamic dispatch at run-time; what will this print?
        
        b = r; //ok, upcast
        //r = b; //not ok, downcast
        r = (ReferenceBook)br; // down-cast, run-time check, type cast is mandatory
    }   
}
