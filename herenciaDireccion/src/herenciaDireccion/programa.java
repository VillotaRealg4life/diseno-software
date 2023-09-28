/**
 * 
 */
package herenciaDireccion;

/**
 * 
 */
public class programa {

	/**
	 * 
	 */
	public programa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nombre nombre1 = new Nombre ("jhosept ","villota ","freire ");
		Direccion direccion = new Direccion(nombre1.getNombre(),nombre1.getPrimerApellido(),nombre1.getSegundoApellido(),"Las Americas","Pasto","Nariño",520001);
		System.out.println("Datos registrados con exito:" + direccion);
	}
	}


