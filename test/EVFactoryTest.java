import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EVFactoryTest {

    // Original families

    @Test
    void shouldCreateCityFamily() {
        EVComponentFactory factory = new CityEVFactory();

        assertInstanceOf(CityBattery.class, factory.createBattery());
        assertInstanceOf(CityMotor.class, factory.createMotor());
        assertInstanceOf(CityChargingSystem.class,
                factory.createChargingSystem());
    }

    @Test
    void shouldCreateSportFamily() {
        EVComponentFactory factory = new SportEVFactory();

        assertInstanceOf(SportBattery.class, factory.createBattery());
        assertInstanceOf(SportMotor.class, factory.createMotor());
        assertInstanceOf(SportChargingSystem.class,
                factory.createChargingSystem());
    }

    @Test
    void shouldCreateLuxuryFamily() {
        EVComponentFactory factory = new LuxuryEVFactory();

        assertInstanceOf(LuxuryBattery.class, factory.createBattery());
        assertInstanceOf(LuxuryMotor.class, factory.createMotor());
        assertInstanceOf(LuxuryChargingSystem.class,
                factory.createChargingSystem());
    }


    // Correct concrete products

    @Test
    void cityBatteryShouldHaveCorrectCapacity() {
        Battery battery = new CityEVFactory().createBattery();

        assertEquals(50, battery.getCapacity());
    }

    @Test
    void sportMotorShouldHaveCorrectPower() {
        Motor motor = new SportEVFactory().createMotor();

        assertEquals(400, motor.getPower());
    }

    @Test
    void luxuryChargerShouldHaveCorrectPower() {
        ChargingSystem charger =
                new LuxuryEVFactory().createChargingSystem();

        assertEquals(200, charger.getChargingPower());
    }


    // Compatibility

    @Test
    void sportFactoryShouldCreateCompatibleFamily() {
        EVComponentFactory factory = new SportEVFactory();

        assertInstanceOf(SportBattery.class, factory.createBattery());
        assertInstanceOf(SportMotor.class, factory.createMotor());
        assertInstanceOf(SportChargingSystem.class,
                factory.createChargingSystem());
    }


    // Runtime factory selection

    @Test
    void shouldSelectCityFactoryAtRuntime() {
        EVComponentFactory factory =
                FactoryProvider.getFactory("city");

        assertInstanceOf(CityEVFactory.class, factory);
    }

    @Test
    void shouldSelectSportFactoryAtRuntime() {
        EVComponentFactory factory =
                FactoryProvider.getFactory("sport");

        assertInstanceOf(SportEVFactory.class, factory);
    }


    // Business behavior

    @Test
    void cityVehicleShouldUseCityBattery() {
        ElectricVehicleSystem vehicle =
                new ElectricVehicleSystem(new CityEVFactory());

        assertEquals(50, vehicle.getBattery().getCapacity());
    }

    @Test
    void sportVehicleShouldUseSportMotor() {
        ElectricVehicleSystem vehicle =
                new ElectricVehicleSystem(new SportEVFactory());

        assertEquals(400, vehicle.getMotor().getPower());
    }

    @Test
    void luxuryVehicleShouldUseLuxuryCharger() {
        ElectricVehicleSystem vehicle =
                new ElectricVehicleSystem(new LuxuryEVFactory());

        assertEquals(
                200,
                vehicle.getChargingSystem().getChargingPower()
        );
    }


    // Negative scenarios

    @Test
    void shouldRejectUnknownFamily() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactoryProvider.getFactory("unknown")
        );
    }

    @Test
    void shouldRejectNullFamily() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactoryProvider.getFactory(null)
        );
    }


    // Fourth family

    @Test
    void shouldCreateOffRoadFamily() {
        EVComponentFactory factory = new OffRoadEVFactory();

        assertInstanceOf(OffRoadBattery.class, factory.createBattery());
        assertInstanceOf(OffRoadMotor.class, factory.createMotor());
        assertInstanceOf(OffRoadChargingSystem.class,
                factory.createChargingSystem());
    }

    @Test
    void shouldSelectOffRoadFactoryAtRuntime() {
        EVComponentFactory factory =
                FactoryProvider.getFactory("offroad");

        assertInstanceOf(OffRoadEVFactory.class, factory);
    }


    // Client works through abstractions

    @Test
    void clientShouldWorkThroughFactoryAbstraction() {
        EVComponentFactory factory = new CityEVFactory();

        ElectricVehicleSystem vehicle =
                new ElectricVehicleSystem(factory);

        assertNotNull(vehicle);
        assertNotNull(vehicle.getBattery());
        assertNotNull(vehicle.getMotor());
        assertNotNull(vehicle.getChargingSystem());
    }
    // Factory Method tests

    @Test
    void shouldCreateCityVehicleCreator() {
        VehicleCreator creator =
                VehicleCreatorProvider.getCreator("city");

        assertInstanceOf(CityVehicleCreator.class, creator);
    }

    @Test
    void shouldCreateSportVehicleCreator() {
        VehicleCreator creator =
                VehicleCreatorProvider.getCreator("sport");

        assertInstanceOf(SportVehicleCreator.class, creator);
    }

    @Test
    void shouldCreateLuxuryVehicleCreator() {
        VehicleCreator creator =
                VehicleCreatorProvider.getCreator("luxury");

        assertInstanceOf(LuxuryVehicleCreator.class, creator);
    }

    @Test
    void shouldRejectUnknownVehicleCreator() {
        assertThrows(
                IllegalArgumentException.class,
                () -> VehicleCreatorProvider.getCreator("unknown")
        );
    }
}