
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PlanoDeEstudo {

    ArrayList detectarMediaBaixa(ControleDeDisciplina cd) {
        ArrayList resultado = new ArrayList();
        // procurar disciplinas com media baixa
        for (int i = 0; i < cd.disciplina.size(); i++) {
            //se há notas cadastradas  e  maior que 6 entao:
            if ((cd.disciplina.get(i).cdn.calcMedia(cd.disciplina.get(i))!=null)
                    && cd.disciplina.get(i).cdn.calcMedia(cd.disciplina.get(i))[0] < 6
                    && cd.disciplina.get(i).nota.getAV1() != null
                    && cd.disciplina.get(i).nota.getAV2() != null
                    && cd.disciplina.get(i).nota.getAV3() != null) {

                resultado.add(i, cd.disciplina.get(i).getNome());
            }else{
             return null;
            }
        }
        //se nao há notas abaixo da media e notas cadastradas o resultado é nulo

        return resultado;
    }

    void mostrarMediaBaixa(ControleDeDisciplina cd) {
        //disciplina vazia?
        if (cd.disciplina.isEmpty()) {
            Notificacao n = new Notificacao();
            n.DisciplinaVazia();
        } // se nao. se nao há disciplina abaixo da media:
        else if (detectarMediaBaixa(cd) == null) {
             Notificacao n = new Notificacao();
             n.AcimaDaMedia();
        }
        //se nao, mostrar as disciplinas com media baixa.
        else {

                JOptionPane.showMessageDialog(null, "a disciplina com a media menor que a meta : " + (detectarMediaBaixa(cd)));

            }
    }



void prepararHorario(ControleDeDisciplina cd) {
        String resultado = null;
        int j = 4;
        //há disciplinas cadastradas?
        if (cd.disciplina.isEmpty()) {
            Notificacao n = new Notificacao();
            n.DisciplinaVazia();
        } 
        // se nao. se nao há disciplina abaixo da media:
        else if (detectarMediaBaixa(cd) == null) {
            Notificacao n = new Notificacao();
            n.AcimaDaMedia();
        } 
        //se há disciplina abaixo da media: 
        else {
            for (Disciplina disciplina : cd.disciplina) {
                resultado = (detectarMediaBaixa(cd)) + " segunda às 1" + j + ":00\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

}
