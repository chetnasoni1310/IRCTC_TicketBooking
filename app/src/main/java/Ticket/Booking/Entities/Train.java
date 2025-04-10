package Ticket.Booking.Entities;

import java.util.List;
import java.util.Map;
import java.sql.Time;


public class Train {

    private String trainID;
    private String trainNo;

    private List<List<Integer>> seats;

    private Map<String , Time> stationTimes;

    private List<String> stations;

}
