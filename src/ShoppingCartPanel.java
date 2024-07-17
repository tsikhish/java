import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Map;

public class ShoppingCartPanel extends JPanel {
    private ShoppingCartApp parent;
    private Cart cart;
    private JTextArea cartTextArea;
    private JButton checkoutButton;

    public ShoppingCartPanel(ShoppingCartApp parent, Cart cart) {
        this.parent = parent;
        this.cart = cart;

        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 10, 10, 10));

        // Text area to display cart items
        cartTextArea = new JTextArea(10, 30);
        cartTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cartTextArea);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for total price and checkout button
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JLabel totalLabel = new JLabel("Total Price: $" + cart.getTotal());
        bottomPanel.add(totalLabel);

        checkoutButton = new JButton("Proceed to Checkout");
        checkoutButton.addActionListener(e -> parent.showPurchasePanel()); // Switch to purchase panel
        bottomPanel.add(checkoutButton);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    public void updateCart() {
        // Update the text area with current cart items
        StringBuilder sb = new StringBuilder();
        Map<Item, Integer> itemsMap = cart.getItem();

        for (Map.Entry<Item, Integer> entry : itemsMap.entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            sb.append(item.getName()).append(" - Quantity: ").append(quantity)
                    .append(", Price: $").append(item.getPrice() * quantity).append("\n");
        }

        cartTextArea.setText(sb.toString());
        cartTextArea.setCaretPosition(0); // Scroll to the top
    }
}
