public class Vehicle {
    private String brand;
    private int year;



    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
    public void displayInfo(){
        System.out.printf("Brand : %s Year : %d",this.brand,this.year);
    }
}
