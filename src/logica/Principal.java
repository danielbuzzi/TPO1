/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import igu.Pantalla;

/**
 *
 * @author daniel
 */
public class Principal {

    public static void main(String[] args) {

        /*Cargamos la interfaz grafica de la igu,
        haciendola visible y la localizamos 
        en el centro de la pantalla
         */
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
