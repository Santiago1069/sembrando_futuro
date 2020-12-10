package ventanas;

import almacenamiento.RepositorioUsuario;
import modelos.UsuarioLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Pantalla {

    RepositorioUsuario repositorioUsuario;



    public Login(Container container) {
        super(container);
        iniciarComponentesL();
        repositorioUsuario = new RepositorioUsuario();

    }

    private void iniciarComponentesL() {

        titulo = new java.awt.Label();
        iniciar_sesion = new javax.swing.JPanel();
        titulo_iniciar_sesion = new javax.swing.JLabel();
        titulo_usuario_sesion = new javax.swing.JLabel();
        input_usuario_sesion = new javax.swing.JTextField();
        titulo_contrasena_sesion = new javax.swing.JLabel();
        input_contrasena_sesion = new javax.swing.JPasswordField();
        boton_ingresar = new javax.swing.JButton();
        boton_registrarse = new javax.swing.JButton();


        titulo.setAlignment(java.awt.Label.CENTER);
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        titulo.setName(""); // NOI18N
        titulo.setText("BIENVENIDO A SEMBRANDO FUTURO");

        iniciar_sesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        iniciar_sesion.setPreferredSize(new java.awt.Dimension(350, 240));

        titulo_iniciar_sesion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_iniciar_sesion.setText("   INICIAR SESION");
        titulo_iniciar_sesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titulo_usuario_sesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_usuario_sesion.setText("Ingrese el Usuario:");

        input_usuario_sesion.setToolTipText("Agregar el usuario con el que se registro");
        input_usuario_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_usuario_sesionActionPerformed(evt);
            }
        });

        titulo_contrasena_sesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_contrasena_sesion.setText("Ingrese la Contraseña:");

        boton_ingresar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton_ingresar.setText("Ingresar");
        boton_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_ingresarMouseClicked(evt);
            }
        });

        boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificacionDeUsuario();
            }
        });

        boton_registrarse.setText("Registrarse");
        boton_registrarse.setFont(new java.awt.Font("Arial", 0, 12));

        boton_registrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateTo(VentanasConstantes.NOMBRE_VISTA_REGISTRO);
            }
        });
        boton_registrarse.setToolTipText("Dar clic si desea registrar para iniciar sesion");

        javax.swing.GroupLayout iniciar_sesionLayout = new javax.swing.GroupLayout(iniciar_sesion);
        iniciar_sesion.setLayout(iniciar_sesionLayout);
        iniciar_sesionLayout.setHorizontalGroup(
                iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(iniciar_sesionLayout.createSequentialGroup()
                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(iniciar_sesionLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(titulo_usuario_sesion)
                                                        .addComponent(titulo_contrasena_sesion))
                                                .addGap(26, 26, 26)
                                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(input_usuario_sesion)
                                                        .addComponent(input_contrasena_sesion)))
                                        .addGroup(iniciar_sesionLayout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(boton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(boton_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 47, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(iniciar_sesionLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(titulo_iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        iniciar_sesionLayout.setVerticalGroup(
                iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(iniciar_sesionLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(titulo_iniciar_sesion)
                                .addGap(40, 40, 40)
                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_usuario_sesion)
                                        .addComponent(input_usuario_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_contrasena_sesion)
                                        .addComponent(input_contrasena_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(boton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(275, 275, 275)
                                                .addComponent(iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(59, Short.MAX_VALUE))
        );



    }

    private void verificacionDeUsuario() {

        String correo = input_usuario_sesion.getText();
        String contrasena = input_contrasena_sesion.getText();

        try {

            UsuarioLogin usuarioLogin = new UsuarioLogin(correo, contrasena);

            boolean validacion = repositorioUsuario.verificarLogin(usuarioLogin);

            if(validacion){

                navigateTo(VentanasConstantes.NOMBRE_VISTA_LISTA_PROYECTOS);

            }else {

                JOptionPane.showMessageDialog(this, "El usuario no se encuentra registrado" , "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);


        }
    }

    private void input_usuario_sesionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }



    private void boton_ingresarMouseClicked(java.awt.event.MouseEvent evt) {

    }





    private javax.swing.JButton boton_ingresar;
    private javax.swing.JButton boton_registrarse;
    private javax.swing.JPanel iniciar_sesion;
    private javax.swing.JPasswordField input_contrasena_sesion;
    private javax.swing.JTextField input_usuario_sesion;
    private java.awt.Label titulo;
    private javax.swing.JLabel titulo_contrasena_sesion;
    private javax.swing.JLabel titulo_iniciar_sesion;
    private javax.swing.JLabel titulo_usuario_sesion;

}
