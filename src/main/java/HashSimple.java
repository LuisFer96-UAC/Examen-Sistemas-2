/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harde
 */
public class HashSimple {

    public static void main(String args[]){
    
    int [] matriculas = {56511,47147,58754,58813,46931};
    for(int i=0; i<=4;i++){
        int numero = matriculas[i];
        int resultado = 0;
        int sumaResultado=0;
        String estado = "";
        while(numero > 0){
            resultado += numero % 10;
            numero = numero / 10;
        }
        int contador = resultado;
        while(contador > 0){
            sumaResultado += contador %10;
            contador = contador / 10;
        }
        
        if(sumaResultado<=6){
        estado="Reprobado";
        }if(sumaResultado>=7 && sumaResultado<=9){
        estado="Aprobado";
        }if(sumaResultado>=10){
        estado="Excelente";
        }
        
        if(matriculas[i]==46931){
        System.out.println("TestHash:" + (i+1) + "Mio " + resultado + " " + sumaResultado + " " + estado);
        }else{
        System.out.println("TestHash:" + (i+1) + " " + resultado + " " + sumaResultado + " " + estado);
        }
    }
    
    }
    
}

