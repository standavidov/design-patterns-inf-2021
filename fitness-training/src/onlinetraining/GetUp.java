package onlinetraining;

public class GetUp implements Instruction {

	Trainee trainee = new Trainee();

	public GetUp(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
	public void execute() {
		trainee.standUp();
	}

}
