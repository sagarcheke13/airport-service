/**
 * 
 */
package com.airport.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.airport.beans.Flights;
import com.airport.beans.FlightsResponse;

/**
 * @author scheke
 *
 */
@Service
public class DemoServiceImpl implements DemoService{

	private static final String dateFormat = "dd/MM/yyyy";

	@Override
	public ResponseEntity<Object> getInfo(List<Flights> flightsArray, String date) {
		System.out.println("Process for date "+date);
		//return flights for resp day
		List<FlightsResponse> list =  flightsArray.stream()
				.filter(c -> c.getDays().contains(LocalDate.parse(date, DateTimeFormatter.ofPattern(dateFormat)).getDayOfWeek()))
				.sorted(Comparator.comparing(Flights::getDepartureTime))
				.map(data->{
					FlightsResponse resp = new FlightsResponse();
					resp.setDepartureTime(data.getDepartureTime());
					resp.setDestination(data.getDestination());
					resp.setDestinationAirportIATA(data.getDestinationAirportIATA());
					resp.setFlightNumber(data.getFlightNumber());
					return resp;
				})
				.collect(Collectors.toList());
		return new ResponseEntity<>(list, HttpStatus.OK); 
	}

}
