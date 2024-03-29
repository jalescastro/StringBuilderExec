package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Post {
	
	private final StringBuilder stb = new StringBuilder();
	
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post (Date moment, String title, String content, Integer likes) {
		this.moment =	moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		stb.append(getTitle()+"\n");
		stb.append(getLikes() + "Likes - " + getMoment() + "\n");
		stb.append(getContent() + "\n");
		stb.append("Comments:\n" );
		for (Comment comment : comments) {
			stb.append(comment.getText()+"\n");
		}
		
		
		
		return " " + stb ;
	}
	
	
	

}
