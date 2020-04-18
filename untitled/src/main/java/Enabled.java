import org.json.JSONObject;

public class Enabled {
    Boolean value;
    FeaturesList featuresList;
    Function function;

    public Enabled(FeaturesList featuresList) {
        this.featuresList = featuresList;
    }

    public Enabled value(Boolean value) {
        this.value = value;
        return this;
    }

    public FeaturesList list() {
        return featuresList;
    }

    public Function function() {
        function = new Function(featuresList);
        return function;
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        if (value != null) {
            object.put("value", value);
        } else if (function != null ){
            object.put("function", function.toJson());
        } else {
            object.put("error", "true");
        }

        return object;
    }
}