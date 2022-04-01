package com.hspedu.homework_.homework06_;

/**
 * @author lamT
 * @version 1.0
 */
class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //实例化Person对象，要求一般情况下用Horse作为交通工具，遇到大河时使用Boat作为交通工具。
    //陆地行走，封装方法walkLand()
    public void walkLand() {
        if (!(vehicles instanceof Horse)) { //判断现有的交通工具，如果为空或者不是马，则获取马；如果是马则跳过该语句
            System.out.println("正在获取马儿...");
            vehicles = VehiclesFactor.getHorse();
        }
        vehicles.work();
    }

    //过河，封装方法passRiver()
    public void passRiver() {
        if (!(vehicles instanceof Boat)) { //判断现有的交通工具，如果为空或者不是船，则获取船；如果是船则跳过该语句
            System.out.println("正在获取小船...");
            vehicles = VehiclesFactor.getBoat();
        }
        vehicles.work();
    } //过河，封装方法passRiver()
    public void passFlameMou() {
        if (!(vehicles instanceof Aircraft)) { //判断现有的交通工具，如果为空或者不是船，则获取船；如果是船则跳过该语句
            System.out.println("正在获取飞机...");
            vehicles = VehiclesFactor.getAircraft();
        }
        vehicles.work();
    }
}
