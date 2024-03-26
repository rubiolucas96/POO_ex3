package view;

import model.Funcionario;

public class Principal {

	    public static void main(String[] args) {
	        Funcionario funcionario = new Funcionario();
	        funcionario.setNome("Lucas");
	        funcionario.setSalario(3000.0);
	        funcionario.setCargo("Analista junior");

	
	        double salarioLiquido = funcionario.getSalarioLiquido(300, 100);
	        System.out.println("Salário líquido de " + funcionario.getNome() + ": R$" + salarioLiquido + " que possui o cargo de " + funcionario.getCargo());
	    }
	}

