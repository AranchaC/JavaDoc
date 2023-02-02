package Multimedia;

import java.util.Objects;
/**
 * Class Multimedia: define objetos con atributos String, double y enum. 
 * que reciben al crear el objeto.
 * @author AranchaCM
 * @version 1.0
 * @see reference PruebaMultimedia
 */
public class Multimedia {
	//Atributos	
	/** Título,autor, duración y Formato del objeto multimedia. */
	protected String titulo, autor;
	protected double duracion;
	protected Formato formato;
	
	/**
	 * Constructor del objeto Multimedia con 4 parámetros (los atributos) donde
	 * se inicializan las variables.
	 * @param titulo del objeto multimedia.
	 * @param autor del objeto multimedia.
	 * @param duración del objeto multimedia.
	 * @param formato del objeto multimedia.
	 */
	public Multimedia(String titulo, String autor, double duracion, Formato formato ) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
		this.formato = formato;
	}//cierre constructor Multimedia	
	/**
	 * Devuelve el título del objeto.
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}	
	/**
	 * Asigna valor a título.
	 * @param titulo asigna valor del parámetro a título.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public double getDuracion() {
		return duracion;
	}	
	/**
	 * Asigna valor a duración.
	 * @param duracion asigna valor del parámetro a duración.
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
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
		return "Título= " + titulo + "\n Autor= " + autor + "\n Duración= " + duracion+" \n Formato= "+formato+"\n" ; 
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
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}//cierre boolean equals	
	
}
