public class VehicleCreatorProvider {

    public static VehicleCreator getCreator(String family) {

        if (family == null) {
            throw new IllegalArgumentException("Family cannot be null.");
        }

        return switch (family.toLowerCase()) {
            case "city" -> new CityVehicleCreator();
            case "sport" -> new SportVehicleCreator();
            case "luxury" -> new LuxuryVehicleCreator();
            default -> throw new IllegalArgumentException(
                    "Factory Method is not available for: " + family
            );
        };
    }
}