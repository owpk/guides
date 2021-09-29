package rest;

import service.ToDoRepr;

import javax.ejb.Local;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Local
@Path("/todo")
public interface ToDoServiceRs {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    void insert(ToDoRepr toDoRepr);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void update(ToDoRepr toDoRepr);

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    void delete(@PathParam("id") long id);

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    List<ToDoRepr> findAll();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    ToDoRepr findById(@PathParam("id") long id);
}
