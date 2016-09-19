
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
public class Menu2 implements Menu<ControleDeDisciplina> {

    @Override
    public void cadastrar(ControleDeDisciplina cd) {
        String nota;
        boolean achouDisciplina = false;
        int sair = 0;
        //recepitores de strings
        String AV1;
        String AV2;
        String AV3;
        //ponteiros nulos que converterao as strings em double
        double[] notaAV1=null;
        double[] notaAV2=null;
        double[] notaAV3=null;
        int posicao = 0;
        int i;
        if (cd.disciplina.isEmpty()) {
            Notificacao n=new Notificacao();
            n.DisciplinaVazia();
        } else {
            
            do {
                String disciplina = JOptionPane.showInputDialog(null, "digite a disciplina: ");
                if (disciplina == null || "".equals(disciplina)) {
                    break;

                }
                //busca de disciplina
                for (i = 0; i < cd.disciplina.size(); i++) {
                    if (disciplina.equals(cd.disciplina.get(i).getNome())) {
                        posicao = i;
                        achouDisciplina = true;
                    }
                }
                if (achouDisciplina == false) {
                    Notificacao n = new Notificacao();
                    n.DisciplinaVazia();
                    break;
                }
                nota = JOptionPane.showInputDialog(null, "digite qual a nota: ");
                if (nota == null || "".equals(nota)) {
                    break;
                }
                try {
                    switch (nota) {
                        case "AV1":
                        case "av1":
                            AV1 = JOptionPane.showInputDialog(null, "AV1: ");
                            if (AV1 == null || "".equals(AV1)) {
                                break;
                            } else {
                                //se a nota nao está vazia é convertida para double encapsulada
                                notaAV1=new double[1];
                                notaAV1[0]=new Double(AV1);
                                cd.disciplina.get(posicao).nota.setAV1(notaAV1);
                                break ;
                            }
                        case "AV2":
                        case "av2":
                            AV2 = JOptionPane.showInputDialog(null, "AV2: ");
                            if (AV2 == null|| "".equals(AV2)) {
                                break ;
                            } else {
                                //se a nota nao está vazia é convertida para double encapsulada
                                notaAV2=new double[1];
                                notaAV2[0]=new Double(AV2);
                                cd.disciplina.get(posicao).nota.setAV2(notaAV2);
                                break ;
                            }
                        case "AV3":
                        case "av3":
                            AV3 = JOptionPane.showInputDialog(null, "AV3: ");
                            if (AV3 == null|| "".equals(AV3)) {
                                break ;
                            } else {
                                //se a nota nao está vazia é convertida para double encapsulada
                                notaAV3=new double[1];
                                notaAV3[0]=new Double(AV3);
                                cd.disciplina.get(posicao).nota.setAV3(notaAV3);
                                break ;
                            }
                        default:
                            //qualquer string que nao seja igual a requerida mostra por padrao a notificacao
                            Notificacao n = new Notificacao();
                            n.Nota();
                            break ;
                    }
                } 
                //caso haja um erro no fornecimento no valor da nota o fluxo vem é direcionado para cá:
                catch (HeadlessException | NumberFormatException e) {
                    Notificacao n= new Notificacao();
                    n.ValorNota();
                    break;
                }
                sair=JOptionPane.showConfirmDialog(null, "sair?", "?", JOptionPane.YES_OPTION);
                
            } while (sair==JOptionPane.NO_OPTION);
        }
    }

}
