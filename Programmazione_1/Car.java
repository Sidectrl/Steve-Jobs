package Java;

public class Car {
    // #region Attributes
    private double weight = 0;
    private double displacement = 0;
    private String model = "";
    private String brand = "";
    private String type = "";
    private String color = "";
    // #endregion

    // #region Costructor
    public Car(String model, String type, String producer) {
        this.model = model;
        this.brand = producer;
        this.type = type;
    }

    public Car(String brand, String model,  String type, double weight) {
        this.model = model;
        this.brand = brand;
        this.weight = weight;
        this.type = type;
    }

    public Car(String model, String type, double displacement, String brand) {
        this.model = model;
        this.brand = brand;
        this.displacement = displacement;
        this.type = type;
    }

    public Car(String brand, String model,  String type, double displacement, double weight, String color) {
        this.model = model;
        this.brand = brand;
        this.displacement = displacement;
        this.weight = weight;
        this.type = type;
        this.color = color;
    }
    // #endregion

    // #region Get and Set Methods
    public double getDisplacement() {
        return displacement;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDisplacement(Double displacement) {
        this.displacement = displacement;
    }
    // #endregion

    // #region Methods
    public double getAcceleration() {
        return (this.weight / this.displacement) * 100/10;
    }
    public double getAcceleration(double value) {
        
        return Math.round((this.weight / this.displacement) * value/10);
    }

    public String toString() {
        return this.getBrand() + " " + this.getModel() + "\n\rType: " + this.getType() + " - " + "Weight: "
                + this.getWeight() + " - "
                + "Displacement: "
                + this.getDisplacement() + " - " + "Color: " + this.getColor() + " - " + "Acceleration: " + this.getAcceleration() + ".";
    }
    // #endregion
}
