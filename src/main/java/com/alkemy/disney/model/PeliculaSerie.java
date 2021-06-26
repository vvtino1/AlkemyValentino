package com.alkemy.disney.model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

public class PeliculaSerie {
	private Image imagen;
	private String titulo;
	private Date fechaCreacion;
	private Calificacion calificacion;
	private ArrayList<Personaje> personajesAsociados;
	private Genero genero;
	
	
	public PeliculaSerie(Image imagen, String titulo, Date fechaCreacion, Calificacion calificacion,
		Genero genero) {
		this.imagen = imagen;
		setTitulo(titulo);
		this.fechaCreacion = fechaCreacion;
		this.calificacion = calificacion;
		this.personajesAsociados = new ArrayList<Personaje>();
		this.genero = genero;
	}


	public Genero getGenero() {
		return genero;
	}


	private void setGenero(Genero genero) {
		this.genero = genero;
	}


	public Image getImagen() {
		return imagen;
	}


	private void setImagen(Image imagen) {
		this.imagen = imagen;
	}


	public String getTitulo() {
		return titulo;
	}



	private void setTitulo(String titulo) {
		if (titulo == null || titulo.isEmpty()) {
			throw new RuntimeException("titulo no puede ser Vacio o nulo");
		}
		this.titulo = titulo;
	}
	


	public Date getFechaCreacion() {
		return fechaCreacion;
	}



	private void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Calificacion getCalificacion() {
		return calificacion;
	}



	private  void setCalificacion(Calificacion calificacion) {
		this.calificacion = calificacion;
	}


	public ArrayList<Personaje> getPersonajesAsociados() {
		return personajesAsociados;
	}


	private void setPersonajesAsociados(ArrayList<Personaje> personajesAsociados) {
		this.personajesAsociados = personajesAsociados;
	}
	
	
	public void detallePelis() {
		System.out.println("Imagen: "+ this.imagen);
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Fecha Creacion: " + this.fechaCreacion);
	}
	public void detallePelisConSusPersonajes() {
		System.out.println("Imagen: "+ this.imagen);
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Fecha Creacion: " + this.fechaCreacion);
		System.out.println("Calificacion: "+ this.calificacion);
		System.out.println("Genero: " + this.genero);
		
		System.out.println("Estos son sus Personajes Asociados: ");
		
		for (Personaje personaje : personajesAsociados) {
			personaje.detallePersonaje();
			
			System.out.println("-----------");
		}
	}
	
	
	
	
	
	

}
