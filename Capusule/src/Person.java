
public class Person {
	
	private String name = null;
	private int age = 0;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {  //getの後の１文字は必ず大文字
		return this.name;
	} //getの時は必ずリターン
	  //getは値を取得すること
	
	public void setName(String name) {  //setの後の１文字は必ず大文字
		//setの時は戻り値の型の位置にvoidと書く
		//今回の場合はsetNameで名前を書き換える「処理」を行うだけなので戻り値なしのvoidになる
		this.name = name;
	}   //setは値を登録すること
	
//	演習５：getterで年齢を取得。setterで30歳に。
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
