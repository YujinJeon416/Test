package ncs.test9;

public class PlaneTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane a = new Airplane("L747", 1000);
		Cargoplane c = new Cargoplane("C40", 1000);
		
		System.out.println("Plane\t\t\t\tfuelSize");
		System.out.println("------------------------------------");
		System.out.println(a.getPlaneName()+"\t\t\t\t"+a.getFuelSize());
		System.out.println(c.getPlaneName()+"\t\t\t\t"+c.getFuelSize());
		System.out.println();
		System.out.println("100 운항");
		a.flight(100);
		c.flight(100);
		System.out.println();
		System.out.println("Plane\t\t\t\tfuelSize");
		System.out.println("------------------------------------");
		System.out.println(a.getPlaneName()+"\t\t\t\t"+a.getFuelSize());
		System.out.println(c.getPlaneName()+"\t\t\t\t"+c.getFuelSize());
		System.out.println();
		System.out.println("200 주유");
		a.refuel(200);
		c.refuel(200);
		System.out.println();
		System.out.println("Plane\t\t\t\tfuelSize");
		System.out.println("------------------------------------");
		System.out.println(a.getPlaneName()+"\t\t\t\t"+a.getFuelSize());
		System.out.println(c.getPlaneName()+"\t\t\t\t"+c.getFuelSize());
	}

}
