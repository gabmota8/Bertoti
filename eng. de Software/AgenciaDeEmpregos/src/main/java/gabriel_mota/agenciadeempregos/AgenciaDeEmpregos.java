/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gabriel_mota.agenciadeempregos;

/**
 *
 * @author gabmo
 */
public class AgenciaDeEmpregos {

    private String Nome_Agencia;
    private String endereço;
    private String site;
    private String telefone;
    private String email;

    public AgenciaDeEmpregos(String Nome_Agencia, String endereço, String site, String telefone, String email) {
        this.Nome_Agencia = Nome_Agencia;
        this.endereço = endereço;
        this.site = site;
        this.telefone = telefone;
        this.email = email;
        
        
    }

    public String getNome_Agencia() {
        return Nome_Agencia;
    }

    public void setNome_Agencia(String Nome_Agencia) {
        this.Nome_Agencia = Nome_Agencia;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
        
    }

