package com.paprika.factory.impl.calculate.factory;

import com.paprika.factory.impl.calculate.operation.OperationAdd;
import com.paprika.factory.impl.calculate.operation.OperationDiv;
import com.paprika.factory.impl.calculate.operation.OperationMul;
import com.paprika.factory.impl.calculate.operation.OperationSub;
import com.paprika.factory.service.calculate.AbstractOperation;

/**
 * @author adam
 * @date 2019/5/29
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class OperationFactory {
    /**
     * 简单工厂，大工厂，大既是优点也是缺点，完备又笨重，简单工厂模式不是GOF的23种设计模式之一，违反了开闭原则，新增操作类型需要添加case
     *
     * @param operation 操作参数
     * @return 相应操作对象引用
     */
    public static AbstractOperation createOperation(String operation) {
        AbstractOperation oper;
        switch (operation) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持改操作");
        }
        return oper;
    }
}
