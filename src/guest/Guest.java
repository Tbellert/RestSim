package guest;

public abstract class Guest {
	private String name;
	private String lastName;
	private int age;
	
	String[] firstNamesArray = {"Jan", "Gerrit", "Egbert", "Ruben", "Dominique", "Angela", "Shakira", "Britney"};
	String[] lastNamesArray = {"de Weert", "van Konijnenburgh", "Janssen", "Bellert", "de Koning", "Westra", "van Hengel", "Notten"};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

//Vraag aan mijn mede developer:
//Idee is als volgt.
//Mijn app gaat in het Reserveringssysteem reserveringen ophalen per dag van de week gebaseerd op een bezettingsgraad per dag.
//Die reserveringen zijn voor een random aantal gasten met een bepaald gastenprofiel welke ik uit een een array met data wil halen (denk aan een array met namen, achternamen, leeftijd, favoriet eten, etc etc)

// Maak een class aan met de naam MedeDeveloper die Guest extends. (zoals GuestProfile)
// Voeg aan deze class een aantal fields toe en schrijf een methode die van toepassing zou kunnen zijn op jou, een developer of een gast in een restaurant.
// Mocht het later toch  niet aansluiten met mijn vereisten dan overschrijf ik dit wel.

// Op deze manier kunnen jullie als gast in het restaurant ontvangen worden (Als het goed is).
