import java.time.*;
public class zoneid {
    public static void main(String[] args) {
        zoneid zoneid1=zoneid.of("Asia/Kolkata");
        zoneid zoneid2=zoneid.of("Asia/Myanmar");
        LocalTime id1=LocalTime.now(zoneid1);
        LocalTime id2=LocalTime.now(zoneid2);
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id1.isBefore((id2)));
    }    
}
