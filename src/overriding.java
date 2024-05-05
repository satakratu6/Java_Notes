class Vehicle{  
    //defining a method  
    void run(){System.out.println("Vehicle is running");}  
  }  
  //Creating a child class  
  class overriding extends Vehicle{  
    //defining the same method as in the parent class  
    void run(){System.out.println("Bike is running safely");}  
    
    public static void main(String args[]){  
    overriding obj = new overriding();//creating object  
    obj.run();//calling method  
    }  
}