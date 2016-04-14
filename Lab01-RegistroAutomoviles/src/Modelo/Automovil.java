/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * @author sqdan
 */
public class Automovil 
{
    //Define las variables
    private int numeroRegistro;
    private String nombreDueno;
    private String cedulaDueno;
    private String placa;

    //Método constructor del Objeto Automovil. Define todas las variables.
    public Automovil(int numeroRegistro, String nombreDueno, String cedulaDueno, String placa)
    {
        this.numeroRegistro = numeroRegistro;
        this.nombreDueno = nombreDueno;
        this.cedulaDueno = cedulaDueno;
        this.placa = placa;
    }
    
    /**
     * @return the numeroRegistro
     */
    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * @param numeroRegistro the numeroRegistro to set
     */
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    /**
     * @return the nombreDueno
     */
    public String getNombreDueno() {
        return nombreDueno;
    }

    /**
     * @param nombreDueno the nombreDueno to set
     */
    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    /**
     * @return the cedulaDueno
     */
    public String getCedulaDueno() {
        return cedulaDueno;
    }

    /**
     * @param cedulaDueno the cedulaDueno to set
     */
    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /**
     * @return the info
     */
    public String getInfo()
    {
        String info = "";
        
        info = "\nNombre del Dueño: "+nombreDueno
                +"\nCedula del Dueño: "+cedulaDueno
                +"\nPlaca del Automóvil: "+placa;
        
        return info;
    }
    
    /**
     * @return the info as array
     */
     public String[] getInfoArray()
    {
        String[] todo = new String[4];
        
        todo[0] =  ""+getNumeroRegistro();
        todo[1] = getNombreDueno();
        todo[2] = getCedulaDueno();
        todo[3] = getPlaca();
                    
        return todo;
    }
}
