/*
 * Controlador del Frame
 */
package Controlador;

import Modelo.Metodos_RegistroAutomoviles;
import Vista.JFRM_RegistroAutomoviles;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * @author sqdan
 */
public class Controlador_RegistroAutomoviles implements ActionListener
{
    int numeroBuscar;
    JFRM_RegistroAutomoviles frame;
    Metodos_RegistroAutomoviles metodos;
    
    //Método constructor del controlador
    public Controlador_RegistroAutomoviles(JFRM_RegistroAutomoviles frame)
    {        
        this.frame = frame;
        metodos = new Metodos_RegistroAutomoviles();
    }
    
    //Métodos del ActionListener
    public void actionPerformed(ActionEvent e)
    {
        //Busca un número de registro y si lo encuentra, lo devuelve
        if(e.getActionCommand().equals("Buscar"))
        {
            if(metodos.buscar(Integer.parseInt(frame.getNumero())) == true)
            {
                frame.setFields(metodos.getInfoArray(Integer.parseInt(frame.getNumero())));
                frame.estadoBuscar();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se ha encontrado el número buscado.");
                frame.clearFields();
            }
            System.out.println("Buscar");
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.addAutomovil(frame.getFields());
            frame.clearFields();
            frame.estadoAgregar();
            System.out.println("Agregar");            
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarAutomovil(Integer.parseInt(frame.getNumero()), frame.getFields());
            System.out.println("Modificar");
            frame.clearFields();
            frame.estadoSinBuscar();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarAutomovil(Integer.parseInt(frame.getNumero()), frame.getFields());
            System.out.println("Eliminar");
            frame.clearFields();
            frame.estadoSinBuscar();
        }
    }
}
