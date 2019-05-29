package com.paprika.factory.service.car;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public interface CarFactory {
    /**
     * 生成奔驰车
     *
     * @return 奔驰车实例
     */
    public BenzCar getBenzCar();
    /**
     * 生成特斯拉电动汽车
     *
     * @return  特斯拉电动车实例
     */
    public TeslaCar getTeslaCar();
}
