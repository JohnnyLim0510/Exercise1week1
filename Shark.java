public class Shark extends Fish{
	private int SharpTeeth=50;

	public void Eat(){
		System.out.println("Eat with " +SharpTeeth+" number of teeth");
	}

	public void SetSharpTeeth(int teeth){
		SharpTeeth=teeth;
	}
}