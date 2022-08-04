package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CabDriver;

@RestController
@RequestMapping(path = "/client")
public class ClientController {
	@Autowired
	private RestTemplate template;
	
	@Autowired
    private TripDTO dto;
	
	
	@GetMapping(path = "/cabdrivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/cabdrivers", String.class);
	}
	@GetMapping(path = "/cabdrivers/json")
	public CabDriver[] getDriversAsJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/cabdrivers", CabDriver[].class);
	}
	@GetMapping(path="/cabdrivers/srch/{name}")
	public String getDriversByName(@PathVariable("name") String name) {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/cabdrivers/srch/"+name,String.class);
	}
	 @GetMapping(path="/trips")
	    public String gettrips() {
	    	return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips", String.class);
	    }
	 
	 @GetMapping(path="/drivers/trips/{id}")
		public TripDTO getDriverTrips(@PathVariable("id") int id) {
			CabDriver drivers=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/cabdrivers/"+id,CabDriver.class);
			
			TripDetail[] trips=this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetail/driverid/"+id,TripDetail[].class);
			
			dto.setDriver(drivers);
			
			List<TripDetail> detailSet = Arrays.asList(trips);
			dto.setTrips(detailSet);
			return dto;
		}
} 
	






//	     @GetMapping(path="trips/json")
//	    public TripDetail[] getDriverAsJson() {
//	    	return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips", TripDetail[].class);
//	    }
//	    
//	    @GetMapping(path="srch/drivers/{driverId}")
//	    public TripDetail getByDriverId(@PathVariable("driverId")int id) {
//	    	return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/srch" +id,TripDetail.class);
//	    }
//	@GetMapping(path="/trips")
//	public String gettrips() {
//		return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips",String.class);
//	}

