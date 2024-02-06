public class swap {
    public static void main(String[] args) {
        String x="Hello World";
        String y="Good bye";
        System.out.println("Before Swapping:");
        System.out.println("X: "+x);
        System.out.println("y: "+y);
        String temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
