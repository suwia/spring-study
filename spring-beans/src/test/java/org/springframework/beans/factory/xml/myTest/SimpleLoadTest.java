package org.springframework.beans.factory.xml.myTest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: sirc_hzr
 * @Date: 2019/3/18 08:39
 * @ClassName: SimpleLoadTest
 * @Version: 1.0
 * @Description:
 */
public class SimpleLoadTest {

	@Test
	public void testSimpleLoad () {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		//MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		//System.out.println(myTestBean.getMsg());
	}

	@Test
	public void testGetBean() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		GetBeanTest getBeanTest = (GetBeanTest) beanFactory.getBean("getBeanTest");
		getBeanTest.showMe();
	}

	@Test
	public void testChangeMethod() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		TestChangeMethod getBeanTest = (TestChangeMethod) beanFactory.getBean("testChangeMethod");
		getBeanTest.changeMe();
	}

	@Test
	public void testConstruct() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		TestConstruct getBeanTest = (TestConstruct) beanFactory.getBean("testConstruct");
		System.out.println(getBeanTest.toString());
	}
}
