package observer.simple;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();

		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject,"1");
		SimpleObserver simpleObserver1 = new SimpleObserver(simpleSubject,"2");
		SimpleObserver simpleObserver2 = new SimpleObserver(simpleSubject,"3");
		SimpleObserver simpleObserver3 = new SimpleObserver(simpleSubject,"4");
		SimpleObserver simpleObserver4 = new SimpleObserver(simpleSubject,"5");
		SimpleObserver simpleObserver5 = new SimpleObserver(simpleSubject,"6");
		SimpleObserver simpleObserver6 = new SimpleObserver(simpleSubject,"7");
		SimpleObserver simpleObserver7 = new SimpleObserver(simpleSubject,"8");


		simpleSubject.setValue(80);
		simpleSubject.removeObserver(simpleObserver7);
		simpleSubject.setValue(10);
		simpleSubject.setValue(90);
		simpleSubject.setValue(180);
		simpleSubject.registerObserver(simpleObserver7);
		simpleSubject.setValue(111180);
	}
}
