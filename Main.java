class Student{
   String name;
   int rollNo;
   String branch;

   Student(String name, int rollNo,String branch)  {
   

     this.name = name;
     this.rollNo = rollNo;
     this.branch = branch;
   }

   void display() {

    System.out.println("Student Name:" + name);
    System.out.println("Roll Number:" + rollNo);
    System.out.println("Branch:" + branch);
   }
}
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(
            "Sahasra",
            101,
            "CSE"
        );

        Student s2 = new Student(
            "Rishika",
            102,
            "CSE"
        );

        s1.display();
        
        System.out.println();

        s2.display();
    }
}