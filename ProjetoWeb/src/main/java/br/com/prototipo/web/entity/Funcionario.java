package br.com.prototipo.web.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity @Table(name="funcionarios") public class Funcionario {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String cpf; @NotBlank private String nome; @PositiveOrZero private double salario;
 public Funcionario(){} public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getCpf(){return cpf;} public void setCpf(String cpf){this.cpf=cpf;} public String getNome(){return nome;} public void setNome(String nome){this.nome=nome;} public double getSalario(){return salario;} public void setSalario(double salario){this.salario=salario;}
}
