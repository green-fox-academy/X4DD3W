// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// 
// Surface Area: 600 (felület)
// Volume: 1000 (térfogat)

public class Cuboid {
    public static void main(String[] args) {

        double a = 10;
        double b = 10;
        double c = 10;

        double S_A = 2 * (a * b + a * c + b * c);
        double V = a * b * c;

        System.out.println("Surface Area: " + S_A);
        System.out.println("Volume: " + V);



    }
}