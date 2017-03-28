package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable{
  /* class body goes here */
  public void pullSled () {
    System.out.println(this + " pulls the sled");
  }

  public void bark() {
		System.out.println(this+" Woof!");
	}

  public void hug() {
    System.out.println(this+" hugged you!");
  }
}
