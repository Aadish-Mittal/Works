import java.util.Map;
import java.util.HashMap;

public class kaden 
{
    public static void main(String[] args)
    {
        // Java program to demonstrate iteration over


		Map<String,String> gfg = new HashMap<String,String>();
	
		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");
		
		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<String,String> entry : gfg.entrySet())
			System.out.println("Key = " + entry.getKey() +
							", Value = " + entry.getValue());
	
}
}

