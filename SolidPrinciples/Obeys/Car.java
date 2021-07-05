package obeys;
//Applying Single Responsibility Principle results in 3 different classes
//These 3 classes Obeys Single Responsibility Principle
class playMusic 
{
	public static int playCD()
	{	
		System.out.println("Music on");
		return 1;
			
	}
}
class turnOnAC
{
	public static int turnOnAC()
	{
		System.out.println("Turn On the AC");
		return 1;
		
	}
	
}
public class Car
{
	public static void main(String[] args)
		{
			int temp=35;
			if(temp>30)
			{
				int AC_status=turnOnAC.turnOnAC();
				System.out.println("AC_status:"+AC_status);
			}
			else
			{
				int playmusic=playMusic.playCD();
				System.out.println("Song Played:"+playmusic);
			}

		}
	

}


