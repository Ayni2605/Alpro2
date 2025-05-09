package array;

import java.util.Scanner;

public class array2_dimensi {
public static void main(String[] args){

Scanner s= new Scanner(System.in);
//deklarasi array
int[][]arr=new int[3][3];
//input nilai ke array
System.out.println("Masukkan elemen array: ");
for(int i=0; i<3; i++){
    for(int j=0;j<3;j++){
    System.out.print("Array["+i+','+j+"]= ");
    arr[i][j]=s.nextInt();
    }
   }
//tampilan isi array
System.out.println("\nIsi array: ");
for(int i=0; i<3; i++){
    for(int j=0; j<3; j++){
        System.out.print(arr[i][j]+ "\t");
        }
        System.out.println();
    }
}
}

