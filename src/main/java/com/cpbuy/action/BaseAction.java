package com.cpbuy.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class BaseAction {
	
	HttpServletRequest request = ServletActionContext.getRequest();
	ServletContext respons =  ServletActionContext.getServletContext();
	HttpSession session =  ServletActionContext.getRequest().getSession();

}
