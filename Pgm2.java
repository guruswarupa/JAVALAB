import java.util.Scanner;

class Student1{
    String usn;
    String name;
    String branch;
    String phone;
    void read(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter usn");
        usn=s.next();
        System.out.println("Enter name");
        name=s.next();
        System.out.println("Enter branch");
        branch=s.next();
        System.out.println("Enter phone");
        phone=s.next();
    }
    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phone);
        System.out.println();
    }
}

public class Pgm2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=s.nextInt();
        Student1[] s1=new Student1[n];
        for (int i = 0; i < n; i++)
            s1[i] = new Student1();
        for(int i=0;i<n;i++)
            s1[i].read();
        for(int i=0;i<n;i++)
            s1[i].display();
    }
}
