public class Node {
     String Name ;
     int age;
     String RegNo;
     String Program;
     String Password;
     int Semester;
     String Concat;
    
    
     String Sub1Name="Subject 1";
     int Sub1FinalExamMarks=0;
     int Sub1MidMarks=0;
     int Sub1Ass1Marks=0;
     int Sub1Ass2Marks=0;
     int Sub1Ass3Marks=0;
     int Sub1Quiz1Marks=0;
     int Sub1Quiz2Marks=0;
     int Sub1Quiz3Marks=0;
     int Sub1TotalMarks=0;
   
     String Sub2Name="Subject 2";
     int Sub2FinalExamMarks=0;
     int Sub2MidMarks=0;
     int Sub2Ass1Marks=0;
     int Sub2Ass2Marks=0;
     int Sub2Ass3Marks=0;
     int Sub2Quiz1Marks=0;
     int Sub2Quiz2Marks=0;
     int Sub2Quiz3Marks=0;
     int Sub2TotalMarks=0;
    
    
     String Sub3Name="Subject 3";
     int Sub3FinalExamMarks=0;
     int Sub3MidMarks=0;
     int Sub3Ass1Marks=0;
     int Sub3Ass2Marks=0;
     int Sub3Ass3Marks=0;
     int Sub3Quiz1Marks=0;
     int Sub3Quiz2Marks=0;
     int Sub3Quiz3Marks=0;
     int Sub3TotalMarks=0;
    
    
     String Sub4Name="Subject 4";
     int Sub4FinalExamMarks=0;
     int Sub4MidMarks=0;
     int Sub4Ass1Marks=0;
     int Sub4Ass2Marks=0;
     int Sub4Ass3Marks=0;
     int Sub4Quiz1Marks=0;
     int Sub4Quiz2Marks=0;
     int Sub4Quiz3Marks=0;
     int Sub4TotalMarks=0;
    
    
     String Sub5Name="Subject 5";
     int Sub5FinalExamMarks=0;
     int Sub5MidMarks=0;
     int Sub5Ass1Marks=0;
     int Sub5Ass2Marks=0;
     int Sub5Ass3Marks=0;
     int Sub5Quiz1Marks=0;
     int Sub5Quiz2Marks=0;
     int Sub5Quiz3Marks=0;
     int Sub5TotalMarks=0;
    
    
     String Sub6Name="Subject 6";
     int Sub6FinalExamMarks=0;
     int Sub6MidMarks=0;
     int Sub6Ass1Marks=0;
     int Sub6Ass2Marks=0;
     int Sub6Ass3Marks=0;
     int Sub6Quiz1Marks=0;
     int Sub6Quiz2Marks=0;
     int Sub6Quiz3Marks=0;
     int Sub6TotalMarks=0;
    
     String BookIss1=null; 
     String BookIss2=null;
     String BookIss3=null;
    
    
    Node left ;
     Node right ;
    
    public Node(){
        Name = null ;
        left = null ;
        right = null ;
    }
    
    public Node (String Name){
        this.Name = Name ;
    }

    public Node(String Name, int age, String RegNo, String Password, String Program, int Semester, String Sub1Name, String Sub2Name, String Sub3Name, String Sub4Name, String Sub5Name, String Sub6Name) {
        this.Name = Name;
        this.age = age;
        this.RegNo = RegNo;
        this.Program = Program;
        this.Password = Password;
        this.Semester = Semester;
        this.Sub1Name = Sub1Name;
        this.Sub2Name = Sub2Name;
        this.Sub3Name = Sub3Name;
        this.Sub4Name = Sub4Name;
        this.Sub5Name = Sub5Name;
        this.Sub6Name = Sub6Name;
        Concat=RegNo.concat(Password);
        System.out.println(Concat);
    }

    public String getConcat() {
        return Concat;
    }

    public void setConcat(String Concat) {
        this.Concat = Concat;
    }

    
    
    
    
    
    
    
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public int getSemester() {
        return Semester;
    }
    
