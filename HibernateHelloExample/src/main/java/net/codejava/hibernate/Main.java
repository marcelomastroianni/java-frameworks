package net.codejava.hibernate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo 1234");
		
		BookManager manager = new BookManager();
	    manager.setup();
	 
	    manager.read();
	    //manager.create();
	    //manager.update();
	   // manager.delete();
	    manager.exit();
	}

}
