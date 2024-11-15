package day12;

public class AccountMain {

	public static void main(String[] args) {
		Account acc=new Account();

		acc.setAccno(2300);
		acc.setAmount(200);
		acc.setName("Anil");
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
	}
}
