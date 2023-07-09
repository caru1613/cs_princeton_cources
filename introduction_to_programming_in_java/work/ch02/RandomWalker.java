class RandomWalker {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int x = 0, y = 0;
		int step = 0;

		System.out.println("(" + x + ", " + y + ")");
		while(Math.abs(x) + Math.abs(y) != r) {
			double random = Math.random();
			int direction = ((int)(random * 4)) + 1;

			switch(direction) {
			case 1 : /* Left */
				x -= 1;
				break;
			case 2 : /* Right */
				x += 1;
				break;
			case 3 : /* Up */
				y -= 1;
				break;
			case 4: /* Down */
				y += 1;
				break;
			default:
				System.out.println("Unexpected value");
				System.out.println("Random : " + random);
				System.out.println("direction : " + direction);
				return;
			}
			step += 1;
			System.out.println("(" + x + ", " + y + ")");
		}

		System.out.println("steps = " + step);

	}
}
