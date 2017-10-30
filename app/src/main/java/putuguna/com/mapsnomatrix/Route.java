package putuguna.com.mapsnomatrix;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Daniel on 10/2/2015.
 */
public class Route {

    @SerializedName("legs")
    private List<Legs> legs;

    public List<Legs> getLegs() {
        return legs;
    }

    public void setLegs(List<Legs> legs) {
        this.legs = legs;
    }
}
