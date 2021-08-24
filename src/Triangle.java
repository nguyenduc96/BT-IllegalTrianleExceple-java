import java.util.Scanner;

public class Triangle {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            inputTriangle();
        } catch (IllegalTriangleException e) {
            System.err.println("Đây không phải tam giác");
        }
    }

    private static void inputTriangle() throws IllegalTriangleException {
        System.out.print("Nhập cạnh a : ");
        double sideA = scanner.nextDouble();
        System.out.print("Nhập cạnh b : ");
        double sideB = scanner.nextDouble();
        System.out.print("Nhập cạnh c : ");
        double sideC = scanner.nextDouble();
        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA) || sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalTriangleException();
        } else {
            System.out.println("Đây là tam giác");
        }
    }
}
