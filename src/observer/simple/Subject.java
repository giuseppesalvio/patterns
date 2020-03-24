package observer.simple;

public interface Subject {
	public void registerObserver(SimpleObserver o);
	public void removeObserver(SimpleObserver o);
	public void notifyObservers();
}
