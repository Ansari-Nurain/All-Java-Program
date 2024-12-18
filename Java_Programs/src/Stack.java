import java.util.*;

public class Stack {

public static void main(String[] args)

{

List<String> list = new LinkedList<>();

list.add("Hello");

list.add("World");

list.add("Java");

list.add("Programming");

Iterator<String> iter = list.iterator();

while (iter.hasNext())

System.out.printf(iter.next() + " ");

System.out.println();

}
}