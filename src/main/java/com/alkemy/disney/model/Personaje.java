package com.alkemy.disney.model;

import java.awt.Image;
import java.util.ArrayList;

public class Personaje {
	
	private Image imagen;
	private String nombre;
	private int edad;
	private double peso;
	private char historia;
	private ArrayList<PeliculaSerie> pelis;
	
	
	public Personaje(Image imagen, String nombre, int edad, double peso, char historia) {
		this.imagen = imagen;
		setNombre(nombre);
		this.edad = edad;
		this.peso = peso;
		this.historia = historia;
		this.pelis = new ArrayList<PeliculaSerie>();
	}
	
	public void recorrerPelis() {
		for (PeliculaSerie p : pelis) {
			p.getTitulo();
			
			System.out.println("----------------");
		}
	}


	public void detallePersonaje() {
		System.out.println("Estas son sus peliculas de :  " + this.nombre);
		this.recorrerPelis();
		
		System.out.println("--------------");
		
		System.out.println("Imagen: ");
		System.out.println("Esta es sus edad: ");
		System.out.println("Esta es su Historia ");
	}


	public Image getImagen() {
		return imagen;
	}



	private void setImagen(Image imagen) {
		this.imagen = imagen;
	}


	public String getNombre() {
		return nombre;
	}



	private void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new RuntimeException("Nombre no puede ser Vacio o nulo");
		}
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}



	private void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}



	private void setPeso(double peso) {
		this.peso = peso;
	}


	public char getHistoria() {
		return historia;
	}



	private void setHistoria(char historia) {
		this.historia = historia;
	}


	public ArrayList<PeliculaSerie> getPelis() {
		return pelis;
	}



	private void setPelis(ArrayList<PeliculaSerie> pelis) {
		this.pelis = pelis;
	}


	
	public String mostrarPersonajes() {
		return "Personaje [imagen=" + imagen + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	

}
