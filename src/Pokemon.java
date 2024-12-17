public abstract class Pokemon {
	private int hp;
	private int level;
	private String food;
	private String sound;


	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;

		public String getFood () {
			return food;
		}

		public void setFood (String food){
			this.food = food;
		}

		public String getSound () {
			return sound;
		}

		public void setSound (String sound){
			this.sound = sound;
		}

		public abstract void getType();
		public abstract void getName();
	}
}
