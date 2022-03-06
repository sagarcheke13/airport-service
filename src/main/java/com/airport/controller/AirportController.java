/**
 * 
 */
package com.airport.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airport.service.AirportService;
import com.airport.service.DemoService;

/**
 * @author scheke
 *
 */
@RestController
public class AirportController {
	
	@Autowired
	private DemoService demoService;
	
	@Autowired
	private AirportService airportService;
	
    @GetMapping("/hello")
    public ResponseEntity<Object> getInfo(@RequestHeader Map<String, String> headers,
    		@RequestParam String date) {
        return demoService.getInfo(airportService.flightsArray, date);
    }  
        
}