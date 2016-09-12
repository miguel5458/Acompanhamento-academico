
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PlanoDeEstudo {

    ArrayList detectarMediaBaixa(ControleDeDisciplina cd) {

        ArrayList resultado = new ArrayList();

        cd.disciplina.stream().filter((disciplina) -> (disciplina.ctrl.calcMedia(disciplina) < 6)).forEach((disciplina) -> {
            resultado.add(disciplina.getNome());
        });

        return resultado;
    }

    void mostrarMediaBaixa(ControleDeDisciplina cd) {
        boolean notaPendente = false;
        if (cd.disciplina.isEmpty()) {
            JOptionPane.showMessageDialog(null, "nao há disciplina cadastrada!");
        } else {
            for (Disciplina disciplina : cd.disciplina) {
                if ((disciplina.nota.getAV1() == 0.0)
                        || (disciplina.nota.getAV2() == 0.0)
                        || (disciplina.nota.getAV3() == 0.0)) {
                    notaPendente = true;
                }
            }
            if (!detectarMediaBaixa(cd).isEmpty()) {
                if (notaPendente == true) {
                    JOptionPane.showMessageDialog(null, "existem notas pendentes!");
                } else {
                    JOptionPane.showMessageDialog(null, "a disciplina com a media menor que a meta : " + (detectarMediaBaixa(cd)));
                }
            } else {
                JOptionPane.showMessageDialog(null, "todas as disciplinas acima da média!");
            }
        }

    }

    void prepararHorario(ControleDeDisciplina cd) {
        String resultado = null;
        boolean notaPendente = false;
        int j = 4;
        if (cd.disciplina.isEmpty()) {
            resultado= "nao há disciplina fornecida!";
        } else if (!detectarMediaBaixa(cd).isEmpty()) {
            for (Disciplina disciplina : cd.disciplina) {
                if (disciplina.nota.getAV1() > 0.0
                        && disciplina.nota.getAV2() > 0.0
                        && disciplina.nota.getAV3() > 0.0) {
                    resultado = detectarMediaBaixa(cd) + " segunda às 1" + j + ":00\n";
                    j++;
                }else{
                    notaPendente=true;
                }
            }
        } else {
            resultado="todas as disciplinas acima da média!";
        }
        if (notaPendente == true) {
            resultado = "notas pendentes!";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

}
