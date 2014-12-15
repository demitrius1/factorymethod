package com.factorymethod.producao;

import com.factorymethod.modelo.Armario;

public abstract class FabricaArmario {

	public Armario encomendarArmario(String modelo) {
		Armario armario;
		armario = construirArmario(modelo);
		armario.construir();
		armario.entregar();
		return armario;
	}

	abstract Armario construirArmario(String modelo);
}