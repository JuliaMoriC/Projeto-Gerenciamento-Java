package br.com.prototipo.api.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.NotBlank; import java.time.LocalDate;
@Entity @Table(name="servicos")
public class Servico {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String descricao;
 private LocalDate dtCadastro=LocalDate.now();
 public Servico(){} public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getDescricao(){return descricao;} public void setDescricao(String descricao){this.descricao=descricao;}
 public LocalDate getDtCadastro(){return dtCadastro;} public void setDtCadastro(LocalDate d){this.dtCadastro=d;}
}
