/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import java.util.List;
import java.util.ArrayList;
public class Formas {
public static void main(String[] args) {
    
    Circulo C1 = new Circulo();
    C1.setRaio(10);

    Quadrado Q1 = new Quadrado();
    Q1.setLado(10);
  
    Retangulo R1 = new Retangulo();
    R1.setBase(10);
    R1.setAltura(5);
     
    Triangulo T1 = new Triangulo();
    T1.setLado(10);
   
    List<Forma> formas = new ArrayList<Forma>();
    formas.add(C1);
    formas.add(Q1);
    formas.add(R1);
    formas.add(T1);

    for (Forma forma : formas){
    System.out.println(forma.getNome());
    System.out.println(forma.calcularPerimetro());
    System.out.println(forma.calcularArea());

    }
  }
}
    
    

