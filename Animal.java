package projectnew;
class dog{
	static int a=10;
	void run(){
		a++;
		System.out.println(a);
	}
}

public class Animal {
public static void main(String[] args) {
	dog s=new dog();
	s.run();
}
}
