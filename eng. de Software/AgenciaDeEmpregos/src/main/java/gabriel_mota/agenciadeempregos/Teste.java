/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_mota.agenciadeempregos;

/**
 *
 * @author gabmo
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Teste {
  

public class Main {
    public static void main(String[] args) {
        // Criando um empregador
        Empregador empregador = new Empregador("Wizards of Api", "Startup de desenvolvimento de Softwares", "Vaga  desenvolvedor Java Junior", "contato@Wizards.of.Api.com.br");

        // Criando uma vaga de emprego
        List<String> requisitos = new ArrayList<>();
        requisitos.add("Conhecimento em Java");
        requisitos.add("Experiência em desenvolvimento web");
        requisitos.add("Conhecimento em Metodologia Scrum");
        requisitos.add("trabalho em Time");
        requisitos.add("Adaptabilidade");
        requisitos.add("Estar Cursando Nivel Superior em Areas de Tecnologia");
        
        VagaDeEmprego vaga = new VagaDeEmprego("Desenvolvedor Web", "Descrição da vaga", empregador.getNome_Empresa(), requisitos, "São Paulo", new Date());

        // Criando um candidato
        List<String> habilidades = new ArrayList<>();
        habilidades.add("Java");
        habilidades.add("Python");
        habilidades.add("HTML");
        habilidades.add("PHP");
        List<String> experiencia = new ArrayList<>();
        experiencia.add("Estágio de 1 ano na Microsoft America");
        experiencia.add("Estagio de 6 Meses na Keyrus ");
        Candidato candidato = new Candidato("Gabriel de Souza Mota", "Cursando o 2° Semestre em Banco de Dados , eexperiencia com Java, |Python HTML, e PHP", habilidades, experiencia, "gabmota8@hotmail.com");

        // Associando a vaga ao empregador
        List<VagaDeEmprego> vagasEmpregador = new ArrayList<>();
        vagasEmpregador.add(vaga);
        empregador.setAnuncio_Emprego(vagasEmpregador);

        // Imprimindo informações para verificar se foram corretamente criadas e associadas
        System.out.println("Empregador: " + empregador.getNome_Empresa());
        System.out.println("Vaga de Emprego: " + empregador.getAnuncio_Emprego());
        System.out.println("Candidato: " + candidato.getNome());
    }
}

    
}
