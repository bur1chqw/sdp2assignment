public class FactoryProvider {

    public static EVComponentFactory getFactory(String family) {

        if (family == null) {
            throw new IllegalArgumentException("Family cannot be null.");
        }

        return switch (family.toLowerCase()) {
            case "city" -> new CityEVFactory();
            case "sport" -> new SportEVFactory();
            case "luxury" -> new LuxuryEVFactory();
            default -> throw new IllegalArgumentException(
                    "Unknown EV family: " + family
            );
        };
    }
}