package Airlinefarecalculation;

public class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    // Parameterized constructor
    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Method to calculate the total amount
    public double calculateAmount() {
        return Math.round(hours * costPerHour * 4 * 100.0) / 100.0; // Multiply by 4 and round to 2 decimal places
    }

    @Override
    public double calculateFare(int distance, int passengers) {
        return 0; // Implementation not required for this task
    }

    @Override
    public String getAirlineName() {
        return "King Fisher";
    }

    @Override
    public int getFlightNumber() {
        return 0; // Not applicable for this task
    }
}


