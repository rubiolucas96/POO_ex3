package model;

public class Funcionario {
 private String nome;
 private double salario;
 private String cargo;
 private static final double salarioMinimo = 1412.00;


 public Funcionario() {
     nome = "";
     salario = salarioMinimo; 
     cargo = "";
 }


 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public double getSalario() {
     return salario;
 }

 public void setSalario(double salario) {
     if (salario < salarioMinimo) {
         this.salario = salarioMinimo;
         System.out.println("O salário não pode ser inferior ao salário mínimo. O salário foi ajustado para o salário mínimo.");
     } else {
         this.salario = salario;
     }
 }


 public String getCargo() {
     return cargo;
 }

 public void setCargo(String cargo) {
     this.cargo = cargo;
 }


 public double getSalarioLiquido(double descontos, double beneficios) {
     double salarioLiquido = salario - descontos + beneficios;
     return Math.max(salarioLiquido, salarioMinimo); // Retorna o maior entre o salário líquido e o salário mínimo
 }
}
