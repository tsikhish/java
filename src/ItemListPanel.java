import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemListPanel extends JPanel {
    private ShoppingCartApp parent;
    private Cart cart;
    private JComboBox<Integer> quantitySelector;

    public ItemListPanel(ShoppingCartApp parent, Cart cart) {
        this.parent = parent;
        this.cart = cart;

        setLayout(new GridLayout(0, 2));

        // Example items (replace with your actual item list setup)
        Item item1 = new Item("Item 1", 10);
        Item item2 = new Item("Item 2", 15);

        // Item 1 UI
        JLabel item1Label = new JLabel(item1.getName() + " - $" + item1.getPrice());
        quantitySelector = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        JButton addItemButton = new JButton("Add to Cart");

        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quantity = (Integer) quantitySelector.getSelectedItem();
                cart.addItem(item1);
                parent.showCartPanel(); // Switch to cart panel after adding item
            }
        });

        add(item1Label);
        add(quantitySelector);
        add(addItemButton);

        // Item 2 UI
        JLabel item2Label = new JLabel(item2.getName() + " - $" + item2.getPrice());
        quantitySelector = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        addItemButton = new JButton("Add to Cart");

        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quantity = (Integer) quantitySelector.getSelectedItem();
                cart.addItem(item2);
                parent.showCartPanel(); // Switch to cart panel after adding item
            }
        });

        add(item2Label);
        add(quantitySelector);
        add(addItemButton);
    }
}
პრობლემის აღწერა: კალათის აპლიკაცია (მარტივი)
მიმოხილვა
ამ პროექტში სტუდენტები შექმნიან გრაფიკულ კალათის აპლიკაციას Java-სა და Swing-ის გამოყენებით
ჩარჩო. აპლიკაცია მომხმარებლებს საშუალებას მისცემს დაამატონ ნივთები კალათაში, ნახონ კალათის შიგთავსი და
გააგრძელეთ შეძენა.
მიზნები
● გაიგეთ როგორ შეიმუშავოთ და დანერგოთ მარტივი კალათის სისტემა.
        ● ისწავლეთ Java Swing-თან მუშაობა მომხმარებლის გრაფიკული ინტერფეისის შესაქმნელად.
        ● მიიღეთ გამოცდილება მოვლენების მართვისა და ინტერფეისის დინამიურად განახლებაში.
        ● ივარჯიშეთ ობიექტზე ორიენტირებული პროგრამირების პრინციპებზე, როგორიცაა ინკაფსულაცია და გამოყენება
მოდელი-ხედვა-კონტროლერი (MVC) არქიტექტურა.
პროექტის მოთხოვნები
1. ნივთის კლასი:
        ○ წარმოადგენს პროდუქტს სახელწოდებით და ფასით.
○ მეთოდები:
        ■ კონსტრუქტორი: ელემენტი (სტრიქონის სახელი, ორმაგი ფასი)
■ მიმღებები: getName(), getPrice()

        2. კალათა კლასი:
        ○ მართავს ნივთების კოლექციას და მათ რაოდენობას.
        ○ მეთოდები:
        ■ კონსტრუქტორი: Cart()
■ addItem (საქონლის ერთეული, არა რაოდენობა)
■ ნივთის ამოღება (საქონელი)
■ getItems(): აბრუნებს ერთეულებისა და რაოდენობების რუკა<Item, Integer>.
■ getTotalPrice(): ითვლის კალათაში არსებული ნივთების მთლიან ფასს.
        ■ clear(): ასუფთავებს ყველა ელემენტს კალათიდან.

        3. ნახეთ კლასები:
        ○ ShoppingCartApp: ძირითადი კლასი, რომელიც აყენებს აპლიკაციის ფანჯარას და ამუშავებს
ნავიგაცია სხვადასხვა პანელებს შორის (ItemListPanel, ShoppingCartPanel,
                                     შესყიდვის პანელი).
        ○ ItemListPanel: აჩვენებს ნივთების სიას
        ხელმისაწვდომია შესაძენად, რაც მომხმარებლებს საშუალებას აძლევს
