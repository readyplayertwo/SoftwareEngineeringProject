package DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gerar_000 on 15/03/2016.
 */
public class TrainDaoImpl implements TrainDao {

    @Autowired
    DataSource myDataSource;


    @Override
    public void insertData(Train train) {
        String sql = "INSERT INTO Train_Schedule"
                + "(Name, Source, Destination, Departure_Time, Arrival_Time, Total_Seats, Kilometers, FirstClassSeats," +
                "SecondClassASeats, SecondClassBSeats, Route, Date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);

        jdbcTemplate.update(
                sql,
                new Object[] { train.getName(), train.getSource(), train.getDestination(), train.getDepartureTime(),
                        train.getArrivalTime(), train.getTotalSeats(), train.getKilometers(), train.getFirstClassSeats(),
                train.getSecondClassASeats(), train.getSecondClassBSeats(), train.getRoute(), train.getDate()});
    }

    @Override
    public List<Train> getTrainList() {

        List trainList = new ArrayList();

        String sql = "select * from Train_Schedule";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
        trainList = jdbcTemplate.query(sql, new TrainRowMapper());
        return trainList;
    }

    @Override
    public void updateData(Train train) {
        String sql = "UPDATE Train_Schedule set Name = ?,Source = ?, Destination = ?, Departure_Time = ?," +
                "Arrival_Time = ?, Total_Seats = ?, Kilometers = ?, FirstClassSeats = ?," +
                "SecondClassASeats = ?, SecondClassBSeats = ?, Route = ?, Date = ? where TrainId = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);

        jdbcTemplate.update(
                sql,
                new Object[] { train.getName(), train.getSource(), train.getDestination(), train.getDepartureTime(),
                train.getArrivalTime(), train.getTotalSeats(), train.getKilometers(), train.getFirstClassSeats(),
                train.getSecondClassASeats(), train.getSecondClassBSeats(), train.getRoute(), train.getDate(), train.getTrainId()});
    }

    @Override
    public void deleteData(String id) {
        String sql = "delete from Train_Schedule where TrainId=" + id;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
        jdbcTemplate.update(sql);
    }

    @Override
    public Train getTrain(String id) {

        List<Train> trainList = new ArrayList<Train>();
        String sql = "select * from Train_Schedule where TrainId= " + id;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
        trainList = jdbcTemplate.query(sql, new TrainRowMapper());
        return trainList.get(0);
    }
}