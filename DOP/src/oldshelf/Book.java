package oldshelf;

public abstract class Book {
    private String title;
	public Book(){
		this.title="Unkknown";
	}
	public Book(String title) {
		this.title=title;
		// TODO: Finish Code here if anything to be done?
	}
	public String getTitle() {
        return title;
    }

    // Setter method for the title (if needed)
    public void setTitle(String title) {
        this.title = title;
    }

    // Optional: Override the toString method to represent the book
    @Override
    public String toString() {
        return "Book title: " + title;
    }
}
