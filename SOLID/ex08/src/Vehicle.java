interface EngineVehicle {
    void startEngine();
}

interface PedalVehicle {
    void pedal(int effort);
}

interface Electric {
    void recharge(int kWh);
}