აირჩიეთ რაოდენობა და დაამატეთ ნივთები კალათაში.

        ○ ShoppingCartPanel: აჩვენებს მიმდინარეობას
ნივთები კალათაში და მთლიანი ფასი. საშუალებას აძლევს
მომხმარებელმა გააგრძელოს გადახდა.

○ PurchasePanel: აჩვენებს საბოლოო
შესყიდვის შეჯამება და ადასტურებს
შესყიდვა.

        ფუნქციონალობა
● ItemListPanel:
        ○ ჩამოთვლილია ხელმისაწვდომი ნივთები (სახელი და ფასი).
        ○ საშუალებას აძლევს მომხმარებლებს აირჩიონ რაოდენობა და დაამატონ ნივთები კალათაში.
○ ღილაკი არჩეული ნივთების კალათაში დასამატებლად და ნავიგაციის კალათის ხედზე.
● ShoppingCartPanel:
        ○ აჩვენებს კალათაში არსებულ ნივთებს მათი რაოდენობითა და მთლიანი ფასებით.
○ ღილაკი შესყიდვის ხედზე გასაგრძელებლად.
        ● შესყიდვის პანელი:
        ○ აჩვენებს ნივთების შეჯამებას და მთლიან ფასს.
        ○ ღილაკი შესყიდვის დასადასტურებლად, რომელიც ასუფთავებს კალათას და ხურავს აპლიკაციას.

განხორციელების დეტალები
● ItemListPanel:
        ○ გამოიყენეთ JPanel GridLayout-ით ელემენტების საჩვენებლად.
○ გამოიყენეთ JComboBox რაოდენობების შესარჩევად.
        ○ გამოიყენეთ JButton კალათაში ნივთების დასამატებლად.
● ShoppingCartPanel:
        ○ გამოიყენეთ JList ან JTable კალათის ელემენტების საჩვენებლად.
○ გამოთვალეთ და აჩვენეთ მთლიანი ფასი.
○ გამოიყენეთ JButton გადახდის გასაგრძელებლად.
        ● შესყიდვის პანელი:
        ○ ShoppingCartPanel-ის მსგავსი ნივთების ჩვენებისთვის.
        ○ აჩვენეთ დამადასტურებელი შეტყობინება შეძენისას და გაასუფთავეთ კალათა.

მომხმარებლის ინტერფეისის განლაგება

1. ItemListPanel:
        ○ ნივთების სია დასახელების, ფასისა და რაოდენობის ამომრჩევით.
        ○ ღილაკი "კალათაში დამატება" ბოლოში.
2. ShoppingCartPanel:
        ○ კალათის ნივთების სია რაოდენობებითა და ფასებით.
        ○ მთლიანი ფასი ზევით.
○ ღილაკი "გადასვლა შეკვეთაზე" ბოლოში.
3. შესყიდვის პანელი:
        ○ კალათის ნივთების შეჯამება რაოდენობებითა და ფასებით.
        ○ მთლიანი ფასი ზევით.
○ ღილაკი "ყიდვა ახლა" ბოლოში.

        დამატებითი ინსტრუქციები
● დარწმუნდით, რომ გაუმკლავდეთ ზღვარს, როგორიცაა ნულოვანი რაოდენობის დამატება ან შეძენის მცდელობა
ცარიელი ეტლით.
        ● გამოიყენეთ განლაგების შესაბამისი მენეჯერები UI-ში კომპონენტების ორგანიზებისთვის.
● დარწმუნდით, რომ UI განახლდება დინამიურად, როდესაც ელემენტი ემატება ან ამოღებულია კალათიდან.
● ჩართეთ კომენტარები და დოკუმენტაცია სიცხადისთვის.
ამ პროექტის განხორციელებით სტუდენტები მიიღებენ პრაქტიკულ გამოცდილებას Java GUI-ის შემუშავებაში
და ობიექტზე ორიენტირებული პროგრამირების პრინციპების უფრო ღრმა გაგება რეალურ სამყაროში.
