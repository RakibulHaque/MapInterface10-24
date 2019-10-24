package enumBox;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class EnumMapUse {
	
	public static void main(String[] args)
	{
		Map<Numbers,String> map = new EnumMap<Numbers,String>(Numbers.class);
		
		map.put(Numbers.ONE, "1");
		map.put(Numbers.TWO, "2");
		map.put(Numbers.THREE, "1");
		map.put(Numbers.FOUR, "2");
		map.put(Numbers.FIVE, "1");
		
		Set<Entry<Numbers,String>> entrySet = map.entrySet();
		
		for(Entry<Numbers,String> entry : entrySet)
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

}
