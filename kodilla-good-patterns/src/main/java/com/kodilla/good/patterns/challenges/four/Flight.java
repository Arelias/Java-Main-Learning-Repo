package com.kodilla.good.patterns.challenges.four;

import java.util.List;

public class Flight {

    private static Integer masterId = 0;
    private Integer iD;
    private List<String> Course;

    public Flight(List<String> course) {

            this.iD = masterId;
            this.Course = course;
            masterId++;

    }

    public List<String> getCourse() {
        return Course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!iD.equals(flight.iD)) return false;
        return Course.equals(flight.Course);
    }

    @Override
    public int hashCode() {
        int result = iD.hashCode();
        result = 31 * result + Course.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "iD=" + iD +
                ", Origin=" + Course.get(0) +
                ", Destination=" + Course.get(Course.size()-1) +
                ", Course=" + Course +
                '}';
    }
}
