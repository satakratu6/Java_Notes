import java.time.*;

public class ZoneIdExample {
    public static void main(String[] args) {
        ZoneId zoneId1 = ZoneId.of("Asia/Kolkata");
        ZoneId zoneId2 = ZoneId.of("Asia/Myanmar");
        LocalTime id1 = LocalTime.now(zoneId1);
        LocalTime id2 = LocalTime.now(zoneId2);
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id1.isBefore(id2));
    }    
}
