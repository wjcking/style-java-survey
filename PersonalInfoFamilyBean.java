package com.eastedge.mobilesurvey.bean;

/**
 * 个人家庭信息
 * @author lianghan
 *
 */
public class PersonalInfoFamilyBean {
	/**姓名*/
	private String name;
	/**性别*/
	private String sex;
	/**出生日期*/
	private String birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
