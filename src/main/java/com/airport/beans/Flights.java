package com.airport.beans;

import java.time.DayOfWeek;
import java.util.List;

public class Flights {
	private String departureTime;
	private String destination;
	private String destinationAirportIATA;
	private String flightNumber;
	private List<DayOfWeek> days;
	
	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the destinationAirportIATA
	 */
	public String getDestinationAirportIATA() {
		return destinationAirportIATA;
	}
	/**
	 * @param destinationAirportIATA the destinationAirportIATA to set
	 */
	public void setDestinationAirportIATA(String destinationAirportIATA) {
		this.destinationAirportIATA = destinationAirportIATA;
	}
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	/**
	 * @return the days
	 */
	public List<DayOfWeek> getDays() {
		return days;
	}
	/**
	 * @param days the days to set
	 */
	public void setDays(List<DayOfWeek> days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "Flights [departureTime=" + departureTime + ", destination=" + destination + ", destinationAirportIATA="
				+ destinationAirportIATA + ", flightNumber=" + flightNumber + ", days=" + days+ "]";
	}
		
}
