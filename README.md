# Simple Ceiling Fan

## Overview
This project implements a Simple Ceiling Fan using the State Design Pattern. The fan has the following characteristics:

- The fan can cycle through 4 speed settings: Off, 1, 2, and 3.
- The fan has two pull cords:
  - Speed Cord: Increases the fan speed by one level each time it is pulled, and after the highest speed, it cycles back to the "Off" state.
  - Direction Cord: Reverses the direction of the fan without affecting the current speed.

The implementation follows SOLID principles and the State Design Pattern, ensuring each fan state (Off, 1, 2, 3) has its own behavior, making the code extensible, maintainable, and testable.

## Class Structure
- CeilingFan: The context class that maintains the current fan state and provides methods to interact with the fan (pull speed cord, pull direction cord).
- FanState (Interface): Defines the common interface for all fan states.
  - Concrete State Classes:
  - OffState: Represents the fan being off (speed 0).
  - SpeedOneState: Represents the fan running at speed 1.
  - SpeedTwoState: Represents the fan running at speed 2.
  - SpeedThreeState: Represents the fan running at speed 3.
- CeilingFanControl: The main class for running the CeilingFan
- CeilingFanTest: Has a set of unit tests to validate the behavior of the ceiling fan

## Getting Started
### Prerequisites
Java 17

### Installation
- Close the repository: 
```
git clone https://github.com/kemmykad/SimpleCeilingFan.git
```
- Navigate to the project directory:
```
cd SimpleCeilingFan
```
- Build and Run the project using your favorite IDE 

### Running Unit Tests
To run unit tests: 
```
mvn test
```