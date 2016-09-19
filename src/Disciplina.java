public class Disciplina {
    NotaDisciplina nota = new NotaDisciplina();
    private String nome;
    private String HorarioDeEstudo;
    ControleDeNota cdn = new ControleDeNota();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getHorarioDeEstudo() {
        return HorarioDeEstudo;
    }
    public void setHorarioDeEstudo(String HorarioDeEstudo) {
        this.HorarioDeEstudo = HorarioDeEstudo;
    }
}
