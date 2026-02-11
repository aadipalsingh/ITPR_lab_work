import java.util.Scanner;

public class VolumeOverloading {

    // 1. Volume of Cube: side * side * side
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // 2. Volume of Cuboid: length * width * height
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // 3. Volume of Cylinder: π * r² * h
    // Cylinder: 2 parameters (radius, height)
    public double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // 4. Volume of Cone: (1/3) * π * r² * h
    public double calculateVolume(double radius, double height, boolean isCone) {
        if (isCone) {
            return (1.0 / 3.0) * Math.PI * radius * radius * height;
        }
        return 0;
    }

    // 5. Volume of Sphere: (4/3) * π * r³
    public double calculateVolume(double radius, String shape) {
        if (shape.equalsIgnoreCase("sphere")) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        } else if (shape.equalsIgnoreCase("hemisphere")) {
            // 6. Volume of Hemisphere: (2/3) * π * r³
            return (2.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
        return 0;
    }

    public static void main(String[] args) {
        VolumeOverloading vol = new VolumeOverloading();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Volume Calculator ---");
        
        // Cube
        System.out.println("1. Cube (Side = 4)");
        System.out.printf("Volume: %.2f\n", vol.calculateVolume(4.0));

        // Cuboid
        System.out.println("\n2. Cuboid (L=5, W=3, H=2)");
        System.out.printf("Volume: %.2f\n", vol.calculateVolume(5.0, 3.0, 2.0));

        // Cylinder
        System.out.println("\n3. Cylinder (Radius=3, Height=7)");
        System.out.printf("Volume: %.2f\n", vol.calculateVolume(3.0, 7.0));

        // Cone (Uses boolean flag to distinguish from Cylinder)
        System.out.println("\n4. Cone (Radius=3, Height=7)");
        System.out.printf("Volume: %.2f\n", vol.calculateVolume(3.0, 7.0, true));

        // Sphere (Uses String label to distinguish from Cube)
        System.out.println("\n5. Sphere (Radius=4)");
        System.out.printf("Volume: %.2f\n", vol.calculateVolume(4.0, "sphere"));

        // Hemisphere
        System.out.println("\n6. Hemisphere (Radius=4)");
        System.out.printf("Volume: %.2f\n", vol.calculateVolume(4.0, "hemisphere"));
        
        sc.close();
    }
}