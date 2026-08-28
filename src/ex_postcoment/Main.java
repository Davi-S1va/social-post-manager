package ex_postcoment;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Cometarios
		Comment c1 = new Comment ("Have a nice trip"); 
		Comment c2 = new Comment ("Wow that's Awesome!"); 
		
		//Post
		Post p1= new Post("Traveling to New Zealand", 12, "I'm going to vist this wonderful contry!", sdf.parse("21/06/2025 13:05:44"));
		//Adicionando comentarios ao post
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		
	}
}	
	
		
		
		 
	


