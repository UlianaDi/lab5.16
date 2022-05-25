package com.company;
import java.util.Scanner;
public class Four {
    public static void main(String[] args){
        int q, w, e, r, t, y;
        int i = 0;
        do{
            i++;
            System.out.println("Введіть три цілі числа в проміжку від 1 до 3: ");
            Scanner scan= new Scanner(System.in);
            q = (int)(Math.random() * 3 + 1);
            w = (int)(Math.random() * 3 + 1);
            e = (int)(Math.random() * 3 + 1);
            if (scan.hasNextInt()){
                r = scan.nextInt();
                t = scan.nextInt();
                y = scan.nextInt();
                if (q == r && w == t && e == y)
                    System.out.println("Ви вгадали та виграли!");
                else{
                    System.out.println("Ви не вгадали...Спробуйте ще раз: ");
                    q = (int) (Math.random() * 3 + 1);
                    w = (int) (Math.random() * 3 + 1);
                    e = (int) (Math.random() * 3 + 1);
                    if (scan.hasNextInt()){
                        r = scan.nextInt();
                        t = scan.nextInt();
                        y = scan.nextInt();
                        if (q == r && w == t && e == y)
                            System.out.println("Ура ви виграли!!");
                        else
                            System.out.println("Ви програли. Наступного разу пощастить.");
                    }else
                        System.out.println("Ви ввели не вірні числа.");
                }
            }else
                System.out.println(" Ви ввели не вірні числа. ");
        }while (i != 1);
    }
}

