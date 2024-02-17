
class cons {
    String name;
    int id;
    cons(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
}
public class constructors{
    public static void main(String[] args){
        cons cons1=new cons("satakratu", 19);
        System.out.println("Name: "+cons1.name+" and id : "+cons1.id);
    }
}