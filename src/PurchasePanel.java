import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Map;

public class PurchasePanel extends JPanel {
    private ShoppingCartApp parent;
    private Cart cart;
    private JTextArea purchaseTextArea;
    private JButton buyNowButton;

    public PurchasePanel(ShoppingCartApp parent, Cart cart) {
        this.parent = parent;
        this.cart = cart;

        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 10, 10, 10));

        // Text area to display purchase summary
        purchaseTextArea = new JTextArea(10, 30);
        purchaseTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(purchaseTextArea);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for total price and buy now button
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JLabel totalLabel = new JLabel("Total Price: $" + cart.getTotal());
        bottomPanel.add(totalLabel);

        buyNowButton = new JButton("Buy Now");
        buyNowButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Purchase confirmed! Thank you for shopping.");
            cart.clear(); // Clear the cart after purchase
            parent.showItemListPanel(); // Switch back to item list panel
        });
        bottomPanel.add(buyNowButton);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    public void updatePurchase() {
        // Update the text area with purchase summary
        StringBuilder sb = new StringBuilder();
        Map<Item, Integer> itemsMap = cart.getItem();

        for (Map.Entry<Item, Integer> entry : itemsMap.entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            sb.append(item.getName()).append(" - Quantity: ").append(quantity)
                    .append(", Price: $").append(item.getPrice() * quantity).append("\n");
        }

        purchaseTextArea.setText(sb.toString());
        purchaseTextArea.setCaretPosition(0); // Scroll to the top
    }
}