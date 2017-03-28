package edu.info448.review;

/**
 * A class representing a gift box containing an object
 */
public class GiftBox<T> {

	private Huggable gift; //what is inside the box

	//makes a new gift box containing the gift
	public GiftBox(Huggable gift){
		this.gift = gift;
	}

	//unwraps the gift and returns what's inside
	public Huggable openGift() {
		return this.gift;
	}
}
