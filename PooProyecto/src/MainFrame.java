import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
private  Formulario formulario;
    public MainFrame(){
        setTitle("Interfaz Usuario");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        add(TopPanel(),BorderLayout.NORTH);
        formulario = new Formulario();
        add(formulario);
        formulario.setVisible(true);
    }

    private JPanel TopPanel(){
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        JLabel lb1 = new JLabel("Sistema de Gestion");
        panel1.setBackground(Color.GREEN);
        panel1.add(lb1);
        return panel1;

    }




}
