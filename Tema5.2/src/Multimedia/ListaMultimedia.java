package Multimedia;

import java.util.Arrays;
/**
 * Class ListaMultimedia: contiene un array de objetos de tipo Multimedia.
 * @author AranchaCM
 * @version 1.0
 * @see reference PruebaMultimedia
 */
public class ListaMultimedia {
	//Atributos
	/** Contador tipo int y array multimedia tipo Multimedia. */
	protected int contador=0;
	protected Multimedia[] multimedia;	

	/**
	 * Constructor de la case con un int como tamaño del array.
	 * @param num Este parametro define el tamaño del array multimedia.
	 */
	public ListaMultimedia(int num) {
		super();
		multimedia = new Multimedia[num];
	}		
	/**
	 * Devuelve el contador.
	 * @return contador
	 */
	public int getContador() {
		return contador;
	}
	/**
	 * Asigna valor a contador.
	 * @param num asigna valor a contador
	 */
	public void setContador(int num) {
		this.contador = num;
	}
	/**
	 * Devuelve multimedia.
	 * @return multimedia
	 */
	public Multimedia[] getMultimedia() {
		return multimedia;
	}
	/**
	 * Asinga valor a multimedia.
	 * @param multimedia asinga valor a multimedia
	 */
	public void setMultimedia(Multimedia[] multimedia) {
		this.multimedia = multimedia;
	}		
	/**
	 * Método que llamamos size para asignar el contador.
	 * @return contador tipo int.
	 */
	public int size() {		
		return contador;
	}	
	/**
	 * Devuelve el valor de la posición del parámetro si la posición del parámetro
	 * es menor al tamaño del array.
	 * @param pos posición del array. 
	 * @return valor de la posición pasada por parámetro.
	 */
	public Multimedia get(int pos) {
		if (pos > multimedia.length) {
			System.out.println("ERROR");			
		}
		return multimedia[pos];
	}
	/**
	 * Añade valor del parámetro a la lista Multimedia (array) hasta que el contador
	 * sea igual al tamaño, para ello se va sumando 1 cada vez que añade un valor.
	 * @param m the m
	 * @return <ul>
     *          <li>false: si el contador es igual al tamaño</li>
     *          <li>false: en caso contrario</li>
     *          </ul>
	 */
	public boolean add(Multimedia m) {		
		if (contador == multimedia.length) {
			return false;
		}//if
		else {
			multimedia[contador] = m;	
			contador++;			
			return true;
			//;
			/*for (int i=0;i<contador;i++) {
				multimedia[contador] = m;*/
		}	
	}//boolean add	
	/**
	 * Ordena los elementos de la lista.
	 */
	public void sort() {
		Arrays.sort(multimedia);
	}//cierre sort	
	/**
	 * Método toString que devuelve los elementos de la lista, 
	 * @return los elementos de la lista.
	 */
	@Override
	public String toString() {
		return  Arrays.toString(multimedia);
	}//cierre toString

}
