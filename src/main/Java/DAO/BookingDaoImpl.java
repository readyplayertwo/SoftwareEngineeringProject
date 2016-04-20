package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gerar_000 on 17/04/2016.
 */
public class BookingDaoImpl  {

//    @Autowired
//    DataSource myDataSource;
//
//
//    @Override
//    public void insertBooking(Booking booking) {
//        String sql = "INSERT INTO Booking"
//            + "(Name, Source, Destination, Departure_Time, Arrival_Time, Total_Seats, Kilometers, FirstClassSeats," +
//            "SecondClassASeats, SecondClassBSeats, Route, Date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
//
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
//
//        jdbcTemplate.update(
//            sql,
//            new Object[] { booking.getName(), booking.getSource(), booking.getDestination(), booking.getDepartureTime(),
//                booking.getArrivalTime(), booking.getTotalSeats(), booking.getKilometers(), booking.getFirstClassSeats(),
//                booking.getSecondClassASeats(), booking.getSecondClassBSeats(), booking.getRoute(), booking.getDate()});
//    }
//
//    @Override
//    public List<Booking> getBookingList() {
//
//        List trainList = new ArrayList();
//
//        String sql = "select * from Train_Schedule";
//
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
//        trainList = jdbcTemplate.query(sql, new TrainRowMapper());
//        return trainList;
//    }
//
//    @Override
//    public void updateData(Booking booking) {
//        String sql = "UPDATE Booking set  = ?,Source = ?, Destination = ?, Departure_Time = ?," +
//            "Arrival_Time = ?, Total_Seats = ?, Kilometers = ?, FirstClassSeats = ?," +
//            "SecondClassASeats = ?, SecondClassBSeats = ?, Route = ?, Date = ? where TrainId = ?";
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
//
//        jdbcTemplate.update(
//            sql,
//            new Object[] { booking.get(), booking.getUserId(), booking.getDestination(), booking.getDepartureTime(),
//                booking.getArrivalTime(), booking.getTotalSeats(), booking.getKilometers(), booking.getFirstClassSeats(),
//                booking.getSecondClassASeats(), booking.getSecondClassBSeats(), booking.getRoute(), booking.getDate(), booking.getTrainId()});
//    }
//
//    @Override
//    public void deleteBooking(String id) {
//        String sql = "delete from Booking where BookingId=" + id;
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
//        jdbcTemplate.update(sql);
//    }
//
//    @Override
//    public Train getTrain(String id) {
//
//        List<Train> trainList = new ArrayList<Train>();
//        String sql = "select * from Train_Schedule where TrainId= " + id;
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
//        trainList = jdbcTemplate.query(sql, new TrainRowMapper());
//        return trainList.get(0);
//    }
}
