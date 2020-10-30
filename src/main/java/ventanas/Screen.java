package ventanas;

import java.awt.*;

import javax.swing.JPanel;

public class Screen extends JPanel {

    private static final long serialVersionUID = 1L;
    private Container container;

    public Screen(Container container){
        this.container = container;
    }

    public void navigateTo(String screenName) {
        CardLayout cl = (CardLayout) this.getParent().getLayout();
        cl.show(this.getParent(), screenName);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000, 500);
    }

    public Container getContainer() {
        return container;
    }
}