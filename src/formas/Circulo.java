/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

public class Circulo extends Forma{
  public double Raio;

  public void setRaio(double Raio){
    this.Raio = Raio;
  }

  @Override
  public String getNome(){
    return "Circulo";
  }

  @Override
  public double calcularPerimetro(){
    return (Raio * 2) * 3.14;
  }

  @Override
  public double calcularArea(){
    return (Raio * Raio)*3.14;
  }


}