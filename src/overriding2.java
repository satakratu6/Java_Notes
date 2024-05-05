import java.util.Scanner;

class Tool{
    String toolName;
    double rentalRate;
    Tool(String toolName, double rentalRate){
        this.toolName=toolName;
        this.rentalRate=rentalRate;
    }
    void displayInfo(){
        System.out.println("Name: "+toolName);
        System.out.println("Rent Rate: "+rentalRate);
    }
}

class PowerTool extends Tool{
    String powerSource;
    PowerTool(String toolName, double rentalRate, String powerSource){
        super(toolName, rentalRate);
        this.powerSource=powerSource;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Power Source: "+powerSource);
    }
}

public class overriding2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter tool name: ");
        String toolName=sc.nextLine();
        System.out.print("Enter rental rate: ");
        double rentalRate=sc.nextDouble();
        sc.nextLine(); // consume newline left-over
        System.out.println("Enter power source: ");
        String powerSource=sc.nextLine();
        PowerTool p=new PowerTool(toolName, rentalRate, powerSource);
        System.out.println("Details of Power tool");
        p.displayInfo();
    }
}
