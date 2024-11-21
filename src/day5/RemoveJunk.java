package day5;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="&#^%***&((&^%&* Anilkumar $%^&  Khanadal";
		
		String replaceAll = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(replaceAll);
	}
}
