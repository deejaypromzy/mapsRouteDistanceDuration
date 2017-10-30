package putuguna.com.mapsnomatrix;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Created by Daniel on 10/2/2015.
 */
public class DirectionResultsModel {
    @SerializedName("routes")
    private List<Route> routes;

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}


