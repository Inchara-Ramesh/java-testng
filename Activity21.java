package abstrac;

abstract class book{
	String title;
	abstract void settitle(String s);
	String gettitle() {
		return title;
	}
}
class Mybook extends book{
	void settitle(String s) {
		title=s;
	}
}
public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title ="Hover car racer";
book Newnovel =new Mybook();
Newnovel.settitle(title);
System.out.println("The title of book:" +Newnovel.gettitle());
	}

}
