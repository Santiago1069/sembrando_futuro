package ventanas;

import almacenamiento.RepositorioProyecto;
import modelos.Proyecto;
import modelos.TipoCosecha;
import servicios.CrearProyectoServicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;

public class ProyectoNuevo extends Pantalla {

    CrearProyectoServicio crearproyectonuevo;
    RepositorioProyecto repositorioProyecto;

    public ProyectoNuevo(Container container) {
        super(container);
        iniciarComponentesP();
        repositorioProyecto = new RepositorioProyecto();
        crearproyectonuevo = new CrearProyectoServicio();
    }


    private void iniciarComponentesP() {

        menuBar1 = new java.awt.MenuBar();
        jPanel3 = new javax.swing.JPanel();
        titulo_proyecto_nuevo = new javax.swing.JLabel();
        nombre_proyecto = new javax.swing.JLabel();
        input_proyecto_nuevo = new javax.swing.JTextField();
        nombre_creador = new javax.swing.JLabel();
        input_nombre_creador = new javax.swing.JTextField();
        titulo_fecha = new javax.swing.JLabel();
        mostrar_fecha = new javax.swing.JTextField();
        titulo_cosecha = new javax.swing.JLabel();
        cosechas = new javax.swing.JComboBox<>();
        texto_motivacional = new javax.swing.JLabel();
        crear_proyecto = new javax.swing.JButton();

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

        mostrar_fecha.setText(new Date().toString());
        mostrar_fecha.setEditable(false);

        titulo_cosecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        titulo_cosecha.setText("Cosecha que desea realizar:");

        cosechas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cosechas.setModel(new javax.swing.DefaultComboBoxModel<>(
            new String[] { TipoCosecha.YUCA.toString(), TipoCosecha.MAIZ.toString() }
        ));

        texto_motivacional.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        texto_motivacional.setText("\"Todas tus acciones  son una semilla, que tarde o temprano daran frutos.\"");
        texto_motivacional.setToolTipText("");

        crear_proyecto.setText("Crear Proyecto ");
        crear_proyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        crear_proyecto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarProyectoNuevo();
            }});


        javax.swing.GroupLayout crearProyectoLayout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(crearProyectoLayout);
        crearProyectoLayout.setHorizontalGroup(
                crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(crearProyectoLayout.createSequentialGroup()
                                .addGroup(crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(crearProyectoLayout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(crearProyectoLayout.createSequentialGroup()
                                                                .addComponent(titulo_cosecha)
                                                                .addGap(63, 63, 63)
                                                                .addComponent(cosechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(crearProyectoLayout.createSequentialGroup()
                                                                .addGroup(crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(titulo_fecha)
                                                                        .addComponent(nombre_proyecto)
                                                                        .addComponent(nombre_creador))
                                                                .addGap(92, 92, 92)
                                                                .addGroup(crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(input_proyecto_nuevo)
                                                                        .addComponent(input_nombre_creador, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                                        .addComponent(mostrar_fecha)))))
                                        .addGroup(crearProyectoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(texto_motivacional))
                                        .addGroup(crearProyectoLayout.createSequentialGroup()
                                                .addGap(267, 267, 267)
                                                .addComponent(crear_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(crearProyectoLayout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addComponent(titulo_proyecto_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        crearProyectoLayout.setVerticalGroup(
                crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(crearProyectoLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(titulo_proyecto_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(titulo_fecha)
                                        .addComponent(mostrar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nombre_proyecto)
                                        .addComponent(input_proyecto_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(input_nombre_creador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombre_creador))
                                .addGap(18, 18, 18)
                                .addGroup(crearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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


    private void registrarProyectoNuevo(){

        String nombre_creador = input_nombre_creador.getText();
        String nombre_proyecto = input_proyecto_nuevo.getText();
        LocalDate fecha = LocalDate.now();
        String tipoCosechaNombre = (String) cosechas.getSelectedItem();
        TipoCosecha tipoCosecha = TipoCosecha.obtenerPorNombre(tipoCosechaNombre);

        try {

            Proyecto proyecto = new Proyecto(nombre_proyecto, nombre_creador, tipoCosecha, fecha);
            repositorioProyecto.guardar(proyecto);

            crear_proyecto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    navigateTo(VentanasConstantes.NOMBRE_VISTA_TAREAS);
                }
            });
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
        }

    }



    private javax.swing.JComboBox<String> cosechas;
    private javax.swing.JButton crear_proyecto;
    private javax.swing.JTextField input_nombre_creador;
    private javax.swing.JTextField input_proyecto_nuevo;
    private javax.swing.JPanel jPanel3;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField mostrar_fecha;
    private javax.swing.JLabel nombre_creador;
    private javax.swing.JLabel nombre_proyecto;
    private javax.swing.JLabel texto_motivacional;
    private javax.swing.JLabel titulo_cosecha;
    private javax.swing.JLabel titulo_fecha;
    private javax.swing.JLabel titulo_proyecto_nuevo;

}
