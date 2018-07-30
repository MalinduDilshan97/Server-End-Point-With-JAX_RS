package com.arimac.SwaggerHub.resource;



import com.arimac.SwaggerHub.service.EtihadService;
import com.arimac.SwaggerHub.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;
import java.util.Map;



@Path("etihad")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Etihad {


    EtihadService etihadService = new EtihadService();

    @POST
    @Path("/enrolment")
    public Response enrolment(User user, @Context UriInfo uriInfo){

        if (user.getEmail().matches("[A-Za-z].*?@example\\.com")){

            user.setId(100000);
            User newUser = etihadService.enrolment(user);
            String Id = String.valueOf(newUser.getId());
            URI uri = uriInfo.getAbsolutePathBuilder().path(Id).build();
            return Response.created(uri)
                    .entity(newUser)
                    .build();

      } else {

            ErrorClass error= new ErrorClass(400,"Invalid Email");
            return Response.status(400)
                    .entity(error)
                    .build();

        }


    }

    @GET
    @Path("/getDigitalCard")
    public Response getCard(){
        List<Card> cards= etihadService.getCards();

        if (cards.size()==0){

            ErrorClass error= new ErrorClass(204,"Card Not Found");
            return Response.status(400)
                    .entity(error)
                    .build();

        }else {

            return Response.status(200)
                    .entity(cards)
                    .build();
        }

    }

    @GET
    @Path("/preferences")
    public Response gellAllPreference(){
            List<Preferences> pre =etihadService.getAllPreference();

            return Response.status(200).entity(pre).build();
    }

    @POST
    @Path("/preferences")
    public Response updatePreference(Preferences preferences , @Context UriInfo uriInfo){
        boolean b= etihadService.updatePreference();
        if (b){
            String string=new String("Preferences has been updated");
            return Response.status(201)
                    .entity(string)
                    .build();
        }else {

            ErrorClass error= new ErrorClass(304,"Unexpected Error");
            return Response.status(400).entity(error).build();
        }
    }

    @GET
    @Path("/profile")
    public Map<String,Object> getBasicData(){
        return etihadService.getUserData();
    }


    @GET
    @Path("/transaction")
    public Response getTransaction(){
        Transaction transaction = etihadService.getTransaction();
        return Response.ok(transaction).build();
    }


    @GET
    @Path("/applyCobrandCard")
    public Response applyForCard(){
        String string=new String("url: https://eyg.example.com/apply-cobrand-card");
        return Response.status(200)
                .entity(string)
                .build();
    }

    @GET
    @Path("/rewardStore")
    public Response getReward(){
        Reward reward = etihadService.getReward();
        return Response.ok(reward).build();
    }

    @GET
    @Path("/chat")
    public Response userChat(@QueryParam("query") String name){
         Chat chat=  etihadService.userChat();
         return Response.ok(chat).build();
    }

}
