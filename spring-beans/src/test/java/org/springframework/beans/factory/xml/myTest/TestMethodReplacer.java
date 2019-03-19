package org.springframework.beans.factory.xml.myTest;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Author: sirc_hzr
 * @Date: 2019/3/19 09:42
 * @ClassName: TestMethodReplacer
 * @Version: 1.0
 * @Description:
 */
public class TestMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("我替换了原始的方法");
		return null;
	}
}
