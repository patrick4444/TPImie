package fr.imie.cours;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonRest {
	
/*	@GET
	public Response ok () {
		return Response.ok("ok").build(); 
		
	}*/
	@GET
	public List<Person> findAll () {
//		Person person = new Person();
//		person.setFirstName("brad");
//		person.setLastName("PITTOU");
		List<Person> list = new ArrayList<Person>();
		list.add(new Person());
		return list;
		//return Response.ok("ok").build(); 
		
	}
	
	//avec +sieurs param 
	//@PathParam("{id},{name}")
	
	
	@GET
	@Path("{id}")
	public Response findOne (@PathParam("id") Integer id) {
		Person person = new Person();
		person.setFirstName("brad");
		person.setLastName("PITT");
		//return Response.ok("ok get--").build(); 
		return Response.ok(person).build();
		
	}

	@POST
	public Response create (Person person) {
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		//service.save();
		return Response.ok("post-- create").build(); 
		
	}
	
	@PUT
	@Path("{id}")
	public Response update (Person person) {
		
		return Response.ok("put--").build(); 
		
	}
	
	@DELETE
	public Response delete () {
		return Response.ok("delete--").build(); 
		
	}



}
