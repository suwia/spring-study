package org.springframework.beans.factory.xml.myTest;

/**
 * @Author: sirc_hzr
 * @Date: 2019/3/19 09:00
 * @ClassName: Student
 * @Version: 1.0
 * @Description:
 */
public class Student extends User {

	@Override
	public void showMe() {
		System.out.println("i am a student");
	}
}
