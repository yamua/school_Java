
public class Capsule {

	
	public static void main(String[] args) {
		Person taro = new Person("山田太郎", 20);
		System.out.println(taro.getName());
		taro.setName("花子");
		System.out.println(taro.getName());
		//getは値を取得すること
		//setは値を登録すること
		
//		演習５：getterで年齢を取得。setterで30歳に。		
		System.out.println(taro.getAge());
		taro.setAge(30);
		System.out.println(taro.getAge());
	}   
}       
