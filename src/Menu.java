
import java.awt.HeadlessException;
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
public class Menu {

    void menu1(ControleDeDisciplina cd) {
        String escolha;

        int i = 0;
        do {
            String nomeDisciplina;
            nomeDisciplina = JOptionPane.showInputDialog(null, "digite a disciplina: ");
            if (nomeDisciplina == null || "".equals(nomeDisciplina)) {
                break;
            } else {
                Disciplina d = new Disciplina();
                cd.adicionarDiciplina(d);
                cd.disciplina.get(i).setNome(nomeDisciplina);
                i++;
            }
            escolha = JOptionPane.showInputDialog(null, "confirmar?");
            if (escolha == null) {
                break;
            }
            escolha = JOptionPane.showInputDialog(null, "deseja cadastrar outra disciplina? s/n?");

        } while (!"n".equals(escolha) && escolha != null);
    }

    void menu2(ControleDeDisciplina cd) {
        String nota;
        boolean achouDisciplina = false;
        String sair = null;
        String AV1;
        String AV2;
        String AV3;
        int posicao = 0;
        int i;
        if (cd.disciplina.isEmpty()) {
            JOptionPane.showMessageDialog(null, "nenhuma disciplina cadastrada!");
        } else {
            do {
                String disciplina = JOptionPane.showInputDialog(null, "digite a disciplina: ");
                if (disciplina == null || "".equals(disciplina)) {
                    break;

                }
                for (i = 0; i < cd.disciplina.size(); i++) {
                    if (disciplina.equals(cd.disciplina.get(i).getNome())) {
                        posicao = i;
                        achouDisciplina = true;
                    }
                }
                if (achouDisciplina == false) {
                    Excecao e = new Excecao();
                    e.Excecao2();
                    break;
                }
                nota = JOptionPane.showInputDialog(null, "digite qual a nota: ");
                if (nota == null|| "".equals(nota)) {
                    break;
                }
                try {
                    switch (nota) {
                        case "AV1":
                            AV1 = JOptionPane.showInputDialog(null, "AV1: ");
                            if (AV1 == null) {
                                break;
                            } else {

                                cd.disciplina.get(posicao).nota.setAV1(new Float(AV1));

                                break;
                            }
                        case "AV2":
                            AV2 = JOptionPane.showInputDialog(null, "AV2: ");
                            if (AV2 == null) {
                                break;
                            } else {

                                cd.disciplina.get(posicao).nota.setAV2(new Float(AV2));

                                break;
                            }
                        case "AV3":
                            AV3 = JOptionPane.showInputDialog(null, "AV3: ");
                            if (AV3 == null) {
                                break;
                            } else {

                                cd.disciplina.get(posicao).nota.setAV3(new Float(AV3));

                                break;
                            }
                        default:
                            Excecao e = new Excecao();
                            e.Excecao3();
                            break;
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "informe numeros!");
                    break;
                }
                sair = JOptionPane.showInputDialog(null, "sair? s/n");
                if("".equals(sair)){
                    break;
                }
            } while (!"s".equals(sair));
        }
    }

}
