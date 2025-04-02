import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Formulario extends JPanel {
    private  JLabel labelNombre, labelApellido, labelND, labelTipoDoc;
    private TextField campoNombre, campoApellido, campoND;
    private JComboBox tipoDocumento;

    public Formulario(){
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelTipoDoc = new JLabel("Tipo de documento:");
        labelTipoDoc.setBounds(10, 20, 120, 40);
        labelND = new JLabel("Numero de Documento:");
        labelND.setBounds(10, 60, 140, 40);
        labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(10,100,50, 30);
        labelApellido = new JLabel("Apellido:");
        labelApellido.setBounds(10,140,50, 40);
        //textFields y sus ajustes.
        campoNombre = new TextField(20);
        campoNombre.setBounds(70, 106,80,20);
        campoApellido = new TextField(20);
        campoApellido.setBounds(70,150,80, 20);
        campoND = new TextField(20);
        campoND.setBounds(150, 70, 80, 20);


        //Lista de tipos de documento
        String[] tipos = {"Cedula de Ciudadania", "Documento de identidad", "PEP", "Pasaporte", "Registro Civil"};
        tipoDocumento = new JComboBox<>(tipos);
        tipoDocumento.setBounds(130, 30, 150, 20);
        add(labelTipoDoc);
        add(labelND);
        add(labelNombre);
        add(labelApellido);
        add(campoNombre);
        add(campoApellido);
        add(campoND);
        add(tipoDocumento);


    }

    public TextField getCampoApellido() {
        return campoApellido;
    }

    public void setCampoApellido(TextField campoApellido) {
        this.campoApellido = campoApellido;
    }

    public TextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(TextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public JComboBox getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(JComboBox tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public TextField getCampoND() {
        return campoND;
    }

    public void setCampoND(TextField campoND) {
        this.campoND = campoND;
    }
}
