package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    CardLayout cardLayout;
    Login login;
    ListaProyectos listaProyectos;
    PanelPrincipal panelPrincipal;
    Tareas tareas;
    Ayuda ayuda;
    AcercaDe acercade;
    Registro registro;
    ProyectoNuevo proyectoNuevo;

    public GUI() {

        crearVentanas();
        crearMenu();
        crearAccionesMenu();

        add(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationByPlatform(true);
        setVisible(true);
        this.setTitle(" Sembrando futuro ");


    }

    private void crearVentanas() {

        cardLayout = new CardLayout();

        panelPrincipal = new PanelPrincipal(cardLayout);

        listaProyectos = new ListaProyectos(getContentPane());
        login = new Login(getContentPane());
        tareas = new Tareas(getContentPane());
        ayuda = new Ayuda(getContentPane());
        proyectoNuevo = new ProyectoNuevo(getContentPane());
        registro = new Registro(getContentPane());
        acercade = new AcercaDe(getContentPane());


        panelPrincipal.addScreen(login, VentanasConstantes.NOMBRE_VISTA_LOGIN);
        panelPrincipal.addScreen(proyectoNuevo, VentanasConstantes.NOMBRE_VISTA_PROYECTO_NUEVO);
        panelPrincipal.addScreen(listaProyectos, VentanasConstantes.NOMBRE_VISTA_LISTA_PROYECTOS);
        panelPrincipal.addScreen(tareas, VentanasConstantes.NOMBRE_VISTA_TAREAS);
        panelPrincipal.addScreen(ayuda, VentanasConstantes.NOMBRE_VISTA_AYUDA);
        panelPrincipal.addScreen(acercade, VentanasConstantes.NOMBRE_VISTA_ACERCA_DE);
        panelPrincipal.addScreen(registro, VentanasConstantes.NOMBRE_VISTA_REGISTRO);

        cardLayout.show(panelPrincipal, VentanasConstantes.NOMBRE_VISTA_LOGIN);

    }

    private void crearMenu() {

        menu = new JMenuBar();
        menu_crear = new JMenu();
        menu_ver = new JMenu();
        menu_ayuda = new JMenu();
        ayuda_ = new JMenuItem();
        separador_crear = new JPopupMenu.Separator();
        proyecto_nuevo = new JMenuItem();
        agregar_recordatorios = new JMenuItem();
        lista_proyectos = new JMenuItem();
        separador_tareas = new JPopupMenu.Separator();
        tareasMenu = new JMenuItem();
        separador_ver = new JPopupMenu.Separator();
        recordatorios = new JMenuItem();
        separador_ayuda = new JPopupMenu.Separator();
        acerca_de = new JMenuItem();

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
        menu_ver.add(lista_proyectos);
        menu_ver.add(separador_ver);
        recordatorios.setText("Recordatorios");
        menu_ver.add(recordatorios);
        menu.add(menu_ver);
        menu_ver.add(separador_tareas);
        menu_ver.add(tareasMenu);
        tareasMenu.setText("Tareas");
        menu_ayuda.setText("Ayuda          ");
        ayuda_.setText("Ayuda");
        menu_ayuda.add(ayuda_);
        menu_ayuda.add(separador_ayuda);
        acerca_de.setText("Acerca de ...");
        menu_ayuda.add(acerca_de);
        menu.add(menu_ayuda);
        setJMenuBar(menu);
    }


    private void crearAccionesMenu() {
        proyecto_nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelPrincipal, VentanasConstantes.NOMBRE_VISTA_PROYECTO_NUEVO);
            }
        });

        lista_proyectos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelPrincipal, VentanasConstantes.NOMBRE_VISTA_LISTA_PROYECTOS);
            }
        });

        tareasMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelPrincipal, VentanasConstantes.NOMBRE_VISTA_TAREAS);
            }
        });

        ayuda_.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelPrincipal, VentanasConstantes.NOMBRE_VISTA_AYUDA);
            }
        });

        acerca_de.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelPrincipal, VentanasConstantes.NOMBRE_VISTA_ACERCA_DE);
            }
        });


    }


    private javax.swing.JMenuItem agregar_recordatorios;
    private javax.swing.JMenuItem ayuda_;
    private javax.swing.JMenuItem acerca_de;
    private javax.swing.JMenuItem lista_proyectos;
    private javax.swing.JMenuItem tareasMenu;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_crear;
    private javax.swing.JMenu menu_ver;
    private javax.swing.JMenuItem proyecto_nuevo;
    private javax.swing.JMenuItem recordatorios;
    private javax.swing.JPopupMenu.Separator separador_ayuda;
    private javax.swing.JPopupMenu.Separator separador_crear;
    private javax.swing.JPopupMenu.Separator separador_ver;
    private javax.swing.JPopupMenu.Separator separador_tareas;
}
