

public class ControleDeNota {

    float calcMedia(Disciplina d) {
        float media = 0;
        if ((d.nota.getAV1() > 0) && (d.nota.getAV2() > 0) && (d.nota.getAV3() > 0)) {
            media = (d.nota.getAV1() + 2 * d.nota.getAV2() + 3 * d.nota.getAV3()) / 6;
        } else {
            Excecao e = new Excecao();
            e.Excecao1();
            return 0;
        }
        return media;

    }

    void adicionarNota(ControleDeDisciplina cd) {
        Menu m2=new Menu();
        m2.menu2(cd);
         
    }
    

}
