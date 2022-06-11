package ex15_5_HashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
public class Hashset_assignment {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<6; i++) {
		set.add((int) (Math.random()*45+1));
		}
		System.out.println(set);
		Random r = new Random();
		while(set.size()<6) {
			set.add(r.nextInt(45) +1);
		}
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"\t");
		}
	}
}

