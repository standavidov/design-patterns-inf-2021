package onlinetraining;

public class LayDown implements Instruction {

	Trainee trainee = new Trainee();

	public LayDown(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
	public void execute() {
		trainee.layDown();
	}

}
