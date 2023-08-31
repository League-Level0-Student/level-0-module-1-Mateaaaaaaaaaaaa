package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {
		for(int loop=0;  loop<2;   loop+=1) {
			for(int badger=0;   badger<12;   badger+=1) {
				System.out.print("Badger");

				if(  badger<11  ) {

					System.out.print(", ");
				}

			}


			System.out.println();


			for (int mushrooms=0;   mushrooms <2;   mushrooms+=1) {
				System.out.print("Mushrooms");

				if( mushrooms<1 ) {

					System.out.print(", ");

				}
			}
			System.out.println();
			System.out.println();
		}





		System.out.print("A Snake!!!");
	}

}





