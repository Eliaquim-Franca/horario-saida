package com.get.off.gettingout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.get.off.gettingout.service.GetOutService;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

@RestController
@RequestMapping(value = "/gettingoff")
public class GetOutController {

	@Autowired
	private GetOutService getOut;

	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/work")
	public String getOffWork(
			@Parameter(name = "Hora", 
			description = "00:00:00", 
			required = true, 
			in = ParameterIn.HEADER) 
			@RequestHeader(value = "hora") String horaDeEntrada) {
		return getOut.calculoHorarioSaida(horaDeEntrada);
	}
}
