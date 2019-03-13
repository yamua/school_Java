
public interface Mp3Player {
//	interface：これからルールを作りますよというイメージ	
	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void back();
//	abstractを使ってそれぞれのルール（メソッド名のみ）を作っていく
//	interface と abstractはセットで使う。メソッド名のみで処理は書かない（抽象メソッド）
}
