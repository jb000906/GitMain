package ex21jdbc.shopping;

import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{

	public InsertShop() {
		super(ORACLE_DRIVER, "kosmo", "1234");	
	}
	
	@Override
	public void execute() {
		try {
			String query="INSERT INTO sh_goods VALUES (?, ?, ?, ?, ?)";
			
			psmt=con.prepareStatement(query);
			
			Scanner scan =new Scanner(System.in);
			System.out.println("상품의 일련번호:");
			String g_idx=scan.nextLine();
			System.out.println("상품명:");
			String goods_name= scan.nextLine();
			System.out.println("상품가격:");
			String goods_price=scan.nextLine();
			System.out.println("등록일:");
			String regidate=scan.nextLine();
			System.out.println("상품코드:");
			String p_code=scan.nextLine();
			
			psmt.setString(1, g_idx);
			psmt.setString(2, goods_name);
			psmt.setString(3, goods_price);
			
			
			java.util.Date utilDate=new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());	
			psmt.setDate(4, sqlDate);
			psmt.setString(5, p_code);

			
			int affected = psmt.executeUpdate();
			System.out.println(affected +"행이 입력되었습니다");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new InsertShop().execute();
	}

}
