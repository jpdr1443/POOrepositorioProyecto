import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Formulario extends JPanel {
    private  JLabel labelNombre, labelApellido, labelND, labelTipoDoc;
    private JTextField campoNombre, campoApellido, campoND;
    private JComboBox tipoDocumento;
    private  JButton btnAgregar, btnModificar, btnEliminar;

    public Formulario(){
        setName("Form");
        setLayout(null);
        setBounds(0,20,450,350);;
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
        campoNombre = new JTextField(20);
        campoNombre.setBounds(70, 106,80,20);
        campoApellido = new JTextField(20);
        campoApellido.setBounds(70,150,80, 20);
        campoND = new JTextField(20);
        campoND.setBounds(150, 70, 80, 20);
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(20,260,90,30);
        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(130,260,90,30);
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(240,260,90,30);


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
        add(btnAgregar);
        add(btnModificar);
        add(btnEliminar);

    }

    public JTextField getCampoApellido() {
        return campoApellido;
    }

    public void setCampoApellido(JTextField campoApellido) {
        this.campoApellido = campoApellido;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(JTextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public JComboBox getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(JComboBox tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public JTextField getCampoND() {
        return campoND;
    }

    public void setCampoND(JTextField campoND) {
        this.campoND = campoND;
    }
}
