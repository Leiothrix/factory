package com.paprika.factory.impl.car.operation;

import com.paprika.factory.service.car.BenzCar;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class BenzSportsCar implements BenzCar {
    @Override
    public void refuel(){
        System.out.println("奔驰跑车加最好的油");
    }
}
