import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item, Integer> items;
    public Cart() {
        this.items = new HashMap<>();
    }
    public void addItem(Item item) {
        this.items.put(item, items.getOrDefault(item, 0) + 1);
    }
    public void removeItem(Item item) {
        this.items.remove(item);
    }
    public Map<Item, Integer> getItem() {
        return new HashMap<>(items);
    }
    public double getTotal() {
        double totalPrice=0.0;
        for(Map.Entry<Item, Integer> entry : items.entrySet()) {
            totalPrice += entry.getKey().getPrice()*entry.getValue();
        }
        return totalPrice;
    }
    public void clear(){
        items.clear();
    }
}
