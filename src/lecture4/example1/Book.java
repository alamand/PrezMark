/*
 * Lecture 4 demo
 */
package lecture4.example1;

/**
 *
 * @author mandy.northover
 */
public class Book { //superclass
    protected String title; //accessible to ReferenceBook
    protected String location; //accessible by ReferenceBook?
    
    public String getTitle(){ return title;}
    
    public void borrow(){System.out.println("Can be borrowed");}
    private void borrow(int i){} //overloading
    public void borrow(int i, String j){} //overloading
    //public String borrow(int j){return "";} //is this valid?
}
