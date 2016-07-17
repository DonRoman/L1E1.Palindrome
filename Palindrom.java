package Palindrom;

import java.util.Scanner;

/**
 * Created by Don on 17.07.2016.
 */
public class Palindrom {

    public void FindPalindromFromConslole(){
        Scanner in = new Scanner(System.in);
        int arrayBorder = getArrayBorder(in);
        int[] array = getArray(in, arrayBorder);
        FindPalindrom(array);
    }

    static int getArrayBorder(Scanner in){
        System.out.print("Input quantity of numbers for array: ");
        int num = in.nextInt();
        return num;
    }

    static int[] getArray(Scanner in, int ArrayBroder){
        int[] array = new int[ArrayBroder];
        for (int i = 0; i<ArrayBroder; i++) {
            System.out.print("Set number "+(i+1)+": ");
            array[i] = in.nextInt();
        }
        return array;
    }

    static void FindPalindrom(int[] array) {
        for (int i = 0;i<array.length;i++) {
            int s = ReverseInt(array[i]);
            if (s == array[i]) {
                System.out.println(array[i] + " is a palindrom!");
            }
        }
    }

    static int ReverseInt(int number) {
        String origin = Integer.toString(number);
        String reverse = "";
        int isPalinom = 0;
        for (int i = origin.length();i>0;i--) {
            reverse = reverse + origin.charAt(i-1);
        }

        isPalinom = Integer.parseInt(reverse);
        return isPalinom;
    }
}
