/**
 *
 */

/**
 * @author My
 *
 */
public class Test {
	public static void main(String[] args) {
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro", "123");
		dao.selectAll(); //追加分_1
		dao.selectByName("taro"); //追加分_2
		dao.selectByPassword("123"); //追加分_3
		dao.updateUserNameByUserName("taro", "saburo"); //追加分_4
		dao.insert(4, "shiro", "012"); //追加分_5
		dao.delete("shiro"); //追加分_6
	}
}

//以下追加分_1
//dao.selectAll();

//以下追加分_2
//dao.selectByName("taro");

//以下追加分_3
//dao.selectByPassword("123");

//以下追加分_4
//dao.updateUserNameByUserName("taro", "saburo");

//以下追加分_5
//dao.insert(4, "shiro", "012");

//以下追加分_6
//dao.delete("shiro");