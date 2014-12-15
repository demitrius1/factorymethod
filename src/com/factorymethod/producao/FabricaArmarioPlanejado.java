package com.factorymethod.producao;

import com.factorymethod.modelo.Armario;
import com.factorymethod.modelo.ArmarioClassico;
import com.factorymethod.modelo.ArmarioModerno;

public class FabricaArmarioPlanejado extends FabricaArmario {

	public Armario construirArmario(String modelo) {
		if (modelo.equals("Classico"))
			return new ArmarioClassico();
		else if (modelo.equals("Moderno"))
			return new ArmarioModerno();
		return null;
	}
}