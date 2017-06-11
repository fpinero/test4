package com.fpe.test4.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class RamdonCitasImpl implements RamdonCitas {
	
	private final String cita1 = "He aprendido que una vida no vale nada, pero también que nada vale una vida.";
	private final String cita2 = "¿Para qué vivir la vida, si no tienes a tu lado nadie que quiera vivirla contigo?";
	private final String cita3 = "Si el agua es vida, que la beban los muertos.";
	private final String cita4 = "¡Vive alegre y a lo loco, que la vida dura poco!";
	private final String cita5 = "La vida se nos escapa cuando menos te los esperes.... asiq disfrutala a tope!! La vida se nos escapa cuando menos te lo esperas, ¡así que disfrutala a tope!";
	private final String cita6 = "Vive como si este fuera el último día de tu vida, porque el mañana es inseguro, el ayer no te pertenece y solamente el hoy es tuyo.";
	private final String cita7 = "La vida es sólo un sueño que termina cuando te topas con la realidad.";
	private final String cita8 = "Haz de tu vida un sueño y de tu sueño una realidad.";
	private final String cita9 = "Cuando naciste tú, todos alrededor sonreían. Vive la vida de manera que cuando mueras tu sonrías y todos alrededor lloren.";
	private final String cita10 = "Que es la vida, si no se tiene sentimientos para vivir.";
	private final String cita11 = "La vida, en si ¿que es la vida? La vida es lo que tu quieres que sea.";
	private final String cita12 = "Para otra forma de vivir, otra forma de pensar y actuar.";

	private final ArrayList<String> superCitas = new ArrayList<>();
	
	@Override
	public String getCita() {
		
		superCitas.add(cita1);
		superCitas.add(cita2);
		superCitas.add(cita3);
		superCitas.add(cita4);
		superCitas.add(cita5);
		superCitas.add(cita6);
		superCitas.add(cita7);
		superCitas.add(cita8);
		superCitas.add(cita9);
		superCitas.add(cita10);
		superCitas.add(cita11);
		superCitas.add(cita12);
		
		int rndNum =  (int)Math.round(Math.random()*12);
		System.out.println("rndNum = " + rndNum);
		
		return superCitas.get(rndNum);
				
	}

	@Override
	public ArrayList<String> giveMeAllCitas() {
		
		superCitas.add(cita1);
		superCitas.add(cita2);
		superCitas.add(cita3);
		superCitas.add(cita4);
		superCitas.add(cita5);
		superCitas.add(cita6);
		superCitas.add(cita7);
		superCitas.add(cita8);
		superCitas.add(cita9);
		superCitas.add(cita10);
		superCitas.add(cita11);
		superCitas.add(cita12);
		
		return superCitas;
	}

}
