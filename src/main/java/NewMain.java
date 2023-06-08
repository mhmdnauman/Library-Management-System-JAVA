public class NewMain {

    public static void main(String[] args) {


        
        BST tree = new BST();
        
        
        tree.accData("Nauman").setRegNo("024");

        
        tree.accData("Zainab").setRegNo("051");
        
        
        System.out.println(tree.accData("Zainab").getRegNo());
        
        tree.removeStuData("024");
        
        System.out.println(tree.accData("Zainab"));
        
        
        tree.printData();

        
        
        tree.printData();
        
        
        BookBST b = new BookBST();
        
        b.insert("n" , "rd", 6);
        
        b.accData("n").setBookID("12");
        
        b.printData();
        
        
        
  


    }
    
}
