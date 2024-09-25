/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_mota.agenciadeempregos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author gabmo
 */
public class VagaDeEmprego {
    private String titulo;
    private String descrição_de_cargo;
    private String empresa;
    private List<String> requiisitos;
    private String localidade;
    private Date data_de_postagem;

    public VagaDeEmprego(String titulo, String descrição_de_cargo, String empresa, List<String> requiisitos, String localidade, Date data_de_postagem) {
        this.titulo = titulo;
        this.descrição_de_cargo = descrição_de_cargo;
        this.empresa = empresa;
        this.requiisitos = requiisitos;
        this.localidade = localidade;
    this.data_de_postagem = data_de_postagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição_de_cargo() {
        return descrição_de_cargo;
    }

    public void setDescrição_de_cargo(String descrição_de_cargo) {
        this.descrição_de_cargo = descrição_de_cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public List<String> getRequiisitos() {
        return requiisitos;
    }

    public void setRequiisitos(List<String> requiisitos) {
        this.requiisitos = requiisitos;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Date getData_de_postagem() {
        return data_de_postagem;
    }

    public void setData_de_postagem(Date data_de_postagem) {
        this.data_de_postagem = data_de_postagem;
    }
    
    
}
