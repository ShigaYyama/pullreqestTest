package kadai6;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		String[] hand = { "グー", "チョキ", "パー" };
		String[] count = { "00", "01", "02" };

		System.out.println("じゃんけんを開始します。");
		System.out.println("あなたの手を選んでください。 ");

		for (int i = 0; i < count.length; i++) {

			System.out.println(count[i] + ":" + hand[i]);
		}

		while (true) {
			System.out.println("最初は" + hand[0] + "、じゃんけん");

			User act = new User();

			@SuppressWarnings("resource")
			String num = new java.util.Scanner(System.in).nextLine();

			switch (num) {

			case "00":
				act.name = hand[0];
				act.Win();
				break;

			case "01":
				act.name = hand[1];
				act.Draw();
				continue;

			case "02":
				act.name = hand[2];
				act.Lose();
				break;

			default:
				System.out.println("正しい値が入力されませんでした。システムを終了します。");
				break;
			}
			break;
		}

	}

}
