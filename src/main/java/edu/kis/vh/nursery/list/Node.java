package edu.kis.vh.nursery.list;

public class Node {
	/**
	 * Klasa Node odpowiada ze przechowywanie jednego elementu listy
	 * dodatkowo przechowuje ona obiekty klasy node wskazujące na następny i poprzedni element listy
	 */

	private int value;
	private Node prev;
	public Node next;

	/**
	 * Konstruktork klasy Node wywołuje metodę setValue dla wartości i
	 * @param i liczba którą dla której chcemy wykonać metodę setValue
	 */
	public Node(int i) {
		setValue(i);
	}

	/**
	 * Metoda zwraca wartość pola value klasy Node
	 * @return wartość pola value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Metoda ustawia wartość pola value klasy Node na podana w atrybucie metody
	 * @param value liczba którą przekazujemy do pola value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Metoda zwraca wartość pola prev klasy Node
	 * @return obiekt klasy Node zawarty w polu prev
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * Metoda ustawia wartość pola prev klasy Node na podana w atrybucie metody
	 * @param prev obiekt klasy Node który przekazujemy do pola prev
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
