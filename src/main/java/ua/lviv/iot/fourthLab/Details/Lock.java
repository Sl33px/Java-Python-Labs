package ua.lviv.iot.fourthLab.Details;

import ua.lviv.iot.fourthLab.BikeDetail;

public class Lock extends BikeDetail {
    private String material;
    private int lengthOfCable;

    public Lock(String model, double weight, double price, String manufacture, String material, int lengthOfCable) {
        super(model, weight, price, manufacture);
        this.material = material;
        this.lengthOfCable = lengthOfCable;
    }

    public String getMaterial() {
        return material;
    }

    public int getLengthOfCable() {
        return lengthOfCable;
    }

    @Override
    public String toString() {
        return "Lock:{" +
                "model='" + super.getModel() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                ", price=" + super.getPrice() + '\'' +
                ", manufacture='" + super.getManufacture() + '\'' +
                ", material=" + material + '\'' +
                ", lengthOfCable=" + lengthOfCable + '\'' +
                '}';
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + "material, lengthOfCable";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.material + ", " + this.lengthOfCable;
    }
}
