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
public class Candidato {
    private String nome;
    private String resumo;
    private List<String> experiencia;
    private List<String> habilidades;
    private String contato;

    public Candidato(String nome, String resumo, List<String> habilidades , List<String> experiencia, String contato) {
        this.nome = nome;
        this.resumo = resumo;
        this.experiencia = experiencia;
        this.habilidades= habilidades;
        this.contato = contato;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public List<String> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(List<String> experiencia) {
        this.experiencia = experiencia;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
}
