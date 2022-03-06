/**
 * 
 */
package com.airport.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.airport.beans.Flights;

/**
 * @author scheke
 *
 */
public interface DemoService {

	ResponseEntity<Object> getInfo(List<Flights> flightsArray, String date);


}
