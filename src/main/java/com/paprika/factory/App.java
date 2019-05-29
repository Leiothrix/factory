package com.paprika.factory;

import com.paprika.factory.impl.calculate.factory.AddFactory;
import com.paprika.factory.impl.car.factory.SportsCarFactory;
import com.paprika.factory.service.calculate.AbstractOperation;
import com.paprika.factory.service.calculate.IFactory;
import com.paprika.factory.service.car.CarFactory;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class App {
    public static void main(String[] args) {

        //工厂方法模式
        IFactory factory = new AddFactory();
        AbstractOperation operationAdd = factory.createOperation();
        operationAdd.setValue1(2);
        operationAdd.setValue2(3);
        System.out.println(operationAdd.getResult());

        //抽象工厂模式，自认为这种模式在实际开发中用的最为普遍
        //每次通过具体工厂类创建一个产品族中的多个对象
        //增加新的具体工厂和产品族很方便
        //主要缺点在于增加新的产品等级结构比较复杂，需要修改抽象工厂和所有具体工厂类
        CarFactory factory1 = new SportsCarFactory();
        factory1.getBenzCar().refuel();
    }
}
