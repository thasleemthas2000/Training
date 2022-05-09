package com.example.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.*;

public class ProductServices {

	private Connection con;

	public ProductServices(Connection con) {
		super();
		this.con = con;
	}
	
	
	public int updatePriceByName(String productName,double newPrice) {
		int rowsUpdated=0;
		String sql ="update thas_product set price=? where product_name=?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1,productName );
			pstmt.setDouble(2,newPrice );
			rowsUpdated =pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
			
		return rowsUpdated;
	}
	public int deleteById(int id) {
		int rowsDeleted = 0;
		String sql = "deleted from thas_product where product_id = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			rowsDeleted = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowsDeleted;
	}
	
	public Optional<Product> findById(int id) {
		Optional<Product> productOptional = Optional.empty();
		
		String sql = "select* from thas_product where product_id =?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
			
				int productId = rs.getInt("product_Id");
				String productName = rs.getString("product_Name");
				double price = rs.getDouble("price");
			Product prod = new Product(productId, productName,price  );
			productOptional = Optional.of(prod);	
		
		
}
			
		}catch(SQLException e) {
				e.printStackTrace();
			}
		return productOptional ;
}
	
	public int addProduct(Product product) {
		int rowAdded = 0;
		String sql = "insert into thas_product values(?, ?, ?)";
		
		
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			rowAdded = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
}

	public List<Product> findAll(){
		
		List<Product> productList = new ArrayList<Product>();
		String sql = "select* from thas_product";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int productId = rs.getInt("product_Id");
				String productName = rs.getString("product_Name");
				double price = rs.getDouble("price");
			Product prod = new Product(productId, productName,price  );
			productList.add(prod);
			
			}
			
		}catch(SQLException e) {
				e.printStackTrace();
			}
		
		
		
		return productList; 
	}
	
//	public void usingTcn(Product prd1, Product prd2) {
//		String sql1 ="insert into thas_product values(?,?,?)";
//		try(PreparedStatement pstmt = con.prepareStatement(sql1)){
//			con.setAutoCommit(false);// automcommit is defaultly true so u must give false.
//			
//			pstmt.setInt(1,prd1.getProductId());
//			pstmt.setString(2,prd1.getProductName());
//			pstmt.setDouble(3,prd1.getPrice());
//			
//			int rowAdded = pstmt.executeUpdate();
//			System.out.println("Row Added :" +rowAdded);
//			
//			
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	// u use connection from main method(app)
	
	public void usingTxn(Product prd1,Product prd2) {
		String sql = "insert into thas_product values(?, ?, ?)";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			con.setAutoCommit(false);
			pstmt.setInt(1, prd1.getProductId());
			pstmt.setString(2, prd1.getProductName());
			pstmt.setDouble(3, prd1.getPrice());
			
			int rowAdded =pstmt.executeUpdate();
			
			pstmt.setInt(1, prd2.getProductId());
			pstmt.setString(2, prd2.getProductName());
			pstmt.setDouble(3, prd2.getPrice());
			
			int rowAdded2 =pstmt.executeUpdate();
			if(prd2.getPrice()>prd1.getPrice()) {
				con.commit();
			}
			else {
				con.rollback();
			}
			
			
			System.out.println("Row Added:"+rowAdded +","+rowAdded2);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
}
}
