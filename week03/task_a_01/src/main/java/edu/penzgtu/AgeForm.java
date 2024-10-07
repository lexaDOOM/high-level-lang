package edu.penzgtu;

public class AgeForm {
    private int age;
    
    // Constructor with parameters
    public AgeForm(int age) {
        this.age = age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeCorrectForm() {
        if (age % 100 >= 11 && age % 100 <= 19) {
            return String.format("%d лет", age);
        } else if (age % 10 == 1) {
            return String.format("%d год", age);
        } else if (age % 10 >= 2 && age % 10 <= 4) {
            return String.format("%d года", age);
        } else {
            return String.format("%d лет", age);
        }
    }
}
