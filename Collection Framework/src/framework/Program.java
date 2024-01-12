package framework;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    LinkedList ll=new LinkedList();
		ll.add(20);
		ll.add(null);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}
