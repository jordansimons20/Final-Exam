
public class ArrayDump {
	
	public void dumpArray(Object[] TheArray)
	{
		String ReturnValue = ""; 
		
		for(Object Element : TheArray)
		{
			if (Element != null) 
			{
				ReturnValue += Element + " "; 
			}
		}
		
		System.out.println(ReturnValue);
		return; 
	}
	
	public static void main(String[] args)
	{
		ArrayDump Test = new ArrayDump(); 
		
		Object[] Test1 = {1,2,3,4};
		Object[] Test2 = {"Mary", "had", "a", "little", null, "lamb", '.'};
		Object[] Test3 = {new Object(), new Object(), new Object()}; 
		
		Test.dumpArray(Test1);
		Test.dumpArray(Test2);
		Test.dumpArray(Test3);
		
	}

}
