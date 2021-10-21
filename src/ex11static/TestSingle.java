package ex11static;





class Single {
	
	private static Single s = new Single();
	static Single getInstance() {
		return s;
	}
	
}



public class TestSingle
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
