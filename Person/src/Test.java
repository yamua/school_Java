
public class Test {
	
	public static void main(String[] args) {
//		Person taro = new Person();
//		taro.name = "山田太郎";
//		taro.age = 20;
//		System.out.println(taro.name);
//		System.out.println(taro.age);
		
		
		Person jiro = new Person();
//		 →jiroは変数
//		　　右辺のPreson()をインスタンス書いて変数jiroに代入
//		　　左辺のPresonは型
		jiro.name = "木村次郎";
//	　　　→「.」を使う事によってjiroインスタンスのnameを呼び出すことができる
		jiro.age = 18;
		jiro.phoneNumber = "090-1234-1234";
		jiro.address = "東京都港区";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
//		「jiro.run();」によりrun()メソッドの中身「System.out.println(this.name+"が走る");」が呼び出された。
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "080-5555-5555";
		hanako.address = "神奈川県横浜市";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		
		Person madoka = new Person();
		madoka.name = "山城円花";
		madoka.age = 28;
		
		System.out.println(madoka.name);
		System.out.println(madoka.age);
	
		
		Robot aibo = new Robot();
		aibo.name = "アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name = "アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		pepper.name = "ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
