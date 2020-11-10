/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

public class Quadrado extends Forma{
  public double Lado;

  public void setLado(double Lado){
    this.Lado = Lado;
  }

  @Override
  public String getNome(){
    return "Quadrado";
  }

  @Override
  public double calcularPerimetro(){
    return (Lado * 4);
  }

  @Override
  public double calcularArea(){
    return (Lado * Lado);
  }


}