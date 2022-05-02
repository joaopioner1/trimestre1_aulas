package ex1;

public class Carro {

	private String nome;
	private String marca;
	private String tipo;
	
	public Carro(String nome, String marca, String tipo) {
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "-Carro-" + "\nNome: "+nome+"\nMarca: "+marca+"\ntipo: "+tipo+"\n-------\n";
	}
}
