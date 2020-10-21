//Author:Lim Weng Cong
public class Driver{
	public static void main(String []arg){
		//Fish actually is a data type
		//Fish nemo; ==int x;
		Fish nemo=new Fish(); //nemo is object, Fish is class
        nemo.Swim();
        //nemo.color="red";
        nemo.SetColor("red");
        nemo.Swim();

		Shark fiery=new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();




       //  Fish dory=new Fish(); //another object
       //  dory.Swim();
       // // dory.color="purple";
       //  dory.SetColor("yellow");
       //  dory.Swim();

       //  Aquarium fancyAquarium =new Aquarium();
       //  fancyAquarium.fillFish();
	}
}