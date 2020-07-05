package services;
import java.time.LocalDate;

import model.*;

public class FareCalculator extends Booking{	
	
	Booking b = new Booking();
	
	public double book(Hotel hotel) {
		LocalDate toDate = hotel.getTodate();
		LocalDate fromDate = hotel.getFromdate();
		String occup = hotel.getOccupancy();
		int totalPersons = hotel.getNoOfPersons();
		int rate = hotel.getRates();
		double d = 0;
		
		if(fromDate.compareTo(toDate)<1 ) {			
				double ans;
				ans = b.booking(totalPersons, rate);
				return ans;						
		}
			else 
				return d;
	}
	
	public double book(Flight flight) {
		LocalDate toDate = flight.getTo();
		LocalDate fromDate = flight.getFrom();
		String trip = flight.getTriptype();
		int totalPersons = flight.getNoOfPersons();
		int rate = flight.getRates();
		double ans=0;
		if(trip=="one-way") {
			ans=b.booking(totalPersons, rate);
		}
		
		else{
			if(fromDate.compareTo(toDate)<1) {
				ans=b.booking(totalPersons, rate);
			}
		}
		return ans;
	}
	
	public double book(Train train) {
		int totalPersons = train.getNoOfPersons();
		String berth = train.getBerth();
		int rate = train.getRates();
		LocalDate date = train.getDate();
		Double ans =b.booking(totalPersons, rate);
		return ans;
	}
	
	public double book(Bus bus) {
		int totalPersons = bus.getNoOfPersons();
		String busType = bus.getBusType();
		int rate = bus.getRates();
		LocalDate date = bus.getDate();
		Double ans =b.booking(totalPersons, rate);
		return ans;
	}	
	
}
// Type your code