import java.util.HashSet;

public class Mobile 
{
String brand;
double price;
Mobile(String brand,double price )
   {
	this.brand=brand;
	this.price=price;
	
   }
public String toString()
{
	return brand+" "+price;
}

public static void main(String[] args) 
{
	HashSet<Mobile>hs= new HashSet<Mobile>();
		hs.add(new Mobile("vivo",28000d));
	    hs.add(new Mobile ("samsung",30000d));
	    
	
  for(Mobile m :hs)
  {
	  System.out.println(m);
  }
}
}

