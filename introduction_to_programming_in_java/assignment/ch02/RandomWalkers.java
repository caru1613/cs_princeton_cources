class RandomWalkers {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		long i = 0;
		long x, y;
		long step;
		long sum_of_steps = 0;
		double avg_of_steps = 0;
		while(i < trials) {
			x = 0;
			y = 0;
			step = 0;
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
			}
			sum_of_steps += step;
			i++;
		}
		avg_of_steps = (double)sum_of_steps / (double)trials;
		System.out.println("average number of steps = " + avg_of_steps);
	}
}
