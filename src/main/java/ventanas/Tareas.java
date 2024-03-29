package ventanas;

import java.awt.*;

public class Tareas extends Pantalla {

    public Tareas(Container container) {
        super(container);
        iniciarComponentesT();

    }

    private void iniciarComponentesT() {

        jMenu1 = new javax.swing.JMenu();
        panel_tareas = new javax.swing.JPanel();
        nombre_proyecto = new javax.swing.JLabel();
        tareas = new javax.swing.JTabbedPane();
        panel_tarea1 = new javax.swing.JPanel();
        tarea1_completada = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        infomacion_tarea1 = new javax.swing.JTextArea();
        informacion_tarea1 = new javax.swing.JTextField();
        panel_tarea2 = new javax.swing.JPanel();
        tarea2_complatada = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        informacion_tarea2 = new javax.swing.JTextArea();




        panel_tareas.setBackground(new java.awt.Color(255, 255, 255));
        panel_tareas.setPreferredSize(new java.awt.Dimension(900, 485));

        nombre_proyecto.setBackground(new java.awt.Color(204, 204, 204));
        nombre_proyecto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nombre_proyecto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tareas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        panel_tarea1.setToolTipText("");

        tarea1_completada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tarea1_completada.setText("Tarea Completada ");
        tarea1_completada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarea1_completadaActionPerformed(evt);
            }
        });

        infomacion_tarea1.setEditable(false);
        infomacion_tarea1.setColumns(20);
        infomacion_tarea1.setFont(new java.awt.Font("Arial", 0, 18));
        infomacion_tarea1.setRows(5);
        jScrollPane1.setViewportView(infomacion_tarea1);

        informacion_tarea1.setEditable(false);
        informacion_tarea1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        informacion_tarea1.setText("?");
        informacion_tarea1.setToolTipText("Cuando ya haya terminado la tarera puedes chuliar la para que te acuerdes que ya terminaste la tarea.");

        javax.swing.GroupLayout panel_tarea1Layout = new javax.swing.GroupLayout(panel_tarea1);
        panel_tarea1.setLayout(panel_tarea1Layout);
        panel_tarea1Layout.setHorizontalGroup(
                panel_tarea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_tarea1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_tarea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel_tarea1Layout.createSequentialGroup()
                                                .addComponent(tarea1_completada)
                                                .addGap(18, 18, 18)
                                                .addComponent(informacion_tarea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(316, Short.MAX_VALUE))
        );
        panel_tarea1Layout.setVerticalGroup(
                panel_tarea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tarea1Layout.createSequentialGroup()
                                .addContainerGap(26, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(panel_tarea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tarea1_completada)
                                        .addComponent(informacion_tarea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        tareas.addTab("Tarea #1", null, panel_tarea1, "");

        tarea2_complatada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tarea2_complatada.setText("Tarea Completada");

        informacion_tarea2.setEditable(false);
        informacion_tarea2.setColumns(20);
        informacion_tarea2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        informacion_tarea2.setRows(5);
        jScrollPane2.setViewportView(informacion_tarea2);

        javax.swing.GroupLayout panel_tarea2Layout = new javax.swing.GroupLayout(panel_tarea2);
        panel_tarea2.setLayout(panel_tarea2Layout);
        panel_tarea2Layout.setHorizontalGroup(
                panel_tarea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_tarea2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_tarea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tarea2_complatada)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(317, Short.MAX_VALUE))
        );
        panel_tarea2Layout.setVerticalGroup(
                panel_tarea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tarea2Layout.createSequentialGroup()
                                .addContainerGap(38, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(tarea2_complatada)
                                .addContainerGap())
        );

        tareas.addTab("Tarea #2", panel_tarea2);


        javax.swing.GroupLayout panel_tareasLayout = new javax.swing.GroupLayout(panel_tareas);
        panel_tareas.setLayout(panel_tareasLayout);
        panel_tareasLayout.setHorizontalGroup(
                panel_tareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_tareasLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(panel_tareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombre_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(77, Short.MAX_VALUE))
        );
        panel_tareasLayout.setVerticalGroup(
                panel_tareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_tareasLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(nombre_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_tareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(panel_tareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));






    }

    private void tarea1_completadaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }



    private javax.swing.JTextArea infomacion_tarea1;
    private javax.swing.JTextField informacion_tarea1;
    private javax.swing.JTextArea informacion_tarea2;
    private javax.swing.JTextArea informacion_tarea3;
    private javax.swing.JTextArea informacion_tarea4;
    private javax.swing.JTextArea informacion_tarea5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel nombre_proyecto;
    private javax.swing.JPanel panel_tarea1;
    private javax.swing.JPanel panel_tarea2;
    private javax.swing.JPanel panel_tarea3;
    private javax.swing.JPanel panel_tarea4;
    private javax.swing.JPanel panel_tarea5;
    private javax.swing.JPanel panel_tareas;
    private javax.swing.JCheckBox tarea1_completada;
    private javax.swing.JCheckBox tarea2_complatada;
    private javax.swing.JCheckBox tarea3_completada;
    private javax.swing.JCheckBox tarea4_completada;
    private javax.swing.JCheckBox tarea5_completada;
    private javax.swing.JTabbedPane tareas;


}
