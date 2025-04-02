import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Tabla extends JPanel {
    private JTable tabla;

    public Tabla() {
        setLayout(new BorderLayout());
        setBackground(Color.BLUE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        String[] columnas = {"Numero de documento", "Nombre", "Apellido"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tabla = new JTable(modelo);
        tabla.setShowHorizontalLines(true);
        JScrollPane scrollPanel = new JScrollPane(tabla);

        add(scrollPanel, BorderLayout.CENTER);
    }
}
