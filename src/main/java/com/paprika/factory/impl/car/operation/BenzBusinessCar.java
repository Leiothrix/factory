package com.paprika.factory.impl.car.operation;

import com.paprika.factory.service.car.BenzCar;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class BenzBusinessCar implements BenzCar {
    @Override
    public void refuel(){
        System.out.println("奔驰商务车加一般的油");
    }
}
