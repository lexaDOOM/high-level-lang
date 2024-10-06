package edu.penzgtu;

public class Author {

    // Attributes
    private String name;
    private int birthYear;
    
    // Default Constructor
    public Author() {
        this.name = "Unknown";
        this.birthYear = 0;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
