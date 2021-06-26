package com.alkemy.disney.model;

import java.util.ArrayList;
import java.util.Comparator;

import org.springframework.web.bind.annotation.GetMapping;


public class Disney {
	public static final int EDAD_DESEADA = 18;
	public static final String GENERO_DESEADO = "MICKYE";
	private ArrayList<Personaje> personajes;
	private ArrayList<PeliculaSerie> pelis;
	
	
	public Disney() {
		this.personajes = new ArrayList<Personaje>();
		this.pelis = new ArrayList<PeliculaSerie>();
	}
	
	@GetMapping("/characters")
	public void listadoDePersonajes() {
		System.out.println("Estos son los Persoajes :)");
		for (Personaje p : personajes) {
			p.mostrarPersonajes();
			System.out.println("---------------------");
		}
	}
	
	public Personaje buscarPersonajeFiltro(String nombre) {
		Personaje personajeAbuscar = this.buscarPersonaje(nombre);
		if(personajeAbuscar != null ) {
			if (personajeAbuscar.getEdad() < EDAD_DESEADA) {
				System.out.println("Este personaje cumple con el requisito de edad: "+ personajeAbuscar.mostrarPersonajes());
			}
		}
		return personajeAbuscar;	
	}
	
	public Personaje buscarPersonaje(String nombre) {
		Personaje personajeAbuscar = null;
		int i = 0;
		
		while (i < this.personajes.size() && personajeAbuscar ==null) {
			if (personajes.get(i).getNombre().equals(personajeAbuscar)) {
				personajeAbuscar =  personajes.get(i);
			}else {
				i++;
			}
		}
		return personajeAbuscar;
	}
	
	
	public boolean crearPersonaje(Personaje personaje) {
		boolean pudo  =  false;
		Personaje personajeCrear = this.buscarPersonaje(personaje.getNombre());
		if (personajeCrear == null) {
			this.personajes.add(personaje);
			pudo = true;
		}else {
			System.out.println("El personaje ya ha sido creado x.x");
		}
		return pudo;		
	}
	
	public boolean eliminarPersonaje(Personaje personaje) {
		boolean pudo= false;
		Personaje personajeEliminar = this.buscarPersonaje(personaje.getNombre());
		if(personajeEliminar != null) {
			this.personajes.remove(personaje);
			pudo = true;
		}else {
			System.out.println("No existe el personaje x.x");
		}
		return pudo;
	}
	
	public void listadoDePeliculas() {
		for (PeliculaSerie peli : pelis) {
			peli.detallePelis();
			
			System.out.println("----------------");
		}
	}
	
	
	public PeliculaSerie buscarPeli(String titulo) {
		PeliculaSerie peliAbuscar = null;
		int i = 0;
		
		while (i < this.pelis.size() && peliAbuscar ==null) {
			if (pelis.get(i).getTitulo().equals(titulo)) {
				peliAbuscar =  pelis.get(i);
			}else {
				i++;
			}
		}
		return peliAbuscar;
	}
	
	
	public boolean crearPeli(PeliculaSerie peli) {
		boolean pudo  =  false;
		PeliculaSerie peliAcrear = this.buscarPeli(peli.getTitulo());
		if (peliAcrear == null) {
			this.pelis.add(peli);
			pudo = true;
		}else {
			System.out.println("La pelicula ya ha sido creado x.x");
		}
		return pudo;		
	}
	
	
	public boolean eliminarPeli(PeliculaSerie peli) {
		boolean pudo= false;
		PeliculaSerie peliAeliminar = this.buscarPeli(peli.getTitulo());
		if(peliAeliminar != null) {
			this.pelis.remove(peli);
			pudo = true;
		}else {
			System.out.println("No existe la Pelicula x.x");
		}
		return pudo;
	}
	
	
	public PeliculaSerie buscarPeliFiltro(String titulo) {
		PeliculaSerie peliAbuscar = this.buscarPeli(titulo);
		if(peliAbuscar != null ) {
			for (PeliculaSerie p : pelis) {
				p.getGenero();
				if(p.getGenero().equals(GENERO_DESEADO));
				System.out.println("Genero encontrado");
			}
			Comparator<? super PeliculaSerie> fechaCreacion = (Comparator<? super PeliculaSerie>) peliAbuscar.getFechaCreacion();
			pelis.sort(fechaCreacion);
		}
		return peliAbuscar;	
	}
	
	
	
	
	
	
	
	
	
	
	
}
