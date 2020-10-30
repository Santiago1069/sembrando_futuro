package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

    CardLayout cardLayout;
    Login login;
    ListaProyectos listaProyectos;
    PanelPrincipal panelPrincipal;
    Tarea tarea;
    ProyectoNuevo proyectoNuevo;

    public GUI() {
        crearVentanas();
        crearMenu();


        add(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationByPlatform(true);
        setVisible(true);

    }

    private void crearVentanas() {
        cardLayout = new CardLayout();
        panelPrincipal = new PanelPrincipal(cardLayout);

        login = new Login(getContentPane());
        listaProyectos = new ListaProyectos(getContentPane());
        tarea = new Tarea(getContentPane());
        proyectoNuevo = new ProyectoNuevo(getContentPane());

        panelPrincipal.addScreen(login, "login");
        panelPrincipal.addScreen(listaProyectos, "lista_proyectos");
        panelPrincipal.addScreen(tarea,"tarea");
        panelPrincipal.addScreen(proyectoNuevo, "proyecto_nuevo");

    }

    private void crearMenu() {

        menu = new JMenuBar();
        menu_crear = new JMenu();
        menu_ver = new JMenu();
        menu_ayuda = new JMenu();
        ayuda = new JMenuItem();
        separador_crear = new JPopupMenu.Separator();
        proyecto_nuevo = new JMenuItem();
        agregar_recordatorios = new JMenuItem();
        lista_proyectos = new JMenuItem();
        separador_ver = new JPopupMenu.Separator();
        recordatorios = new JMenuItem();
        separador_ayuda = new JPopupMenu.Separator();
        jMenuItem1 = new JMenuItem();

        menu_crear.setText("Crear          ");
        menu_crear.setToolTipText("");
        menu_crear.setActionCommand("menu_crear");


        proyecto_nuevo.setText("Proyecto Nuevo");
        menu_crear.add(proyecto_nuevo);
        menu_crear.add(separador_crear);

        agregar_recordatorios.setText("Agregar Recordatorios");
        menu_crear.add(agregar_recordatorios);

        menu.add(menu_crear);

        menu_ver.setText("Ver          ");

        lista_proyectos.setText("Lista de Proyectos");
        lista_proyectos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lista_proyectosMouseClicked(evt);
            }
        });
        lista_proyectos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                lista_proyectosActionPerformed(evt);
            }
        });
        
        menu_ver.add(lista_proyectos);
        menu_ver.add(separador_ver);

        recordatorios.setText("Recordatorios");
        menu_ver.add(recordatorios);

        menu.add(menu_ver);

        menu_ayuda.setText("Ayuda          ");

        ayuda.setText("Ayuda");
        menu_ayuda.add(ayuda);
        menu_ayuda.add(separador_ayuda);

        jMenuItem1.setText("Acerca de ...");
        menu_ayuda.add(jMenuItem1);

        menu.add(menu_ayuda);

        setJMenuBar(menu);
    }

    private void lista_proyectosActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void lista_proyectosMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }



    private javax.swing.JMenuItem agregar_recordatorios;
    private javax.swing.JMenuItem ayuda;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem lista_proyectos;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_crear;
    private javax.swing.JMenu menu_ver;
    private javax.swing.JMenuItem proyecto_nuevo;
    private javax.swing.JMenuItem recordatorios;
    private javax.swing.JPopupMenu.Separator separador_ayuda;
    private javax.swing.JPopupMenu.Separator separador_crear;
    private javax.swing.JPopupMenu.Separator separador_ver;
}
