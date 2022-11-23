package ua.lviv.iot.fourthLab.Details;

import ua.lviv.iot.fourthLab.BikeDetail;

public class Pump extends BikeDetail {

    private double pressure;
    private String color;

    public Pump(String model, double weight, double price, String manufacture, double pressure, String color) {
        super(model, weight, price, manufacture);
        this.pressure = pressure;
        this.color = color;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pump:{" +
                "model='" + super.getModel() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                ", price=" + super.getPrice() + '\'' +
                ", manufacture='" + super.getManufacture() + '\'' +
                ", pressure=" + pressure + '\'' +
                ", color=" + color + '\'' +
                '}';
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + "pressure, color";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.pressure + ", " + this.color;
    }
}
