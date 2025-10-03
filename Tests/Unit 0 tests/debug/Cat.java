public class Cat {
	// 1.changed name of class to Cat instead of cats and also fixed capitalization of public
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;

	// 2-Parameter Constructor
	public Cat(String name, String breed) {
		// 2.added this. to name and breed and also added breed as a parameter
		this.name = name;
		this.breed = breed;
		this.isHungry = true;
		// 3.changed yes to true
		livesRemaining = 9;

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getLivesRemaining() {
		return livesRemaining;
	}

	public void setLivesRemaining(int livesRemaining) {
		this.livesRemaining = livesRemaining;
	}

	public String getName() {
		// 3. changed return type to String
		// 4.added this. to name
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry() {
		// 5.changed return type to boolean and used proper camel case for isHungry
		return this.isHungry;
	}

	public boolean feed() {
		// 6.added return method
		return this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed)
				&& this.livesRemaining == other.livesRemaining;
		// 7.changed = to == and added .equals for string comparison
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
		// 8.turned return into a string instead of a print statement
	}
}
