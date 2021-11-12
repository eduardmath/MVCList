
import java.util.*;

public class KjvAdvList implements Iterable<Integer>
  {
	int count = 0;
	KjvNode first = null;
	KjvNode last = null;

	public KjvAdvList() {}
	public KjvAdvList( Collection<? extends Integer> c)
	  {for ( Integer x: c)
	     { 
		   add(x);
	     }
	  }

	public boolean print(){
		KjvIterator iterator = new KjvIterator(this);
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		return true;
	}
	public boolean join(KjvAdvList list1, KjvAdvList list2){
		KjvIterator iterator1 = new KjvIterator(list1);
		KjvIterator iterator2 = new KjvIterator(list2);
		while(iterator1.hasNext() || iterator2.hasNext()){
			if(iterator1.hasNext()) this.add(iterator1.next());
			if(iterator2.hasNext()) this.add(iterator2.next());
		}
		return true;
	}
	public boolean add(Integer x){
		KjvNode newltem = new KjvNode(x, null);
		   if (last == null) first = newltem;
		   else last.next = newltem;
		   last = newltem;
		   count++;
		   return true;
	}
	public int size() { return count;}

    @Override
	public KjvIterator iterator()
	  { return new KjvIterator(this);}
	@Override
	public KjvAdvList clone()  throws CloneNotSupportedException 
	  { KjvAdvList tmp = new KjvAdvList(); 
	    for (Integer x: this)
	      tmp.add(x);
	    return tmp;
	   }	
}
