package onlinetraining;

public class FitnessTrainer {
	private Instruction instruction;
	
	public void setInstruction(Instruction instruction) {
		this.instruction = instruction;
	}
	
	public void giveInstruction(String instructionType) {
		System.out.printf("\nTrainer gives %s instruction to Trainee\n", instructionType);
		instruction.execute();
	}
}
