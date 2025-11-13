package application;

public class Program3 {
	public static void main (String[]args) {
		String[]vect = new String[]{"Maria", "Bob", "Vinni"};
			for (int i = 0; i < vect.length; i++) {
				System.out.println(vect[i]);
			}
			for (String obj : vect) {
				System.out.println(obj);
			}
		}
	}

