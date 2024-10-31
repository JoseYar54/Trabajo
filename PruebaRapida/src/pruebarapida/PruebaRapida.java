package pruebarapida;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class PruebaRapida {

    public static void main(String[] args) {
        new Prueba();
    }
}

class Prueba extends JFrame {
    JPanel PnlPanelPrincipal, PnlLateralIzquierda, PnlGeneral;
    final Color ColorFondo = new Color(255, 255, 255), ColorLateral = new Color(0, 204, 204);

    public Prueba() {
        // Configuración de la ventana principal
        setTitle("Aplicación de Ejemplo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Crear y configurar paneles
        setPnlLateralIzquierdo();
        setPnlGeneral();
        
        // Ajustar el tamaño de la ventana según el contenido
        pack();
        setLocationRelativeTo(null); // Centrar la ventana
        setVisible(true); // Hacer visible la ventana
    }

    private void setPnlGeneral() {
        PnlGeneral = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            // Agregar un JPanel vacío a cada celda
            PnlGeneral.add(new JPanel());
        }
        
        PnlGeneral.add(new JTextField(){

            @Override
            public void setSize(Dimension d) {
                super.setSize(new Dimension(100, 100));
            }
        });
        PnlGeneral.setPreferredSize(new Dimension(700, 400)); // Ajustar el tamaño preferido (ancho)
        this.add(PnlGeneral, BorderLayout.EAST); // Agregar el panel general al centro
    }

    private void setPnlLateralIzquierdo() {
        PnlLateralIzquierda = new JPanel();
        PnlLateralIzquierda.setBackground(ColorLateral);
        PnlLateralIzquierda.setPreferredSize(new Dimension(200, 400)); // Ajustar el tamaño preferido (ancho)

        this.add(PnlLateralIzquierda, BorderLayout.WEST); // Agregar el panel lateral al lado oeste
    }
}
