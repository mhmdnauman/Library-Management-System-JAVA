public class BookBST {
    
    
    BookNode root ;
    
    public BookBST (){
        root = null ;
    }
    
    public void remove(String Name){
        root = removeRecursively(root, Name);
    }
    
    private BookNode removeRecursively(BookNode root, String Name){
        if (root == null) return root ;
        if (Name.compareTo(root.getName()) < 0 ) 
            root.setLeft(removeRecursively(root.getLeft(), Name)) ;
        else if (Name.compareTo(root.getName()) > 0)
            root.setRight(removeRecursively(root.getRight(), Name));
        else{
            // node with only one 1 child 
            if (root.getLeft() == null)
                return root.getRight() ;
            else if (root.getRight() == null)
                return root.getLeft() ;
            
            // find inOrder successor
            String inOrderSuccessor = getMin(root.getRight()) ;
            root.setName(inOrderSuccessor);
            root.setRight(removeRecursively(root.getRight(), inOrderSuccessor)) ;
        }
        return root ;
    }
    
    private String getMin(BookNode node){
        String min = node.getName() ;
        while(node.getLeft() != null){
            min = node.getLeft().getName() ;
            node = node.getLeft() ;
        }
        return min ;
    }
    
    
    public boolean isLeaf(BookNode node){
        if (node.getLeft() == null && node.getRight() == null)
            return true ;
        else
            return false ;
    }
    
    public boolean find(String Name){
    BookNode current = root ;
    while (current != null){
        if (current.getName() == Name)
            return true ;
        else if (current.getName().compareTo(Name) < 0)
            current = current.getRight() ;
        else 
            current = current.getLeft() ;
    }
    return false ;
    }
    
    public void insert(String Name, String BookID, int BookQuantity){
        BookNode newNode = new BookNode( Name, BookID, BookQuantity) ;
        if (root == null){
            root = newNode ; return ;
        }
        BookNode p, q ;          // p is potential parent, q will help guide the search
        p = q = root ;      // During the search modify, p, and q but not root
        while (q != null){  // search while a node is found which will become a parent
            p = q ;         // move parent before moving q
            if (Name.compareTo(p.getName()) < 0) // keep moving q 
                q = p.getLeft() ; 
            else
                q = p.getRight() ;
        }
        
        if (Name.compareTo(p.getName()) < 0) // place newNode to its appropriate left or right side
            p.setLeft(newNode);
        else
            p.setRight(newNode);
        
        // this code assumes that the user will not enter duplicates
        // modify this code to check if the data to be inserted already exists
        // if it exists, write code to display appropriate message and continue the execution.
    }
    
    public void printData(){
        //Node p = root ;
        inOrder(root) ;
        System.out.println("");
    }
    
    private void inOrder(BookNode p){
            if (p != null){
                // it will print the BST data in sorted order
                inOrder(p.getLeft()) ;
                System.out.printf("%s, ",p.getName());
                inOrder(p.getRight()) ;
            }
    }
    
    private void preOrder(BookNode p){
        if (p != null){
            System.out.printf("%s ",p.getName());
            preOrder(p.getLeft()) ;
            preOrder(p.getRight()) ;
        }
    }
    
    private void postOrder(BookNode p){
        if (p != null){
            postOrder(p.getLeft()) ;
            postOrder(p.getRight()) ;
            System.out.printf("%s, ",p.getName());
        }
    }
    
    public int fun(BookNode p) {
        int count = 0;
        if( p != null){
            if((p.left == null) && (p.right == null))
                count = 1;
            else
                count = count + fun(p.left)+ fun(p.right);
        }
        return count;
    }
    
    
      public BookNode accData(String Name){
    BookNode current = root ;
    while (current != null){
        if (current.getName() == Name)
            return current;
        else if (current.getName().compareTo(Name) < 0)
            current = current.getRight() ;
        else 
            current = current.getLeft() ;
    }
    return null;
    }
  
      
      
    
    
    


    
}
