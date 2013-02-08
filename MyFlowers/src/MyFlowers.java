
public class MyFlowers {

	/**
	 * @param args
	 * this is test class
	 * the test is: Define a hierarchy of flowers. Create a few objects, flowers. Collect a bunch and determine its value.
	 */
	public static void main(String[] args) {
		Bouquet myBouquet = new Bouquet();
		myBouquet.addFlower(new BigRose());
		myBouquet.addFlower(new MidRose());
		myBouquet.addFlower(new SmallRose());
		myBouquet.addFlower(new Lily());
		myBouquet.addFlower(new RareLily ());
		System.out.println (myBouquet.priceIs());

	}

}
