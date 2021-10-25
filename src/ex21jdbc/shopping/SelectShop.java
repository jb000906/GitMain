package ex21jdbc.shopping;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl {
	
	public SelectShop() {
		super("kosmo","1234");
	}
	@Override
	public void execute() {
		try {
			while(true)
			{
				
				String sql =" SELECT * FROM sh_goods "
						+" WHERE goods_name LIKE '%'||?||'%'";
				psmt=con.prepareStatement(sql);
				psmt.setString(1, scanValue("찾는이름"));
				rs=psmt.executeQuery();
				while(rs.next()) {
					String g_idx = rs.getString(1);
					String goods_name = rs.getString(2);
					String goods_price = rs.getString(3);
					String regidate=
							rs.getString(4).substring(0,10);
					String p_code = rs.getString(5);
					System.out.printf("%s %s %s %s %s\n",
							g_idx, goods_name, goods_price, regidate, p_code);
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new SelectShop().execute();
	}

}
