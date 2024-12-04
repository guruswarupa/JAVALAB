import java.util.Scanner;

class Staff {
    String staffID, name, phone, salary;
    Scanner input = new Scanner(System.in);
    void read(){
        System.out.println("Enter StaffID");
        staffID = input.next();
        name = input.next();
        phone = input.next();
        salary = input.next();
    }
    void display(){
        System.out.print(staffID+"\t"+name+"\t"+phone+"\t"+salary+"\t");
    }
}

class Teaching extends Staff {
    String domain, publication;

    void read(){
        super.read();
        System.out.println("Enter Domain");
        domain = input.next();
        System.out.println("Enter Publication");
        publication = input.next();
    }

    void display() {
        super.display(); 
        System.out.println(domain+"\t"+publication);
    }
}

class Technical extends Staff {
    String Skills;
    void read(){
        super.read();
        System.out.println("Enter Skills");
        Skills = input.next();
    }
    void display(){
        super.display(); 
        System.out.println(Skills);
    }

}
class Contract extends Staff{
    String period;
    void read(){
        super.read(); 
        System.out.println("Enter Period");
        period = input.next();
    }

    @Override
    void display() {
        super.display(); 
        System.out.println(period);
    }
}
    
public class Pgm3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of staff details to be created");
        int n = input.nextInt();
        Teaching ts[] = new Teaching[n];
        Technical tech[] = new Technical[n];
        Contract c[] = new Contract[n];

        for (int i = 0; i < n; i++){
            System.out.println("Enter Teaching staff information");
            ts[i] = new Teaching();
            ts[i].read();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Technical staff information");
            tech[i] = new Technical();
            tech[i].read();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Contract staff information");
            c[i] = new Contract();
            c[i].read();
        }
        System.out.println("\n STAFF DETAILS: \n");
        System.out.println("-----TEACHING STAFF DETAILS----- ");
        for (int i = 0; i < n; i++)
            ts[i].display();
        System.out.println("-----TECHNICAL STAFF DETAILS-----");
        for (int i = 0; i < n; i++)
            tech[i].display();
        System.out.println("-----CONTRACT STAFF DETAILS-----");
        for (int i = 0; i < n; i++)
            c[i].display();
    }
}