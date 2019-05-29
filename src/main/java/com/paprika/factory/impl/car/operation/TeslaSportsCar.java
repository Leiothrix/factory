package com.paprika.factory.impl.car.operation;

import com.paprika.factory.service.car.TeslaCar;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class TeslaSportsCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("特斯拉跑车使用快充");
    }
}
