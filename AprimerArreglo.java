

package com.mycompany.aprimerarreglo;


public class AprimerArreglo {

    public static void main(String[] args) {
        int[] arreglos = {1,2,3,4,5};
        
        for (int i=0; i<arreglos.length; i++){
            arreglos[i] = i;
            System.out.println(i);
            System.out.println("----------");
            System.out.println(i*i);
            
        }
    }
}
