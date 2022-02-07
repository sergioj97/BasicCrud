package com.example.basiccrud.zumbo_managing;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rewe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String nombre;
	
	@OneToMany
	List<Zumbo> zumbos;
	
	public Rewe() {
		
	}
	
	public Rewe(String nombre) {
		this.nombre = nombre;
	}
	
	public void asociarZumbo(Zumbo zumbo) {
		zumbos.add(zumbo);
	}
	
	public void desasociarZumbo(Zumbo zumbo) {
		zumbos.remove(zumbo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Zumbo> getZumbos() {
		return zumbos;
	}

	public void setZumbos(List<Zumbo> zumbos) {
		this.zumbos = zumbos;
	}

	@Override
	public String toString() {
		return "Rewe [id=" + id + ", nombre=" + nombre + ", zumbos=" + zumbos + "]";
	}
	
	
}