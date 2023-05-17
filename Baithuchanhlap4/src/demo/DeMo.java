package demo;

public class DeMo {
    public static void main (String [] args){
        Set<String> linkedHashset = new LinkedHashSet<String>();
        linkedHashset.add("C++");
        linkedHashset.add("Java");
        linkedHashset.add("PPP");
        for (String str : linkedHashSet){
            System.out.println(str);
        }
    }
}
