package game.entities.concretes;

public class Campaign {

	private double discountPrice;

	
	
	public Campaign() {
		
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	public Campaign(int discountPrice) {
		super();
		this.discountPrice = discountPrice;
	}
	
}
