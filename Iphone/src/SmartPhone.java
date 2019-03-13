
public class SmartPhone extends Mp3Player{
//	extendsを使うことによってMp3PlayerからSmartPhoneへ継承するという意味
//	ここではSmartPhoneが「サブクラス（子クラス）」、Mp3Playerが「スーパークラス（親クラス）」
	
//	ここから：オーバーライドしたプログラム
	public void play() {
		System.out.println("再生（ハイレゾ機能）");
	}
	public void stop() {
		System.out.println("停止（ハイレゾ機能）");
	}
	public void next() {
		System.out.println("次へ（ハイレゾ機能）");
	}
	public void back() {
		System.out.println("戻る（ハイレゾ機能）");
	}
//	ここまで：オーバーライドしたプログラム
//	→ Mp3Playerの同メソッドは無視され、こちらが実行される
	
	public void call() {
		System.out.println("電話");
	}
	public void mail() {
		System.out.println("メール");
	}
	public void photo() {
		System.out.println("写真");
	}
	public void internet() {
		System.out.println("インターネット");
	}
}
//オーバーライド：スーパークラスの機能をサブクラスで上書くこと
//オーバーライドする場合は、サブクラスにスーパークラスのメソッドも書く
