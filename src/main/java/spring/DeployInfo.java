package spring;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DeployInfo {
	private final Log log = LogFactory.getLog(DeployInfo.class);

	private String databaseUrl;
	private String databaseUser;
	private String databasePassword;

	public String getDatabaseUrl() {
		return databaseUrl;
	}

	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}

	public String getDatabaseUser() {
		return databaseUser;
	}

	public void setDatabaseUser(String databaseUser) {
		this.databaseUser = databaseUser;
	}

	public String getDatabasePassword() {
		return databasePassword;
	}

	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}
	
	public void echoDeployInfo(){
		InetAddress addr;
		try{
			log.info("taiwandoc 部屬訊息");
			addr = InetAddress.getLocalHost();
			log.info("Web應用伺服器主機 >"+addr.getHostName()+":" + addr.getHostAddress());
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
	}
}
