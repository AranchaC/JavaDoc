package Multimedia;
/**
 * Class Pelicula: define objetos de tipo Película con métodos y atributos heredados
 * de Multimedia y con la interfaz Comparable implementada.
 * @author AranchaCM
 * @version 1.0
 * @see reference PruebaMultimedia, Multimedia.
 */
public class Pelicula extends Multimedia implements Comparable<Pelicula>{
	//atributos
	/** actor principal, actriz principal. */
	protected String actorPrincipal, actrizPrincipal;
	/**
	 * Constructor de Película, con 6 parámetros/atributos:
	 * 2 propios y 4 heredados de Multimedia. Donde se inicializan las variables.
	 * @param titulo the título
	 * @param autor the autor
	 * @param duración the duración
	 * @param formato the formato
	 * @param actorPrincipal the actor principal
	 * @param actrizPrincipal the actriz principal
	 */
	public Pelicula(String titulo, String autor, double duracion, Formato formato, String actorPrincipal,
			String actrizPrincipal) {
		super(titulo, autor, duracion, formato);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}//cierre Constructor
	/**
	 * Devuelve actor principal.
	 * @return actor principal
	 */
	public String getActorPrincipal() {
		return actorPrincipal;
	}
	/**
	 * Asigna valor a actor principal.
	 * @param actorPrincipal asigna valor de parámetro a actor principal
	 */
	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}
	/**
	 * Devuelve actriz principal.
	 * @return actriz principal
	 */
	public String getActrizPrincipal() {
		return actrizPrincipal;
	}
	/**
	 * Asigna valor a actriz principal.
	 * @param actrizPrincipal asigna valor de parámetro a actriz principal
	 */
	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}
	/**
	 * Método toString que devuelve cadena para sacar por pantalla la info del objeto 
	 * con todos los atributos. Después de comprobar si hay actor y actriz.
	 * @return cadena string con cada atributo + toString de clase padre.
	 */
	@Override
	public String toString() {
		String actores = "";
		if (actorPrincipal != null) {
			actores += actorPrincipal;
			if (actrizPrincipal != null) {
			actores += " y "+actrizPrincipal;	
			}
		}
		else {
			if (actrizPrincipal != null) {
				actores += actrizPrincipal;
			}
		}
		if (actorPrincipal == null && actrizPrincipal == null) {
			actores = "ERROR: Escribe al menos uno";			
		}
		return super.toString()+ " Protagonistas: "+actores+"\n\n";
	}//cierre toString
	/**
	 * Compare to. Compara autor y luego duración para que se ordene la lista con 
	 * estos atributos respectivamente.
	 * @param o objeto para comparar con los ifs.
	 * @return <ul>
     *          <li>-1: si es menor</li>
     *          <li>1: si es mayor</li>
     *          <li>0: si es igual</li>
     *          </ul>
	 */
	@Override
	public int compareTo(Pelicula o) {
		if (this.autor != o.getAutor()) {
			return this.autor.compareToIgnoreCase(o.getAutor());
		}
		if (this.duracion < o.getDuracion()) {
			return -1;
		}//if
		else if (this.duracion > o.getDuracion()) {
			return 1;
		}//else
		return 0;		
	}//cierre comapreTo
		//return (int) ((this.duración*1000) - (o.duración*1000));
}




