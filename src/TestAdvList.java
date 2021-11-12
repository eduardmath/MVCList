
import java.util.*;

public class TestAdvList {

	public static void main(String[] args) 
	{
		Collection<Integer> myList2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{}));
		Collection<Integer> myList1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 13}));

		KjvAdvList list1 = new KjvAdvList(myList1);
		KjvAdvList list2 = new KjvAdvList(myList2);

		KjvAdvList list = new KjvAdvList();

		list.join(list1, list2);
		//list.print();
		for(Integer i : list1){
			System.out.print(i + " ");
		}
		KjvIterator it = list1.iterator();
		it.remove();
		System.out.println();
		for(Integer i : list1){
			System.out.print(i + " ");
		}
	}
}
