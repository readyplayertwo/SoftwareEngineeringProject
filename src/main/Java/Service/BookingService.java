package Service;

import DAO.Booking;

import java.awt.print.Book;
import java.util.List;

/**
 * Created by gerar_000 on 17/04/2016.
 */
public interface BookingService {

    public void insertBooking(Booking booking);
    public List<Booking> getBookingList();
    public void deleteBooking(String id);
    public Booking getBooking(String id);
    public void updateBooking(Booking booking);
}
