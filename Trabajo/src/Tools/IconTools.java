package Tools;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconTools {
    public static Color colorPnlPrinci=new Color(223,225,222),colorPnls=new Color(86,104,118);
    
    public static Image mainIcon(){
        ImageIcon icon = new ImageIcon("img/icon.png");
        Image image=icon.getImage();
        return  image;
    }
    
    /**
    * Reconoce cuando el mouse se posa sobre cada opción
    */
    public static void addMouseDecoration(JLabel lbl,String urlEntrada,String UrlSalida){
        lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                IconTools.addIconOption(lbl, urlEntrada);
                lbl.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                IconTools.addIconOption(lbl, UrlSalida);
                lbl.repaint();
            }
        });
    }
    
    /**
    * Realiza la inserrción del icon en el JLabel
    */
    public static void addIconOption(JLabel lbl,String url){
        ImageIcon icon = new ImageIcon(url);
        Image image=icon.getImage();
        Image Tamanio=image.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);        
        lbl.setIcon(new ImageIcon(Tamanio));
    }
}
