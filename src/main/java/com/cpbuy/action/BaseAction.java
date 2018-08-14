package com.cpbuy.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {

	protected HttpServletRequest request = ServletActionContext.getRequest();
	protected ServletContext respons = ServletActionContext.getServletContext();
	protected HttpSession session = ServletActionContext.getRequest().getSession();
	protected String MSG;
	protected String BASE_PATH;

	public String getBASE_PATH() {
		return BASE_PATH;
	}

	public void setBASE_PATH(String bASE_PATH) {
		BASE_PATH = bASE_PATH;
	}

	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub

	}
	
	public void validate() {
		String path = request.getContextPath();
		BASE_PATH = "http://localhost:8080";
	}
}
