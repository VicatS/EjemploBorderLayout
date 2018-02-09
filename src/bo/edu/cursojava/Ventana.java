package bo.edu.cursojava;

import javax.swing.*;
import java.awt.*;
public class Ventana extends  JFrame{
    private JButton etiquetaNombre= new JButton("1");
    private JButton etiquetaNombre2= new JButton("2");
    private  JButton etiquetaNombre3= new JButton("3");
    private JButton etiquetaNombre4= new JButton("4");
    private JButton etiquetaNombre5= new JButton("5");

    public Ventana(){
        super("Ejemplo de BorderLayout");
        setLayout(new BorderLayout());
        //add(etiquetaNombre, BorderLayout.NORTH);
        add(etiquetaNombre2, BorderLayout.CENTER);
        //add(etiquetaNombre3, BorderLayout.SOUTH);
        add(etiquetaNombre4, BorderLayout.WEST);
        add(etiquetaNombre5, BorderLayout.EAST);
    }
}
