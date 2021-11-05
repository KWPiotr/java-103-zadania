package CityBike;

import java.time.LocalDateTime;

public class Travel {
    private String id;
    private String bikeNumber;
    private LocalDateTime travelStart;
    private LocalDateTime travelEnd;
    private String startStation;
    private String endStation;


    public Travel(String id) {
        this.id = id;
    }

    public Travel(String id, String bikeNumber, LocalDateTime travelStart, LocalDateTime travelEnd, String startStation, String endStation) {
        this.id = id;
        this.bikeNumber = bikeNumber;
        this.travelStart = travelStart;
        this.travelEnd = travelEnd;
        this.startStation = startStation;
        this.endStation = endStation;

    }

    public String getId() {
        return id;
    }

    public String getBikeNumber() {
        return bikeNumber;
    }

    public LocalDateTime getTravelStart() {
        return travelStart;
    }

    public LocalDateTime getTravelEnd() {
        return travelEnd;
    }

    public String getStartStation() {
        return startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    @Override
    public String toString() {
        return String.format("ID przejazdu: %s, numer rowera: %s, czas startu: %s, czas zakończenia: %s, stacja początkowa: %s, stacja końcowa: %s\n", id, bikeNumber, travelStart, travelEnd, startStation, endStation);
    }
}