package pages;

import base.BaseClass;

public class ViewLeadsPage_TC06 extends BaseClass{

	public ViewLeadsPage_TC06 verifyViewLead() {
		String title = driver.getTitle();
		System.out.println(title);
		return this;

	}
}
