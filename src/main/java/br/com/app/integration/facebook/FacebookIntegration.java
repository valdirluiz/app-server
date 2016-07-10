package br.com.app.integration.facebook;

import br.com.app.integration.facebook.dtos.EventDTO;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.ejb.Stateless;
import java.io.IOException;

/**
 * Created by valdirluiz on 09/07/16.
 */

@Stateless
public class FacebookIntegration {

    private static final String API_URL = "https://graph.facebook.com";
    private static final String ACESS_TOKEN = "1615644685412428|iWpIw79efu8aAWq0r0BH-xY0kFo";

    public EventDTO getFacebookEvent(String eventiId) throws IOException{

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EventsClient events = retrofit.create(EventsClient.class);

        Call<EventDTO> call = events.get("1271236509568084", ACESS_TOKEN);
        return call.execute().body();
    }


}
