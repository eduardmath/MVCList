public class KjvNode implements Cloneable,  Comparable<KjvNode>   
{
	 public KjvNode (int i, KjvNode n) 
	   {
		    item = i;
	    	next = n;	    
	   }
	 @Override
	 public KjvNode clone()  throws CloneNotSupportedException 
	   { return (KjvNode)super.clone();
	   }
	 
	 KjvNode Comp() throws CloneNotSupportedException
	   { return this.clone();    
	   }	 
	 @Override
	 public int compareTo(KjvNode obj)
	   { if (item < obj.item)
	       return -1;
	     else if (item > obj.item)
	       return 1;
	     else
	       return 0;
	   }
	 
	     int item;
	 KjvNode next;
}
