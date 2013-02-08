import java.util.ArrayList;
import java.util.List;


public class Bouquet {
	private  List <Flower> bouquet = new ArrayList<Flower> ();
public void addFlower (Flower flower) {
	bouquet.add(flower);
}
public float priceIs () {
	float price = 0;
	for (int i=0; i<bouquet.size(); i++) {
		price = price + bouquet.get(i).getPrice();
	}
	return price;
}
}
