package Map_Ass;

import java.util.HashMap;
import java.util.Map;

public class Map_Into_Map {

	public static void main(String[] args)
	{
		Map <String , Map<String,Object>> m1=new HashMap<String , Map<String,Object>>();
		Map <String ,Object> m2=new HashMap<String ,Object>();
		
		Map<String ,String> m3=new HashMap<String ,String>();
		
		m3.put("City","Mumbai");
		m3.put("Country ", "India");
		m2.put("Status", "false");
		m2.put("Adrress", m3);
		m1.put("Sunainia",m2);
		
		System.out.println(m1);

	}

}
