package com.hspedu.homework_.homework06_;

/**
 * @author lamT
 * @version 1.0
 */

class VehiclesFactor {
    private static final Horse horse = new Horse();

    private VehiclesFactor() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    //新增过火焰山坐飞机的需求
    public static Aircraft getAircraft() {
        return new Aircraft();
    }
}