    public void setSemester(int Semester) {
        this.Semester = Semester;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String RegNo) {
        this.RegNo = RegNo;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getSub1Name() {
        return Sub1Name;
    }

    public void setSub1Name(String Sub1Name) {
        this.Sub1Name = Sub1Name;
    }

    public int getSub1FinalExamMarks() {
        return Sub1FinalExamMarks;
    }

    public void setSub1FinalExamMarks(int Sub1FinalExamMarks) {
        this.Sub1FinalExamMarks = Sub1FinalExamMarks;
    }

    public int getSub1MidMarks() {
        return Sub1MidMarks;
    }

    public void setSub1MidMarks(int Sub1MidMarks) {
        this.Sub1MidMarks = Sub1MidMarks;
    }

    public int getSub1Ass1Marks() {
        return Sub1Ass1Marks;
    }

    public void setSub1Ass1Marks(int Sub1Ass1Marks) {
        this.Sub1Ass1Marks = Sub1Ass1Marks;
    }

    public int getSub1Ass2Marks() {
        return Sub1Ass2Marks;
    }

    public void setSub1Ass2Marks(int Sub1Ass2Marks) {
        this.Sub1Ass2Marks = Sub1Ass2Marks;
    }

    public int getSub1Ass3Marks() {
        return Sub1Ass3Marks;
    }

    public void setSub1Ass3Marks(int Sub1Ass3Marks) {
        this.Sub1Ass3Marks = Sub1Ass3Marks;
    }

    public int getSub1Quiz1Marks() {
        return Sub1Quiz1Marks;
    }

    public void setSub1Quiz1Marks(int Sub1Quiz1Marks) {
        this.Sub1Quiz1Marks = Sub1Quiz1Marks;
    }

    public int getSub1Quiz2Marks() {
        return Sub1Quiz2Marks;
    }

    public void setSub1Quiz2Marks(int Sub1Quiz2Marks) {
        this.Sub1Quiz2Marks = Sub1Quiz2Marks;
    }

    public int getSub1Quiz3Marks() {
        return Sub1Quiz3Marks;
    }

    public void setSub1Quiz3Marks(int Sub1Quiz3Marks) {
        this.Sub1Quiz3Marks = Sub1Quiz3Marks;
    }

    public int getSub1TotalMarks() {
        
       Sub1TotalMarks = Sub1FinalExamMarks+Sub1MidMarks+Sub1Ass1Marks+Sub1Ass2Marks+Sub1Ass3Marks+Sub1Quiz1Marks+Sub1Quiz2Marks+Sub1Quiz3Marks;
         return Sub1TotalMarks;
    }

    public void setSub1TotalMarks(int Sub1TotalMarks) {
        this.Sub1TotalMarks = Sub1TotalMarks;
    }

    public String getSub2Name() {
        return Sub2Name;
    }

    public void setSub2Name(String Sub2Name) {
        this.Sub2Name = Sub2Name;
    }

    public int getSub2FinalExamMarks() {
        return Sub2FinalExamMarks;
    }

    public void setSub2FinalExamMarks(int Sub2FinalExamMarks) {
        this.Sub2FinalExamMarks = Sub2FinalExamMarks;
    }

    public int getSub2MidMarks() {
        return Sub2MidMarks;
    }

    public void setSub2MidMarks(int Sub2MidMarks) {
        this.Sub2MidMarks = Sub2MidMarks;
    }

    public int getSub2Ass1Marks() {
        return Sub2Ass1Marks;
    }

    public void setSub2Ass1Marks(int Sub2Ass1Marks) {
        this.Sub2Ass1Marks = Sub2Ass1Marks;
    }

    public int getSub2Ass2Marks() {
        return Sub2Ass2Marks;
    }

    public void setSub2Ass2Marks(int Sub2Ass2Marks) {
        this.Sub2Ass2Marks = Sub2Ass2Marks;
    }

    public int getSub2Ass3Marks() {
        return Sub2Ass3Marks;
    }

    public void setSub2Ass3Marks(int Sub2Ass3Marks) {
        this.Sub2Ass3Marks = Sub2Ass3Marks;
    }

    public int getSub2Quiz1Marks() {
        return Sub2Quiz1Marks;
    }

    public void setSub2Quiz1Marks(int Sub2Quiz1Marks) {
        this.Sub2Quiz1Marks = Sub2Quiz1Marks;
    }

    public int getSub2Quiz2Marks() {
        return Sub2Quiz2Marks;
    }

    public void setSub2Quiz2Marks(int Sub2Quiz2Marks) {
        this.Sub2Quiz2Marks = Sub2Quiz2Marks;
    }

    public int getSub2Quiz3Marks() {
        return Sub2Quiz3Marks;
    }

    public void setSub2Quiz3Marks(int Sub2Quiz3Marks) {
        this.Sub2Quiz3Marks = Sub2Quiz3Marks;
    }

    public int getSub2TotalMarks() {
        Sub2TotalMarks = Sub2FinalExamMarks+Sub2MidMarks+Sub2Ass1Marks+Sub2Ass2Marks+Sub2Ass3Marks+Sub2Quiz1Marks+Sub2Quiz2Marks+Sub2Quiz3Marks;
        return Sub2TotalMarks;
    }

    public void setSub2TotalMarks(int Sub2TotalMarks) {
        this.Sub2TotalMarks = Sub2TotalMarks;
    }

    public String getSub3Name() {
        return Sub3Name;
    }

    public void setSub3Name(String Sub3Name) {
        this.Sub3Name = Sub3Name;
    }

    public int getSub3FinalExamMarks() {
        return Sub3FinalExamMarks;
    }

    public void setSub3FinalExamMarks(int Sub3FinalExamMarks) {
        this.Sub3FinalExamMarks = Sub3FinalExamMarks;
    }

    public int getSub3MidMarks() {
        return Sub3MidMarks;
    }

    public void setSub3MidMarks(int Sub3MidMarks) {
        this.Sub3MidMarks = Sub3MidMarks;
    }

    public int getSub3Ass1Marks() {
        return Sub3Ass1Marks;
    }

    public void setSub3Ass1Marks(int Sub3Ass1Marks) {
        this.Sub3Ass1Marks = Sub3Ass1Marks;
    }

    public int getSub3Ass2Marks() {
        return Sub3Ass2Marks;
    }

    public void setSub3Ass2Marks(int Sub3Ass2Marks) {
        this.Sub3Ass2Marks = Sub3Ass2Marks;
    }

    public int getSub3Ass3Marks() {
        return Sub3Ass3Marks;
    }

    public void setSub3Ass3Marks(int Sub3Ass3Marks) {
        this.Sub3Ass3Marks = Sub3Ass3Marks;
    }

    public int getSub3Quiz1Marks() {
        return Sub3Quiz1Marks;
    }

    public void setSub3Quiz1Marks(int Sub3Quiz1Marks) {
        this.Sub3Quiz1Marks = Sub3Quiz1Marks;
    }

    public int getSub3Quiz2Marks() {
        return Sub3Quiz2Marks;
    }

    public void setSub3Quiz2Marks(int Sub3Quiz2Marks) {
        this.Sub3Quiz2Marks = Sub3Quiz2Marks;
    }

    public int getSub3Quiz3Marks() {
        return Sub3Quiz3Marks;
    }

    public void setSub3Quiz3Marks(int Sub3Quiz3Marks) {
        this.Sub3Quiz3Marks = Sub3Quiz3Marks;
    }

    public int getSub3TotalMarks() {
        Sub3TotalMarks = Sub3FinalExamMarks+Sub3MidMarks+Sub3Ass1Marks+Sub3Ass2Marks+Sub3Ass3Marks+Sub3Quiz1Marks+Sub3Quiz2Marks+Sub3Quiz3Marks;
        return Sub3TotalMarks;
    }

    public void setSub3TotalMarks(int Sub3TotalMarks) {
        this.Sub3TotalMarks = Sub3TotalMarks;
    }

    public String getSub4Name() {
        return Sub4Name;
    }

    public void setSub4Name(String Sub4Name) {
        this.Sub4Name = Sub4Name;
    }

    public int getSub4FinalExamMarks() {
        return Sub4FinalExamMarks;
    }

    public void setSub4FinalExamMarks(int Sub4FinalExamMarks) {
        this.Sub4FinalExamMarks = Sub4FinalExamMarks;
    }

    public int getSub4MidMarks() {
        return Sub4MidMarks;
    }

    public void setSub4MidMarks(int Sub4MidMarks) {
        this.Sub4MidMarks = Sub4MidMarks;
    }

    public int getSub4Ass1Marks() {
        return Sub4Ass1Marks;
    }

    public void setSub4Ass1Marks(int Sub4Ass1Marks) {
        this.Sub4Ass1Marks = Sub4Ass1Marks;
    }

    public int getSub4Ass2Marks() {
        return Sub4Ass2Marks;
    }

    public void setSub4Ass2Marks(int Sub4Ass2Marks) {
        this.Sub4Ass2Marks = Sub4Ass2Marks;
    }

    public int getSub4Ass3Marks() {
        return Sub4Ass3Marks;
    }

    public void setSub4Ass3Marks(int Sub4Ass3Marks) {
        this.Sub4Ass3Marks = Sub4Ass3Marks;
    }

    public int getSub4Quiz1Marks() {
        return Sub4Quiz1Marks;
    }

    public void setSub4Quiz1Marks(int Sub4Quiz1Marks) {
        this.Sub4Quiz1Marks = Sub4Quiz1Marks;
    }

    public int getSub4Quiz2Marks() {
        return Sub4Quiz2Marks;
    }

    public void setSub4Quiz2Marks(int Sub4Quiz2Marks) {
        this.Sub4Quiz2Marks = Sub4Quiz2Marks;
    }

    public int getSub4Quiz3Marks() {
        return Sub4Quiz3Marks;
    }

    public void setSub4Quiz3Marks(int Sub4Quiz3Marks) {
        this.Sub4Quiz3Marks = Sub4Quiz3Marks;
    }

    public int getSub4TotalMarks() {
        Sub4TotalMarks = Sub4FinalExamMarks+Sub4MidMarks+Sub4Ass1Marks+Sub4Ass2Marks+Sub4Ass3Marks+Sub4Quiz1Marks+Sub4Quiz2Marks+Sub4Quiz3Marks;
        return Sub4TotalMarks;
    }

    public void setSub4TotalMarks(int Sub4TotalMarks) {
        this.Sub4TotalMarks = Sub4TotalMarks;
    }

    public String getSub5Name() {
        return Sub5Name;
    }

    public void setSub5Name(String Sub5Name) {
        this.Sub5Name = Sub5Name;
    }

    public int getSub5FinalExamMarks() {
        return Sub5FinalExamMarks;
    }

    public void setSub5FinalExamMarks(int Sub5FinalExamMarks) {
        this.Sub5FinalExamMarks = Sub5FinalExamMarks;
    }

    public int getSub5MidMarks() {
        return Sub5MidMarks;
    }

    public void setSub5MidMarks(int Sub5MidMarks) {
        this.Sub5MidMarks = Sub5MidMarks;
    }

    public int getSub5Ass1Marks() {
        return Sub5Ass1Marks;
    }

    public void setSub5Ass1Marks(int Sub5Ass1Marks) {
        this.Sub5Ass1Marks = Sub5Ass1Marks;
    }

    public int getSub5Ass2Marks() {
        return Sub5Ass2Marks;
    }

    public void setSub5Ass2Marks(int Sub5Ass2Marks) {
        this.Sub5Ass2Marks = Sub5Ass2Marks;
    }

    public int getSub5Ass3Marks() {
        return Sub5Ass3Marks;
    }

    public void setSub5Ass3Marks(int Sub5Ass3Marks) {
        this.Sub5Ass3Marks = Sub5Ass3Marks;
    }

    public int getSub5Quiz1Marks() {
        return Sub5Quiz1Marks;
    }

    public void setSub5Quiz1Marks(int Sub5Quiz1Marks) {
        this.Sub5Quiz1Marks = Sub5Quiz1Marks;
    }

    public int getSub5Quiz2Marks() {
        return Sub5Quiz2Marks;
    }

    public void setSub5Quiz2Marks(int Sub5Quiz2Marks) {
        this.Sub5Quiz2Marks = Sub5Quiz2Marks;
    }

    public int getSub5Quiz3Marks() {
        return Sub5Quiz3Marks;
    }

    public void setSub5Quiz3Marks(int Sub5Quiz3Marks) {
        this.Sub5Quiz3Marks = Sub5Quiz3Marks;
    }

    public int getSub5TotalMarks() {
        Sub5TotalMarks = Sub5FinalExamMarks+Sub5MidMarks+Sub5Ass1Marks+Sub5Ass2Marks+Sub5Ass3Marks+Sub5Quiz1Marks+Sub5Quiz2Marks+Sub5Quiz3Marks;
        return Sub5TotalMarks;
    }

    public void setSub5TotalMarks(int Sub5TotalMarks) {
        this.Sub5TotalMarks = Sub5TotalMarks;
    }

    public String getSub6Name() {
        return Sub6Name;
    }

    public void setSub6Name(String Sub6Name) {
        this.Sub6Name = Sub6Name;
    }

    public int getSub6FinalExamMarks() {
        return Sub6FinalExamMarks;
    }

    public void setSub6FinalExamMarks(int Sub6FinalExamMarks) {
        this.Sub6FinalExamMarks = Sub6FinalExamMarks;
    }

    public int getSub6MidMarks() {
        return Sub6MidMarks;
    }

    public void setSub6MidMarks(int Sub6MidMarks) {
        this.Sub6MidMarks = Sub6MidMarks;
    }

    public int getSub6Ass1Marks() {
        return Sub6Ass1Marks;
    }

    public void setSub6Ass1Marks(int Sub6Ass1Marks) {
        this.Sub6Ass1Marks = Sub6Ass1Marks;
    }

    public int getSub6Ass2Marks() {
        return Sub6Ass2Marks;
    }

    public void setSub6Ass2Marks(int Sub6Ass2Marks) {
        this.Sub6Ass2Marks = Sub6Ass2Marks;
    }

    public int getSub6Ass3Marks() {
        return Sub6Ass3Marks;
    }

    public void setSub6Ass3Marks(int Sub6Ass3Marks) {
        this.Sub6Ass3Marks = Sub6Ass3Marks;
    }

    public int getSub6Quiz1Marks() {
        return Sub6Quiz1Marks;
    }

    public void setSub6Quiz1Marks(int Sub6Quiz1Marks) {
        this.Sub6Quiz1Marks = Sub6Quiz1Marks;
    }

    public int getSub6Quiz2Marks() {
        return Sub6Quiz2Marks;
    }

    public void setSub6Quiz2Marks(int Sub6Quiz2Marks) {
        this.Sub6Quiz2Marks = Sub6Quiz2Marks;
    }

    public int getSub6Quiz3Marks() {
        return Sub6Quiz3Marks;
    }

    public void setSub6Quiz3Marks(int Sub6Quiz3Marks) {
        this.Sub6Quiz3Marks = Sub6Quiz3Marks;
    }

    public int getSub6TotalMarks() {
        Sub6TotalMarks = Sub6FinalExamMarks+Sub6MidMarks+Sub6Ass1Marks+Sub6Ass2Marks+Sub6Ass3Marks+Sub6Quiz1Marks+Sub6Quiz2Marks+Sub6Quiz3Marks;
        return Sub6TotalMarks;
    }

    public void setSub6TotalMarks(int Sub6TotalMarks) {
        this.Sub6TotalMarks = Sub6TotalMarks;
    }

    

    public String getBookIss1() {
        return BookIss1;
    }

    public void setBookIss1(String BookIss1) {
        this.BookIss1 = BookIss1;
    }

    public String getBookIss2() {
        return BookIss2;
    }

    public void setBookIss2(String BookIss2) {
        this.BookIss2 = BookIss2;
    }

    public String getBookIss3() {
        return BookIss3;
    }

    public void setBookIss3(String BookIss3) {
        this.BookIss3 = BookIss3;
    }
    
       
    public Node getLeft() {
        return left;
    }
    
    public Node getRight(){
        return right ;
    }

   
    public void setLeft(Node left) {
        this.left = left;
    }   
    
    public void setRight(Node right){
        this.right = right ; 
    }
}
