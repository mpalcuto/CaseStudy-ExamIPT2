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
