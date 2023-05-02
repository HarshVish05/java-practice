public class First {
	public static void main(String[] args){
		/*
		int a = 10;
		boolean bool = true;
        float s = 7.6f;
		int d = (int)s;

		byte b= 127;
		int bb = (int)b;
		 */
/* 
		for (int i =0; i<10; i++){
			System.out.println(i);
		}*/
/* 
		int j=10;
		while(j<15){
			System.out.println(j);
			j++;
		}*/
		Library lib = new Library();
		Books b1 = new Books();
		b1.bookName="Dumb Witness";
		b1.authorName="Agatha Christie";
		b1.pages=256;

		lib.adding(b1.bookName);

		lib.show();

		// System.out.println(lib);
	}
}
// System.out.println("welcome");
