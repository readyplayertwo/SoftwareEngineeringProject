package DAO;

import java.util.List;

/**
 * Created by gerar_000 on 17/04/2016.
 */
public interface BookingDao {


    /**
     * Created by gerar on 16/03/2016.
     */

    public void insertBooking(Booking booking);
    public List<Booking> getBookingList();
    public void updateBooking(Booking train);
    public void deleteBooking(String id);
    public Booking getBooking(String id);

}

