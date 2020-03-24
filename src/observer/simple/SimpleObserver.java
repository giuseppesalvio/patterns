package observer.simple;

import java.lang.reflect.Field;

public class SimpleObserver implements Observer {
	private int value;
	private Subject simpleSubject;
	private String name;
	
	public SimpleObserver(Subject simpleSubject,String name) {
		this.simpleSubject = simpleSubject;
		simpleSubject.registerObserver(this);
		this.name=name;
	}
	
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("io sono : " + this.name + " - Value: " + value);
	}
}
