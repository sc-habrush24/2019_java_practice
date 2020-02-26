import java.util.*;
public class IteratorEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap();
		HashMap<String, Integer> map1 = new HashMap();
		map.put("이재문",0);
		map.put("황기태",0);
		map.put("김남윤",0);
		System.out.println("**포인트 관리 프로그램입니다**");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = scanner.next();
			if(name.equals("그만")) {
				break;}
			int point = scanner.nextInt();
			int p = map.get(name);
			map.remove(name);
			map.put(name,point+p);
			map1.remove(name);
			map1.put(name,point+p);
			Set <String> keys = map1.keySet();
			Iterator <String> it = keys.iterator();
			while(it.hasNext()) {
				String n = it.next();
				System.out.print("("+n+","+map1.get(n)+")");
			}
			System.out.print("\n");
		}
	}

}
