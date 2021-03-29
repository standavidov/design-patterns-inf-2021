package onlinetraining;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {
//	private Boolean standingUp;
//	private Boolean layingDown;

	protected List<Observer> observers = new ArrayList<Observer>();

	public void standUp() {
		System.out.println("Trainee stands up");
		notifySubscribers("Trainee stand up");
	}

	public void layDown() {
		System.out.println("Trainee lays down");
		notifySubscribers("Trainee layed down");
	}

	@Override
	public void addSubscriber(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeSubscriber(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifySubscribers(String message) {
		observers.forEach(observer -> observer.notification(message));
	}
}
