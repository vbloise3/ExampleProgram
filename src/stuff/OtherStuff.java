package stuff;

/**
 * Created by vincebloise on 4/24/16.
 */
public class OtherStuff {
    private String tag;
    private String value;

    public OtherStuff(String tag, String value) {
        this.setTag(tag);
        this.setValue(value);
    }

    public OtherStuff() {

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTag() {

        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
