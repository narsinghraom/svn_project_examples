import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laddu
 */
public class Combination {

    public void comb(String start, String end) {
        if (end.length() <= 1) {
            
            System.out.println(start + end);
            
        } else {
            for (int i = 0; i < end.length(); i++) {
                String n = end.substring(0, i) + end.substring(i + 1);
                comb(start + end.charAt(i), n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Combination c = new Combination();
        System.out.println("Enter the string");
        String str = input.nextLine();
        c.comb("", str);

    }

}
