/**
 * 
 */
package com.airport.service;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.airport.beans.Flights;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

/**
 * @author scheke
 *
 */
@Service
public class AirportService {

	private static final String X = "x";
	private static final String FILE_NAME = "src/main/resources/files/flights.csv";
	public List<Flights> flightsArray = new ArrayList<>();

	@PostConstruct
	public void init() {
		try{
			Path path = Paths.get(FILE_NAME);
            CSVReader reader= new CSVReaderBuilder(new FileReader(path.toFile())).
                            withSkipLines(1). // Skiping firstline as it is header
                            build();
            flightsArray = reader.readAll()
		            		.stream().map(data-> 
		            		{
		            			List<DayOfWeek> days = new ArrayList<>();
				            	Flights flight= new Flights();
				            	flight.setDepartureTime(data[0]);
				            	flight.setDestination(data[1]);
				            	flight.setDestinationAirportIATA(data[2]);
				            	flight.setFlightNumber(data[3]);
				            	
				            	if (data[4].equalsIgnoreCase(X)) {
				            		days.add(DayOfWeek.SUNDAY);
				            	}
								if (data[5].equalsIgnoreCase(X)) {
				            		days.add(DayOfWeek.MONDAY);
								}
								if (data[6].equalsIgnoreCase(X)) {
									days.add(DayOfWeek.TUESDAY);
								}
								if (data[7].equalsIgnoreCase(X)) {
									days.add(DayOfWeek.WEDNESDAY);
								}
								if (data[8].equalsIgnoreCase(X)) {
									days.add(DayOfWeek.THURSDAY);
								}
								if (data[9].equalsIgnoreCase(X)) {
									days.add(DayOfWeek.FRIDAY);
								}
								if (data[10].equalsIgnoreCase(X)) {
									days.add(DayOfWeek.SATURDAY);
								}
								flight.setDays(days);
				            	
				            	return flight;}
		            			
		            				)
		            		.collect(Collectors.toList());
		        } catch (IOException | CsvException e) {
		            e.printStackTrace();
		        }
	
	}
}