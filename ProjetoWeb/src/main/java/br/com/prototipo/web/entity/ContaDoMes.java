package br.com.prototipo.web.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDate;
@Entity @Table(name="contas_do_mes") public class ContaDoMes {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotBlank private String descricao; @PositiveOrZero private double valor; private LocalDate dtCadastro=LocalDate.now();
 public ContaDoMes(){} public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getDescricao(){return descricao;} public void setDescricao(String descricao){this.descricao=descricao;} public double getValor(){return valor;} public void setValor(double valor){this.valor=valor;} public LocalDate getDtCadastro(){return dtCadastro;} public void setDtCadastro(LocalDate d){this.dtCadastro=d;}
}
