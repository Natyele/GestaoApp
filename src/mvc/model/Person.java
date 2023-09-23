package mvc.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe Person representa o modelo (models)
 * Trata-se da enridadr Pessoa que o sistema possui
 */
public class Person {
	
	// Atributos 
	private String name;
	private String lastName;
	private EventRoom room;  // A pessoa esta dentro de uma sala
	private CoffeeSpace space; // A pessoa está dentro de um espaço de café
	
	// Construtor
	public Person() {
		
	}
	
	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	// Getters and Setters
	// Métodos de acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EventRoom getRoom() {
		return room;
	}

	public void setRoom(EventRoom room) {
		this.room = room;
	}

	public CoffeeSpace getSpace() {
		return space;
	}

	public void setSpace(CoffeeSpace space) {
		this.space = space;
	}

	public static ArrayList<Person> getPersons() {
		Person person = new Person("Tharlys", "Rodrigues");
		ArrayList<Person> listPerson = new ArrayList<>();
		listPerson.add(person);
		return listPerson;

		
	}
	
}
