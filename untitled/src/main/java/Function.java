import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Function {

    Map<String, String> dictionary = new HashMap<String, String>();
    FeaturesList featuresList;

    public Function(FeaturesList featuresList) {
        this.featuresList = featuresList;
    }

    public Function iOSVersionHigher(String version) {
        dictionary.put("iOSVersionHigher", version);
        return this;
    }

    public Function iOSVersionLower(String version) {
        dictionary.put("iOSVersionLower", version);
        return this;
    }

    public Function locationIs(String location) {
        dictionary.put("locationIs", location);
        return this;
    }

    public Function locationIsNot(String location) {
        dictionary.put("locationIsNot", location);
        return this;
    }

    public FeaturesList list() {
        return featuresList;
    }

    public JSONObject toJson() {
        return new JSONObject(dictionary);
    }
}
