package Service;

import DAO.Booking;
import DAO.BookingDao;
import DAO.Train;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by gerar_000 on 17/04/2016.
 */
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingDao bookingDao;

    @Override
    public void insertBooking(Booking booking) {
        bookingDao.insertBooking(booking);
    }

    @Override
    public List<Booking> getBookingList() {
        return bookingDao.getBookingList();
    }

    @Override
    public void deleteBooking(String id) {
        bookingDao.deleteBooking(id);

    }

    @Override
    public Booking getBooking(String id) {
        return bookingDao.getBooking(id);
    }

    @Override
    public void updateBooking(Booking booking) {
        bookingDao.updateBooking(booking);
    }
}
