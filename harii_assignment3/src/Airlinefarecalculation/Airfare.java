package Airlinefarecalculation;
public interface Airfare {
    double calculateFare(int distance, int passengers);
    String getAirlineName();
    int getFlightNumber();
}
