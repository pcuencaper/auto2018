package com.autokm.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class auto {

	
	

	private Integer id;
	@NotNull
	@Size(min=2, max=30,message="mi mensaje")
	private String nombre;
	@NotNull
	@Size(min=2, max=30)
	private String recorrido;
	@NotNull
	@Size(min=2, max=50)
	private String vehiculo;
	
	public Integer getId() {
		return id;
	}
	

	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(String recorrido) {
		this.recorrido = recorrido;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	
	
	
	
}
