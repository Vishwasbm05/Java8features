package Java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

class prd{
	int id;
	String name;
	double price;
	public prd(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof prd) {
			prd p=(prd) obj;
			if(this.id==p.id) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return this.id+ "||" + this.name;
	}
}


public class ConvertingStreamToSet {
public static void main(String[] args) {
	List<prd> prdlist=new ArrayList<prd>();
	for(int i=0;i<3;i++) {
		prdlist.add(new prd(10,"lap",50000));
	}
	prdlist.add(new prd(20,"mob",10000));
	prdlist.add(new prd(30,"airpodes",1000));  
	System.out.println(prdlist);
	//set
	
	Set<prd> prdset= prdlist.stream()
			.filter(prd->prd.price<15000)
			.collect(Collectors.toSet());
	System.out.println(prdset);
	
	//map
	
	Map<Integer,String> prdMap=prdset.stream().collect(Collectors.toMap(p->p.id, p->p.name));
	
	Iterator<Entry<Integer,String>> prdItr=prdMap.entrySet().iterator();
	while(prdItr.hasNext()) {
		Entry<Integer, String> str=prdItr.next();
		System.out.println(str.getKey()+ " " + str.getValue());
	}
	
}
}
