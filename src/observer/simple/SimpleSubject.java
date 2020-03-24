package observer.simple;

import java.util.*;

public class SimpleSubject implements Subject {
	private ArrayList<SimpleObserver> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<SimpleObserver>();
	}

	public void registerObserver(SimpleObserver o) {
		observers.add(o);
	}

	public void removeObserver(SimpleObserver o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (SimpleObserver observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}