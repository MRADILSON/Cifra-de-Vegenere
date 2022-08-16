/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author MR.ADILSON
 */
//PROGRAMADOR => AZOÇAUB ELNQBHB OSLSR WHÇFÇE
//CHAVE => ANONYMOUS
public class Menu {

    static Scanner tecla = new Scanner(System.in);

    //PROGRAMADOR => AZOÇAUB ELNQBHB OSLSR WHÇFÇE
    //CHAVE => ANONYMOUS
    public static void menu() {

        while (true) {
            System.out.println("---------- BEM VINDO À CIFRA DE VEGENERE----------");
            System.out.println("1 => CODIFICAR MENSAGEM\n2 => DESCODIFICAR MENSAGEM\n3 => SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO: ");
            try {
                int opcao = Integer.parseInt(tecla.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.println("INTRODUZ O TEXTO À CODIFICAR:");
                        String msgCodificar = tecla.nextLine();
                        System.out.println("INTRODUZ A CHAVE DE CODIFICAÇÃO:");
                        String chaveCodificar = tecla.nextLine();
                        System.out.println("RESULTADO DA CODIFICAÇÃO: \n" + Cifra.codificar(msgCodificar, chaveCodificar));
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("INTRODUZ O TEXTO À DESCODIFICAR:");
                        String msgDescodificar = tecla.nextLine();
                        System.out.println("INTRODUZ A CHAVE DE DESCODIFICAÇÃO: ");
                        String chaveDescodificar = tecla.nextLine();
                        System.out.println("RESULTADO DA DESCODIFICAÇÃO: \n" + Cifra.descodificar(msgDescodificar, chaveDescodificar));
                        System.out.println("");
                        break;

                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("ESCOLHA UMA VÁLIDA OU QUE ESTEJA NO INTERVALO DE 1 À 3");
                        System.out.println("");
                        break;
                }
            } catch (Exception e) {
                System.out.println("ERRO AO INSERIR OS DADOS");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
