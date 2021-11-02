package VetoresEntities;


public class Produto {
	
	private String email;
	private String name;
	private int room;
	
	
	
	public Produto(String email, String name, int room) {
		this.email = email;
		this.name = name;
		this.room = room;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRoom() {
		return room;
	}



	public void setRoom(int room) {
		this.room = room;
	}
	
	
	
	
	
	

}
