import javax.swing.*;

public class ShoppingCartApp {
    private JFrame frame;
    private JPanel currentPanel;
    private ItemListPanel itemListPanel;
    private ShoppingCartPanel cartPanel;
    private PurchasePanel purchasePanel;
    private Cart cart;

    public ShoppingCartApp() {
        frame = new JFrame("Shopping Cart Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cart = new Cart();
        itemListPanel = new ItemListPanel(this, cart);
        cartPanel = new ShoppingCartPanel(this, cart);
        purchasePanel = new PurchasePanel(this, cart);

        showItemListPanel();
    }

    public void showItemListPanel() {
        if (currentPanel != null) {
            frame.getContentPane().remove(currentPanel);
        }
        currentPanel = itemListPanel;
        frame.getContentPane().add(currentPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    public void showCartPanel() {
        if (currentPanel != null) {
            frame.getContentPane().remove(currentPanel);
        }
        currentPanel = cartPanel;
        cartPanel.updateCart();
        frame.getContentPane().add(currentPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    public void showPurchasePanel() {
        if (currentPanel != null) {
            frame.getContentPane().remove(currentPanel);
        }
        currentPanel = purchasePanel;
        purchasePanel.updatePurchase();
        frame.getContentPane().add(currentPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShoppingCartApp();
        });
    }
}
