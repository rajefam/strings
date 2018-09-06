
public class duplicate1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		char s1 = 0;
		int rs=s.length();
		for(int i=0;i<rs;i++)
		{
			for(int j=i+1;j<rs;j++)
			{
				s1=s.charAt(i);
				char s2=s.charAt(j);
				if(s1!=s2)	
				{
					s2=0;
				}
			}
		}
		for(int i=0;i<rs;i++)
		{
			if(s1==0)
			{
				System.out.println(s1);
			}
		}

	}

}
