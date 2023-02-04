package guest;

public class Roy extends Guest
{
	private String naam = "Roy";
	private String achternaam = "Rooseboom";
	private int leeftijd = 28;
	private String favorietenEten = "Spareribs";
	
	public String getNaam()
	{
		return naam;
	}
	
	public String getAchternaam()
	{
		return achternaam;
	}
	
	public int getLeeftijd()
	{
		return leeftijd;
	}
	
	public String getFavorietenEten()
	{
		return favorietenEten;
	}
	
	
	public void EtenVanSpareRibs()
	{
		System.out.println("Roy is munching on some delicious, meaty, tasty spareribs.");
		System.out.println("nom..nom..SPARERIBS...YEAHHHH..nom..nom");
	}
	
}
