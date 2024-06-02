package br.com.karineg;

public class fordFactory extends CarFactory{
	public Carro criarCarro(String modelo, String tipo) {
		return new Carro("Ford", modelo, tipo) {
			void exibirInfo() {
				System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Tipo: " + tipo);
			}
		};
	}
}
