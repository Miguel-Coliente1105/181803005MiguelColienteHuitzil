/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class TestBicicleta {
     public static void main(String[] args) {
         Bicicleta benotto=new Bicicleta();
         benotto.marca= "benotto";
         benotto.color="azul";
         benotto.rodada=23;
         benotto.velocidad=4;
         benotto.precio=2700;
         
        
        System.out.println(benotto);
}
}