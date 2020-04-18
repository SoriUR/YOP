public class MainClass {
    public static void main(String[] args) {
        FeaturesList list = new FeaturesList();
        list
            .name("features")
            .feature()
                .name("animations")
                .isEnabled()
                    .value(true)
                    .list()
            .feature()
                .name("themes")
                .isEnabled()
                    .function()
                        .iOSVersionHigher("13.0")
                        .list()
            .feature()
                .name("investments")
                .isEnabled()
                    .function()
                        .iOSVersionHigher("10.0")
                        .iOSVersionLower("11.3")
                        .list()
            .feature()
                .name("in_app_purchase")
                .isEnabled()
                    .function()
                        .locationIs("Europe")
                        .locationIsNot("German");

        System.out.println(list.toJson());
    }
}

