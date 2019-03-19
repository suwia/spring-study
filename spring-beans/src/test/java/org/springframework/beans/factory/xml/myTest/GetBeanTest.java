package org.springframework.beans.factory.xml.myTest;

/**
 * @Author: sirc_hzr
 * @Date: 2019/3/19 09:02
 * @ClassName: GetBeanTest
 * @Version: 1.0
 * @Description:
 */
public abstract class GetBeanTest {
	public void showMe() {
		this.getBean().showMe();
	}

	public abstract User getBean();
}
