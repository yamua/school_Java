//演習②：Mp3Playerというインターフェイスを実装してSmartPhoneクラスを作る
public class SmartPhone extends Phone implements Mp3Player,NewFunction{
//	クラスにインターフェイスを実装するには implements を指定しなくてはならない。
//	Mp3Playerで作ったルール（メソッド）は必ずSmartPhoneクラスで上書きし、処理内容を記述する必要がある。
	public void play(){
		System.out.println("再生");
	}
	public void stop(){
		System.out.println("停止");
	}
	public void next(){
		System.out.println("次へ");
	}
	public void back(){
		System.out.println("戻る");
	}
//	必ず、インターフェイスに書いたメソッドの処理内容を書く！

}
