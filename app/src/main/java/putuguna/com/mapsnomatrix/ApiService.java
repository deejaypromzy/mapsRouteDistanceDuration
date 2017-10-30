package putuguna.com.mapsnomatrix;


import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by putuguna on 1/27/2016.
 */
public interface ApiService {
/*   @GET("api/gateways")
    public Call<DataResponse> getAllData();


    @GET("api/gateways")
    public Call<DataResponse> getListData(@Query("api_key") String api_key);*/

    @GET("/maps/api/distancematrix/json")
    public Call<Data> getDirection(@Query("origin") String origin, @Query("destination") String destination);


    @GET("/maps/api/directions/json")
    public Call<DirectionResultsModel> getDistanceAndDuration(@Query("origin") String origin, @Query("destination") String destination, @Query("sensor") String sensor, @Query("mode") String mode, @Query("alternatives") String alternatives);

}
