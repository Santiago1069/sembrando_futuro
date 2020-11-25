package ventanas;


import java.awt.CardLayout;

import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {

    private static final long serialVersionUID = 1L;



    public PanelPrincipal(CardLayout cardLayout) {
        setLayout(cardLayout);
    }

    public void addScreen(Pantalla screen, String screenName) {
        add(screen, screenName);
    }


}