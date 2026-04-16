package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] itemNames = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("商品" + (i + 1) + "を入力してください:>");
			String name = reader.readLine();
			itemNames[i] = name;
		}

		System.out.println("各商品の単価を順に入力してください:");
		int[] prices = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "の単価:>");
			String pricestr = reader.readLine();
			int priceint = Integer.parseInt(pricestr);
			prices[i] = priceint;
		}

		System.out.println("登録商品一覧");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "：" + prices[i] + "円");
		}

	}

}
