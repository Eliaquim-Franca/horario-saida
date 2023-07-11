package com.get.off.gettingout.service;

import java.sql.Time;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class GetOutService {	
	public String calculoHorarioSaida(String horarioEntrada) {
		LocalTime hDeEntrada = Time.valueOf(horarioEntrada).toLocalTime();
		String saida = hDeEntrada.plusHours(9).plusMinutes(48).toString();
		return "Você deve sair as: "+ saida;
	}

}
