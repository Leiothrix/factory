package com.paprika.factory.impl.calculate.factory;

import com.paprika.factory.service.calculate.AbstractOperation;
import com.paprika.factory.service.calculate.IFactory;
import com.paprika.factory.impl.calculate.operation.OperationMul;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class MulFactory implements IFactory {
    @Override
    public AbstractOperation createOperation(){
        return new OperationMul();
    }
}
