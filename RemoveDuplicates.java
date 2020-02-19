import java.util.*;
class RemoveDuplicates{
    public static Set removeDuplicates(String name)
    {
        char newString[]=name.toCharArray();
        List list= Arrays.asList(newString);
        Set <Character> set=new LinkedHashSet<>();
        for(char c:newString)
        {
            if(!set.contains(c))
            {
                set.add(c);
            }
        }
   return set;

    }
}
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("before removing duplicate  String ="+name);
        System.out.println("after remove the duplicate character"+RemoveDuplicates.removeDuplicates(name));
    }
}
