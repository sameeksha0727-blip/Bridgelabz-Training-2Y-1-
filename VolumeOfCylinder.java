import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        double pi = 3.14;
        double volume = pi * radius * radius * height;
        System.out.println("Volume of cylinder: " + volume);
    }
}

