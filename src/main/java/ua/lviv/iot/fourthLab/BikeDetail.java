package ua.lviv.iot.fourthLab;

public class BikeDetail {
    private String model;
    private double weight;
    private double price;
    private String manufacture;

    public BikeDetail(String model, double weight, double price, String manufacture) {
        this.model = model;
        this.weight = weight;
        this.price = price;
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return "BikeDetail:{" +
                "model='" + model + '\'' +
                ", weight=" + weight + '\'' +
                ", price=" + price + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
    public String getHeaders() {
        return "model, weight, price, manufacture";
    }

    public String toCSV() {
        return this.model + ", " + this.weight + ", " + this.price + ", " + this.manufacture;
    }
}
