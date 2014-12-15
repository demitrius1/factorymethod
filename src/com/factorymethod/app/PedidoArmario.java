package com.factorymethod.app;

import com.factorymethod.modelo.Armario;
import com.factorymethod.producao.FabricaArmario;
import com.factorymethod.producao.FabricaArmarioModulado;
import com.factorymethod.producao.FabricaArmarioPlanejado;

public class PedidoArmario {

	public static void main(String[] args) {
		FabricaArmario fabricaArmarioPlanejado = new FabricaArmarioPlanejado();
		FabricaArmario fabricaArmarioModulado = new FabricaArmarioModulado();
		
		Armario armario = fabricaArmarioPlanejado.encomendarArmario("Clássico");
		System.out.println("Pedido: " + armario.getTipo() + " " + armario.getModelo());
		armario = fabricaArmarioModulado.encomendarArmario("Moderno");
		System.out.println("Pedido: " + armario.getTipo() + " " + armario.getModelo()); 
	}
}