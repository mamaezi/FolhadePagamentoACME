package app;


import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;


public class RecibodePagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f1,f2,f3,f4;
		
		f1 = new Chefe("boss",1,5000,10,500);
		f2 = new Comissionado("comissionado",100,2000,30);
		f3 = new Horista("horista",200,10,168);
		f4 = new Empreiteiro("empreiteiro",300,20000);
				
		
		System.out.printf("O Salario do %s e R$ %.02f \n" , f1.getNome(), f1.calcularSalario());
		System.out.printf("O Salario do %s e R$ %.02f \n " ,  f2.getNome(), f2.calcularSalario());
		System.out.printf("O Salario do %s e R$ %.02f \n" ,  f3.getNome(), f3.calcularSalario());
		System.out.printf("O Salario do %s e R$ %.02f \n" , f4.getNome(),  f4.calcularSalario());
			
	}

}
