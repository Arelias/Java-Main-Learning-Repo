package com.kodilla.good.patterns.challenges.four;

public class Flight {

    private static Integer masterId = 0;
    private Integer iD;
    private String originCity;
    private String destinationCity;

    public Flight(String originCity, String destinationCity) {

            this.iD = masterId;
            this.originCity = originCity;
            this.destinationCity = destinationCity;
            masterId++;

    }

    public String getOriginCity() {
        return originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!iD.equals(flight.iD)) return false;
        if (!originCity.equals(flight.originCity)) return false;
        return destinationCity.equals(flight.destinationCity);
    }

    @Override
    public int hashCode() {
        int result = iD.hashCode();
        result = 31 * result + originCity.hashCode();
        result = 31 * result + destinationCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "iD=" + iD +
                ", originCity='" + originCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                '}';
    }
}
