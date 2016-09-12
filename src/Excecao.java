
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miguel henrique
 */
public class Excecao extends Exception {

    public void Excecao1() {
        JOptionPane.showMessageDialog(null, "todas as notas devem ser maiores que zero!");
    }

    public void Excecao2() {
        JOptionPane.showMessageDialog(null, "não há essa disciplina cadastrada!");
    }

    public void Excecao3() {
        JOptionPane.showMessageDialog(null, "digite exatamente AV1,AV2 ou AV3 por favor!");
    }
}
