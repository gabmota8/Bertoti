/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_mota.agenciadeempregos;

import java.util.List;


/**
 *
 * @author gabmo
 */
public class Empregador {
    private String Nome_Empresa;
    private String descrição;
    private String anuncio_Emprego;
    private String contato;

    public Empregador(String Nome_Empresa, String descrição, String anuncio_Emprego, String contato) {
        this.Nome_Empresa = Nome_Empresa;
        this.descrição = descrição;
        this.anuncio_Emprego = anuncio_Emprego;
        this.contato = contato;
    }

    public String getNome_Empresa() {
        return Nome_Empresa;
    }

    public void setNome_Empresa(String Nome_Empresa) {
        this.Nome_Empresa = Nome_Empresa;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getAnuncio_Emprego() {
        return anuncio_Emprego;
    }

    public void setAnuncio_Emprego(String anuncio_Emprego) {
        this.anuncio_Emprego = anuncio_Emprego;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    void setAnuncio_Emprego(List<VagaDeEmprego> vagasEmpregador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
