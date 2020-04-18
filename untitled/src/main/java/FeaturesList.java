import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class FeaturesList {

    String name;
    ArrayList<Feature> list = new ArrayList();

    public FeaturesList name(String name) {
        this.name = name;
        return this;
    }

    public Feature feature() {
        Feature feature = new Feature(this);
        list.add(feature);
        return feature;
    }

    public JSONObject toJson() {
        JSONArray featuresArray = new JSONArray();

        for(int i = 0; i< list.size(); i++ ) {
            featuresArray.put(list.get(i).toJson());
        }

        JSONObject object = new JSONObject();
        object.put("name", name);
        object.put("features", featuresArray);

        return object;
    }
}