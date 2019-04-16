package extra.chap07_05;

public class BuyerTest {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Tv(5000));
		buyer.buy(new Computer(1000));
		
		System.out.println("남은 돈:"+buyer.money);
		System.out.println("모인 포인트:"+buyer.bp);

	}

}
