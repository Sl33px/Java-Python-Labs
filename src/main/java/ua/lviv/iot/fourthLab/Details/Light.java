package ua.lviv.iot.fourthLab.Details;

import ua.lviv.iot.fourthLab.BikeDetail;

public class Light extends BikeDetail {
    private String material;
    private String color;

    public Light(String model, double weight, double price, String manufacture, String material, String color) {
        super(model, weight, price, manufacture);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Light:{" +
                "model='" + super.getModel() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                ", price=" + super.getPrice() + '\'' +
                ", manufacture='" + super.getManufacture() + '\'' +
                ", material=" + material + '\'' +
                ", color=" + color + '\'' +
                '}';
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + "material, color";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.material + ", " + this.color;
    }
}
