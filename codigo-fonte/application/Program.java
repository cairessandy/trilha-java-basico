package application;

import java.util.Scanner;

import entities.IPhone;
   
    /**
     *  <h1>Program</h1>
     * <p>Programa simula as funcionalidades de um iPhone</p>
     * @author Sandy Caires
     * @version 1.0
     * @since 14/06/2024
     */

public class Program{
    
    public static void main(String[] args) {
       
        IPhone iPhone = new IPhone();

        System.out.println("Bem-vido ao seu iPhone!");
        String musica = "Yellow - Coldpplay";
        iPhone.selecionarMusica(musica);
        iPhone.tocar();
        iPhone.pausar();
        System.out.println();

        String numero = "99887700";
        iPhone.ligar(numero);
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        System.out.println();

        String url = "https://www";
        iPhone.exibirPagina(url);
        iPhone.atualizarPagina();
        iPhone.adicionarNovaAba();
        System.out.println();

    
    }
}