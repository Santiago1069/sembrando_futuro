package ventanas;

import almacenamiento.RepositorioUsuario;
import modelos.RegistroUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends Pantalla {

    private RepositorioUsuario repositorioUsuario;

    public Registro (Container container){
        super(container);
        iniciarComponentes();
        repositorioUsuario = new RepositorioUsuario();
    }

    private void iniciarComponentes(){

        ventana_registro = new javax.swing.JPanel();
        titulo_registro = new javax.swing.JLabel();
        titulo_nombre = new javax.swing.JLabel();
        input_nombre = new javax.swing.JTextField();
        titulo_apellidos = new javax.swing.JLabel();
        input_apellido = new javax.swing.JTextField();
        titulo_identificacion = new javax.swing.JLabel();
        input_identificacion = new javax.swing.JTextField();
        titulo_correo = new javax.swing.JLabel();
        input_correo = new javax.swing.JTextField();
        titulo_contrasena = new javax.swing.JLabel();
        input_contrasena = new javax.swing.JPasswordField();
        ayuda_contrasena = new javax.swing.JLabel();
        boton_resgitro = new javax.swing.JButton();
        ayuda_correo = new javax.swing.JLabel();

        titulo_registro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo_registro.setText("    REGISTRO");
        titulo_registro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        titulo_nombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_nombre.setText("Nombre:");

        input_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreActionPerformed(evt);
            }
        });

        titulo_apellidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_apellidos.setText("Apellidos:");

        input_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_apellidoActionPerformed(evt);
            }
        });

        titulo_identificacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_identificacion.setText("Identificacion:");

        input_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_identificacionActionPerformed(evt);
            }
        });

        titulo_correo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_correo.setText("Correo Electronico:");

        input_correo.setToolTipText("Correo con el que se va a registrar");
        input_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_correoActionPerformed(evt);
            }
        });

        titulo_contrasena.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_contrasena.setText("Contraseña:");

        input_contrasena.setToolTipText("Contraseña con la que se va a registrar");

        ayuda_contrasena.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ayuda_contrasena.setText("?");
        ayuda_contrasena.setToolTipText("En caso de olvidar su contraseña se le enviara un mensaje al correo elcetronico mostrandole su nueva contraseña");
        ayuda_contrasena.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        boton_resgitro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton_resgitro.setText("Registrarse ");

        boton_resgitro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarUsuario();
            }
        });


        ayuda_correo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ayuda_correo.setText("?");
        ayuda_correo.setToolTipText("Correo con el que se va a registrar en la aplicacion ( Tiene que ser un correo activo )");
        ayuda_correo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout ventana_registroLayout = new javax.swing.GroupLayout(ventana_registro);
        ventana_registro.setLayout(ventana_registroLayout);
        ventana_registroLayout.setHorizontalGroup(
                ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ventana_registroLayout.createSequentialGroup()
                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ventana_registroLayout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(titulo_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ventana_registroLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(titulo_nombre)
                                                        .addComponent(titulo_apellidos)
                                                        .addComponent(titulo_identificacion)
                                                        .addComponent(titulo_correo)
                                                        .addComponent(titulo_contrasena))
                                                .addGap(39, 39, 39)
                                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(input_apellido)
                                                        .addComponent(input_nombre)
                                                        .addComponent(input_identificacion)
                                                        .addComponent(input_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(input_contrasena))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(ayuda_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ayuda_contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(34, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventana_registroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(boton_resgitro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
        );
        ventana_registroLayout.setVerticalGroup(
                ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ventana_registroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titulo_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_nombre)
                                        .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_apellidos)
                                        .addComponent(input_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_identificacion)
                                        .addComponent(input_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_correo)
                                        .addComponent(input_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ayuda_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ventana_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_contrasena)
                                        .addComponent(input_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ayuda_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(boton_resgitro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(ventana_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(43, Short.MAX_VALUE)
                                .addComponent(ventana_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );


    }

    private void registrarUsuario() {

        String nombre = input_nombre.getText();
        String apellido = input_apellido.getText();
        String identificacion = input_identificacion.getText();
        String correo = input_correo.getText();
        String contrasena = input_contrasena.getText();

        try{

            RegistroUsuario registroUsuario = new RegistroUsuario(
                nombre, apellido, identificacion, correo, contrasena
            );

            repositorioUsuario.guardar(registroUsuario);
            irAVentanaCrearProyecto();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
        }

    }

    private void irAVentanaCrearProyecto() {
        navigateTo(VentanasConstantes.NOMBRE_VISTA_PROYECTO_NUEVO);
    }

    private void input_nombreActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void input_apellidoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void input_identificacionActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void input_correoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JLabel ayuda_contrasena;
    private javax.swing.JLabel ayuda_correo;
    private javax.swing.JButton boton_resgitro;
    private javax.swing.JTextField input_apellido;
    private javax.swing.JPasswordField input_contrasena;
    private javax.swing.JTextField input_correo;
    private javax.swing.JTextField input_identificacion;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JLabel titulo_apellidos;
    private javax.swing.JLabel titulo_contrasena;
    private javax.swing.JLabel titulo_correo;
    private javax.swing.JLabel titulo_identificacion;
    private javax.swing.JLabel titulo_nombre;
    private javax.swing.JLabel titulo_registro;
    private javax.swing.JPanel ventana_registro;


}
