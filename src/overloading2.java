class Antra{
    public int division(int n1, int n2){
        return n1/n2;
    }
    public double division(double n1,double n2){
        return n1/n2;
    }
}
public class overloading2 {
    public static void main(String[] args) {
        Antra a=new Antra();
        System.out.println("Division = "+a.division(12, 4));
        System.out.println("Division = "+a.division(11.68, 6.7));

    }
}
