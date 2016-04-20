package Service;

import DAO.Booking;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by gerar_000 on 17/04/2016.
 */
public class BookingExtractor implements ResultSetExtractor<Booking> {

    public Booking extractData(ResultSet resultSet) throws SQLException,
            DataAccessException {

        Booking booking = new Booking();

        booking.setBookingId(resultSet.getInt(1));
        booking.setTrainId(resultSet.getInt(2));
        booking.setUserId(resultSet.getInt(3));

        return booking;
    }
}
