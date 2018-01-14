package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextUtil {
	private static ApplicationContext context;
	private static String domainName;

	public static ApplicationContext getContext() {
		if (context == null) {
			context = new ClassPathXmlApplicationContext("classpath:/config/spring*/*Context.xml");
		}
		return context;
	}

	public static void setContext(ApplicationContext context) {
		SpringContextUtil.context = context;
	}

	public static String getDomainName() {
		return domainName;
	}

	public static void setDomainName(String domainName) {
		SpringContextUtil.domainName = domainName;
	}

}
