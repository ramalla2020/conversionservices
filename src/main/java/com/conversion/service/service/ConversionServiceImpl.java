package com.conversion.service.service;

import org.springframework.stereotype.Service;
import com.conversion.service.utils.Constants;

@Service  
public class ConversionServiceImpl implements ConversionService {

	
	public double celsiusToKelvin(double celsius) {  
		return celsius + Constants.KELVIN_TO_CELCIOUS_FACTOR;
	}

	
	public double kelvinTocelsius(double kelvin) {
		return kelvin - Constants.KELVIN_TO_CELCIOUS_FACTOR;
	}

	
	public double milesToKilometers(double miles) {
		return miles * Constants.MILE_TO_KILOMETER_FACTOR;
	}
	
	
	public double kilometersToMiles(double km) {
		return km*Constants.KILOMETER_TO_MILE_FACTOR;
	}


}
