
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
public class Notificacao {

    //metodos de notificação reusados
    public void Nota() {
        JOptionPane.showMessageDialog(null, "digite exatamente AV1,AV2 ou AV3 \n "
                + "ou av1, av2 e av3 por favor!");
    }
    public void DisciplinaExistente(){
         JOptionPane.showMessageDialog(null, "Disciplina ja cadastrada!");
    }
    public void ValorNota(){
        JOptionPane.showMessageDialog(null, "informe numeros!");
    }
    public void DisciplinaVazia(){
        JOptionPane.showMessageDialog(null, "nenhuma disciplina cadastrada!");
    }
    public void Pendente(){
        JOptionPane.showMessageDialog(null, "existem notas pendentes!");
    }
    public void AcimaDaMedia(){
        JOptionPane.showMessageDialog(null, "todas as disciplinas acima da média!");
    }
}
