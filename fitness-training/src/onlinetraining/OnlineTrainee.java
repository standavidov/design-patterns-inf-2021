package onlinetraining;

public class OnlineTrainee implements Observer {
	protected String onlineTrainee;

	public OnlineTrainee(String onlineTrainee) {
		this.onlineTrainee = onlineTrainee;
	}

	@Override
	public void notification(String exercise) {
		System.out.printf("%s observed Trainee movement\n%s repeated %s \n", onlineTrainee, onlineTrainee, exercise);
	}

}
