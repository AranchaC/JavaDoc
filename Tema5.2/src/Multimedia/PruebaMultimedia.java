package Multimedia;
/**
 * Class PruebaMultimedia: clase con main donde se hace la ejecución.
 * @author AranchaCM
 * @version 1.0
 */
public class PruebaMultimedia {
	/**
	 * Método main. Crea objetos de tipo ListaMultimedia enviando los valores/datos por parámetros
	 * al llamar al método add.
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ListaMultimedia obras = new ListaMultimedia (10);//ej4 
		//ListaMultimedia 
		
		obras.add(new Pelicula ("LA LA LAND","Damien Chazelle", 2.8, Formato.DVD, "RYAN GOSLING", "EMMA STONE"));
		obras.add(new Pelicula ("LIBRO DE LA SELVA","DISNEY", 1.29, Formato.AVI, null, null));
		obras.add(new Pelicula ("TITANIC","James Cameron", 3.30, Formato.MP3, "LEO DI CAPRIO","KATE WINSLET"));
		obras.add(new Pelicula ("VIUDA NEGRA","Marvel", 2.13, Formato.MOV, null, "SCARLETT JOHANSSON"));
		obras.add(new Pelicula ("IRON MAN","MARVEL", 2.6, Formato.MPG, "ROBERT DOWNEY JR", null));		
		obras.add(new Pelicula ("HARRY POTTER 3","Alfonso Cuarón", 2.19, Formato.DVD, "DANIEL RADCLIFFE", null));
		obras.add(new Pelicula ("PIRATAS DEL CARIBE","Disney", 2.23, Formato.AVI, "JOHNNY DEPP", "ORLANDO BLOOM"));
		obras.add(new Pelicula ("GREEN BOOK","Peter Farrelly", 2.10, Formato.MPG, "VIGGO MORTENSEN", "MAHERSHALA ALI"));
		obras.add(new Pelicula ("CRIADAS Y SEÑORAS","Tate Taylor", 2.26, Formato.MP3, "VIOLA DAVIS", "EMMA STONE"));
		obras.add(new Pelicula ("ENOLA HOLMES","Netflix", 2.3, Formato.MOV, null, "MILLIE BOBBY BROWN"));
		
		//System.out.println(obras.toString());
		/**
		 * Llamo al métdo sort para ordenar lista.
		 * Saco por pantalla la lista, ya ordenada.
		 */
		obras.sort();
		System.out.println(obras);


	}

}
