package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.Customer;

//∑√Œ  ˝æ›ø‚
public class CustomerDao {
	private Connection conn = null;

	public void initConnection() throws Exception {
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		conn = DriverManager.getConnection("jdbc:ucanaccess://E:/Database2.accdb");	
	}
	public void closeConnection() throws Exception {
		conn.close();
	}

	public Customer getCustomerByAccount(String account) throws Exception {
		String sql = "SELECT ACCOUNT,PASSWORD,CNAME "
				+ "FROM T_CUSTOMER WHERE ACCOUNT=?";
		this.initConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, account);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Customer cus = new Customer();
			cus.setAccount(rs.getString("ACCOUNT"));
			cus.setPassword(rs.getString("PASSWORD"));
			cus.setCname(rs.getString("CNAME"));
			return cus;
		}
		closeConnection();
		return null;
	}
}
