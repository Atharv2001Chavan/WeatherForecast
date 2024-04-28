package com.WeatherAPI.Weatherforecast.Controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@Controller
public class WeatherController {
	 private final RestTemplate restTemplate;

	    public WeatherController(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

	    @GetMapping("/weather/summary")
	    public ResponseEntity<String> getWeatherSummary(
	            @RequestParam("city") String city){

	        HttpHeaders headers = new HttpHeaders();
	        headers.set("x-rapidapi-key", "3b8d99eadamsha26862d9711a591p1c9646jsn359854f3d767");
	        headers.set("x-rapidapi-host", "forecast9.p.rapidapi.com");
	        HttpEntity<String> entity = new HttpEntity<>(headers);

	        ResponseEntity<String> response = restTemplate.exchange(
	                "https://forecast9.p.rapidapi.com/rapidapi/forecast/"+city+"/summary/",
	                HttpMethod.GET,
	                entity,
	                String.class);

	        return ResponseEntity.ok(response.getBody());
	    }

	    @GetMapping("/weather/hourly")
	    public ResponseEntity<String> getHourlyWeather(
	            @RequestParam("city1") String city ){

	        HttpHeaders headers = new HttpHeaders();
	        headers.set("x-rapidapi-key", "3b8d99eadamsha26862d9711a591p1c9646jsn359854f3d767");
	        headers.set("x-rapidapi-host", "forecast9.p.rapidapi.com");
	        HttpEntity<String> entity = new HttpEntity<>(headers);

	        ResponseEntity<String> response = restTemplate.exchange(
	                "https://forecast9.p.rapidapi.com/rapidapi/forecast/"+city+"/hourly/",
	                HttpMethod.GET,
	                entity,
	                String.class);

	        return ResponseEntity.ok(response.getBody());
	    }    
    
}
