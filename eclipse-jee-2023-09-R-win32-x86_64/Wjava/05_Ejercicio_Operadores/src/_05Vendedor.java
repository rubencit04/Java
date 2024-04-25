import java.util.Scanner;

public class _05Vendedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Un vendedor recibe un sueldo base más un 10% extra por comisión de  \r\n"
				+ "\r\n"
				+ "sus ventas, el vendedor desea saber cuánto dinero obtendrá por concepto  \r\n"
				+ "\r\n"
				+ "de comisiones por las tres ventas que realiza en el mes y el total que  \r\n"
				+ "\r\n"
				+ "recibirá en el mes tomando en cuenta su sueldo base y comisiones. ");
		System.out.println("-------------------------------------------------------------------------------");
		double com = 0.1;
		System.out.println("Introduzca el sueldo base del vendedor");
		double SBase = sc.nextDouble();
		System.out.println("Sueldo Base---> "+SBase);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Introduzca el dinero ganado de la primera venta ");
		double venta1 = sc.nextDouble();
		System.out.println("Sueldo Base---> "+SBase);
		System.out.println("Venta 1 mas la comision---> "+venta1);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Introduzca el dinero ganado de la segunda venta ");
		double venta2 = sc.nextDouble();
		System.out.println("Sueldo Base---> "+SBase);
		System.out.println("Venta 1 mas la comision---> "+venta1);
		System.out.println("Venta 2 mas la comision---> "+venta2);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Introduzca el dinero ganado de la tercera venta ");
		double venta3 = sc.nextDouble();
		System.out.println("Sueldo Base---> "+SBase);
		System.out.println("Venta 1 mas la comision---> "+venta1);
		System.out.println("Venta 2 mas la comision---> "+venta2);
		System.out.println("Venta 3 mas la comision---> "+venta3);
		double dinero =  ((venta1*com)+(venta2*com)+(venta3*com))+ SBase;
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Teniendo encuenta el dinero y la comision del "+com+"\r\n"
				+ "el vendedor ha ganado------>"+dinero);
		
	}

}
