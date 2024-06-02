package br.com.karineg;

public class hondaFactory extends CarFactory {
	//construtor da marca honda
	public Carro criarCarro(String modelo, String tipo) {
		return new Carro("Honda", modelo, tipo) {
			void exibirInfo() {
				System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Tipo: " + tipo);
			}
		};
	}
}
