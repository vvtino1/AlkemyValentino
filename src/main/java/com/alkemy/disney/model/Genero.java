package com.alkemy.disney.model;

import java.awt.Image;
import java.util.ArrayList;

public class Genero {
	
	private String nombre;
	private Image imagen;
	private ArrayList<PeliculaSerie> pelisAsociadas;
	
	
	
	public Genero(String nombre, Image imagen, ArrayList<PeliculaSerie> pelisAsociadas) {
		this.nombre = nombre;
		this.imagen = imagen;
		this.pelisAsociadas = new ArrayList<PeliculaSerie>();
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public ArrayList<PeliculaSerie> getPelisAsociadas() {
		return pelisAsociadas;
	}



	public void setPelisAsociadas(ArrayList<PeliculaSerie> pelisAsociadas) {
		this.pelisAsociadas = pelisAsociadas;
	}
	
	
	
	
	

}
