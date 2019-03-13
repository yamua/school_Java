
public class Person {
	
	public String name = null;
	public int age = 0;
//	初期値としてnullと０を入れておく。このことを「初期化」と言う。
	
	public String phoneNumber = null;
	public String address = null;
	
	public void talk() {
		System.out.println(this.name+"が話す");
	}
	
	public void walk() {
		System.out.println(this.name+"が歩く");
	}
//	this.nameとは「このインスタンスのname」を指している。今回だとpublic String name;
	public void run() {
		System.out.println(this.name+"が走る");
	}

}
