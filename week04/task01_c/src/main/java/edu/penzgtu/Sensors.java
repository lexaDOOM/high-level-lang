package edu.penzgtu;

public class Sensors {
    private String[] sensorIds;
    private double[] totalTemps;
    private int[] counts;
    private int size;

    // Constructor
    public Sensors(int maxSensors) {
        sensorIds = new String[maxSensors];
        totalTemps = new double[maxSensors];
        counts = new int[maxSensors];
        size = 0;
    }

    // Searching index by ID
    private int findSensorIndex(String sensorId) {
        for (int i = 0; i < size; i++) {
            if (sensorIds[i].equals(sensorId)) {
                return i;
            }
        }
        return -1;
    }

    // Processing sensors data
    public void sensorDataProc(String[] readings) {
        for (String reading : readings) {
            String sensorId = reading.substring(0, 2);
            int temp = Integer.parseInt(reading.substring(2));

            // Проверка диапазона температуры
            if (temp < -50 || temp > 50) {
                System.out.printf("Invalid temperature %d for sensor ID %s. Ignoring this reading.%n", temp, sensorId);
                continue;
            }

            int index = findSensorIndex(sensorId);

            if (index != -1) {
                totalTemps[index] += temp;
                counts[index]++;
            } else {
                sensorIds[size] = sensorId;
                totalTemps[size] = temp;
                counts[size] = 1;
                size++;
            }
        }
    }

    // Calculating average temps
    public double[] calculateAverageTemps() {
        double[] averages = new double[size];
        for (int i = 0; i < size; i++) {
            averages[i] = totalTemps[i] / counts[i];
        }
        return averages;
    }

    // Swap temperature and ID values
    private void swap(int i, int j, double[] averageTemps) {
        String tempId = sensorIds[i];
        sensorIds[i] = sensorIds[j];
        sensorIds[j] = tempId;

        double tempT = averageTemps[i];
        averageTemps[i] = averageTemps[j];
        averageTemps[j] = tempT;
    }

    // Sort by IDs
    public void sortById(double[] averageTemps) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (sensorIds[i].compareTo(sensorIds[j]) > 0) {
                    swap(i, j, averageTemps);
                }
            }
        }
    }

    // Sort by Temperature
    public void sortByTemp(double[] averageTemps) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (averageTemps[i] > averageTemps[j]) {
                    swap(i, j, averageTemps);
                }
            }
        }
    }

    public void printResults(double[] averageTemps) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%s %.1f%n", sensorIds[i], averageTemps[i]);
        }
    }
}