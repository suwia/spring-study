package org.springframework.beans.factory.xml.myTest;

/**
 * @Author: sirc_hzr
 * @Date: 2019/3/19 10:06
 * @ClassName: TestConstruct
 * @Version: 1.0
 * @Description:
 */
public class TestConstruct {

	private String name;
	private Integer age;

	public TestConstruct(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "TestConstruct{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
