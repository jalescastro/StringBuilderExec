package Entities;

public class Comment {
	private String text;
	
	public Comment(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "[ " + getText() + " ]";
	}
	
	

}
