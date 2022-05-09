package com.example.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ifaces.CrudRepository;

public class CustomerService implements CrudRepository<LoanApplication> {
 private Connection con;
 
 
	public CustomerService(Connection con) {
	super();
	this.con = con;
}
	
	public int add(LoanApplication obj) {
		
			int rowAdded=0;
			String sqlloan="insert into thas3_LoanApplication values(?,?,?)" ;
			String sqlcust="insert into thas1_Customer values(?,?,?,?)";
			try(PreparedStatement pstmtloan=con.prepareStatement(sqlloan);
				PreparedStatement pstmtcust=con.prepareStatement(sqlcust)){
				
				pstmtcust.setInt(1,obj.getCustomer().getCustomerId());
				pstmtcust.setString(2,obj.getCustomer().getCustomerName());
				pstmtcust.setLong(3,obj.getCustomer().getPhoneNumber());
				pstmtcust.setDouble(4,obj.getCustomer().getCreditScore());
				
				rowAdded = pstmtcust.executeUpdate();

				pstmtloan.setInt(1,obj.getApplicationNumber());
				pstmtloan.setInt(2,obj.getCustomer().getCustomerId());
				pstmtloan.setDouble(3,obj.getLoanAmount());
				
				pstmtloan.executeUpdate();
				
				}catch(SQLException e) {
					e.printStackTrace();
			}
				return rowAdded;
			
		}


	public List<LoanApplication> findAll() {
		
		List<LoanApplication> appList = new ArrayList<LoanApplication>();
		String sql = "select tc.customer_Id, tc.customer_Name, tc.phone_Number, tc.credit_Score, "
				+ "tl.application_Number, tl.customer,"
				+ " tl.loan_Amount from thas1_customer tc,"
				+ " thas3_loanapplication tl where tc.customer_id=tl.customer"; 
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int customerId = rs.getInt("customer_Id");
				String customerName = rs.getString("customer_Name");
				long phoneNumber = rs.getLong("phone_Number");
				int creditScore = rs.getInt("credit_Score");
				int applicationNumber = rs.getInt("application_Number");
				int loanAmount = rs.getInt("loan_Amount");
				
				Customer cust = new Customer(customerId, customerName,  phoneNumber,  creditScore);
				LoanApplication appli = new LoanApplication(applicationNumber, cust, loanAmount);
			appList.add(appli);
			
			}
			
		}catch(SQLException e) {
				e.printStackTrace();
			}
		
		
		
		return appList; 
	}
	
	
	public int remove(int id) {
		int rowdeleted=0;
		String sql = "delete from thas3_loanapplication where application_number =?";
				
		try(PreparedStatement ps = con.prepareStatement(sql)){
					
			ps.setInt(1,id);
			rowdeleted= ps.executeUpdate();
					
			}catch(Exception e) {
			e.printStackTrace();
			}
	return rowdeleted;
	}
	
	
	
	@Override
	public Optional<LoanApplication> findById(int id) {
		
		Optional<LoanApplication> app = Optional.empty();
			
			String sql = "select tc.customer_Id, tc.customer_Name, tc.phone_Number, tc.credit_Score, tl.application_Number, tl.customer, tl.loan_Amount from thas1_customer tc left outer join thas3_loanapplication tl on tc.customer_id =tl.customer where customer_id= ?";
			
			try(PreparedStatement pstmt = con.prepareStatement(sql)){
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
				
					int customerId = rs.getInt("customer_Id");
					String customerName = rs.getString("customer_Name");
					long phoneNumber = rs.getLong("phone_Number");
					int creditScore = rs.getInt("credit_Score");
					int applicationNumber = rs.getInt("application_Number");
					int customer = rs.getInt(customer);
					int loanAmount = rs.getInt("loan_Amount");
					
					Customer cust1 = new Customer(customerId,customerName,phoneNumber,creditScore );
					LoanAplication loan = new LoanAplication(applicationNumber, cust1, loanAmount );
				app = Optional.of(loan);	
			
			
	}
				
			}catch(SQLException e) {
					e.printStackTrace();				}
			return app ;
	}
	


	@Override
	public int update(int Id, LoanApplication customer) {
		// TODO Auto-generated method stub
		return 0;
	}


}