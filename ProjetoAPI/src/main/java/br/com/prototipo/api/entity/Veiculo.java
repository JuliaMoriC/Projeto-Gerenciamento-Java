package br.com.prototipo.api.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity @Table(name="veiculos")
public class Veiculo {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Column(nullable=false,unique=true) private String placa;
 @NotBlank private String modelo;
 @NotBlank private String marca;
 @Min(1886) private int anoModelo;
 @Min(1886) private int anoFabricacao;
 private String cor;
 @PositiveOrZero private double preco;
 public Veiculo() {}
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getPlaca(){return placa;} public void setPlaca(String placa){this.placa=placa;}
 public String getModelo(){return modelo;} public void setModelo(String modelo){this.modelo=modelo;}
 public String getMarca(){return marca;} public void setMarca(String marca){this.marca=marca;}
 public int getAnoModelo(){return anoModelo;} public void setAnoModelo(int v){this.anoModelo=v;}
 public int getAnoFabricacao(){return anoFabricacao;} public void setAnoFabricacao(int v){this.anoFabricacao=v;}
 public String getCor(){return cor;} public void setCor(String cor){this.cor=cor;}
 public double getPreco(){return preco;} public void setPreco(double preco){this.preco=preco;}
}
