public class LunchAccount {
	
	private static int currentID = 0, bonus = 0;

	int id, lunches = 0;
	double balance = 0.f, totalSpent = 0.f;
	boolean gotBonus = false;

	LunchAccount(){
		id = currentID;
		currentID++;
	}

	LunchAccount(double money){
		id = currentID;
		currentID++;
	

		addMoney(money);
	}

	public double getBalance(){
		return balance;
	}

	private double valueOfItem(int item){
		if(item == 1){
			return 1.f;
		} else if (item == 2){
			return 5.f;
		} else if (item == 3){
			return 2.5f;
		}

		return 0.f;
	}

	public void addMoney(double money){
		balance += money;

		if(bonus <= 100 && !gotBonus){
			balance += 20;
			bonus++;
			gotBonus = true;
		}
	}

	public double calculateCost(int item1, int item2, int item3){
		return valueOfItem(item1) + valueOfItem(item2) + valueOfItem(item3); 
	}

	public void buyLunch(int item1, int item2, int item3){
		double price = calculateCost(item1, item2, item3);

		if(price > balance){
			return;
		}
		
		lunches++;
		totalSpent += price;
		balance -= price;
	}

}
