import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseHashMap {
	
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<>();
		
		map.put("myName", "Rakibul");
		map.put("actor", "John");
		map.put("hobby","sakka");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
		{
			System.out.println(key + " " + map.get(key));
		}
		//System.out.println(map);
		//System.out.println(map.get("myName"));
		
	}

}
