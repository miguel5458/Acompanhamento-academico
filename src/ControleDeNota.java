

public class ControleDeNota {
    
    double[]calcMedia(Disciplina d) {
        double []media= null;
        //se há notas cadastradas
        if (d.nota.getAV1()!=null && d.nota.getAV2()!=null && d.nota.getAV3()!=null) {
            media=new double[1];
            media[0] = d.nota.getAV1()[0] + 2 *  d.nota.getAV2()[0] + 3 * d.nota.getAV3()[0] / 6;
        } 
        //se nao
        else {
            Notificacao n=new Notificacao();
            n.Pendente();
           
        }    
            
        
        return media;
    }

    void adicionarNota(ControleDeDisciplina cd) {
        //chama menu2
        
        Menu2 m2=new Menu2();
        m2.cadastrar(cd);
         
    }
    

}
