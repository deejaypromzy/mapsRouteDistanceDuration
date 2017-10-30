package putuguna.com.mapsnomatrix;

import com.google.gson.annotations.SerializedName;

/**
 * Created by putuguna on 5/23/2016.
 */
public class EndLocation {

    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
