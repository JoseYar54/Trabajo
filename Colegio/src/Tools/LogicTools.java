package Tools;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LogicTools {
    /**
    * Obliga a que solo se escriban numeros en el TextField
    */
    public static void setOnlyNumbers(KeyEvent e, JTextField txt, int maximo) {
    	char x = e.getKeyChar();
        if (!Character.isDigit(x)) {
            e.consume();
       	}
       	if (txt.getText().length() == maximo) {
            e.consume();
        }
    }
    
    /**
    * Obliga a que solo se escriban letras en el TextField
    */
    public static void setOnlyChars(KeyEvent e, JTextField txt, int maximo) {
    	char x = e.getKeyChar();
        if (Character.isDigit(x)) {
            e.consume();
       	}
       	if (txt.getText().length() == maximo) {
            e.consume();
        }
    }
    
    /**
    * Obliga a que solo se escriban cierta cantidad de caracteres alfanuméricos
    */
    public static void setMaxSize(KeyEvent e, JTextArea txt, int maximo) {
       	if (txt.getText().length() >= maximo) {
            e.consume();
        }
    }
    
    /**
    * Obliga a que solo se escriban cierta cantidad de caracteres alfanuméricos
    */
    public static void setMaxSize(KeyEvent e, JTextField txt, int maximo) {
       	if (txt.getText().length() >= maximo) {
            e.consume();
        }
    }
    
    /**
    * Establece las decoraciones para el boton de cerrado
    */
    public static void styleCloseButtom(JLabel lbl, Color color){
        lbl.setOpaque(true);
        lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbl.setBackground(new Color(227,38,54));
                lbl.setForeground(new Color(255,255,255));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                lbl.setBackground(color);
                lbl.setForeground(new Color(0,0,0));
            }
        });
    }
    
    /**
    * Insertar Valores Basicos del JFrame en todos los JFrames
    */
    public static void styleMainFrame(JFrame jframe){
        jframe.setLocationRelativeTo(null);
        jframe.setIconImage(IconTools.mainIcon());
        jframe.setTitle("Colegio");
    }
    
    /**
     * Inserta Texto tipo placeholder en el input ingresado en los JTextField
     */
    public static void setStyleInput(JTextField text,String Mensaje, int tamanio){
        LogicTools.setFontStyle(text, Color.GRAY,Mensaje,tamanio);
        text.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                text.setText("");
                LogicTools.setFontStyle(text, Color.black,"",tamanio);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (text.getText().isEmpty()) {
                    LogicTools.setFontStyle(text, Color.GRAY,Mensaje,tamanio);
                }
            }
        });
    }
    
    public static void setFontStyle(JTextField c,Color color,String txt,int Tamanio){
        c.setForeground(color);
        c.setFont(new Font("Consolas",Font.BOLD,Tamanio));
        c.setText(txt);
    }
    
    public static void sendMessage(String mensaje) {
        JOptionPane.showMessageDialog(null,mensaje,"Adventencia",2,null);
    }
    
    public static void setLogicCmbBoxGradoAlum(JComboBox<String> cmbGrado,JComboBox<String> cmbNivel){
        String opcion=(String)cmbNivel.getSelectedItem();
        String[] Elección=null;
        switch (opcion) {
            case "Primaria":
                Elección=new String[]{"-","1","2","3","4","5","6"};
                break;
            case "Secundaria":
                Elección=new String[]{"-","1","2","3","4","5"};
                break;
            default:
                System.out.println("No se ha seleccionado nada para el combo box");;
        }
        
        if (Elección != null) {
            cmbGrado.removeAllItems();

        for (String string : Elección) {
            cmbGrado.addItem(string);
            }
        }
    }
}
