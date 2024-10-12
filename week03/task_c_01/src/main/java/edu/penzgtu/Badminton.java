package edu.penzgtu;

public class Badminton {
    private int day;
    private String temperature;
    private String precipitation;
    private boolean wind;
    private boolean humidity;

    // Constructor
    public Badminton(int day, String temperature, String precipitation, boolean wind, boolean humidity) {
        this.day = day;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.wind = wind;
        this.humidity = humidity;
    }

    private boolean isGoodWeather() {
        if (temperature.equals("warm") && (precipitation.equals("clear") || precipitation.equals("cloudy")) &&
            !wind && !humidity) {
                return true;
            } else {
                return false;
            }
    }

    public String wannaPlayBadminton() {
        if (day == 7 && isGoodWeather()) {
            return "Да";
        } else {
            return "Нет";
        }
    }
}
