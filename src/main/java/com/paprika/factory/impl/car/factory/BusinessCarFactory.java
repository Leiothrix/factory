package com.paprika.factory.impl.car.factory;

import com.paprika.factory.impl.car.operation.BenzBusinessCar;
import com.paprika.factory.impl.car.operation.TeslaBusinessCar;
import com.paprika.factory.service.car.BenzCar;
import com.paprika.factory.service.car.CarFactory;
import com.paprika.factory.service.car.TeslaCar;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class BusinessCarFactory implements CarFactory{
    @Override
    public BenzCar getBenzCar(){
        return new BenzBusinessCar();
    }

    @Override
    public TeslaCar getTeslaCar(){
        return new TeslaBusinessCar();
    }
}
