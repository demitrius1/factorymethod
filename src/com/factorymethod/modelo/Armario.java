package com.factorymethod.modelo;

public abstract class Armario {

	private String tipo;
	private String modelo;

	public void construir() {
		System.out.println("Armario em producao");
	}

	public void entregar() {
		System.out.println("Armario em transporte");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}