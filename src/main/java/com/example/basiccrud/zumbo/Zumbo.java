package com.example.basiccrud.zumbo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Zumbo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private Integer bibis;
	
	public Zumbo() {
		
	}

	public Zumbo(String nombre, Integer bibis) {
		this.nombre = nombre;
		this.bibis = bibis;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getBibis() {
		return bibis;
	}

	public void setBibis(Integer bibis) {
		this.bibis = bibis;
	}

	@Override
	public String toString() {
		return "Zumbo [nombre=" + nombre + ", bibis=" + bibis + "]";
	}
	

}
