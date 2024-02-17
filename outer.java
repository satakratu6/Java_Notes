public class outer {

    public static void main(String[] args) {
        nigga: for (int i = 0; i < 3; i++) {
            System.out.println("i:"+i);
            inner: for(int j = i;j<3;j++){
                System.out.println(j);
                if(i == j+1){
                    break nigga;
                }
                System.out.println("hello");
            }
        }
    }
}