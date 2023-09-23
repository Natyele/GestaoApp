package mvc.model;

import java.util.ArrayList;

public class CoffeeSpace {
	
	// Atributos do espaco de café
	private String name;
	private int capacity;
	
	// O espaço de café tem uma lista de pessoas
	ArrayList<Person> listPersonCoffee;
	
	// Construtores
    public CoffeeSpace() {
    	// Instanciando o ArrayList
    	listPersonCoffee = new ArrayList<>();
    }
    
    public CoffeeSpace(String name, int capacity) {
    	this.name = name;
    	this.capacity = capacity;
    	listPersonCoffee = new ArrayList<>();
    }

    // Métodos de acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// Método para manipular o ArrayList
	public ArrayList<Person> getListPersonCoffee() {
		return listPersonCoffee;
	}

	// Atribui a lista de pessoas informada ao atributo
	public void setListPersonCoffee(ArrayList<Person> listPersonCoffee) {
		this.listPersonCoffee = listPersonCoffee;
	}
	
	// Adiciona uma pessoa a lista
	public void addPersonCoffe(Person person) {
		person.setSpace(this); // Informa o espaço do café que a pessoa está (Muda o atributo space da person para o espaço que ela está)
		listPersonCoffee.add(person); // Adiciona uma pessoa a um espaço de café
	}
	
	public static ArrayList<CoffeeSpace> getSpaces(){
		CoffeeSpace space = new CoffeeSpace("Apex Java Café", 10);
		ArrayList<CoffeeSpace> listSpace = new ArrayList<>();
		listSpace.add(space);
		return listSpace;
	}
	
}
