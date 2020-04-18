import org.json.JSONObject;

public class Feature {
    String name;
    Enabled isEnabled;
    Boolean isOffline = false;
    FeaturesList featuresList;

    public Feature(FeaturesList featuresList) {
        this.featuresList = featuresList;
    }

    public Feature name(String name) {
        this.name = name;
        return this;
    }

    public Feature offlineEnabled(Boolean isOffline) {
        this.isOffline = isOffline;
        return this;
    }

    public Enabled isEnabled() {
        isEnabled = new Enabled(featuresList);
        return isEnabled;
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("name", name);
        object.put("isOfflineEnabled", isOffline);
        object.put("isEnabled", isEnabled.toJson());

        return object;
    }
}