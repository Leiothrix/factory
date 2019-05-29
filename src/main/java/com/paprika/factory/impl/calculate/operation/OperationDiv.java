package com.paprika.factory.impl.calculate.operation;

import com.paprika.factory.service.calculate.AbstractOperation;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class OperationDiv extends AbstractOperation {
    @Override
    public double getResult() {
        if (0 != getValue2()) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数不能为0");
    }
}
