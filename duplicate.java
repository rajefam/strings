
public class duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		char[] s1={};
		int n=0;
		int rs=s.length();
		for(int i=0;i<rs;i++)
		{
			
			if(i==0)
			{
				s1[0]=s.charAt(i);
			}
			else 
			{
				for(int j=0;j<rs;j++)
				{
					if(i==s1[j])
					{
						s1[j]=s.charAt(i);
					}
				}
			}
			
		}
		if(true)
		{
			int i=0;
			n=i;
			n++;
		}
System.out.println();
	}

}
