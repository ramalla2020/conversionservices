package com.conversion.service.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conversion.service.dto.ConversionRequestDto;
import com.conversion.service.service.ConversionService;

@RestController
@RequestMapping("/conversions")
public class ConversionController {

	@Autowired
	private ConversionService conversionService;

	
	@PostMapping("/ktoc")
	public double kelvinToCelsius(@Valid @RequestBody ConversionRequestDto request){
		return conversionService.kelvinTocelsius(request.getInputValue());
	}

	
	@PostMapping("/ctok")
	public double celsiusToKelvin(@Valid @RequestBody ConversionRequestDto request){
		return conversionService.celsiusToKelvin(request.getInputValue());
	}
	
	@PostMapping("/mtok")
	public double milesToKilometers(@Valid @RequestBody ConversionRequestDto request){
		return conversionService.milesToKilometers(request.getInputValue());
	}
	
	
	@PostMapping("/ktom")
	public double kilometersToMiles(@Valid @RequestBody ConversionRequestDto request){
		return conversionService.kilometersToMiles(request.getInputValue());
	}

}
