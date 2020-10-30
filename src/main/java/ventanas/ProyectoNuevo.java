package ventanas;

import java.awt.*;

public class ProyectoNuevo extends Screen {

    public ProyectoNuevo(Container container) {
        super(container);
        iniciarComponentesP();
    }

    private void iniciarComponentesP() {

        jDialog1 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel3 = new javax.swing.JPanel();
        titulo_proyecto_nuevo = new javax.swing.JLabel();
        nombre_proyecto = new javax.swing.JLabel();
        input_proyecto_nuevo = new javax.swing.JTextField();
        nombre_creador = new javax.swing.JLabel();
        input_nombre_creador = new javax.swing.JTextField();
        titulo_fecha = new javax.swing.JLabel();
        mostrar_fecha = new javax.swing.JFormattedTextField();
        titulo_cosecha = new javax.swing.JLabel();
        cosechas = new javax.swing.JComboBox<>();
        texto_motivacional = new javax.swing.JLabel();
        crear_proyecto = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jPanel3.setPreferredSize(new java.awt.Dimension(500, 400));

        titulo_proyecto_nuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_proyecto_nuevo.setText("    PROYECTO NUEVO");
        titulo_proyecto_nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nombre_proyecto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre_proyecto.setText("Nombre del proyecto:");

        input_proyecto_nuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        nombre_creador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre_creador.setText("Nombre del Creador:");

        input_nombre_creador.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        titulo_fecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        titulo_fecha.setText("Fecha Inicial:");
        titulo_fecha.setToolTipText("");

        mostrar_fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
        mostrar_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_fechaActionPerformed(evt);
            }
        });

        titulo_cosecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        titulo_cosecha.setText("Cosecha que desea realizar:");

        cosechas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cosechas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yuca", "Maiz" }));

        texto_motivacional.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        texto_motivacional.setText("\"Todas tus acciones  son una semilla, que tarde o temprano daran frutos.\"");
        texto_motivacional.setToolTipText("");

        crear_proyecto.setText("Crear Proyecto ");
        crear_proyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(titulo_cosecha)
                                                                .addGap(63, 63, 63)
                                                                .addComponent(cosechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(titulo_fecha)
                                                                        .addComponent(nombre_proyecto)
                                                                        .addComponent(nombre_creador))
                                                                .addGap(92, 92, 92)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(input_proyecto_nuevo)
                                                                        .addComponent(input_nombre_creador, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                                        .addComponent(mostrar_fecha)))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(texto_motivacional))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(267, 267, 267)
                                                .addComponent(crear_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addComponent(titulo_proyecto_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(titulo_proyecto_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(titulo_fecha)
                                        .addComponent(mostrar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nombre_proyecto)
                                        .addComponent(input_proyecto_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(input_nombre_creador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombre_creador))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titulo_cosecha)
                                        .addComponent(cosechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(texto_motivacional)
                                .addGap(18, 18, 18)
                                .addComponent(crear_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));




    }

    private void mostrar_fechaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JComboBox<String> cosechas;
    private javax.swing.JButton crear_proyecto;
    private javax.swing.JTextField input_nombre_creador;
    private javax.swing.JTextField input_proyecto_nuevo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel3;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JFormattedTextField mostrar_fecha;
    private javax.swing.JLabel nombre_creador;
    private javax.swing.JLabel nombre_proyecto;
    private javax.swing.JLabel texto_motivacional;
    private javax.swing.JLabel titulo_cosecha;
    private javax.swing.JLabel titulo_fecha;
    private javax.swing.JLabel titulo_proyecto_nuevo;

}
