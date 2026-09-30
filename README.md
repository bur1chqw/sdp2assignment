# Electric Vehicle Factory System

## Overview

This project demonstrates the Factory Method and Abstract Factory design patterns using an electric vehicle system.

The application supports different EV families while keeping the main business logic independent from concrete product implementations.

## Product Types

Each EV family contains three related components:

- Battery
- Motor
- Charging System

## EV Families

The original system contains three families:

- City EV
- Sport EV
- Luxury EV

A fourth family, OffRoad EV, was later added to demonstrate system extensibility.

## Factory Method

Factory Method is used for creating different ElectricVehicle types.

Creator hierarchy:

- VehicleCreator
- CityVehicleCreator
- SportVehicleCreator
- LuxuryVehicleCreator

The VehicleCreator also contains the startTrip() business operation, which prepares and starts the created vehicle.

## Abstract Factory

EVComponentFactory is the Abstract Factory.

It creates a compatible set of:

- Battery
- Motor
- ChargingSystem

Concrete factories:

- CityEVFactory
- SportEVFactory
- LuxuryEVFactory
- OffRoadEVFactory

Each concrete factory creates components belonging to the same EV family.

## Compatibility

Product compatibility is controlled through concrete factories.

For example, SportEVFactory creates:

- SportBattery
- SportMotor
- SportChargingSystem

The client receives the complete family through one factory instead of manually selecting individual concrete components.

## Runtime Factory Selection

FactoryProvider selects the appropriate factory based on the user's input.

Supported values:

- city
- sport
- luxury
- offroad

After the factory is selected, ElectricVehicleSystem works through the EVComponentFactory abstraction.

## Business Operations

ElectricVehicleSystem provides three main operations:

- startVehicle()
- chargeVehicle()
- showPerformance()

These operations use multiple EV components as part of one vehicle system.

## Adding the Fourth Family

The OffRoad family was added after the original implementation.

New files:

- OffRoadBattery.java
- OffRoadMotor.java
- OffRoadChargingSystem.java
- OffRoadEVFactory.java

Modified files:

- FactoryProvider.java
- Main.java

The existing ElectricVehicleSystem business logic did not require modification.

This demonstrates that a new product family can be introduced with minimal changes to existing business logic.

## Automated Tests

The project contains 17 JUnit 5 tests covering:

- Original product families
- Concrete product creation
- Product compatibility
- Runtime factory selection
- Business behavior
- Negative scenarios
- OffRoad family
- Client usage through abstractions