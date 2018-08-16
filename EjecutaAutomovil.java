public class EjecutaAutomovil{
	public static void main(String args[]){
		Automovil obj1= new Automovil("as4","negro",4,"tesla",2018);
		obj1.MostrarDatos();
		//con esto creamos un objeto sin valores
		Automovil obj2= new Automovil();
		obj2.AsignarDatos();
		obj2.MostrarDatos();
	}
	
}