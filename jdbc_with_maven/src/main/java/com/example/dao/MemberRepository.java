package com.example.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;
import com.example.entity.Member;
import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {

	private Connection con;
	
	
	public MemberRepository(Connection con2) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
		int rowAdded = 0;
		String sql = "insert into gowse_member values(?, ?, ?, ?, ?, ?, ?, ?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, obj.getMemberId());
			pstmt.setString(2, obj.getMemberName());
			pstmt.setString(3, obj.getMemberAddress());
			pstmt.setDate(4, obj.getAccountOpenDate());
			pstmt.setString(5, obj.getMemberShipType());
			pstmt.setInt(6, obj.getFeesPaid());
			pstmt.setInt(7, obj.getMaxBookAllowed());
			pstmt.setDouble(8, obj.getPenaltyAmount());
			rowAdded = pstmt.executeUpdate();
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;

		}
		
		
		
	public List<Member> findAll() {
		List<Member> memberList = new ArrayList<Member>();
		String sql = "select* from gowse_member";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int memberId = rs.getInt("Member_Id");
				String memberName = rs.getString("Member_Name");
				String memberAddress = rs.getString("Member_Address");
				LocalDate accountOpenDate = rs.getDate("Acc_Open_Date").toLocalDate();
				String memberShipType = rs.getString("Member_Ship_Type");
				double feesPaid = rs.getDouble("Fees_Paid");
				int maxBooksAllowed = rs.getInt("MaxBooks_Allowed");
				double penaltyAmount = rs.getDouble("Penalty_Amount");
				Member mem= new Member(memberId, memberName, memberAddress, accountOpenDate, memberShipType, feesPaid, maxBooksAllowed, penaltyAmount);
				memberList.add(mem);
			}
			
		}catch(SQLException e) {
				e.printStackTrace();
			}
		

		return memberList ;
	}

	public int remove(int d) {
		
		return 0;
	}

	public Member findById(int id) {
		
		return null;
	}

	public int update(int Id, Member obj) {
		
		return 0;
	}

	@Override
	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
