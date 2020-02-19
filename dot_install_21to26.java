package myapp;
//import model.User;
//import model.AdminUser;
////import model.*; //modelパッケージのクラスを全て読み込む
//
//
//public class MyApp{
//	
//	public static void main(String[] args) {
//		User tom = new User("tom");
////	System.out.println(tom.name);
//		tom.sayHi();
//		
//		AdminUser bob = new AdminUser("bob");
////	System.out.println(bob.name);
//		bob.sayHi();
//		bob.sayHello();
//	}
//}
 
//class User {
//	private String name;
//	private int score;
//	
//	public User(String name, int score) {
//		this.name = name;
//		this.score = score;
//	}
//	
//	public int getScore() { //getter
//		return this.score;
//	}
//	
//	public void setScore(int score) { //setter
//		if (score > 0) {
//			this.score = score;
//		}
//	}
//	}
//
//public class MyApp {
//	
//	public static void main(String[] args) {
//		User tom = new User("tom",65);
//		tom.setScore(85);
//		tom.setScore(-22);
//		System.out.println(tom.getScore());
//	}}

	// static修飾子
	
//	 class User{
//		 private String name;
//		 private static int count = 0; 
//		 //class変数
//		 //class自体が値を保持する、インスタンス化しなくてもよい
//		 
//		 // initializer
//		 static {
//			 User.count = 0;
//			 System.out.println("Static Initilizer");
//		 }
//		 
//		 // instance initializer
//		 {
//			 System.out.println("Instance initializer");
//		 }
//		 
//		 public User(String name) {
//			 this.name = name;
//			 User.count++;
//			 System.out.println("Constructor initializer");
//		 }
//		 
//		 public static void getInfo() {
//			 System.out.println("# of instances: " + User.count);
//			 //classメソッド
//		 }
//	 }
//	 
//	 public class MyApp {
//		 
//		 public static void main(String[] args) {
//			 User.getInfo(); //0
//			 User tom = new User("tom");
//			 User.getInfo(); //1
//			 User tom2 = new User("tom2");
//			 User.getInfo(); //2
//			 
////			 Static Initilizer
////			 # of instances: 0
////			 Instance initializer
////			 Constructor initializer
////			 # of instances: 1
////			 Instance initializer
////			 Constructor initializer
////			 # of instances: 2
//		 }
//	 }
