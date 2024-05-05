import java.util.Scanner;
class TravelBooking{
    void book(){
        System.out.println("Booking a travel service");
    }
}
class FlightBooking extends TravelBooking{
    String dest;
    @Override
    void book(){
        // super.book();
        Scanner sc=new Scanner(System.in);
        System.out.print("Destination for flight booking: ");
        dest=sc.nextLine();
        System.out.println("Flight booked");
    }
}
class HotelBooking extends TravelBooking{
    String hotel_name;
    @Override
    void book(){
        // super.book();
        Scanner sc=new Scanner(System.in);
        System.out.print("Hotel Name for booking: ");
        hotel_name=sc.nextLine();
        System.out.println("Hotel Booked");
    }
}
public class overriding3 {
    public static void main(String[] args) {
        TravelBooking t=new TravelBooking();
        t.book();
        FlightBooking f=new FlightBooking();
        f.book();
        HotelBooking h=new HotelBooking();
        h.book();
    }
}
