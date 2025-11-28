package car;

public class Car {
    private String color;
    private String make;
    private String model;
    private int year;

    public Car(){
         
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
