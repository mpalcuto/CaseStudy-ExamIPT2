public class Exam {

   
    public static void main(String[] args) {
       Hardware hard = new Hardware();
		hard.move();
		hard.ware();
		Screen hard1 = new Screen();
		hard1.reen();
		KeyBoard board = new KeyBoard();
		board.key();
		Brand brand1 = new Brand();
		brand1.top();
		Price pri = new Price();
		pri.tag();
		Warranty warr = new Warranty();
		warr.war();
		Op system = new Op();
		system.sys();
		Size s1 = new Size();
		s1.inch();
	}
}
abstract class Laptop{
	public void move() {
		System.out.println("i am laptop!");
	}
}
class Hardware extends Laptop {
	public void ware() {
		System.out.println("i am hardware of a laptop!");	System.out.println("inside hardware there is a: ");
		}
}
class Brand extends Laptop {
	public void top() {
		System.out.println("i am a brand of laptop!");
		System.out.println("inside brand there is a: ");
		}
}
class Screen extends Hardware {
	public void reen() {
		System.out.println("LCD/LED");
		}
}
class KeyBoard extends Hardware {
	public void key() {
		System.out.println("Space bar and enter");
		}
}
class Price extends Hardware {
	public void tag() {
		System.out.println("P30,000");
	}
}
class Warranty extends Laptop{
	public void war(){
		System.out.println("1 year warranty");
	}
}
class Op extends Laptop {
	public void sys(){
		System.out.println("Windows 7, 8, 8.1,10");
	}
}
class Size extends Hardware{
	public void inch(){
		System.out.println("15 inches");
	}
}
