package br.com.karineg;

public class fiatFactory extends CarFactory {

	//construtor
	public Carro criarCarro(String modelo, String tipo ) {
		return new Carro("Fiat", modelo, tipo) {
	
		//implementa método da classe abstrata Carro
			void exibirInfo() {
				System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Tipo: " + tipo);
			}
		};
	}
}
