public class Apartment implements Comparable<Apartment>{
    private String address;
    private int apartmentNumb;
    private double rent;
    private int quantity;
    public Apartment(String address, int apartmentNumb, double price, int quantity) {
        this.address = address;
        this.apartmentNumb = apartmentNumb;
        this.rent = price;
        this.quantity = quantity;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setApartmentNumb(int apartmentNumb) {
        this.apartmentNumb = apartmentNumb;
    }
    public void setRent(double price) {
        this.rent = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getAddress() {
        return address;
    }
    public int getApartmentNumb() {
        return apartmentNumb;
    }
    public double getRent() {
        return rent;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Apartment [address=" + address + ", apartmentNumb=" + apartmentNumb + ", price=" + rent + ", quantity=" + quantity + "]";
    }
    @Override
    public int compareTo(Apartment other) {
        return Double.compare(this.rent, other.rent);
    }
}
