/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Federico García Lorca
 */
public class Ayuda {
    
    private String ayuda ="Esto es una ayuda";
    
    private int num = 535;
    
    private String holo;
    
    public void pedirAyuda (){
        System.out.println(ayuda + "" + num);
    }

    @Override
    public String toString() {
        return "Ayuda{" + "ayuda=" + ayuda + '}';
    }
    
    
}
