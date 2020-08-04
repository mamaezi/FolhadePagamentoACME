package model;

public class Empreiteiro extends Funcionario {
	
	private float valorEmpreita;

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	@Override
	public float calcularSalario() {
		return this.valorEmpreita;
	}

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}

}
