/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author MR.ADILSON
 */
//PROGRAMADOR => AZOÇAUB ELNQBHB OSLSR WHÇFÇE
//CHAVE => ANONYMOUS
public class Cifra {

    //PROGRAMADOR => AZOÇAUB ELNQBHB OSLSR WHÇFÇE
    //CHAVE => ANONYMOUS
    public static String codificar(String txt, String chave) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZÇ";
        txt = txt.toUpperCase();
        String codificado = "";
        int posicao = 0;

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) != ' ') {
                if (chave.length() < txt.length()) {
                    chave += chave.charAt(posicao);
                }
                int t = abc.indexOf(txt.charAt(i));
                int c = abc.indexOf(chave.toUpperCase().charAt(posicao));
                codificado += abc.charAt((t + c) % 27);
                posicao++;
            } else {
                codificado += ' ';
            }
        }
        return codificado;
    }

    //PROGRAMADOR => AZOÇAUB ELNQBHB OSLSR WHÇFÇE
    //CHAVE => ANONYMOUS
    public static String descodificar(String txt, String chave) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZÇ";
        txt = txt.toUpperCase();
        chave = chave.toUpperCase();
        String retorno = "";
        int posicao = 0;

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) != ' ') {
                if (chave.length() < txt.length()) {
                    chave += chave.charAt(posicao);
                }
                int t = abc.indexOf(txt.charAt(i));
                int c = abc.indexOf(chave.charAt(posicao));
                retorno += ((t - c) % 27 < 0) ? abc.charAt((t - c) % 27 + 27) : abc.charAt((t - c) % 27);
                posicao++;
            } else {
                retorno += ' ';
            }
        }
        return retorno;
    }

}
