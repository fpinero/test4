package com.fpe.test4.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpe.test4.service.RamdonCitas;

@Controller
public class Test4App {
	
	private String msg = "Hola desde test4Mvc";
	private Long timeStamp = 0L;
	private String now;
	
	@Autowired
	RamdonCitas ramdonCita;
	
	@RequestMapping("/")
	public String doThings (Model model) {
		
		model.addAttribute("msgApp", msg);
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:s - dd/MM/yyyy");
		timeStamp = System.currentTimeMillis();
		now = sdf.format(timeStamp);
		
		model.addAttribute("sonLas", now);
		
		String laCita = ramdonCita.getCita();
		
		model.addAttribute("citaAzar", laCita);
		
		model.addAttribute("todasCitas", ramdonCita.giveMeAllCitas());
		
		return("showme");
	}

}
