package services.impl;

import models.*;
import services.IContactService;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ContactServiceImpl implements IContactService {
    private static Queue<Booking> queueBooking = new LinkedList<>( );
    static BookingServiceImpl bookingService = new BookingServiceImpl();
    static {
        for (Booking booking : bookingService.getList()) {
            queueBooking.add(booking);
        }
    }


    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    @Override
    public List<Contract> getList() {
        return null;
    }
//    public Queue<Booking> getListContract () {
//        return queueBooking;
//    }

}
