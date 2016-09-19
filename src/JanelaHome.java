
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JanelaHome extends JFrame implements Janela{
   
    
    @Override
    public void mostrar (){
        //Titulo da janela
        setTitle("Janela");
        setBounds(100, 100, 460, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        JLabel tema =new JLabel("Home");
        tema.setBounds(200, 20, 400, 50);
        this.getContentPane().add(tema);
        
        //instanciação dos objetos
        PlanoDeEstudo pde=new PlanoDeEstudo();
        ControleDeDisciplina cd= new ControleDeDisciplina();
        ControleDeNota cdn=new ControleDeNota();
        
        //botao de cadastro de disciplina
        JButton botao1 = new JButton("cadastrar disciplina");
        botao1.setBounds(20, 60, 400, 20);
          // quando clicar chama o menu1
        this.getContentPane().add(botao1);
        botao1.addActionListener((ActionEvent e) -> {
           Menu1 m1 = new Menu1();
           m1.cadastrar(cd);
        });
        //botao de cadastro de notas
        JButton botao2=new JButton("cadastrar notas");
        botao2.setBounds(20, 80, 400, 20);
        this.getContentPane().add(botao2);
        //quando clicar chama o metodo adicionar nota
        botao2.addActionListener((ActionEvent e) -> {
           
            cdn.adicionarNota(cd);
            
        });
        //botao de analise de notas
        JButton botao3 = new JButton("saber quais disciplinas tiveram media baixa");
        botao3.setBounds(20, 100, 400, 20);
        this.getContentPane().add(botao3);
        //quando clicar chama os  respectivos metodos
        botao3.addActionListener((ActionEvent e) -> {
          
            pde.detectarMediaBaixa(cd);
            pde.mostrarMediaBaixa(cd);

           
        });
        //botao de calculo de horário
        JButton botao4 = new JButton("formar horário");
        botao4.setBounds(20, 120, 400, 20);
        this.getContentPane().add(botao4);
        //quando clicar mostrar o horario a disciplina
        botao4.addActionListener((ActionEvent e) -> {
          
           
            pde.prepararHorario(cd);
           
        });
        //botao sair
        JButton sair=new JButton("sair...");
        sair.setBounds(20, 140, 400, 20);
        this.getContentPane().add(sair);
        //ao clicar sai automaticamente do menu
        sair.addActionListener((ActionEvent e) -> {
           
            System.exit(0);
        });
        
    }
    
}
