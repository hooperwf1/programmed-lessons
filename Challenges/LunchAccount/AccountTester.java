public class AccountTester {

	public static void main(String[] args){
		LunchAccount acc1 = new LunchAccount();
		LunchAccount acc2 = new LunchAccount(10.f);

		System.out.println(acc1.getBalance() + " " + acc2.getBalance());

		acc1.addMoney(10.f);
		acc2.addMoney(10.f);

		System.out.println(acc1.getBalance() + " " + acc2.getBalance());

		acc1.buyLunch(2,3,0);
		System.out.println(acc1.getBalance());
	}

}
