public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString(){
        return String.format("Brand : %s Model : %s Year : %d%n",
        this.getBrand(),this.getModel(), this.getYear());
    }
}
