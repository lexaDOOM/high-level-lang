package edu.penzgtu;

public class App 
{
    public static void main( String[] args )
    {
        // Create and set Camera examplare
        Camera description1 = new Camera();
        description1.setManufacturer("Canon");
        description1.setModel("EOS 1100D");
        description1.setMount("EF-S");
        description1.setSensorType("APS-C");
        description1.setWeight(495);
        description1.setResolutionMP(12.2);

        // Create Camera examplare via default constructor
        Camera defaultDescription = new Camera();

        // Output of class data
        System.out.println(description1.getManufacturer() + description1.getModel() +  
        description1.getMount() + description1.getSensorType() + description1.getWeight() + 
        description1.getResolutionMP());
        System.out.println(defaultDescription.getManufacturer() + defaultDescription.getModel() +  
        defaultDescription.getMount() + defaultDescription.getSensorType() + defaultDescription.getWeight() + 
        defaultDescription.getResolutionMP());
    }
}
