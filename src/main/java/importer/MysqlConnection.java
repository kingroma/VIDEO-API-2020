package importer;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {
	private String ip = "127.0.0.1" ; 
	private int port = 3306 ;
	private String db = "video" ;
	private String id = "root" ; 
	private String pwd = "4235" ;
	
	private Connection conn = null ;
	
	public MysqlConnection(){}
	
	public MysqlConnection(String ip, int port , String db, String id, String pwd){
		this.ip = ip ; 
		this.port = port ; 
		this.db = db ; 
		this.id = id ; 
		this.pwd = pwd ; 
	}
	
	public void init(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.setConn(DriverManager.getConnection("jdbc:mysql://" + this.ip + ":" + this.port + "/" + this.db, this.id, this.pwd ));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close(){
		try {
			if ( this.conn != null )
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
