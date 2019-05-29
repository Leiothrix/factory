package com.paprika.factory.service.calculate;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public interface IFactory {
    /**
     * 虚拟工厂中的虚拟操作对象生成器
     *
     * @return 返回相应的操作对象
     */
    AbstractOperation createOperation();
}
