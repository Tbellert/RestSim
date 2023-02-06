package guest;

public class Alex extends Guest{



private String naam = "Alex";
private String achternaam = "Popov";
private int leeftijd = 30;
private String favorietenEten = "Lasagna";

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
	System.out.println("Alex enjoys his lasagna in peace");
	System.out.println("DELICIOUS!!!");
}

}