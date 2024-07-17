import java.util.LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class ApartmentLinkedList2 {
    public static void main(String[] args) {
        LinkedList<Apartment> list = new LinkedList<Apartment>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String address=sc.nextLine();
            if(address.equals("exit")){
                break;
            }
            int number=sc.nextInt();
            int quantity=sc.nextInt();
            int rent=sc.nextInt();
            Apartment apartment = new Apartment(address,number,quantity,rent);
            list.add(apartment);
        }
        list.sort(null);
        for(Apartment apartment : list){
            System.out.println(apartment);
        }
        System.out.println("Please enter your address to remove it from the list");
        String address=sc.nextLine();
        for(Apartment apartment : list){
            if(apartment.getAddress().equals(address)){
                list.remove(apartment);
            }
        }
        for(Apartment apartment : list){
            System.out.println(apartment);
        }
    }
}
//    Apartment.java
//    ნინომ იყიდა შენობები, რომლებიც შეიცავს გასაქირავებელ ბინებს. შექმენით ბინების
//    Apartment კლასი, რომელიც შეიცავს ველებს:
//            - Street Address,
//- Apartment Number,
//- Rent ყოველთვიური ქირავნობის ოდენობას
//- საძინებლების რაოდენობას
//    ასევე მეთოდებს:
//            - კონსტრუქტორს, რომელიც ანიჭებს ველებს მნიშვნელობებს,
//- toString() მეთოდი, რომელიც აბრუნებს Apartment მნიშვნელობებს
//- compareTo() მეთოდი, რომელიც ადარებს ბინის ობიექტებს rent-ის საფუძველზე.
//            - ნებისმიერ სხვა მეთოდს, რომელიც, თქვენი აზრით, შეიძლება დაგჭირდეთ.
//            ApartmentsLinkedList.java
//    დაწერეთ აპლიკაცია, რომელიც შეიცავს LinkedList-ს, რომელშიც ინახება ბინის ობიექტები.
//    შემოაყვანინეთ მომხმარებელს კონსოლიდან ველები/მნიშვნელობები ბინისთვის და
//    დაამატეთ ისინი LinkedList-ში, იქამდე სანამ მომხმარებელი არ შეიყვანს რაიმე შენსავე
//    შემოღებულ sentinel value-ს.
//    დაალაგეთ ბინები ქირის ღირებულების ზრდის მიხედვით და შემდეგ აჩვენეთ დალაგებული
//    სია.
//            ApartmentsLinkedList2.java
//    ნინო ზოგჯერ ყიდის თავის ერთ-ერთ შენობას. დააფდეითეთ ApartmentsLinkedList
//    აპლიკაცია ისე, რომ მონაცემების შეყვანის და ბინის ობიექტების სიის გამოჩენის შემდეგ,
//    აპლიკაცია სთხოვს მომხმარებელს ქუჩის მისამართ, რათა ამოიღოს ყველა ბინა შესაბამისი
//    ველით ამ სიიდან. კვლავ აჩვენეთ ბინების სია.
