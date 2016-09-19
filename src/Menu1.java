
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
public class Menu1 implements Menu<ControleDeDisciplina> {

    @Override
    public void cadastrar(ControleDeDisciplina cd) {
        int escolha = 0;//resultado padrao da confirmação
        int confirmar = 1;//valor padrao da confirmação
        int i = 0;//iterador
        boolean achou = false;
        String nomeDisciplina;//disciplina fornecida
        do {
            nomeDisciplina = JOptionPane.showInputDialog(null, "digite a disciplina: ");
            if (nomeDisciplina == null || "".equals(nomeDisciplina)) {
                break;
            } else {
                confirmar = JOptionPane.showConfirmDialog(null, "confirmar?", "?", JOptionPane.YES_OPTION);
                if (confirmar == JOptionPane.NO_OPTION) {
                    break;
                }
                if (!cd.disciplina.isEmpty()) {
                    for (i = 0; i < cd.disciplina.size(); i++) {
                        if (cd.disciplina.get(i).getNome().equals(nomeDisciplina)) {
                            achou = true;
                        }
                    }
                    if (achou == true) {
                        Notificacao n = new Notificacao();
                        n.DisciplinaExistente();
                        break;

                    }
                } else {
                    Disciplina d = new Disciplina();
                    cd.adicionarDiciplina(d);
                    cd.disciplina.get(i).setNome(nomeDisciplina);
                    i++;
                }
            }

            escolha = JOptionPane.showConfirmDialog(null, "deseja cadastrar outra disciplina? s/n?", "?", JOptionPane.YES_OPTION);

        } while (escolha == JOptionPane.YES_OPTION);

    }
}
