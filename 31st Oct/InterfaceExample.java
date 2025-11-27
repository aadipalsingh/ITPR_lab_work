
/*----- Interface for ThreeD Figure -------*/
interface ThreeDFigure {
	// member variable
	float PI = 3.14f;

	// method for calculating curved surface area
	default void calculateCurvedSurfaceArea() {
		System.out.println("Curved Surface Area");
	}

	// method for calculating total surface area
	void calculateTotalSurfaceArea();

	// method for calculating Volume
	void calculateVolume();
}

/*---- Defining a Cylinder class ----*/
class Cylinder implements ThreeDFigure {
	// member variable
	float radius, height;

	// Constructor
	public Cylinder(float radius, float height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public void calculateCurvedSurfaceArea() {
		// variable to store curved Surface area
		double csa = 2 * ThreeDFigure.PI * radius * height;
		System.out.println("Curved Surface Area of Cylinder : " + csa + " sq. cm");

	}

	@Override
	public void calculateTotalSurfaceArea() {
		// variable to store total Surface area
		double tsa = 2 * ThreeDFigure.PI * radius * (radius + height);
		System.out.println("Total Surface Area of Cylinder : " + tsa + " sq. cm");
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateVolume() {
		// variable to store volume
		double volume = ThreeDFigure.PI * radius * radius * height;
		System.out.println("Volume of Cylinder : " + volume + " sq. cm");
	}
}

/*-----------------------------------------------------*/
/*----- Defining a class for Cube ----*/
class Cube implements ThreeDFigure {
	int side;

	// constructor
	public Cube(int side) {
		this.side = side;
	}

	@Override
	public void calculateCurvedSurfaceArea() {
		// to store curved surface area
		long csa = 4 * side * side;
		System.out.println("Curved Surface Area of Cube : " + csa);
	}

	@Override
	public void calculateTotalSurfaceArea() {
		// to store total surface area
		long tsa = 6 * side * side;
		System.out.println("Total Surface Area of Cube : " + tsa);

	}

	@Override
	public void calculateVolume() {
		// to store volume
		long volume = side * side * side;
		System.out.println("Volume of Cube : " + volume);
	}

}

/*----- Defining a class for sphere ---*/
class Sphere implements ThreeDFigure {
	float radius;

	public Sphere(float radius) {
		this.radius = radius;
	}

	@Override
	public void calculateTotalSurfaceArea() {
		double tsa = 4 * ThreeDFigure.PI * radius * radius;
		System.out.println("Total Surface Area : " + tsa + " sq. cm");
	}

	@Override
	public void calculateVolume() {
		double volume = (4 * ThreeDFigure.PI * radius * radius * radius) / 3;
		System.out.println("Volume : " + volume + " cubic. cm");
	}

}

/*-------------------------------------------------*/
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------ Cylinder ------");
		ThreeDFigure figure1 = new Cylinder(7.0f, 10.0f);
		figure1.calculateCurvedSurfaceArea();
		figure1.calculateTotalSurfaceArea();
		figure1.calculateVolume();
		System.out.println("-------------------------------------------");
		// ---------------------------------------------------
		System.out.println("------ Cube ------");
		ThreeDFigure figure2 = new Cube(10);
		figure2.calculateCurvedSurfaceArea();
		figure2.calculateTotalSurfaceArea();
		figure2.calculateVolume();
		System.out.println("-------------------------------------------");
		// ---------------------------------------------------
		System.out.println("------ Sphere ------");
		ThreeDFigure figure3 = new Sphere(10);
		figure3.calculateTotalSurfaceArea();
		figure3.calculateVolume();

	}

}
