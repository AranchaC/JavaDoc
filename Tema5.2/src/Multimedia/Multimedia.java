package Multimedia;

import java.util.Objects;
/**
 * Clase Multimedia: define objetos con atributos String, double y enum. 
 * que reciben al crear el objeto.
 * @author AranchaCM
 * @version 1.0
 * @see refenrence PruebaMultimedia
 */
public class Multimedia {
	//Atributos	
	/** Título,autor, duración y Formato del objeto multimedia. */
	protected String título, autor;
	protected double duración;
	protected Formato formato;
	
	/**
	 * Constructor del objeto Multimedia con 4 parámetros (los atributos).
	 * @param título del objeto multimedia.
	 * @param autor del objeto multimedia.
	 * @param duración del objeto multimedia.
	 * @param formato del objeto multimedia.
	 */
	public Multimedia(String título, String autor, double duración, Formato formato ) {
		super();
		this.título = título;
		this.autor = autor;
		this.duración = duración;
		this.formato = formato;
	}//cierre constructor Multimedia	
	/**
	 * Devuelve el título del objeto.
	 * @return título
	 */
	public String getTítulo() {
		return título;
	}	
	/**
	 * Asigna valor a título.
	 * @param título asigna valor del parámetro a título.
	 */
	public void setTítulo(String título) {
		this.título = título;
	}	
	/**
	 * Devuelve el autor.
	 * @return autor
	 */
	public String getAutor() {
		return autor;
	}	
	/**
	 * Asigna valor al autor.
	 * @param autor asigna valor del parámetro a autor.
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}	
	/**
	 * Devuelve la duración.
	 * @return duración
	 */
	public double getDuración() {
		return duración;
	}	
	/**
	 * Asigna valor a duración.
	 * @param duración asigna valor del parámetro a duración.
	 */
	public void setDuración(double duración) {
		this.duración = duración;
	}	
	/**
	 * Devuelve el formato.
	 * @return formato
	 */
	public Formato getFormato() {
		return formato;
	}	
	/**
	 * Asigna valor a formato.
	 * @param formato asigna del parámetro a formato.
	 */
	public void setFormato(Formato formato) {
		this.formato = formato;
	}	
	/**
	 * Método toString que devuelve cadena para sacar por pantalla 
	 * la info del objeto con todos los atributos.
	 * @return cadena string con cada atributo.
	 */
	@Override
	public String toString() {
		return "Título= " + título + "\n Autor= " + autor + "\n Duración= " + duración+" \n Formato= "+formato+"\n" ; 
	}
	/**
	 * Método Equals que compara dos objetos en base al autor y al título.
	 * @param obj recibe objeto a comparar.
	 * @return <ul>
     *          <li>true: si el autor y el título son iguales</li>
     *          <li>false: si el autor y el título son diferentes</li>
     *          </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;*/
		Multimedia other = (Multimedia) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(título, other.título);
	}//cierre boolean equals	
	
}
