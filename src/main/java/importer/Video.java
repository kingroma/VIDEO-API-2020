package importer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Video {

	private static Connection connection = null;
	
	public static void main(String[] args) {
		MysqlConnection conn = new MysqlConnection();
		conn.init();
		connection = conn.getConn();
		
		System.out.println(getPK());
	}
	
	public static String getPK(){
		String sql = "SELECT CONCAT('VIDEO_' , LPAD(IFNULL(COUNT(VIDEO_ID),0) + 1,5,'0')) FROM TB_VIDEO";
		String pk = "";
		Statement stmt = null;
		ResultSet rs = null ; 
		try{
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			
			while ( rs.next() ) {
				pk = rs.getString(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pk ; 
	}
	
	/**
	 * 	VIDEO_ID
		PARENT_VIDEO_ID
		VIDEO_TYPE
		VIDEO_NM
		VIDEO_EXPLAIN
		VIDEO_ACTOR
		VIDEO_PATH
		USE_AT
		DEL_AT
	 * 
	 * */
	public static void insertVideo(){
		String sql = "INSERT INTO TB_VIDEO ("
				+ "VIDEO_ID , "
				+ "PARENT_VIDEO_ID , "
				+ "VIDEO_TYPE , "
				+ "VIDEO_NM , "
				+ "VIDEO_EXPLAIN , "
				
				+ "VIDEO_ACTOR , "
				+ "VIDEO_PATH , "
				+ "USE_AT , "
				+ "DEL_AT , "
				+ " ) VALUES ("
				+ " ? , "
				+ " ? , "
				+ " ? , "
				+ " ? , "
				+ " ? , "
				
				+ " ? , "
				+ " ? , "
				+ " ? , "
				+ " ?  "
				+ ""
				+ ") ";
		
		PreparedStatement pstmt = null ;
		
		try{
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, ""); // video_id
			pstmt.setString(1, ""); // video_id
			pstmt.setString(1, ""); // video_id
			pstmt.setString(1, ""); // video_id
			pstmt.setString(1, ""); // video_id
			
			pstmt.setString(1, ""); // video_id
			pstmt.setString(1, ""); // video_id
			pstmt.setString(1, ""); // video_id
			pstmt.setString(1, ""); // video_id
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
