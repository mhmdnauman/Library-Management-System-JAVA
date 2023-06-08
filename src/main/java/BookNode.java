public class BookNode {

     String Name;
     String BookID;
     int BookQuantity;
     BookNode left ;
     BookNode right ;

    public BookNode(String Name, String BookID, int BookQuantity) {
        this.Name = Name;
        this.BookID = BookID;
        this.BookQuantity = BookQuantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public int getBookQuantity() {
        return BookQuantity;
    }

    public void setBookQuantity(int BookQuantity) {
        this.BookQuantity = BookQuantity;
    }
    
    
    public void decBookQuantity(int BookQuantity) {
        this.BookQuantity =this.BookQuantity-BookQuantity;
    }
    
    
    
    public void incBookQuantity(int BookQuantity) {
        this.BookQuantity =this.BookQuantity+BookQuantity;
    }
    

    public BookNode getLeft() {
        return left;
    }

    public void setLeft(BookNode left) {
        this.left = left;
    }

    public BookNode getRight() {
        return right;
    }

    public void setRight(BookNode right) {
        this.right = right;
    }

     
     
     
     

    
}
