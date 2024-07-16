package questao6;

import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A,B,C,R,S,D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        R = A+B;
        R *= R;
        S = B+C;
        S *= S;
        D = (R+S)/2;
        System.out.printf("D = %.2f", D);
    }
}