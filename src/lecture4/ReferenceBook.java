/*
 * Lecture 4 demo
 */
package lecture4;
import lecture4.example1.*;
/**
 *
 * @author mandy.northover
 */
public class ReferenceBook extends Book { //inheritance is-a relationship, subclass
    // ReferenceBook also has a title member variable and a getTitle method
    ReferenceBook(){}; //no default constructor is provided by Java
    ReferenceBook(String str){super(); title = str;} //constructor with arguments
    
    void setTitle(String str) { //Books do not have setTitle
        this.getTitle(); //can call superclass methods, demonstrates "this"
        title = str;
    }
     
    @Override //identical signature to parent
    public void borrow(){ System.out.println("Cannot be borrowed");}
}
