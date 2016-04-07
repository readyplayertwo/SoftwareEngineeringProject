package Service;

import DAO.Train;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by gerar on 16/03/2016.
 */
public class TrainExtractor implements ResultSetExtractor<Train> {

    public Train extractData(ResultSet resultSet) throws SQLException,
            DataAccessException {

        Train train = new Train();

        train.setTrainId(resultSet.getInt(1));
        train.setName(resultSet.getString(2));
        train.setSource(resultSet.getString(3));
        train.setDestination(resultSet.getString(4));
        train.setDepartureTime(resultSet.getTime(5));
        train.setArrivalTime(resultSet.getTime(6));
        train.setTotalSeats(resultSet.getInt(7));
        train.setKilometers(resultSet.getInt(8));
        train.setFirstClassSeats(resultSet.getInt(9));
        train.setSecondClassASeats(resultSet.getInt(10));
        train.setSecondClassBSeats(resultSet.getInt(11));
        train.setRoute(resultSet.getString(12));
        train.setDate(resultSet.getDate(13));


        return train;
    }
}
