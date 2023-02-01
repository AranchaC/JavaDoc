
public class Bicicleta {
	
	//comentario de Arancha p33

	protected int VelocidadActual;
	protected int PlatoActual;
	protected int PiñonActual;
	
	
	public void acelerar() {
		VelocidadActual *=2; 			
	}
	
	public void frenar() {		
		VelocidadActual/=2;		
	}
	
	public void CambiarPlato(int plato) {
		PlatoActual=plato;		
	}
	
	public void cambiarPiñon(int piñon) {		
		PiñonActual=piñon;		
	}

	public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
		super();
		VelocidadActual = velocidadActual;
		PlatoActual = platoActual;
		PiñonActual = piñonActual;
	}

	@Override
	
	public String toString() {
		return "Bicicleta [VelocidadActual=" + VelocidadActual + ", PlatoActual=" + PlatoActual + ", PiñonActual="
				+ PiñonActual + "]";
	}
	
	
	
}
