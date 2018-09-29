package monologue_db;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/")
public class MonologueDBApplication extends Application {

	@GET
	@Path("test")
	@Produces(MediaType.TEXT_PLAIN)
	public Response test() {
		return Response.ok("Success!").build();
	}
}
