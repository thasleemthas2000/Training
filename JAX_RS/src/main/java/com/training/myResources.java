 package com.training;
	import jakarta.ws.rs.GET;
	import jakarta.ws.rs.Path;

	@Path("myresources")
	public class myResources {
		@GET
		public String getMessage() {
			
			return "My Friend Java";
		}
	}


