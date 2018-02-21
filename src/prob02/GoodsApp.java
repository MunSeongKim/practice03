package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		for(int i = 0; i < COUNT_GOODS; i++){
			String input = scanner.nextLine();
			String[] tmp = input.split(" ");
			
			goods[i] = new Goods(tmp[0], Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
		}
		
		for(Goods g : goods){
			g.showInfo();
		}

		
		scanner.close();
	}
}
