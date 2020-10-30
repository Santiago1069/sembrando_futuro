package ventanas;

import java.awt.*;

public class Login extends Screen{

    public Login(Container container) {
        super(container);
        iniciarComponentesL();
    }

    private void iniciarComponentesL() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        titulo = new java.awt.Label();
        iniciar_sesion = new javax.swing.JPanel();
        titulo_iniciar_sesion = new javax.swing.JLabel();
        titulo_usuario_sesion = new javax.swing.JLabel();
        input_usuario_sesion = new javax.swing.JTextField();
        titulo_contrasena_sesion = new javax.swing.JLabel();
        input_contrasena_sesion = new javax.swing.JPasswordField();
        boton_ingresar = new javax.swing.JButton();
        registro = new javax.swing.JPanel();
        titulo_registro = new javax.swing.JLabel();
        titulo_usuario_registro = new javax.swing.JLabel();
        titulo_contrasena_registro = new javax.swing.JLabel();
        input_usuario_registro = new javax.swing.JTextField();
        input_contrasena_registro = new javax.swing.JPasswordField();
        boton_registrar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 4, Short.MAX_VALUE)
        );

        setName("SEMBRANDO FUTURO");

        titulo.setAlignment(java.awt.Label.CENTER);
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        titulo.setName("SEMBRANDO FUTURO"); // NOI18N
        titulo.setText("BIENVENIDO A SEMBRANDO FUTURO");

        iniciar_sesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        iniciar_sesion.setPreferredSize(new java.awt.Dimension(350, 240));

        titulo_iniciar_sesion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_iniciar_sesion.setText("   INICIAR SESION");
        titulo_iniciar_sesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titulo_usuario_sesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_usuario_sesion.setText("Ingrese el Usuario:");

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
                boton_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iniciar_sesionLayout = new javax.swing.GroupLayout(iniciar_sesion);
        iniciar_sesion.setLayout(iniciar_sesionLayout);
        iniciar_sesionLayout.setHorizontalGroup(
                iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(iniciar_sesionLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titulo_usuario_sesion)
                                        .addComponent(titulo_contrasena_sesion))
                                .addGap(26, 26, 26)
                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(input_usuario_sesion)
                                        .addComponent(input_contrasena_sesion))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciar_sesionLayout.createSequentialGroup()
                                .addGap(0, 91, Short.MAX_VALUE)
                                .addComponent(titulo_iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciar_sesionLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
        );
        iniciar_sesionLayout.setVerticalGroup(
                iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(iniciar_sesionLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(titulo_iniciar_sesion)
                                .addGap(38, 38, 38)
                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_usuario_sesion)
                                        .addComponent(input_usuario_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_contrasena_sesion)
                                        .addComponent(input_contrasena_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(boton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        registro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registro.setPreferredSize(new java.awt.Dimension(350, 240));

        titulo_registro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_registro.setText("   REGISTRO");
        titulo_registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titulo_usuario_registro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_usuario_registro.setText("Ingrese el Usuario:");

        titulo_contrasena_registro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo_contrasena_registro.setText("Ingrese la Contraseña:");

        input_usuario_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_usuario_registroActionPerformed(evt);
            }
        });

        boton_registrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton_registrar.setText("Registrar se");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registroLayout = new javax.swing.GroupLayout(registro);
        registro.setLayout(registroLayout);
        registroLayout.setHorizontalGroup(
                registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroLayout.createSequentialGroup()
                                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroLayout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addComponent(titulo_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(registroLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(registroLayout.createSequentialGroup()
                                                                .addComponent(titulo_contrasena_registro)
                                                                .addGap(25, 25, 25)
                                                                .addComponent(input_contrasena_registro))
                                                        .addGroup(registroLayout.createSequentialGroup()
                                                                .addComponent(titulo_usuario_registro)
                                                                .addGap(47, 47, 47)
                                                                .addComponent(input_usuario_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))))
                                .addContainerGap())
                        .addGroup(registroLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registroLayout.setVerticalGroup(
                registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(titulo_registro)
                                .addGap(40, 40, 40)
                                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_usuario_registro)
                                        .addComponent(input_usuario_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_contrasena_registro)
                                        .addComponent(input_contrasena_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContainer());
        getContainer().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
    }

    private void input_usuario_sesionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void input_usuario_registroActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void boton_ingresarMouseClicked(java.awt.event.MouseEvent evt) {

    }


    private javax.swing.JButton boton_ingresar;
    private javax.swing.JButton boton_registrar;
    private javax.swing.JPanel iniciar_sesion;
    private javax.swing.JPasswordField input_contrasena_registro;
    private javax.swing.JPasswordField input_contrasena_sesion;
    private javax.swing.JTextField input_usuario_registro;
    private javax.swing.JTextField input_usuario_sesion;
    private javax.swing.JInternalFrame jInternalFrame1;
    private java.awt.Label titulo;
    private javax.swing.JPanel registro;
    private javax.swing.JLabel titulo_contrasena_registro;
    private javax.swing.JLabel titulo_contrasena_sesion;
    private javax.swing.JLabel titulo_iniciar_sesion;
    private javax.swing.JLabel titulo_registro;
    private javax.swing.JLabel titulo_usuario_registro;
    private javax.swing.JLabel titulo_usuario_sesion;

}
