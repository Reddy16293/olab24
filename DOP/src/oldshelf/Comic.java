package oldshelf;

public class Comic extends Book {

	/* TODO: Add most strict modifiers here*/ 
	private String Title;

	// TODO: Warning to be removed.
	private final int ageOfMainCharacter;

	// TODO Correct the error
	public Comic(String title, int ageOfMainCharacter) {
        super(title);
		this.ageOfMainCharacter = ageOfMainCharacter;
                
	}
    // TODO : create a getter if required.
	
	@Override
	public String getTitle() {
		return Title;
	}
	// TODO: Create a setter if required
	@Override
	public void setTitle(String title) {
		this.Title = title;
	}

	// TODO: write a toString method
	@Override
	public String toString(){
		return "Comic [Tite=" + Title + ", ageOfMainCharacter=" + ageOfMainCharacter + "]";
	}
}
	
	
	

	
	

// 	// TODO: Bonus: 
// 	@Override
// 	public int hashCode() {
// 		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
// 	}
	
// 	// TODO: Bonus: 
// 	@Override
// 	public boolean equals(Object o) {
// 		// TODO: Based on the information about hashCode write the equals method.
// 	}
// }
