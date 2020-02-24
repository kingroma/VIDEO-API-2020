package importer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * VIDEO_TYPE { "SINGLE" , 
 * 
 * */
public class Common {
	private static Connection connection = null;
	
	public static void main(String[] args) {
		MysqlConnection conn = new MysqlConnection();
		conn.init();
		connection = conn.getConn();
		
		insertCode("VD_1000","");
		
		conn.close();
	}
	
	public static String getPK(){
		String sql = "SELECT CONCAT('CODE_' , LPAD(IFNULL(COUNT(CODE_ID),0) + 1,4,'0')) FROM TB_CODE";
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
		} finally { 
			
		}
		
		return pk ; 
	}
	private static void insertCode(String codeId , String codeNm ){
		String sql = "INSERT INTO TB_CODE ( CODE_ID , CODE_NM ) VALUES ( ? , ? )";
		
		PreparedStatement pstmt = null ; 
		try {
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, codeId );
			pstmt.setString(2, codeNm);
			
			pstmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			try {
				if ( pstmt != null )
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
