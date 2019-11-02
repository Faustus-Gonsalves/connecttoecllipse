package com.lti;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
public class BookService {
	
	@GET
	@Path("/single")
	@Produces(MediaType.APPLICATION_XML)
 public Book getBook()
 {
		Book b = new Book();
		
		b.setId(1);
		b.setName("head first java");
		b.setIsbn("isbn-000-1111");
		b.setAuthor("kathy serra");
		b.setPrice(2000.02f);
		return b;
 }
}
