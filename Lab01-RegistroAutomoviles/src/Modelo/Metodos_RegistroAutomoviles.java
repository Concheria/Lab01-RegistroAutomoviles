/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sqdan
 */
public class Metodos_RegistroAutomoviles 
{
    ArrayList <Automovil> arrayAutomoviles;
    int numeroRegistro = 0;
    
    public Metodos_RegistroAutomoviles()
    {
        arrayAutomoviles = new ArrayList();
    }
    
    public boolean buscar(int numero)
    {
        boolean encontrado = false;
        
        int numeroBuscar = (numero);
        
        System.out.println("Numero Buscado: "+numeroBuscar);
        
        for(int index=0; index < arrayAutomoviles.size(); index++)
        {
            if(numero == arrayAutomoviles.get(index).getNumeroRegistro())
            {
                encontrado = true;
            }
        }
        
        System.out.println("Encontrado = "+encontrado);
        
        return encontrado;
    }
    
    public void addAutomovil(String[] todo)
    {
        Automovil automovil = new Automovil(numeroRegistro, todo[1], todo[2], todo[3]);
        
        arrayAutomoviles.add(numeroRegistro, automovil);
        
        JOptionPane.showMessageDialog(null, "Registro Agregado:\n\nNúmero de Registro: "+numeroRegistro+"\n"+arrayAutomoviles.get(numeroRegistro).getInfo());
        
        numeroRegistro++;
    }
    
    public void modificarAutomovil(int index, String[] todo)
    {
        Automovil automovil = new Automovil(index, todo[1], todo[2], todo[3]);
        
        arrayAutomoviles.add(index, automovil);
        
        JOptionPane.showMessageDialog(null, "Registro Modificado\n\nNúmero de Registro: "+index+"\n"+arrayAutomoviles.get(numeroRegistro).getInfo());
    }
    
    public void eliminarAutomovil(int index, String[] todo)
    {
        arrayAutomoviles.remove(index);
        
        JOptionPane.showMessageDialog(null, "Registro "+index+" Eliminado");
    }
    
    public String getNumeroRegistro()
    {
        return ""+(numeroRegistro);
    }
    
    public String[] getInfoArray(int index)
    {
        return arrayAutomoviles.get(index).getInfoArray();
    }
}
