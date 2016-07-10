package br.com.app.services.json.events;

import br.com.app.integration.facebook.FacebookIntegration;
import br.com.app.integration.facebook.dtos.EventDTO;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by valdirluiz on 08/07/16.
 */

@Consumes("application/json")
@Produces("application/json")
@Path("/event")
public class EventsJsonService {

    @EJB
    private FacebookIntegration facebookIntegration;

    @GET
    @Path("/events")
    public List<EventDTO> getAll(){
        try {
            List<EventDTO> eventos =  new ArrayList<>();
            eventos.add(facebookIntegration.getFacebookEvent("1271236509568084"));
            return  eventos;
        } catch (Exception e){
            return null;
        }
    }

}
