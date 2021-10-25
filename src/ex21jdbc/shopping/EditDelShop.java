package ex21jdbc.shopping;

import java.sql.SQLException;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class EditDelShop extends IConnectImpl{

		public EditDelShop() {
			super("kosmo","1234");
		}
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정(1), 삭제(0) ");
		int user = scan.nextInt();
		
		if(user==0) {
		try {
			String query = "DELETE FROM sh_goods WHERE g_idx=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, scanValue("삭제할 제품코드:"));
			System.out.println(psmt.executeUpdate()
					+"행이 삭제되었습니다");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		}
		
		if(user==1) {
		String sql ="UPDATE sh_goods "
				+" SET goods_name=?, goods_price=?, regidate=? "
				+" WHERE g_idx=? ";
		try {
			psmt = con.prepareStatement(sql);
			
			while(true) {
				psmt.setString(1, scanValue("이름"));
				psmt.setString(2, scanValue("가격"));
				psmt.setString(3, scanValue("등록일"));
				psmt.setString(4, scanValue("제품코드"));
				
				int affected = psmt.executeUpdate();
				System.out.println(affected +"행이 업데이트 되었습니다");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			close();
		}
		}
	}
	
	public static void main(String[] args) {
		new EditDelShop().execute();
	}
}
