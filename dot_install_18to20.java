//class User{
//	String name;// フィールド
//	
//	// constructor
//	User(String name){
//		this.name = name;
//	}
//	
//	// this() 
//	
//	// constructor overload
//	User(){
////		this.name = "Me!";
//		this("Me!"); // User(String name)を呼び出す
//	}
//	
//	void sayHi() {
//		System.out.println("hi! " + this.name);
//	}
//}
//
//class AdminUser extends User {
//	
//	AdminUser(String name){
//		super(name);
//	}
//	
//	void sayHello() {
//		System.out.println("hello! " + this.name);
//	}
//	
//	// override
//	@Override //アノテーション うまくオーバーライドできていなければerror
//	void saHi() {
//		System.out.println("[admin] hi! " + this.name); //saHi()なのでerror
//	}
//	
//}


//public class MyApp{
//	public static void main(String[] args) {
//		// static句はクラスをインスタンス化しなくても使用できるメソッド
//		// Class
//		
//		User tom;//参照型なのでメモリ領域にデータが作られていない
//		//tom = new User("Tom");//インスタンス
//		tom = new User();
//		System.out.println(tom.name);
//		tom.sayHi()
//	}

//public class MyApp{
//	public static void main(String[] args) {
//		AdminUser bob = new AdminUser("bob");
//		System.out.println(bob.name);
//		bob.sayHi();
//		bob.sayHello();
//	}
//}
