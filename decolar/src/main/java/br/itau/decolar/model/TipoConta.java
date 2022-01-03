package br.itau.decolar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_conta")
public class TipoConta {
  
  @Id
  @Column(name = "id_tipoConta")
  private long codigo;

  @Column(name = "tipo", length = 200, nullable = false)
  private String tipo;

  public long getCodigo() {
    return codigo;
  }

  public void setCodigo(long codigo) {
    this.codigo = codigo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
