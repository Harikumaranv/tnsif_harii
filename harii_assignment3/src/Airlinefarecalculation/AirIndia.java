package Airlinefarecalculation;

public class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    // Parameterized constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Method to calculate the total amount
    public double calculateAmount() {
        return Math.round(hours * costPerHour * 8 * 100.0) / 100.0; // Multiply by 8 and round to 2 decimal places
    }

    @Override
    public double calculateFare(int distance, int passengers) {
        return 0; // Implementation not required for this task
    }

    @Override
    public String getAirlineName() {
        return "Air India";
    }

    @Override
    public int getFlightNumber() {
        return 0; // Not applicable for this task
    }
}