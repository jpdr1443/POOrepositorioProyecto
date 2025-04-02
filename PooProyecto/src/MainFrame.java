import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Formulario formulario;
    private Tabla tabla;
    private JPanel panelDerecho;

    public MainFrame() {
        setTitle("Interfaz Usuario");
        setSize(800, 600); // Ajustamos el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); // Usamos BorderLayout para distribuir los paneles

        // Panel Izquierdo con el Formulario
        formulario = new Formulario();
        formulario.setPreferredSize(new Dimension(400, getHeight())); // Ancho fijo, altura automática
        add(formulario, BorderLayout.WEST);

        // Panel Derecho, esta vacio, no hay mounstros aqui
        panelDerecho = new JPanel();
        panelDerecho.setPreferredSize(new Dimension(250, getHeight())); // Ancho fijo, altura automática
        panelDerecho.setBackground(Color.LIGHT_GRAY); // Color de fondo para distinguirlo
        add(panelDerecho, BorderLayout.EAST);

        // Panel Inferior con la tabla de las consultas
        tabla = new Tabla();
        tabla.setPreferredSize(new Dimension(getWidth(), 200)); // Altura fija, ancho automático
        add(tabla, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame vista = new MainFrame();
            vista.setVisible(true);
        });
    }
}
