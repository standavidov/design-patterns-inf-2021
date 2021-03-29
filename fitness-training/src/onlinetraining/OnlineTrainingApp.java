package onlinetraining;

public class OnlineTrainingApp {

	public static void main(String[] args) {

		FitnessTrainer fitnessTrainer = new FitnessTrainer();
		Trainee trainee = new Trainee();

		Instruction getUp = new GetUp(trainee);
		Instruction layDown = new LayDown(trainee);
		
		OnlineTrainee onlineTraineeOne = new OnlineTrainee("Online Trainee 1");
		OnlineTrainee onlineTraineeTwo = new OnlineTrainee("Online Trainee 2");
		OnlineTrainee onlineTraineeThree = new OnlineTrainee("Online Trainee 3");
		
		trainee.addSubscriber(onlineTraineeOne);
		trainee.addSubscriber(onlineTraineeTwo);
		trainee.addSubscriber(onlineTraineeThree);

		fitnessTrainer.setInstruction(getUp);
		fitnessTrainer.giveInstruction("stand up");
		fitnessTrainer.setInstruction(layDown);
		fitnessTrainer.giveInstruction("lay down");
	}

}
