import java.util.LinkedList;
import java.util.Scanner;

public class ApartmentLinkedList {
    public static void main(String[] args) {
        LinkedList<Apartment> list = new LinkedList<Apartment>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String input = sc.nextLine().trim();
            if(input.equals("exit")) {
                break;
            }
            String[] details = input.split(",");
            if (details.length != 4) {
                System.out.println("Invalid input format. Please enter details in format: Street Address, Apartment Number, Rent, Bedrooms");
                continue;
            }
            String address = details[0].trim();
            int apartmentNumber = Integer.parseInt(details[1].trim());
            double rent = Double.parseDouble(details[2].trim());
            int quantity = Integer.parseInt(details[3].trim());
            Apartment apartment=new Apartment(address,apartmentNumber,rent,quantity);
            list.add(apartment);
        }
        sc.close();
        list.sort(Apartment::compareTo);
        for(Apartment apartment : list) {
            System.out.println(apartment);
        }
    }
}
