package inicio;

import ventanas.GUI;

import javax.swing.*;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                GUI gameFrame = new GUI();
            }
        });

    }
}
