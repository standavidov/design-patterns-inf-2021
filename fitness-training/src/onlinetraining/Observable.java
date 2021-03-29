package onlinetraining;

public interface Observable {
	public void addSubscriber(Observer observer);
	public void removeSubscriber(Observer observer);
	public void notifySubscribers(String exercise);
	
}
