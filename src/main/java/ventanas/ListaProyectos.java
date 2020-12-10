package ventanas;

import almacenamiento.RepositorioProyecto;
import modelos.Proyecto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class ListaProyectos extends Pantalla {

    RepositorioProyecto repositorioProyecto;

    public ListaProyectos(Container container) {
        super(container);
        repositorioProyecto = new RepositorioProyecto();


        iniciarComponentesT();

    }

    private void iniciarComponentesT() {

        JPanel Lista_proyectos = new JPanel();
        JScrollPane panel = new JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        boton_crear = new javax.swing.JButton();
        boton_actualizar = new javax.swing.JButton();
        boton_leer = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();


        crearTabla();
        panel.setViewportView(tablaProyectos);



        boton_crear.setText("Crear Proyecto");
        boton_actualizar.setText("Actualizar Tabla");
        boton_leer.setText("Leer Tabla");
        boton_eliminar.setText("Eliminar Proyecto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(Lista_proyectos);
        Lista_proyectos.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(boton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81)
                                                .addComponent(boton_leer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(80, 80, 80)
                                                .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(boton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_leer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Lista_proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Lista_proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );



    }

    private void crearTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("Numero de proyecto");
        modeloTabla.addColumn("Nombre del proyecto");
        modeloTabla.addColumn("Fecha de inicio");
        modeloTabla.addColumn("Dias desde la fecha");
        modeloTabla.addColumn("Tipo de consecha");

        try{
            java.util.List<Proyecto> proyectos = repositorioProyecto.obtenerProyectosPorUsuario("1070611648");

            int contador = 1;
            for (Proyecto p: proyectos){

                Vector<Object> row = new Vector<Object>();

                row.add(contador);
                row.add(p.getNombre_proyecto());
                row.add(p.getFecha());
                row.add(p.obtenerDiasPasados());
                row.add(p.getTipoCosecha().name());

                contador++;

                modeloTabla.addRow(row);
            }

        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
        }

        tablaProyectos.setModel(modeloTabla);
    }


    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_crear;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_leer;
    private javax.swing.JTable tablaProyectos;


}
