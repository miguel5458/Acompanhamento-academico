
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Home extends JFrame{
   
    
    public void mostrar (){
        setTitle("Janela");
        setBounds(100, 100, 460, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        JLabel tema =new JLabel("Home");
        tema.setBounds(200, 20, 400, 50);
        this.getContentPane().add(tema);
        
        
        PlanoDeEstudo pde=new PlanoDeEstudo();
        ControleDeDisciplina cd= new ControleDeDisciplina();
        ControleDeNota cdn=new ControleDeNota();
        
        
        JButton botao1 = new JButton("cadastrar disciplina");
        botao1.setBounds(20, 60, 400, 20);
        
        this.getContentPane().add(botao1);
        botao1.addActionListener((ActionEvent e) -> {
           Menu m1 = new Menu();
           m1.menu1(cd);
        });
        JButton botao2=new JButton("cadastrar notas");
        botao2.setBounds(20, 80, 400, 20);
        this.getContentPane().add(botao2);
        botao2.addActionListener((ActionEvent e) -> {
           
            cdn.adicionarNota(cd);
            
        });
        JButton botao3 = new JButton("saber quais disciplinas tiveram media baixa");
        botao3.setBounds(20, 100, 400, 20);
        this.getContentPane().add(botao3);
        botao3.addActionListener((ActionEvent e) -> {
          
            pde.detectarMediaBaixa(cd);
            pde.mostrarMediaBaixa(cd);

           
        });
        JButton botao4 = new JButton("formar horário");
        botao4.setBounds(20, 120, 400, 20);
        this.getContentPane().add(botao4);
        botao4.addActionListener((ActionEvent e) -> {
          
           
            pde.prepararHorario(cd);
           
        });
        JButton sair=new JButton("sair...");
        sair.setBounds(20, 140, 400, 20);
        this.getContentPane().add(sair);
        sair.addActionListener((ActionEvent e) -> {
           
            System.exit(0);
        });
        
    }
    
}
