package br.com.app.integration.facebook;

import br.com.app.integration.facebook.dtos.EventDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by valdirluiz on 09/07/16.
 */
public interface EventsClient {

    @GET("/v2.6/{event-id}")
    public Call<EventDTO> get(@Path("event-id") String eventId, @Query("access_token") String accessToken);

}
