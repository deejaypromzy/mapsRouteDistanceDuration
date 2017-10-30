package putuguna.com.mapsnomatrix;

/**
 * Created by Daniel on 10/2/2015.
 */
public class Distance {

    private String text;
    private String value;

    public Distance(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
