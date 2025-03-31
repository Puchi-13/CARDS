
public class animacionMoneda {

	public void ejecutar() throws InterruptedException {

		int i = 0;
		int y = 0;
		int g = 0;
		int h = 0;
		int f = 0;
		int p = 0;
		int u = 0;

		while (i < 10) {
			System.out.println("      ████████      " + "\r\n" + "   ██████████████   " + "\r\n"
					+ "  ████████████████  " + "\r\n" + "  ██████CARA██████  \r\n" + "  ████████████████  \r\n"
					+ "  ████████████████  \r\n" + "   ██████████████   \r\n" + "      ████████      ");

			Thread.sleep(100);

			while (y < 55) {
				System.out.println("");
				y++;
			}

			System.out.println("       ██████        \r\n" + "    ████████████     \r\n" + "   ██████████████    \r\n"
					+ "   ██████████████    \r\n" + "   ██████████████    \r\n" + "   ██████████████    \r\n"
					+ "    ████████████    \r\n" + "      ████████       ");

			Thread.sleep(100);

			while (g < 55) {
				System.out.println("");
				g++;
			}
			System.out.println("        ████        \r\n" + "       ██████       \r\n" + "       ██████       \r\n"
					+ "       ██████       \r\n" + "       ██████       \r\n" + "       ██████       \r\n"
					+ "       ██████       \r\n" + "        ████        ");
			Thread.sleep(100);

			while (h < 55) {
				System.out.println("");
				h++;
			}
			System.out.println("      ████████      \r\n" + "   ██████████████   \r\n" + "  ████████████████  \r\n"
					+ "  ██████CRUZ██████  \r\n" + "  ████████████████  \r\n" + "  ████████████████  \r\n"
					+ "   ██████████████   \r\n" + "      ████████      ");

			Thread.sleep(100);

			while (f < 55) {
				System.out.println("");
				f++;
			}
			System.out.println("       ██████        \r\n" + "    ████████████     \r\n" + "   ██████████████    \r\n"
					+ "   ██████████████    \r\n" + "   ██████████████    \r\n" + "   ██████████████    \r\n"
					+ "    ████████████    \r\n" + "      ████████       ");

			Thread.sleep(100);

			while (p < 55) {
				System.out.println("");
				p++;
			}
			System.out.println("        ████        \r\n" + "       ██████       \r\n" + "       ██████       \r\n"
					+ "       ██████       \r\n" + "       ██████       \r\n" + "       ██████       \r\n"
					+ "       ██████       \r\n" + "        ████        ");
			Thread.sleep(100);

			while (u < 55) {
				System.out.println("");
				u++;
			}
			i++;
			y = 0;
			g = 0;
			h = 0;
			f = 0;
			u = 0;
			p = 0;
		}
		i = 0;

	}

}
