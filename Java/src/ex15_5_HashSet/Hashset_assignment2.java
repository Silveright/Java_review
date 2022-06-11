package ex15_5_HashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
public class Hashset_assignment2 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
//		for(int i = 0; i<6; i++) {
//		set.add((int) (Math.random()*45+1));
//		}
//		System.out.println(set);
//		
		
		Random r = new Random();
		while(set.size()<6) {
			int num =r.nextInt(45) +1;
			set.add(num);
		}
		
			System.out.println("로또 번호 오름차순: "+set);
	}
}


