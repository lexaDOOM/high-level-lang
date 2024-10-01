package edu.penzgtu;

public class Camera {
    private String manufacturer;
    private String model;
    private String mount;
    private String sensorType;
    private int weight;
    private double resolutionMP;

    // Getters
    public String getManufacturer() {
        return manufacturer + "\n";
    }

    public String getModel() {
        return "Model - " + model + "\n";
    }

    public String getMount() {
        return "Mount - " + mount + "\n";
    }

    public String getSensorType() {
        return "Sensor Type - " + sensorType + "\n";
    }

    public String getWeight() {
        return String.format("Weight - %d\n", weight);
    }

    public String getResolutionMP() {
        return String.format("Resolution - %f MP\n", resolutionMP);
    }

    // Setters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setResolutionMP(double resolutionMP) {
        this.resolutionMP = resolutionMP;
    }

    // Default constructor
    public Camera() {
        this.manufacturer = "-";
        this.model = "-";
        this.mount = "-";
        this.sensorType = "-";
    }

    // Constructor with parameters
    public Camera(String manufacturer, String model, String mount, String sensorType, int weight, float resolutionMP) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.mount = mount;
        this.sensorType = sensorType;

        if (weight >= 0) {
            this.weight = weight;
        }

        if (resolutionMP >= 0) {
            this.resolutionMP = resolutionMP;
        }
    }
}