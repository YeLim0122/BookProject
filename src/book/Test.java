package book;

import java.util.*;

public class Test {

	static class Singer {

		private String name;
		private int age;

		// setter, getter
		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String printInfo() {
			String str = "이름: " + name + "\n연차: " + age;
			return str;
		}
	}

	static class Btob extends Singer {

		private String fan;

		public void setFan(String f) {
			fan = f;
		}

		public String getFan() {
			return fan;
		}

		public String printInfo() {
			return super.printInfo() + "\n팬: " + fan;
		}
	}
	

	public static void main(String[] args) {
		
		ArrayList<Singer> btob = new ArrayList<>();
		
		Btob b1 = new Btob();
		
		b1.setName("비투비");
		b1.setAge(11);
		b1.setFan("멜로디");
		
		btob.add(b1);
		
		b1.setName("비투비");
		b1.setAge(11);
		b1.setFan("멜로디");
		
		btob.add(b1);
		
		Iterator<Singer> it = btob.iterator();
		while (it.hasNext()) {
			Singer s = it.next();
			System.out.println(((Btob)s).printInfo());
		}
		

	}

}
