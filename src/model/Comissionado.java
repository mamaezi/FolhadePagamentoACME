package model;

public class Comissionado extends Funcionario{

	public float salarioBase;
	public float comissao;
	
	
	
	public float getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}



	public float getComissao() {
		return comissao;
	}



	public void setComissao(float comissao) {
		this.comissao = comissao;
	}



	@Override
	public float calcularSalario(){
		return this.salarioBase+this.salarioBase*this.comissao/100;

	}



	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome,numeroRegistro);
		// TODO Auto-generated constructor stub
		this.salarioBase = salarioBase;
		this.comissao=comissao;
	}
}
