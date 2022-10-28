/*
 Formas de imorimir un arreglo
 */
package bucleforeach;

/**
 *
 * @author Carolina EM
 */
public class BucleForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] nombres ={"Carolina","Luis","Mariana","Andrea","Sofia"};
        
        /**for (int i=0; i<nombres.length; i++){ //Se utiliza cuando no sabes cuantos numeros de arreglos hay .length
            System.out.println(nombres[i]);
        }*/
        for (String i:nombres){ //BUCLE FOR EACH para imprimir
            System.out.println(i);
        }
    }
    
}
