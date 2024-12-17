import java.util.ArrayList;
import java.util.List;


public class PokemonGymOwner {
	private String name = "";
	private String town = "";
	private List<Pokemon> pokemons;

	// Constructor
	public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
		this.name = name;
		this.town = town;
		this.pokemons = new ArrayList<>(pokemons); // Maak een kopie van de lijst
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}

	public List<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List<Pokemon> pokemons) {
		this.pokemons = new Arraylist<>(pokemons);
	}


}
