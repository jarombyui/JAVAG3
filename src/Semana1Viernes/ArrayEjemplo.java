package Semana1Viernes;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayEjemplo {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[2] = 10;
        array[4] = 56;

        System.out.println(array[2]);

        int[] array2 = {1,2,1,22,23,32,23,232};
        /// array dinamico
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(190);
        arrayList.add(200);

        arrayList.remove(0); /*te acepta borrar  el indice=index de un array */


        //Linked List

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.add(89);
        linkedList.add(76);

        System.out.println(linkedList);



    }
}
