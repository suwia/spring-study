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

}
