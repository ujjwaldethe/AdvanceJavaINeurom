import java.util.*; 
import java.util.stream.*;
class Sample
{
	private String s;
	Sample(String s)
	{
		this.s=s;
		System.out.println("Const Executed");
	}
}
interface Intern
{
	public Sample get(String s);
}
public class LamdaTest 
{
	public static void main(String[] args) 
	{
		Intern i1 = s->new Sample(s);
		i1.get("From Lambda Expression");

		Intern i2  = Sample::new;
		i2.get("From Constructor Refernce"); 

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(33);
		al.add(12);
		System.out.println(al);
		System.out.println("Even : ");
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(Integer i : al)
		{
			if(i%2==0)
			{
				al1.add(i); 
			}
		}
		System.out.print(al1);
		//al.stream() -> Configuration 
		//filter(i->i%2==0) -> Processing
		//collect(Collectors.toList()) -> Collecting
		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("\n\nStream API : "+l);
		l.forEach(System.out::println);
	
		
		List<Integer> l2 = al.stream().map(obj->obj*2).collect(Collectors.toList());
		System.out.println("\n\nStream API : "+l2);
		l2.forEach(System.out::println);
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ujjwal");
		names.add("Shriram");
		names.add("Dethe");

		List<String> n = names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		n.forEach(System.out::println);


		List<Integer> result = al.stream().sorted().collect(Collectors.toList());
		result.forEach(System.out::println);

		List<Integer> reverseResult= al.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
		
        reverseResult.forEach(System.out::println);

		Integer min = al.stream().min((min_a ,max_b)->min_a.compareTo(max_b)).get();
		
		System.out.println("Min : "+min);

		Integer max = al.stream().max((max_a ,min_b)->max_a.compareTo(min_b)).get();
		
		System.out.println("Max : "+max);


		//toArray Method return object array
		Integer[] objArr = al.stream().toArray(Integer[]::new);
		for( Integer obj :objArr)
		{
			System.out.print(obj+" ");		
		}

	}
}