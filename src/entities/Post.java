package entities;

import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private String title;
	private Integer likes;
	private String content;
	private Date moment;
	
	private List<Comment>comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(String title, Integer likes, String content, Date moment) {
		
		this.title = title;
		this.likes = likes;
		this.content = content;
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment (Comment comment) {
		comments.add(comment);
	}
	public void removeComment (Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title+"\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment)+"\n");
		sb.append(content+"\n");
		sb.append("Comment:\n");
		for (Comment c : comments) {
			sb.append(c+" comentou: \n"+c.getText() + "\n");
		}
		return sb.toString();
	}
	
	

	

}
