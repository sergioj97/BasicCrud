package com.example.basiccrud.zumbo_managing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Zumbo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private Integer bibis;
	
	@OneToOne
	@Column(nullable=true)
	private Rewe rewe;
	
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
