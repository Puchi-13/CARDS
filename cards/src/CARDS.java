import java.util.Scanner;

public class CARDS {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		boolean juegoActivo = true;

		boolean comun1 = false;
		boolean comun2 = false;
		boolean comun3 = false;
		boolean comun4 = false;
		boolean comun5 = false;
		boolean comun6 = false;
		boolean comun7 = false;
		boolean comun8 = false;
		boolean comun9 = false;
		boolean comun10 = false;
		boolean comun11 = false;
		boolean comun12 = false;
		boolean comun13 = false;
		boolean comun14 = false;
		boolean comun15 = false;
		boolean comun16 = false;
		boolean comun17 = false;
		boolean comun18 = false;

		boolean especialSobresaliente1 = false;
		boolean especialSobresaliente2 = false;
		boolean especialSobresaliente3 = false;
		boolean especialSobresaliente4 = false;
		boolean especialSobresaliente5 = false;

		boolean especialReconocimiento1 = false;
		boolean especialReconocimiento2 = false;
		boolean especialReconocimiento3 = false;
		boolean especialReconocimiento4 = false;
		boolean especialReconocimiento5 = false;

		boolean especialMomentum1 = false;
		boolean especialMomentum2 = false;
		boolean especialMomentum3 = false;
		boolean especialMomentum4 = false;
		boolean especialMomentum5 = false;

		boolean fanaticoPOWER1 = false;
		boolean fanaticoPOWER2 = false;
		boolean fanaticoPOWER3 = false;
		boolean fanaticoPOWER4 = false;

		boolean fanaticoMEGA1 = false;
		boolean fanaticoMEGA2 = false;
		boolean fanaticoMEGA3 = false;
		boolean fanaticoMEGA4 = false;

		boolean SOTY1 = false;
		boolean SOTY2 = false;
		boolean SOTY3 = false;
		boolean SOTY4 = false;
		boolean SOTY5 = false;

		boolean diabloRemontada1 = false;
		boolean diabloRemontada2 = false;

		boolean diabloLunar1 = false;
		boolean diabloLunar2 = false;

		boolean flashback1 = false;
		boolean flashback2 = false;

		boolean omega1 = false;

		boolean icono1 = false;
		boolean icono2 = false;
		boolean icono3 = false;
		boolean icono4 = false;
		boolean icono5 = false;
		boolean icono6 = false;
		boolean icono7 = false;
		boolean icono8 = false;
		boolean icono9 = false;

		boolean leyenda1 = false;
		boolean leyenda2 = false;

		boolean unico1 = false;
		boolean unico2 = false;
		boolean unico3 = false;
		boolean unico4 = false;
		boolean unico5 = false;
		boolean unico6 = false;

		String azul = "\033[34m";
		String rojo = "\033[31m";
		String amarillo = "\033[33m";
		String verde = "\033[32m";
		String magenta = "\033[35m";
		String celeste = "\033[36m";
		String blanco = "\033[37m";
		String negro = "\033[30m";

		int aaa = 0;

		int i = 0;
		int y = 0;
		int g = 0;
		int h = 0;
		int f = 0;
		int p = 0;
		int u = 0;

		int ii = 0;
		int yy = 0;
		int gg = 0;
		int hh = 0;
		int ff = 0;
		int pp = 0;
		int uu = 0;

		int iii = 0;
		int iiii = 0;

		int eleccion = 0;

		int eleccionSobres = 0;
		int eleccionProbabilidades = 0;

		int eleccionColeccion = 0;

		int eleccionColeccionComun = 0;
		int eleccionColeccionEspecial = 0;
		int eleccionColeccionFanatico = 0;
		int eleccionColeccionIcono = 0;
		int eleccionColeccionSOTY = 0;
		int eleccionColeccionDiablo = 0;
		int eleccionColeccionFlashback = 0;
		int eleccionColeccionLeyenda = 0;
		int eleccionColeccionUnico = 0;
		int eleccionApuesta = 0;

		int enter = 0;

		double dinero = 50;

		double dineroApostado = 0;
		double dineroApostado2 = 0;
		int eleccionCoinFlip = 0;
		double randomCoinFlip = 0;
		double randomNumeroAzar = 0;

		double randomNumeroCalidad = 0;

		double randomNumeroComun = 0;
		double randomNumeroEspecial = 0;
		double randomNumeroFanaticoPOWER = 0;
		double randomNumeroFanaticoMEGA = 0;
		double randomNumeroIcono = 0;
		double randomNumeroSOTY = 0;
		double randomNumeroDiablo = 0;
		double randomNumeroFlashback = 0;

		int code = 0;
		boolean cupon10001 = false;
		boolean cupon10002 = false;
		boolean cuponLeyenda = false;
		boolean cuponUnico1 = false;
		boolean cuponUnico2 = false;
		boolean cuponUnico3 = false;
		boolean cuponUnico4 = false;
		boolean cuponUnico5 = false;
		boolean cuponUnico6 = false;

		while (aaa < 24) {
			System.out.println("");
			aaa++;
		}
		aaa = 0;
		System.out.println("Pucci Presenta...");
		Thread.sleep(2500);
		while (aaa < 70) {
			System.out.println("");
			aaa++;
		}
		aaa = 0;

		System.out.println(verde + "/==========================================================\\\r\n" + magenta
				+ "|| .' ___  |     / \\     |_   __ \\   |_   _ `. .' ____ \\  ||\r\n" + amarillo
				+ "||/ .'   \\_|    / _ \\      | |__) |    | | `. \\| (___ \\_| ||\r\n" + azul
				+ "||| |          / ___ \\     |  __ /     | |  | | _.____`.  ||\r\n" + rojo
				+ "||\\ `.___.'\\ _/ /   \\ \\_  _| |  \\ \\_  _| |_.' /| \\____) | ||\r\n" + celeste
				+ "|| `.____ .'|____| |____||____| |___||______.'  \\______.' ||\r\n" + blanco
				+ "\\======================================================V1.3/\u001B[0m");
		Thread.sleep(5000);

		while (aaa < 70) {
			System.out.println("");
			aaa++;
		}
		aaa = 0;

		while (juegoActivo == true) {

			System.out.println(verde + "/==========================================================\\\r\n" + magenta
					+ "|| .' ___  |     / \\     |_   __ \\   |_   _ `. .' ____ \\  ||\r\n" + amarillo
					+ "||/ .'   \\_|    / _ \\      | |__) |    | | `. \\| (___ \\_| ||\r\n" + azul
					+ "||| |          / ___ \\     |  __ /     | |  | | _.____`.  ||\r\n" + rojo
					+ "||\\ `.___.'\\ _/ /   \\ \\_  _| |  \\ \\_  _| |_.' /| \\____) | ||\r\n" + celeste
					+ "|| `.____ .'|____| |____||____| |___||______.'  \\______.' ||\r\n" + blanco
					+ "\\======================================================V1.3/\u001B[0m");
			System.out.println("                 _____             _____ \r\n"
					+ "                ( ___ )-----------( ___ )\r\n" + "                 |   |             |   | \r\n"
					+ "                 |   | 1-SOBRES    |   | \r\n" + "                 |   | 2-COLECCIÓN |   | \r\n"
					+ "                 |   | 3-CASINO    |   | \r\n" + "                 |___|             |___| \r\n"
					+ "                (_____)-----------(_____)");

			eleccion = sc.nextInt();

			if (eleccion == 1) {
				while (aaa < 70) {
					System.out.println("");
					aaa++;
				}
				aaa = 0;

				System.out.println(rojo + "███████████████████████████████████" + blanco
						+ " ███████████████████████████████████████████████████████████\r\n" + rojo
						+ "█▌  / __/ __ \\/ _ )/ _ \\/ __/ __/▐█ " + blanco + "██" + azul
						+ "NUEVAS CARTAS SOTY (500 EUR de valor)                  " + blanco + "██\r\n" + rojo
						+ "█▌ _\\ \\/ /_/ / _  / , _/ _/_\\ \\  ▐█ \u001B[0m██" + magenta
						+ "ACTUALIZACION DE LAS FANATICO: CARTAS " + celeste + "𝓜𝓔𝓖𝓐\u001B[0m--->50€     ██\r\n"
						+ rojo + "█▌/___/\\____/____/_/|_/___/___/  ▐█ \u001B[0m██" + rojo
						+ "ACTUALIZACION DE LAS DIABLO: CARTAS" + azul + " 𝕷𝖀𝕹𝕬𝕽\u001B[0m--->1500€    ██\r\n"
						+ rojo + "███████████████████████████████████ " + blanco
						+ "███████████████████████████████████████████████████████████\u001B[0m");
				System.out.println("Tienes " + dinero + "€, ¿qué sobre quieres abrir?");
				System.out.println("");
				System.out.println("0.Probabilidades(%)\u001B[0m");
				System.out.println("");
				System.out.println(
						"1." + amarillo + "Sobre Revolución\u001B[0m (" + rojo + "回転\u001B[0m)--->20€\u001B[0m");
				System.out.println("2." + amarillo + "Sobre" + azul + " Tiburón\u001B[0m (" + amarillo + "サ" + azul
						+ "メ\u001B[0m)--->50€\u001B[0m");
				System.out.println("3." + azul + "Sobre " + rojo + "Tigre\u001B[0m (" + azul + "ト" + rojo
						+ "ラ\u001B[0m)--->50€\u001B[0m");
				System.out.println("4." + rojo + "Sobre " + celeste + "Vida\u001B[0m (" + rojo + "人" + celeste
						+ "生\u001B[0m)--->50€\u001B[0m");
				System.out.println("5." + celeste + "Sobre " + blanco + "Oscuro\u001B[0m (" + celeste + "暗" + blanco
						+ "い\u001B[0m)--->50€\u001B[0m");
				System.out.println("6." + rojo + "Sobre\u001B[0m Suerte (" + rojo + "運\u001B[0m)--->2000€");

				System.out.println("");
				System.out.println(blanco
						+ "███████████████████████████████████████████████████████████████████████████████████████████████\r\n"
						+ "█" + amarillo
						+ "LOS ICONOS HAN ATERRIZADO !! Desbloquea a los alumnos iconicos de los cursos pasados."
						+ blanco + "        █\r\n" + "█" + rojo + "ゲーム作成者はこのゲームを作成するために必要なライセンスをすべて持っています (嘘)." + blanco
						+ "                            █\r\n" + "█¿Quieres desbloquear a las dos " + amarillo + "伝説"
						+ blanco + " del juego? Paga 4.99€ (" + rojo + "リアルマネー" + blanco
						+ ") al desarrollador.       █\r\n"
						+ "███████████████████████████████████████████████████████████████████████████████████████████████\r\n"
						+ "\u001B[0m");

				eleccionSobres = sc.nextInt();

				if (eleccionSobres == 0) {

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}

					aaa = 0;

					System.out.println(
							"╔──────────────────────────────────────────────────────────────────────────────╗\r\n"
									+ "│_____ _____  _____  ____   ___  ____  __ __    __ _____  ___  _____ _____   __│\r\n"
									+ "│||_// ||_// ((   )) ||=)  ||=|| ||=)  || ||    || ||  ) ||=|| ||  ) ||==   (( │\r\n"
									+ "│||    || \\\\  \\\\_//  ||_)) || || ||_)) || ||__| || ||_// || || ||_// ||___ \\_))│\r\n"
									+ "╚──────────────────────────────────────────────────────────────────────────────╝");

					System.out.println("¿De qué sobre quieres saber las probabilidades?");
					System.out.println("");
					System.out.println("0.Ayuda");
					System.out.println("");
					System.out.println("1." + amarillo + "Sobre Revolución\u001B[0m (" + rojo + "回転\u001B[0m)");
					System.out.println("2." + amarillo + "Sobre" + azul + " Tiburón\u001B[0m (" + amarillo + "サ" + azul
							+ "メ\u001B[0m)");
					System.out.println(
							"3." + azul + "Sobre " + rojo + "Tigre\u001B[0m (" + azul + "ト" + rojo + "ラ\u001B[0m)");
					System.out.println("4." + rojo + "Sobre " + celeste + "Vida\u001B[0m (" + rojo + "人" + celeste
							+ "生\u001B[0m)");
					System.out.println("5." + celeste + "Sobre " + blanco + "Oscuro\u001B[0m (" + celeste + "暗" + blanco
							+ "い\u001B[0m)");
					System.out.println("6." + rojo + "Sobre\u001B[0m Suerte (" + rojo + "運\u001B[0m)");
					eleccionProbabilidades = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}

					aaa = 0;

					if (eleccionProbabilidades == 0) {

						System.out.println("0.Ayuda.");
						System.out.println("");
						System.out.println("El juego consiste en colecionar cartas y conseguirlas todas.");
						System.out.println(
								"Cada carta tiene su media (el número grande en la parte de arriba cuanto más alta sea, más poderosa será).");
						System.out.println(
								"La media se calcula mediante la suma de 5 a la divisón de la suma de las 6 estadísticas:");
						System.out.println("Es decir: (suma de las 6 estadísticas / 6) + 5");
						System.out.println(
								"(La mayoría de las cartas que tienen más de 99 de media se quedan con 99 de media).");
						System.out.println(
								"Finalmente, queda determiar como se han calculado cada una de las 6 estadísticas:");
						System.out.println("");
						System.out.println(
								"EST>>>ESTUDIOS>>El número de estudios será más alto si el alumno saca notas con puntuación elevada.");
						System.out.println(
								"POP>>>POPULARIDAD>>>El número de popularidad será más alto si el alumno es reconocido por la gente del instituto y/o conoce a mucha gente.");
						System.out.println(
								"MNT>>>MOMENTO>>>El número de momento será más alto si al alumno le trata bien la vida y es afortunado por lo que tiene.");
						System.out.println(
								"HOB>>>HOBBIES>>>El número de hobbies será más alto si el alumno tiene muchas actividades extraescolares y/o sabe hacer múltiples actividades.");
						System.out.println(
								"BON>>>BONDAD>>>El número de bondad será más alto si el alumno trata con amabilidad y respeto al resto de gente.");
						System.out.println(
								"SUE>>>SUERTE>>>El número de suerte será más alto si el alumno es muy afortunado por su vida, por sus acciones, ... (es una cifra más aleatoria).");

						enter = sc.nextInt();

						if (enter >= 0) {

						}

						else {

						}
						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

					} else if (eleccionProbabilidades == 1) {

						System.out.println("1." + amarillo + "Sobre Revolución\u001B[0m (" + rojo + "回転\u001B[0m)");
						System.out.println("");
						System.out.println(amarillo + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
								+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
								+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
								+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
								+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
								+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
								+ "..::.:-" + rojo + "回" + amarillo + "██" + rojo + "転" + amarillo
								+ ".-::.:. \u001B[0m");
						System.out.println("");
						System.out.println("█C█--->50%");
						System.out
								.println(verde + "█E█--->25%\u001B[0m--->(" + magenta + "8,33% Sobresaliente\u001B[0m,"
										+ azul + "8,33% Reconocimiento\u001B[0m," + rojo + "8,33% Momentum\u001B[0m)");
						System.out.println(magenta + "█F█--->23%\u001B[0m--->(" + magenta + "15% POWER\u001B[0m,"
								+ celeste + "8% 𝓜𝓔𝓖𝓐\u001B[0m)");
						System.out.println(amarillo + "█I█--->2%\u001B[0m");
						System.out.println("");
						System.out.println("(Introduce cualquier número para voler)");
						enter = sc.nextInt();

						if (enter >= 0) {

						}

						else {

						}
						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

					}

					else if (eleccionProbabilidades == 2) {

						System.out.println("2." + amarillo + "Sobre" + azul + " Tiburón\u001B[0m (" + amarillo + "サ"
								+ azul + "メ\u001B[0m)");
						System.out.println("");
						System.out.println(amarillo + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
								+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
								+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
								+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
								+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
								+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
								+ "..::.:-" + rojo + "サ" + azul + "██" + rojo + "メ" + amarillo + ".-::.:. \u001B[0m");
						System.out.println("");
						System.out.println("█C█--->50%");
						System.out
								.println(verde + "█E█--->25%\u001B[0m--->(" + magenta + "8,33% Sobresaliente\u001B[0m,"
										+ azul + "8,33% Reconocimiento\u001B[0m," + rojo + "8,33% Momentum\u001B[0m)");
						System.out.println(magenta + "█F█--->22%\u001B[0m--->(" + magenta + "15% POWER\u001B[0m,"
								+ celeste + "7% 𝓜𝓔𝓖𝓐\u001B[0m)");
						System.out.println(amarillo + "█I█--->2%\u001B[0m");
						System.out.println(azul + "█S█--->1%\u001B[0m");
						System.out.println("");
						System.out.println("(Introduce cualquier número para voler)");
						enter = sc.nextInt();

						if (enter >= 0) {

						}

						else {

						}
						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

					}

					else if (eleccionProbabilidades == 3) {

						System.out.println(
								"3." + azul + "Sobre " + rojo + "Tigre\u001B[0m (" + azul + "ト" + rojo + "ラ\u001B[0m)");
						System.out.println("");
						System.out.println(azul + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
								+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
								+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
								+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
								+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
								+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
								+ "..::.:-" + amarillo + "ト" + rojo + "██" + amarillo + "ラ" + azul
								+ ".-::.:. \u001B[0m");
						System.out.println("");
						System.out.println("█C█--->50%");
						System.out
								.println(verde + "█E█--->25%\u001B[0m--->(" + magenta + "8,33% Sobresaliente\u001B[0m,"
										+ azul + "8,33% Reconocimiento\u001B[0m," + rojo + "8,33% Momentum\u001B[0m)");
						System.out.println(magenta + "█F█--->23.5%\u001B[0m--->(" + magenta + "15% POWER\u001B[0m,"
								+ celeste + "8.5% 𝓜𝓔𝓖𝓐\u001B[0m)");
						System.out.println(azul + "█S█--->1%\u001B[0m");
						System.out.println(rojo + "█D█--->0.5%\u001B[0m");
						System.out.println("");
						System.out.println("(Introduce cualquier número para voler)");
						enter = sc.nextInt();

						if (enter >= 0) {

						}

						else {

						}
						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

					}

					else if (eleccionProbabilidades == 4) {

						System.out.println("4." + rojo + "Sobre " + celeste + "Vida\u001B[0m (" + rojo + "人" + celeste
								+ "生\u001B[0m)");
						System.out.println("");
						System.out.println(rojo + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
								+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
								+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
								+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
								+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
								+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
								+ "..::.:-" + amarillo + "人" + celeste + "██" + amarillo + "生" + rojo
								+ ".-::.:. \u001B[0m");
						System.out.println("");
						System.out.println("█C█--->50%");
						System.out
								.println(verde + "█E█--->25%\u001B[0m--->(" + magenta + "8,33% Sobresaliente\u001B[0m,"
										+ azul + "8,33% Reconocimiento\u001B[0m," + rojo + "8,33% Momentum\u001B[0m)");
						System.out.println(magenta + "█F█--->24.25%\u001B[0m--->(" + magenta + "15% POWER\u001B[0m,"
								+ celeste + "9.25% 𝓜𝓔𝓖𝓐\u001B[0m)");
						System.out.println(rojo + "█D█--->0.5%\u001B[0m");
						System.out.println(celeste + "█B█--->0.25%\u001B[0m");
						System.out.println("");
						System.out.println("(Introduce cualquier número para voler)");
						enter = sc.nextInt();

						if (enter >= 0) {

						}

						else {

						}
						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

					}

					else if (eleccionProbabilidades == 5) {

						System.out.println("5." + celeste + "Sobre " + blanco + "Oscuro\u001B[0m (" + celeste + "暗"
								+ blanco + "い\u001B[0m)");
						System.out.println("");
						System.out.println(celeste + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
								+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
								+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
								+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
								+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
								+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
								+ "..::.:-" + amarillo + "暗" + blanco + "██" + amarillo + "い" + celeste
								+ ".-::.:.. \u001B[0m");
						System.out.println("");
						System.out.println("█C█--->50%");
						System.out
								.println(verde + "█E█--->25%\u001B[0m--->(" + magenta + "8,33% Sobresaliente\u001B[0m,"
										+ azul + "8,33% Reconocimiento\u001B[0m," + rojo + "8,33% Momentum\u001B[0m)");
						System.out.println(magenta + "█F█--->24.65%\u001B[0m--->(" + magenta + "15% POWER\u001B[0m,"
								+ celeste + "9.65% 𝓜𝓔𝓖𝓐\u001B[0m)");
						System.out.println(celeste + "█B█--->0.25%\u001B[0m");
						System.out.println(blanco + "█" + amarillo + "O" + blanco + "█--->0.1%\u001B[0m");
						System.out.println("");
						System.out.println("(Introduce cualquier número para voler)");
						enter = sc.nextInt();

						if (enter >= 0) {

						}

						else {

						}
						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

					}

					else if (eleccionProbabilidades == 6) {

						System.out.println("6." + rojo + "Sobre\u001B[0m Suerte (" + rojo + "運\u001B[0m)");
						System.out.println("");
						System.out.println(rojo + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
								+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
								+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
								+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
								+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
								+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
								+ "..::.:-" + blanco + "運" + rojo + "██" + blanco + "運" + rojo + ".-::.:.. \u001B[0m");
						System.out.println("");
						System.out.println("█C█--->90%");
						System.out.println(amarillo + "█I█--->5%\u001B[0m");
						System.out.println(azul + "█S█--->3%\u001B[0m");
						System.out.println(rojo + "█D█--->1%\u001B[0m");
						System.out.println(celeste + "█B█--->0.75%\u001B[0m");
						System.out.println(blanco + "█" + amarillo + "O" + blanco + "█--->0.25%\u001B[0m");
						System.out.println("");
						System.out.println("(Introduce cualquier número para voler)");
						enter = sc.nextInt();

						if (enter >= 0) {

						}

						else {

						}
						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
						System.out.println("Error");
					}

				}

				else if (eleccionSobres == 1 && dinero >= 20) {

					dinero = dinero - 20;

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					System.out.println(amarillo + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
							+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
							+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
							+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
							+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
							+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
							+ "..::.:-" + rojo + "回" + amarillo + "██" + rojo + "転" + amarillo + ".-::.:. \u001B[0m");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(amarillo + "..::::---██--::::::.\r\n" + "..:-=++*#██*=-----:.\r\n"
							+ ".:+-:=#%#██+======:.\r\n" + ".:+--==+*██+=+====:.\r\n" + ".:-==::+*██+==--+=:.\r\n"
							+ ".-=-===#*██=++#**=.\r\n" + ".=###++*=██=*#=%**=.\r\n" + ".-*%#***#██%%++*#=.\r\n"
							+ ".:......-██%#+=++-=.\r\n" + ".....:..:██+##+=%%=.\r\n" + ".:+=++-:=██%%##@%%=.\r\n"
							+ ".:=+*=--=██*%%=%%%=.\r\n" + ".:======+██=+**#%#-.\r\n" + ".--=*+*+=██====-=+:.\r\n"
							+ ".---=::=+██==+=::::.\r\n" + "..:-*+#%%██+=++=-::.\r\n" + "..=--+*##██*+====--.\r\n"
							+ "..::.:-" + rojo + "回  " + rojo + "転" + amarillo + ".-::.:.\u001B[0m ");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(amarillo + ".::::--█    █-:::::\r\n" + ".:-=++*█    █=-----\r\n"
							+ ":+-:=#%█    █======\r\n" + ":+--==+█    █=+====\r\n" + ":-==::+█    █==--+=\r\n"
							+ "-=-===#█    █=++#**\r\n" + "=###++*█    █*#=%**\r\n" + ".-*#***█    █%%++*#\r\n"
							+ ".:.....█    █#+=++-\r\n" + "....:..█    █##+=%%\r\n" + ".:+=+-:█    █%##@%%\r\n"
							+ ".:=+=--█    █%%=%%%\r\n" + ".:=====█    █+**#%#\r\n" + ".--=+*+█    █===-=+\r\n"
							+ ".---=:=█    █=+=:::\r\n" + "..:-+#%█    █=++=-:\r\n" + "..=-+*#█    █*+====\r\n"
							+ "..:.:" + rojo + "回\u001B[0m      " + rojo + "転" + amarillo + ".-::. \u001B[0m");

					randomNumeroCalidad = Math.random();
					Thread.sleep(1000);

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (randomNumeroCalidad >= 0.5) {

						animacionComun AnimacionComun = new animacionComun();
						AnimacionComun.ejecutar();

						Thread.sleep(1500);
						randomNumeroComun = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroComun >= 0.94444) {

							System.out.println("                      \r\n" + "    ............     \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     .  \r\n"
									+ " .{ {} } / /      .  \r\n" + " .{ {} }{ {} }    .  \r\n"
									+ " . `--'  `--'     .  \r\n" + " .                .  \r\n"
									+ " ..................  \r\n" + " .....--PUCCI-.....  \r\n"
									+ " ..................  \r\n" + " ..EST-51..HOB-89..  \r\n"
									+ " ..POP-90..BON-86..  \r\n" + " ..MNT-89..SUE-80..  \r\n"
									+ "   ......==......    \r\n" + "        ....         \r\n"
									+ "                      ");
							Thread.sleep(1500);
							if (comun1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección.");
								comun1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.88888) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--MARCOS--.... \r\n"
									+ " .................. \r\n" + " ..EST-56..HOB-86.. \r\n"
									+ " ..POP-63..BON-93.. \r\n" + " ..MNT-87..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....    \r\n" + "");
							Thread.sleep(1500);
							if (comun2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.83332) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--JAVIER--.... \r\n"
									+ " .................. \r\n" + " ..EST-81..HOB-79.. \r\n"
									+ " ..POP-80..BON-87.. \r\n" + " ..MNT-73..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....     \r\n" + "");
							Thread.sleep(1500);
							if (comun3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.77776) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GABO--..... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-91.. \r\n"
									+ " ..POP-48..BON-91.. \r\n" + " ..MNT-70..SUE-72.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.7222) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JAUME—..... \r\n"
									+ " .................. \r\n" + " ..EST-60..HOB-92.. \r\n"
									+ " ..POP-78..BON-84.. \r\n" + " ..MNT-72..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.66664) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .--.     . \r\n"
									+ " .{ {} }{ {} }    . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IZAN--..... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-91..BON-84.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.61108) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---. .---.     . \r\n"
									+ " .`-`} }`-`} }    . \r\n" + " .  / /   / /     . \r\n"
									+ " . `-'   `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-65.. \r\n"
									+ " ..POP-39..BON-78.. \r\n" + " ..MNT-70..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.55552) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " .{ {} }' `-' '   . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-94..HOB-69.. \r\n"
									+ " ..POP-48..BON-82.. \r\n" + " ..MNT-71..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.49996) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---`     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IVÁN--..... \r\n"
									+ " .................. \r\n" + " ..EST-77..HOB-62.. \r\n"
									+ " ..POP-93..BON-80.. \r\n" + " ..MNT-82..SUE-75.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.4444) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--BRUNO—..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-73.. \r\n"
									+ " ..POP-83..BON-89.. \r\n" + " ..MNT-78..SUE-70.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun10 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun10 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.38884) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IKER--..... \r\n"
									+ " .................. \r\n" + " ..EST-83..HOB-81.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun11 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun11 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.33328) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--LUIS--..... \r\n"
									+ " .................. \r\n" + " ..EST-53..HOB-74.. \r\n"
									+ " ..POP-89..BON-84.. \r\n" + " ..MNT-79..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun12 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun12 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.27772) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--NACHO—..... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-70.. \r\n"
									+ " ..POP-87..BON-89.. \r\n" + " ..MNT-75..SUE-85.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun13 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun13 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.22216) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }  / /     . \r\n"
									+ " . `--'  `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JOSE--..... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-78.. \r\n"
									+ " ..POP-84..BON-86.. \r\n" + " ..MNT-72..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun14 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun14 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.1666) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GAEL--..... \r\n"
									+ " .................. \r\n" + " ..EST-64..HOB-79.. \r\n"
									+ " ..POP-86..BON-90.. \r\n" + " ..MNT-90..SUE-77.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun15 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun15 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.11104) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---.  .--.     . \r\n"
									+ " .`-`} }{ {} }    . \r\n" + " .  / / { {} }    . \r\n"
									+ " . `-'   `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--ALEJANDRO-... \r\n"
									+ " .................. \r\n" + " ..EST-41..HOB-95.. \r\n"
									+ " ..POP-79..BON-80.. \r\n" + " ..MNT-70..SUE-71.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun16 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun16 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.05548) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--FERRÁN--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-72.. \r\n"
									+ " ..POP-84..BON-85.. \r\n" + " ..MNT-89..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun17 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun17 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' '   . \r\n"
									+ " . `-'   `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-97..HOB-80.. \r\n"
									+ " ..POP-86..BON-82.. \r\n" + " ..MNT-84..SUE-81.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);

							if (comun18 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun18 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

					}

					else if (randomNumeroCalidad >= 0.25) {

						animacionEspecial AnimacionEspecial = new animacionEspecial();
						AnimacionEspecial.ejecutar();

						Thread.sleep(1500);
						randomNumeroEspecial = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroEspecial >= 0.93333333334) {

							System.out.println(magenta + "Sobresaliente\u001B[0m");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .--.     . \r\n" + " .{ {} }{ {} }    . \r\n"
											+ " .{ {} } `/ /   " + magenta + " █" + verde + ". \r\n" + " . `--'  `-'  "
											+ magenta + "  ██" + verde + ". \r\n" + " .            " + magenta + "████"
											+ verde + ". \r\n" + " .................. \r\n" + " .....--GABO--..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-93.. \r\n"
											+ " ..POP-53..BON-95.. \r\n" + " ..MNT-80..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.86666666668) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'    `-'  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-74.. \r\n"
									+ " ..POP-49..BON-82.. \r\n" + " ..MNT-79..SUE-89.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.80000000002) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'  `--'   " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-79.. \r\n"
									+ " ..POP-58..BON-85.. \r\n" + " ..MNT-79..SUE-87.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.73333333336) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n" + " . `/ / | }   "
											+ magenta + "   █" + verde + ". \r\n" + " . `-'  `-'     " + magenta + "██"
											+ verde + ". \r\n" + " .            " + magenta + "████" + verde + ". \r\n"
											+ " .................. \r\n" + " .....--BRUNO-..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-78.. \r\n"
											+ " ..POP-86..BON-91.. \r\n" + " ..MNT-79..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.6666666667) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `-'  `----`  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-84.. \r\n"
									+ " ..POP-89..BON-86.. \r\n" + " ..MNT-87..SUE-83.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.60000000004) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-59..HOB-89.. \r\n"
											+ " ..POP-99..BON-90.. \r\n" + " ..MNT-91..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.53333333338) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + azul + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--JAVIER--.... \r\n"
											+ " .................. \r\n" + " ..EST-88..HOB-82.. \r\n"
											+ " ..POP-90..BON-94.. \r\n" + " ..MNT-76..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.46666666672) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-87.. \r\n"
											+ " ..POP-99..BON-88.. \r\n" + " ..MNT-89..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.40000000006) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--JAUME-..... \r\n"
											+ " .................. \r\n" + " ..EST-67..HOB-91.. \r\n"
											+ " ..POP-88..BON-86.. \r\n" + " ..MNT-80..SUE-95.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.3333333334) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " .{ {} }  / /    " + azul + "█" + verde + ". \r\n" + " . `--'  `-'    "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IVÁN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-68.. \r\n"
											+ " ..POP-99..BON-83.. \r\n" + " ..MNT-85..SUE-77.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.26666666674) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-60..HOB-91.. \r\n"
											+ " ..POP-96..BON-92.. \r\n" + " ..MNT-99..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.20000000008) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + rojo + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IKER--..... \r\n"
											+ " .................. \r\n" + " ..EST-87..HOB-84.. \r\n"
											+ " ..POP-84..BON-81.. \r\n" + " ..MNT-96..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.13333333342) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--FERRÁN--.... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-76.. \r\n"
											+ " ..POP-89..BON-87.. \r\n" + " ..MNT-99..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.06666666676) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--MARCOS--.... \r\n"
											+ " .................. \r\n" + " ..EST-65..HOB-93.. \r\n"
											+ " ..POP-72..BON-97.. \r\n" + " ..MNT-97..SUE-88.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\n\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-..-.    . \r\n" + " .{ {} }| || |    . \r\n"
											+ " . `/ /  `-| }   " + rojo + "█" + verde + ". \r\n" + " . `-'     `-'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-91.. \r\n"
											+ " ..POP-95..BON-89.. \r\n" + " ..MNT-96..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.1) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoPOWER = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoPOWER >= 0.75) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--.  .---.   █. \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' ' ██. \r\n"
									+ " . `-'   `---' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--𝒩𝒜𝒞ℋ𝒪--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-86.. \r\n"
									+ " ..POP-79..BON-88.. \r\n" + " ..MNT-90..SUE-93.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoPOWER >= 0.50) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .---.    █. \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  ██. \r\n"
									+ " . `-'  `----` ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--ℱℰℛℛ𝒜𝒩-.... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-79.. \r\n"
									+ " ..POP-90..BON-92.. \r\n" + " ..MNT-98..SUE-82.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0.25) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'    ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--ℐ𝒱𝒜𝒩-..... \r\n"
									+ " .................. \r\n" + " ..EST-87..HOB-71.. \r\n"
									+ " ..POP-99..BON-89.. \r\n" + " ..MNT-90..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--𝒥𝒪𝒮ℰ--..... \r\n"
									+ " .................. \r\n" + " ..EST-90..HOB-86.. \r\n"
									+ " ..POP-93..BON-96.. \r\n" + " ..MNT-81..SUE-88.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.02) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoMEGA = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoMEGA >= 0.75) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓛𝓤𝓘𝓢" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "78" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "98" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "92" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "89" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "83" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.5) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ....--" + celeste
									+ "𝓙𝓐𝓥𝓘𝓔𝓡" + magenta + "--.... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "96" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "91" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "94" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "93" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "80" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoMEGA2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.25) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ..--" + celeste
									+ "𝓐𝓛𝓔𝓙𝓐𝓝𝓓𝓡𝓞" + magenta + "--.. \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "71" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "90" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "88" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "92" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓖𝓐𝓔𝓛" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "74" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "83" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "99" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "98" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad < 0.02) {

						animacionIcono AnimacionIcono = new animacionIcono();
						AnimacionIcono.ejecutar();

						Thread.sleep(1500);
						randomNumeroIcono = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroIcono >= 0.88888888889) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....-ENRIQUE--.... \r\n"
									+ " .................. \r\n" + " ..EST-87..HOB-87.. \r\n"
									+ " ..POP-81..BON-98.. \r\n" + " ..MNT-91..SUE-91.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}

						}

						else if (randomNumeroIcono >= 0.77777777778) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " .....--XEMA--..... \r\n"
									+ " .................. \r\n" + " ..EST-67..HOB-85.. \r\n"
									+ " ..POP-97..BON-80.. \r\n" + " ..MNT-93..SUE-94.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.66666666667) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--MIGUEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-97.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-88..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.55555555556) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--HECTOR--.... \r\n"
									+ " .................. \r\n" + " ..EST-63..HOB-84.. \r\n"
									+ " ..POP-95..BON-87.. \r\n" + " ..MNT-94..SUE-92.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.44444444445) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--BRANDON-.... \r\n"
									+ " .................. \r\n" + " ..EST-71..HOB-92.. \r\n"
									+ " ..POP-92..BON-76.. \r\n" + " ..MNT-88..SUE-97.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.33333333334) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .---.    █. \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / { {.-.  ██. \r\n"
									+ " . `-'   `---'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--SALAZAR-.... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-94.. \r\n"
									+ " ..POP-94..BON-86.. \r\n" + " ..MNT-90..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.22222222223) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--JORGE--..... \r\n"
									+ " .................. \r\n" + " ..EST-69..HOB-93.. \r\n"
									+ " ..POP-91..BON-98.. \r\n" + " ..MNT-87..SUE-93.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.11111111112) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--.  .---.   █. \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' ' ██. \r\n"
									+ " . `-'   `---'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--MANUEL-..... \r\n"
									+ " .................. \r\n" + " ..EST-71..HOB-92.. \r\n"
									+ " ..POP-79..BON-91.. \r\n" + " ..MNT-80..SUE-95.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ......--PAU-...... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-81..BON-89.. \r\n" + " ..MNT-93..SUE-92.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

					}

					System.out.println(
							"---------------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("(Introduce cualquier número para voler)");
					enter = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

				}

				else if (eleccionSobres == 2 && dinero >= 50) {

					dinero = dinero - 50;

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					System.out.println(amarillo + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
							+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
							+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
							+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
							+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
							+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
							+ "..::.:-" + rojo + "サ" + azul + "██" + rojo + "メ" + amarillo + ".-::.:. \u001B[0m");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(amarillo + "..::::---" + azul + "██" + amarillo + "--::::::.\r\n" + "..:-=++*#"
							+ azul + "██" + amarillo + "*=-----:.\r\n" + ".:+-:=#%#" + azul + "██" + amarillo
							+ "+======:.\r\n" + ".:+--==+*" + azul + "██" + amarillo + "+=+====:.\r\n" + ".:-==::+*"
							+ azul + "██" + amarillo + "+==--+=:.\r\n" + ".-=-===#*" + azul + "██" + amarillo
							+ "=++#**=.\r\n" + ".=###++*=" + azul + "██" + amarillo + "=*#=%**=.\r\n" + ".-*%#***#"
							+ azul + "██" + amarillo + "%%++*#=.\r\n" + ".:......-" + azul + "██" + amarillo
							+ "%#+=++-=.\r\n" + ".....:..:" + azul + "██" + amarillo + "+##+=%%=.\r\n" + ".:+=++-:="
							+ azul + "██" + amarillo + "%%##@%%=.\r\n" + ".:=+*=--=" + azul + "██" + amarillo
							+ "*%%=%%%=.\r\n" + ".:======+" + azul + "██" + amarillo + "=+**#%#-.\r\n" + ".--=*+*+="
							+ azul + "██" + amarillo + "====-=+:.\r\n" + ".---=::=+" + azul + "██" + amarillo
							+ "==+=::::.\r\n" + "..:-*+#%%" + azul + "██" + amarillo + "+=++=-::.\r\n" + "..=--+*##"
							+ azul + "██" + amarillo + "*+====--.\r\n" + "...::.:-" + rojo + "サ  " + rojo + "メ"
							+ amarillo + ".-::.:.\u001B[0m ");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(amarillo + ".::::--" + azul + "█    █" + amarillo + "-:::::\r\n" + ".:-=++*"
							+ azul + "█    █" + amarillo + "=-----\r\n" + ":+-:=#%" + azul + "█    █" + amarillo
							+ "======\r\n" + ":+--==+" + azul + "█    █" + amarillo + "=+====\r\n" + ":-==::+" + azul
							+ "█    █" + amarillo + "==--+=\r\n" + "-=-===#" + azul + "█    █" + amarillo + "=++#**\r\n"
							+ "=###++*" + azul + "█    █" + amarillo + "*#=%**\r\n" + ".-*#***" + azul + "█    █"
							+ amarillo + "%%++*#\r\n" + ".:....." + azul + "█    █" + amarillo + "#+=++-\r\n"
							+ "....:.." + azul + "█    █" + amarillo + "##+=%%\r\n" + ".:+=+-:" + azul + "█    █"
							+ amarillo + "%##@%%\r\n" + ".:=+=--" + azul + "█    █" + amarillo + "%%=%%%\r\n"
							+ ".:=====" + azul + "█    █" + amarillo + "+**#%#\r\n" + ".--=+*+" + azul + "█    █"
							+ amarillo + "===-=+\r\n" + ".---=:=" + azul + "█    █" + amarillo + "=+=:::\r\n"
							+ "..:-+#%" + azul + "█    █" + amarillo + "=++=-:\r\n" + "..=-+*#" + azul + "█    █"
							+ amarillo + "*+====\r\n" + "..:..:" + rojo + "サ\u001B[0m      " + rojo + "メ" + amarillo
							+ ".-::. \u001B[0m");

					randomNumeroCalidad = Math.random();
					Thread.sleep(1000);

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (randomNumeroCalidad >= 0.5) {

						animacionComun AnimacionComun = new animacionComun();
						AnimacionComun.ejecutar();

						Thread.sleep(1500);
						randomNumeroComun = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroComun >= 0.94444) {

							System.out.println("                      \r\n" + "    ............     \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     .  \r\n"
									+ " .{ {} } / /      .  \r\n" + " .{ {} }{ {} }    .  \r\n"
									+ " . `--'  `--'     .  \r\n" + " .                .  \r\n"
									+ " ..................  \r\n" + " .....--PUCCI-.....  \r\n"
									+ " ..................  \r\n" + " ..EST-51..HOB-89..  \r\n"
									+ " ..POP-90..BON-86..  \r\n" + " ..MNT-89..SUE-80..  \r\n"
									+ "   ......==......    \r\n" + "        ....         \r\n"
									+ "                      ");
							Thread.sleep(1500);
							if (comun1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección.");
								comun1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.88888) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--MARCOS--.... \r\n"
									+ " .................. \r\n" + " ..EST-56..HOB-86.. \r\n"
									+ " ..POP-63..BON-93.. \r\n" + " ..MNT-87..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....    \r\n" + "");
							Thread.sleep(1500);
							if (comun2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.83332) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--JAVIER--.... \r\n"
									+ " .................. \r\n" + " ..EST-81..HOB-79.. \r\n"
									+ " ..POP-80..BON-87.. \r\n" + " ..MNT-73..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....     \r\n" + "");
							Thread.sleep(1500);
							if (comun3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.77776) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GABO--..... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-91.. \r\n"
									+ " ..POP-48..BON-91.. \r\n" + " ..MNT-70..SUE-72.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.7222) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JAUME—..... \r\n"
									+ " .................. \r\n" + " ..EST-60..HOB-92.. \r\n"
									+ " ..POP-78..BON-84.. \r\n" + " ..MNT-72..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.66664) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .--.     . \r\n"
									+ " .{ {} }{ {} }    . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IZAN--..... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-91..BON-84.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.61108) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---. .---.     . \r\n"
									+ " .`-`} }`-`} }    . \r\n" + " .  / /   / /     . \r\n"
									+ " . `-'   `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-65.. \r\n"
									+ " ..POP-39..BON-78.. \r\n" + " ..MNT-70..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.55552) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " .{ {} }' `-' '   . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-94..HOB-69.. \r\n"
									+ " ..POP-48..BON-82.. \r\n" + " ..MNT-71..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.49996) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---`     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IVÁN--..... \r\n"
									+ " .................. \r\n" + " ..EST-77..HOB-62.. \r\n"
									+ " ..POP-93..BON-80.. \r\n" + " ..MNT-82..SUE-75.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.4444) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--BRUNO—..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-73.. \r\n"
									+ " ..POP-83..BON-89.. \r\n" + " ..MNT-78..SUE-70.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun10 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun10 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.38884) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IKER--..... \r\n"
									+ " .................. \r\n" + " ..EST-83..HOB-81.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun11 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun11 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.33328) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--LUIS--..... \r\n"
									+ " .................. \r\n" + " ..EST-53..HOB-74.. \r\n"
									+ " ..POP-89..BON-84.. \r\n" + " ..MNT-79..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun12 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun12 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.27772) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--NACHO—..... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-70.. \r\n"
									+ " ..POP-87..BON-89.. \r\n" + " ..MNT-75..SUE-85.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun13 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun13 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.22216) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }  / /     . \r\n"
									+ " . `--'  `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JOSE--..... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-78.. \r\n"
									+ " ..POP-84..BON-86.. \r\n" + " ..MNT-72..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun14 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun14 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.1666) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GAEL--..... \r\n"
									+ " .................. \r\n" + " ..EST-64..HOB-79.. \r\n"
									+ " ..POP-86..BON-90.. \r\n" + " ..MNT-90..SUE-77.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun15 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun15 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.11104) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---.  .--.     . \r\n"
									+ " .`-`} }{ {} }    . \r\n" + " .  / / { {} }    . \r\n"
									+ " . `-'   `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--ALEJANDRO-... \r\n"
									+ " .................. \r\n" + " ..EST-41..HOB-95.. \r\n"
									+ " ..POP-79..BON-80.. \r\n" + " ..MNT-70..SUE-71.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun16 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun16 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.05548) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--FERRÁN--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-72.. \r\n"
									+ " ..POP-84..BON-85.. \r\n" + " ..MNT-89..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun17 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun17 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' '   . \r\n"
									+ " . `-'   `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-97..HOB-80.. \r\n"
									+ " ..POP-86..BON-82.. \r\n" + " ..MNT-84..SUE-81.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);

							if (comun18 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun18 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

					}

					else if (randomNumeroCalidad >= 0.25) {

						animacionEspecial AnimacionEspecial = new animacionEspecial();
						AnimacionEspecial.ejecutar();

						Thread.sleep(1500);
						randomNumeroEspecial = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroEspecial >= 0.93333333334) {

							System.out.println(magenta + "Sobresaliente\u001B[0m");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .--.     . \r\n" + " .{ {} }{ {} }    . \r\n"
											+ " .{ {} } `/ /   " + magenta + " █" + verde + ". \r\n" + " . `--'  `-'  "
											+ magenta + "  ██" + verde + ". \r\n" + " .            " + magenta + "████"
											+ verde + ". \r\n" + " .................. \r\n" + " .....--GABO--..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-93.. \r\n"
											+ " ..POP-53..BON-95.. \r\n" + " ..MNT-80..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.86666666668) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'    `-'  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-74.. \r\n"
									+ " ..POP-49..BON-82.. \r\n" + " ..MNT-79..SUE-89.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.80000000002) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'  `--'   " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-79.. \r\n"
									+ " ..POP-58..BON-85.. \r\n" + " ..MNT-79..SUE-87.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.73333333336) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n" + " . `/ / | }   "
											+ magenta + "   █" + verde + ". \r\n" + " . `-'  `-'     " + magenta + "██"
											+ verde + ". \r\n" + " .            " + magenta + "████" + verde + ". \r\n"
											+ " .................. \r\n" + " .....--BRUNO-..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-78.. \r\n"
											+ " ..POP-86..BON-91.. \r\n" + " ..MNT-79..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.6666666667) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `-'  `----`  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-84.. \r\n"
									+ " ..POP-89..BON-86.. \r\n" + " ..MNT-87..SUE-83.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.60000000004) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-59..HOB-89.. \r\n"
											+ " ..POP-99..BON-90.. \r\n" + " ..MNT-91..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.53333333338) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + azul + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--JAVIER--.... \r\n"
											+ " .................. \r\n" + " ..EST-88..HOB-82.. \r\n"
											+ " ..POP-90..BON-94.. \r\n" + " ..MNT-76..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.46666666672) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-87.. \r\n"
											+ " ..POP-99..BON-88.. \r\n" + " ..MNT-89..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.40000000006) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--JAUME-..... \r\n"
											+ " .................. \r\n" + " ..EST-67..HOB-91.. \r\n"
											+ " ..POP-88..BON-86.. \r\n" + " ..MNT-80..SUE-95.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.3333333334) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " .{ {} }  / /    " + azul + "█" + verde + ". \r\n" + " . `--'  `-'    "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IVÁN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-68.. \r\n"
											+ " ..POP-99..BON-83.. \r\n" + " ..MNT-85..SUE-77.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.26666666674) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-60..HOB-91.. \r\n"
											+ " ..POP-96..BON-92.. \r\n" + " ..MNT-99..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.20000000008) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + rojo + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IKER--..... \r\n"
											+ " .................. \r\n" + " ..EST-87..HOB-84.. \r\n"
											+ " ..POP-84..BON-81.. \r\n" + " ..MNT-96..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.13333333342) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--FERRÁN--.... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-76.. \r\n"
											+ " ..POP-89..BON-87.. \r\n" + " ..MNT-99..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.06666666676) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--MARCOS--.... \r\n"
											+ " .................. \r\n" + " ..EST-65..HOB-93.. \r\n"
											+ " ..POP-72..BON-97.. \r\n" + " ..MNT-97..SUE-88.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\n\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-..-.    . \r\n" + " .{ {} }| || |    . \r\n"
											+ " . `/ /  `-| }   " + rojo + "█" + verde + ". \r\n" + " . `-'     `-'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-91.. \r\n"
											+ " ..POP-95..BON-89.. \r\n" + " ..MNT-96..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.1) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoPOWER = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoPOWER >= 0.75) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--.  .---.   █. \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' ' ██. \r\n"
									+ " . `-'   `---' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--𝒩𝒜𝒞ℋ𝒪--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-86.. \r\n"
									+ " ..POP-79..BON-88.. \r\n" + " ..MNT-90..SUE-93.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoPOWER >= 0.50) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .---.    █. \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  ██. \r\n"
									+ " . `-'  `----` ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--ℱℰℛℛ𝒜𝒩-.... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-79.. \r\n"
									+ " ..POP-90..BON-92.. \r\n" + " ..MNT-98..SUE-82.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0.25) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'    ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--ℐ𝒱𝒜𝒩-..... \r\n"
									+ " .................. \r\n" + " ..EST-87..HOB-71.. \r\n"
									+ " ..POP-99..BON-89.. \r\n" + " ..MNT-90..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--𝒥𝒪𝒮ℰ--..... \r\n"
									+ " .................. \r\n" + " ..EST-90..HOB-86.. \r\n"
									+ " ..POP-93..BON-96.. \r\n" + " ..MNT-81..SUE-88.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.03) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoMEGA = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoMEGA >= 0.75) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓛𝓤𝓘𝓢" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "78" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "98" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "92" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "89" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "83" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.5) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ....--" + celeste
									+ "𝓙𝓐𝓥𝓘𝓔𝓡" + magenta + "--.... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "96" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "91" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "94" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "93" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "80" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoMEGA2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.25) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ..--" + celeste
									+ "𝓐𝓛𝓔𝓙𝓐𝓝𝓓𝓡𝓞" + magenta + "--.. \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "71" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "90" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "88" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "92" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓖𝓐𝓔𝓛" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "74" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "83" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "99" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "98" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.01) {

						animacionIcono AnimacionIcono = new animacionIcono();
						AnimacionIcono.ejecutar();

						Thread.sleep(1500);
						randomNumeroIcono = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroIcono >= 0.88888888889) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....-ENRIQUE--.... \r\n"
									+ " .................. \r\n" + " ..EST-87..HOB-87.. \r\n"
									+ " ..POP-81..BON-98.. \r\n" + " ..MNT-91..SUE-91.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}

						}

						else if (randomNumeroIcono >= 0.77777777778) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " .....--XEMA--..... \r\n"
									+ " .................. \r\n" + " ..EST-67..HOB-85.. \r\n"
									+ " ..POP-97..BON-80.. \r\n" + " ..MNT-93..SUE-94.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.66666666667) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--MIGUEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-97.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-88..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.55555555556) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--HECTOR--.... \r\n"
									+ " .................. \r\n" + " ..EST-63..HOB-84.. \r\n"
									+ " ..POP-95..BON-87.. \r\n" + " ..MNT-94..SUE-92.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.44444444445) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--BRANDON-.... \r\n"
									+ " .................. \r\n" + " ..EST-71..HOB-92.. \r\n"
									+ " ..POP-92..BON-76.. \r\n" + " ..MNT-88..SUE-97.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.33333333334) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .---.    █. \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / { {.-.  ██. \r\n"
									+ " . `-'   `---'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--SALAZAR-.... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-94.. \r\n"
									+ " ..POP-94..BON-86.. \r\n" + " ..MNT-90..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.22222222223) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--JORGE--..... \r\n"
									+ " .................. \r\n" + " ..EST-69..HOB-93.. \r\n"
									+ " ..POP-91..BON-98.. \r\n" + " ..MNT-87..SUE-93.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.11111111112) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--.  .---.   █. \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' ' ██. \r\n"
									+ " . `-'   `---'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--MANUEL-..... \r\n"
									+ " .................. \r\n" + " ..EST-71..HOB-92.. \r\n"
									+ " ..POP-79..BON-91.. \r\n" + " ..MNT-80..SUE-95.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ......--PAU-...... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-81..BON-89.. \r\n" + " ..MNT-93..SUE-92.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad < 0.01) {

						animacionSOTY AnimacionSOTY = new animacionSOTY();
						AnimacionSOTY.ejecutar();

						Thread.sleep(1500);
						randomNumeroSOTY = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroSOTY >= 0.8) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--. .---.  " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }`-`} }   " + azul + "█. \r\n" + " ." + amarillo + " `/ /   / /   " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'   `-'  " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐏𝐔𝐂𝐂𝐈--" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "70" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "99" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "99" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "98" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "88" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}

						}

						else if (randomNumeroSOTY >= 0.6) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .---. " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {`-'   " + azul + "█. \r\n" + " ." + amarillo + " `/ / .-.} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `---' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ...." + amarillo
									+ "--𝐌𝐀𝐑𝐂𝐎𝐒--" + azul + ".... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "72" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "98" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "81" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "99" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "91" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY >= 0.4) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .--.  " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {} }   " + azul + "█. \r\n" + " ." + amarillo + " `/ / { {} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'   `--' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ......" + amarillo
									+ "--𝐈𝐙𝐀𝐍-" + azul + "...... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "84" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "98" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "99" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "90" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "87" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY >= 0.2) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .---. " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {`-'   " + azul + "█. \r\n" + " ." + amarillo + " `/ / .-.} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `---' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐆𝐀𝐁𝐎--" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "99" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "97" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "74" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "99" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "84"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "86" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY > 0) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .-.   " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }/ /.     " + azul + "█. \r\n" + " ." + amarillo + " `/ /{ {} }   " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `--'  " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐉𝐀𝐕𝐈𝐄𝐑-" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "94" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "86" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "95" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "98" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "82"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "90" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

					}

					System.out.println(
							"---------------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("(Introduce cualquier número para voler)");
					enter = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

				}

				else if (eleccionSobres == 3 && dinero >= 50) {

					dinero = dinero - 50;

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					System.out.println(azul + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
							+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
							+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
							+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
							+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
							+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
							+ "..::.:-" + amarillo + "ト" + rojo + "██" + amarillo + "ラ" + azul + ".-::.:. \u001B[0m");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(azul + "..::::---" + rojo + "██" + azul + "--::::::.\r\n" + "..:-=++*#" + rojo
							+ "██" + azul + "*=-----:.\r\n" + ".:+-:=#%#" + rojo + "██" + azul + "+======:.\r\n"
							+ ".:+--==+*" + rojo + "██" + azul + "+=+====:.\r\n" + ".:-==::+*" + rojo + "██" + azul
							+ "+==--+=:.\r\n" + ".-=-===#*" + rojo + "██" + azul + "=++#**=.\r\n" + ".=###++*=" + rojo
							+ "██" + azul + "=*#=%**=.\r\n" + ".-*%#***#" + rojo + "██" + azul + "%%++*#=.\r\n"
							+ ".:......-" + rojo + "██" + azul + "%#+=++-=.\r\n" + ".....:..:" + rojo + "██" + azul
							+ "+##+=%%=.\r\n" + ".:+=++-:=" + rojo + "██" + azul + "%%##@%%=.\r\n" + ".:=+*=--=" + rojo
							+ "██" + azul + "*%%=%%%=.\r\n" + ".:======+" + rojo + "██" + azul + "=+**#%#-.\r\n"
							+ ".--=*+*+=" + rojo + "██" + azul + "====-=+:.\r\n" + ".---=::=+" + rojo + "██" + azul
							+ "==+=::::.\r\n" + "..:-*+#%%" + rojo + "██" + azul + "+=++=-::.\r\n" + "..=--+*##" + rojo
							+ "██" + azul + "*+====--.\r\n" + "...::.:-" + amarillo + "ト  " + amarillo + "ラ" + azul
							+ ".-::.:.\u001B[0m ");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(azul + ".::::--" + rojo + "█    █" + azul + "-:::::\r\n" + ".:-=++*" + rojo
							+ "█    █" + azul + "=-----\r\n" + ":+-:=#%" + rojo + "█    █" + azul + "======\r\n"
							+ ":+--==+" + rojo + "█    █" + azul + "=+====\r\n" + ":-==::+" + rojo + "█    █" + azul
							+ "==--+=\r\n" + "-=-===#" + rojo + "█    █" + azul + "=++#**\r\n" + "=###++*" + rojo
							+ "█    █" + azul + "*#=%**\r\n" + ".-*#***" + rojo + "█    █" + azul + "%%++*#\r\n"
							+ ".:....." + rojo + "█    █" + azul + "#+=++-\r\n" + "....:.." + rojo + "█    █" + azul
							+ "##+=%%\r\n" + ".:+=+-:" + rojo + "█    █" + azul + "%##@%%\r\n" + ".:=+=--" + rojo
							+ "█    █" + azul + "%%=%%%\r\n" + ".:=====" + rojo + "█    █" + azul + "+**#%#\r\n"
							+ ".--=+*+" + rojo + "█    █" + azul + "===-=+\r\n" + ".---=:=" + rojo + "█    █" + azul
							+ "=+=:::\r\n" + "..:-+#%" + rojo + "█    █" + azul + "=++=-:\r\n" + "..=-+*#" + rojo
							+ "█    █" + azul + "*+====\r\n" + "..:..:" + amarillo + "ト\u001B[0m      " + amarillo + "ラ"
							+ azul + ".-::. \u001B[0m");

					randomNumeroCalidad = Math.random();
					Thread.sleep(1000);

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (randomNumeroCalidad >= 0.5) {

						animacionComun AnimacionComun = new animacionComun();
						AnimacionComun.ejecutar();

						Thread.sleep(1500);
						randomNumeroComun = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroComun >= 0.94444) {

							System.out.println("                      \r\n" + "    ............     \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     .  \r\n"
									+ " .{ {} } / /      .  \r\n" + " .{ {} }{ {} }    .  \r\n"
									+ " . `--'  `--'     .  \r\n" + " .                .  \r\n"
									+ " ..................  \r\n" + " .....--PUCCI-.....  \r\n"
									+ " ..................  \r\n" + " ..EST-51..HOB-89..  \r\n"
									+ " ..POP-90..BON-86..  \r\n" + " ..MNT-89..SUE-80..  \r\n"
									+ "   ......==......    \r\n" + "        ....         \r\n"
									+ "                      ");
							Thread.sleep(1500);
							if (comun1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección.");
								comun1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.88888) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--MARCOS--.... \r\n"
									+ " .................. \r\n" + " ..EST-56..HOB-86.. \r\n"
									+ " ..POP-63..BON-93.. \r\n" + " ..MNT-87..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....    \r\n" + "");
							Thread.sleep(1500);
							if (comun2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.83332) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--JAVIER--.... \r\n"
									+ " .................. \r\n" + " ..EST-81..HOB-79.. \r\n"
									+ " ..POP-80..BON-87.. \r\n" + " ..MNT-73..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....     \r\n" + "");
							Thread.sleep(1500);
							if (comun3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.77776) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GABO--..... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-91.. \r\n"
									+ " ..POP-48..BON-91.. \r\n" + " ..MNT-70..SUE-72.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.7222) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JAUME—..... \r\n"
									+ " .................. \r\n" + " ..EST-60..HOB-92.. \r\n"
									+ " ..POP-78..BON-84.. \r\n" + " ..MNT-72..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.66664) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .--.     . \r\n"
									+ " .{ {} }{ {} }    . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IZAN--..... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-91..BON-84.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.61108) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---. .---.     . \r\n"
									+ " .`-`} }`-`} }    . \r\n" + " .  / /   / /     . \r\n"
									+ " . `-'   `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-65.. \r\n"
									+ " ..POP-39..BON-78.. \r\n" + " ..MNT-70..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.55552) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " .{ {} }' `-' '   . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-94..HOB-69.. \r\n"
									+ " ..POP-48..BON-82.. \r\n" + " ..MNT-71..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.49996) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---`     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IVÁN--..... \r\n"
									+ " .................. \r\n" + " ..EST-77..HOB-62.. \r\n"
									+ " ..POP-93..BON-80.. \r\n" + " ..MNT-82..SUE-75.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.4444) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--BRUNO—..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-73.. \r\n"
									+ " ..POP-83..BON-89.. \r\n" + " ..MNT-78..SUE-70.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun10 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun10 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.38884) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IKER--..... \r\n"
									+ " .................. \r\n" + " ..EST-83..HOB-81.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun11 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun11 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.33328) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--LUIS--..... \r\n"
									+ " .................. \r\n" + " ..EST-53..HOB-74.. \r\n"
									+ " ..POP-89..BON-84.. \r\n" + " ..MNT-79..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun12 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun12 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.27772) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--NACHO—..... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-70.. \r\n"
									+ " ..POP-87..BON-89.. \r\n" + " ..MNT-75..SUE-85.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun13 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun13 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.22216) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }  / /     . \r\n"
									+ " . `--'  `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JOSE--..... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-78.. \r\n"
									+ " ..POP-84..BON-86.. \r\n" + " ..MNT-72..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun14 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun14 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.1666) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GAEL--..... \r\n"
									+ " .................. \r\n" + " ..EST-64..HOB-79.. \r\n"
									+ " ..POP-86..BON-90.. \r\n" + " ..MNT-90..SUE-77.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun15 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun15 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.11104) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---.  .--.     . \r\n"
									+ " .`-`} }{ {} }    . \r\n" + " .  / / { {} }    . \r\n"
									+ " . `-'   `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--ALEJANDRO-... \r\n"
									+ " .................. \r\n" + " ..EST-41..HOB-95.. \r\n"
									+ " ..POP-79..BON-80.. \r\n" + " ..MNT-70..SUE-71.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun16 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun16 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.05548) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--FERRÁN--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-72.. \r\n"
									+ " ..POP-84..BON-85.. \r\n" + " ..MNT-89..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun17 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun17 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' '   . \r\n"
									+ " . `-'   `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-97..HOB-80.. \r\n"
									+ " ..POP-86..BON-82.. \r\n" + " ..MNT-84..SUE-81.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);

							if (comun18 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun18 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

					}

					else if (randomNumeroCalidad >= 0.25) {

						animacionEspecial AnimacionEspecial = new animacionEspecial();
						AnimacionEspecial.ejecutar();

						Thread.sleep(1500);
						randomNumeroEspecial = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroEspecial >= 0.93333333334) {

							System.out.println(magenta + "Sobresaliente\u001B[0m");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .--.     . \r\n" + " .{ {} }{ {} }    . \r\n"
											+ " .{ {} } `/ /   " + magenta + " █" + verde + ". \r\n" + " . `--'  `-'  "
											+ magenta + "  ██" + verde + ". \r\n" + " .            " + magenta + "████"
											+ verde + ". \r\n" + " .................. \r\n" + " .....--GABO--..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-93.. \r\n"
											+ " ..POP-53..BON-95.. \r\n" + " ..MNT-80..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.86666666668) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'    `-'  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-74.. \r\n"
									+ " ..POP-49..BON-82.. \r\n" + " ..MNT-79..SUE-89.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.80000000002) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'  `--'   " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-79.. \r\n"
									+ " ..POP-58..BON-85.. \r\n" + " ..MNT-79..SUE-87.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.73333333336) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n" + " . `/ / | }   "
											+ magenta + "   █" + verde + ". \r\n" + " . `-'  `-'     " + magenta + "██"
											+ verde + ". \r\n" + " .            " + magenta + "████" + verde + ". \r\n"
											+ " .................. \r\n" + " .....--BRUNO-..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-78.. \r\n"
											+ " ..POP-86..BON-91.. \r\n" + " ..MNT-79..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.6666666667) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `-'  `----`  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-84.. \r\n"
									+ " ..POP-89..BON-86.. \r\n" + " ..MNT-87..SUE-83.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.60000000004) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-59..HOB-89.. \r\n"
											+ " ..POP-99..BON-90.. \r\n" + " ..MNT-91..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.53333333338) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + azul + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--JAVIER--.... \r\n"
											+ " .................. \r\n" + " ..EST-88..HOB-82.. \r\n"
											+ " ..POP-90..BON-94.. \r\n" + " ..MNT-76..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.46666666672) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-87.. \r\n"
											+ " ..POP-99..BON-88.. \r\n" + " ..MNT-89..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.40000000006) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--JAUME-..... \r\n"
											+ " .................. \r\n" + " ..EST-67..HOB-91.. \r\n"
											+ " ..POP-88..BON-86.. \r\n" + " ..MNT-80..SUE-95.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.3333333334) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " .{ {} }  / /    " + azul + "█" + verde + ". \r\n" + " . `--'  `-'    "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IVÁN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-68.. \r\n"
											+ " ..POP-99..BON-83.. \r\n" + " ..MNT-85..SUE-77.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.26666666674) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-60..HOB-91.. \r\n"
											+ " ..POP-96..BON-92.. \r\n" + " ..MNT-99..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.20000000008) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + rojo + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IKER--..... \r\n"
											+ " .................. \r\n" + " ..EST-87..HOB-84.. \r\n"
											+ " ..POP-84..BON-81.. \r\n" + " ..MNT-96..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.13333333342) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--FERRÁN--.... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-76.. \r\n"
											+ " ..POP-89..BON-87.. \r\n" + " ..MNT-99..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.06666666676) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--MARCOS--.... \r\n"
											+ " .................. \r\n" + " ..EST-65..HOB-93.. \r\n"
											+ " ..POP-72..BON-97.. \r\n" + " ..MNT-97..SUE-88.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\n\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-..-.    . \r\n" + " .{ {} }| || |    . \r\n"
											+ " . `/ /  `-| }   " + rojo + "█" + verde + ". \r\n" + " . `-'     `-'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-91.. \r\n"
											+ " ..POP-95..BON-89.. \r\n" + " ..MNT-96..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}
					}

					else if (randomNumeroCalidad >= 0.1) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoPOWER = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoPOWER >= 0.75) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--.  .---.   █. \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' ' ██. \r\n"
									+ " . `-'   `---' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--𝒩𝒜𝒞ℋ𝒪--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-86.. \r\n"
									+ " ..POP-79..BON-88.. \r\n" + " ..MNT-90..SUE-93.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoPOWER >= 0.50) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .---.    █. \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  ██. \r\n"
									+ " . `-'  `----` ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--ℱℰℛℛ𝒜𝒩-.... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-79.. \r\n"
									+ " ..POP-90..BON-92.. \r\n" + " ..MNT-98..SUE-82.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0.25) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'    ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--ℐ𝒱𝒜𝒩-..... \r\n"
									+ " .................. \r\n" + " ..EST-87..HOB-71.. \r\n"
									+ " ..POP-99..BON-89.. \r\n" + " ..MNT-90..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--𝒥𝒪𝒮ℰ--..... \r\n"
									+ " .................. \r\n" + " ..EST-90..HOB-86.. \r\n"
									+ " ..POP-93..BON-96.. \r\n" + " ..MNT-81..SUE-88.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.015) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoMEGA = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoMEGA >= 0.75) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓛𝓤𝓘𝓢" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "78" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "98" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "92" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "89" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "83" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.5) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ....--" + celeste
									+ "𝓙𝓐𝓥𝓘𝓔𝓡" + magenta + "--.... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "96" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "91" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "94" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "93" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "80" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoMEGA2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.25) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ..--" + celeste
									+ "𝓐𝓛𝓔𝓙𝓐𝓝𝓓𝓡𝓞" + magenta + "--.. \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "71" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "90" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "88" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "92" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓖𝓐𝓔𝓛" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "74" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "83" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "99" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "98" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}
						}
					}

					else if (randomNumeroCalidad >= 0.005) {

						animacionSOTY AnimacionSOTY = new animacionSOTY();
						AnimacionSOTY.ejecutar();

						Thread.sleep(1500);
						randomNumeroSOTY = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroSOTY >= 0.8) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--. .---.  " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }`-`} }   " + azul + "█. \r\n" + " ." + amarillo + " `/ /   / /   " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'   `-'  " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐏𝐔𝐂𝐂𝐈--" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "70" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "99" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "99" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "98" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "88" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}

						}

						else if (randomNumeroSOTY >= 0.6) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .---. " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {`-'   " + azul + "█. \r\n" + " ." + amarillo + " `/ / .-.} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `---' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ...." + amarillo
									+ "--𝐌𝐀𝐑𝐂𝐎𝐒--" + azul + ".... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "72" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "98" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "81" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "99" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "91" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY >= 0.4) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .--.  " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {} }   " + azul + "█. \r\n" + " ." + amarillo + " `/ / { {} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'   `--' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ......" + amarillo
									+ "--𝐈𝐙𝐀𝐍-" + azul + "...... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "84" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "98" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "99" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "90" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "87" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY >= 0.2) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .---. " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {`-'   " + azul + "█. \r\n" + " ." + amarillo + " `/ / .-.} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `---' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐆𝐀𝐁𝐎--" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "99" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "97" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "74" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "99" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "84"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "86" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY > 0) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .-.   " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }/ /.     " + azul + "█. \r\n" + " ." + amarillo + " `/ /{ {} }   " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `--'  " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐉𝐀𝐕𝐈𝐄𝐑-" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "94" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "86" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "95" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "98" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "82"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "90" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad < 0.005) {

						animacionDiablo AnimacionDiablo = new animacionDiablo();
						AnimacionDiablo.ejecutar();

						Thread.sleep(1500);
						randomNumeroDiablo = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroDiablo >= 0.75) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(rojo + "Remontada");
							Thread.sleep(1500);
							System.out.println(rojo + "\r\n" + "\r\n" + "    ....." + blanco + "⛧" + rojo
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " . .--.  .--.  ███. \r\n"
									+ " .{ {} }{ {} }   █. \r\n" + " . `/ /  `/ /   ██. \r\n"
									+ " . `-'   `-'  ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n"
									+ " ....." + blanco + "--𝖕𝖚𝖈𝖈𝖎--" + rojo + "..... \r\n"
									+ "   .............   \r\n" + " .." + blanco + "EST" + rojo + "-" + blanco + "99"
									+ rojo + ".." + blanco + "HOB" + rojo + "-" + blanco + "99" + rojo + ".. \r\n"
									+ "  ." + blanco + "POP" + rojo + "-" + blanco + "99" + rojo + ".." + blanco + "BON"
									+ rojo + "-" + blanco + "99" + rojo + ".  \r\n" + " .." + blanco + "MNT" + rojo
									+ "-" + blanco + "99" + rojo + ".." + blanco + "SUE" + rojo + "-" + blanco + "90"
									+ rojo + ".. \r\n" + "     ...☠︎☠︎...     \r\n" + "        ....        \r\n"
									+ "\u001B[0m ");

							if (diabloRemontada1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloRemontada1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}

						}

						else if (randomNumeroDiablo >= 0.5) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(rojo + "Remontada");
							Thread.sleep(1500);
							System.out.println(rojo + "\r\n" + "\r\n" + "    ....." + blanco + "⛧" + rojo
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " . .--.  .--.  ███. \r\n"
									+ " .{ {} }{ {} }   █. \r\n" + " . `/ / { {} }  ██. \r\n"
									+ " . `-'   `--' ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n"
									+ " ....." + blanco + "--𝖏𝖆𝖚𝖒𝖊--" + rojo + "..... \r\n"
									+ "   .............   \r\n" + " .." + blanco + "EST" + rojo + "-" + blanco + "99"
									+ rojo + ".." + blanco + "HOB" + rojo + "-" + blanco + "99" + rojo + ".. \r\n"
									+ "  ." + blanco + "POP" + rojo + "-" + blanco + "94" + rojo + ".." + blanco + "BON"
									+ rojo + "-" + blanco + "88" + rojo + ".  \r\n" + " .." + blanco + "MNT" + rojo
									+ "-" + blanco + "81" + rojo + ".." + blanco + "SUE" + rojo + "-" + blanco + "99"
									+ rojo + ".. \r\n" + "     ...☠︎☠︎...     \r\n" + "        ....        \r\n"
									+ "\u001B[0m ");

							if (diabloRemontada2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloRemontada2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}

						else if (randomNumeroDiablo >= 0.25) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(azul + "Lunar");
							Thread.sleep(1500);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + blanco + "☾" + azul
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ azul + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + azul + "   █. \r\n" + " . "
									+ azul + "`/ /  `/ /" + azul + "   ██. \r\n" + " . " + azul + "`-'   `-'" + azul
									+ "  ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n" + " ....."
									+ blanco + "--𝔇𝔞𝔫𝔦𝔢𝔩--" + azul + "..... \r\n" + "   .............   \r\n"
									+ " .." + blanco + "EST" + azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB"
									+ azul + "-" + blanco + "95" + azul + ".. \r\n" + "  ." + blanco + "POP" + azul
									+ "-" + blanco + "99" + azul + ".." + blanco + "BON" + azul + "-" + blanco + "90"
									+ azul + ".  \r\n" + " .." + blanco + "MNT" + azul + "-" + blanco + "91" + azul
									+ ".." + blanco + "SUE" + azul + "-" + blanco + "92" + azul + ".. \r\n"
									+ "     ...✨✨...     \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (diabloLunar1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloLunar1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}

						else if (randomNumeroDiablo >= 0) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(azul + "Lunar");
							Thread.sleep(1500);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + blanco + "☾" + azul
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " ." + azul + " .--.  .--." + azul
									+ "  ███. \r\n" + " ." + azul + "{ {} }{ {} }" + azul + "   █. \r\n" + " . " + azul
									+ "`/ / { {} }" + azul + "  ██. \r\n" + " . " + azul + "`-'   `--'" + azul
									+ " ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n" + " ....."
									+ blanco + "--𝔊𝔞𝔟𝔬--" + azul + "..... \r\n" + "   .............   \r\n" + " .."
									+ blanco + "EST" + azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB" + azul
									+ "-" + blanco + "99" + azul + ".. \r\n" + "  ." + blanco + "POP" + azul + "-"
									+ blanco + "81" + azul + ".." + blanco + "BON" + azul + "-" + blanco + "99" + azul
									+ ".  \r\n" + " .." + blanco + "MNT" + azul + "-" + blanco + "87" + azul + ".."
									+ blanco + "SUE" + azul + "-" + blanco + "90" + azul + ".. \r\n"
									+ "     ...✨✨...     \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (diabloLunar2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloLunar2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}

					}

					System.out.println(
							"---------------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("(Introduce cualquier número para voler)");
					enter = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

				}

				else if (eleccionSobres == 4 && dinero >= 50) {

					dinero = dinero - 50;

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					System.out.println(rojo + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
							+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
							+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
							+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
							+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
							+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
							+ "..::.:-" + amarillo + "人" + celeste + "██" + amarillo + "生" + rojo
							+ ".-::.:. \u001B[0m");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(rojo + "..::::---" + celeste + "██" + rojo + "--::::::.\r\n" + "..:-=++*#"
							+ celeste + "██" + rojo + "*=-----:.\r\n" + ".:+-:=#%#" + celeste + "██" + rojo
							+ "+======:.\r\n" + ".:+--==+*" + celeste + "██" + rojo + "+=+====:.\r\n" + ".:-==::+*"
							+ celeste + "██" + rojo + "+==--+=:.\r\n" + ".-=-===#*" + celeste + "██" + rojo
							+ "=++#**=.\r\n" + ".=###++*=" + celeste + "██" + rojo + "=*#=%**=.\r\n" + ".-*%#***#"
							+ celeste + "██" + rojo + "%%++*#=.\r\n" + ".:......-" + celeste + "██" + rojo
							+ "%#+=++-=.\r\n" + ".....:..:" + celeste + "██" + rojo + "+##+=%%=.\r\n" + ".:+=++-:="
							+ celeste + "██" + rojo + "%%##@%%=.\r\n" + ".:=+*=--=" + celeste + "██" + rojo
							+ "*%%=%%%=.\r\n" + ".:======+" + celeste + "██" + rojo + "=+**#%#-.\r\n" + ".--=*+*+="
							+ celeste + "██" + rojo + "====-=+:.\r\n" + ".---=::=+" + celeste + "██" + rojo
							+ "==+=::::.\r\n" + "..:-*+#%%" + celeste + "██" + rojo + "+=++=-::.\r\n" + "..=--+*##"
							+ celeste + "██" + rojo + "*+====--.\r\n" + "...:::-" + amarillo + "人  " + amarillo + "生"
							+ rojo + ".-::.:.\u001B[0m ");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(rojo + ".::::--" + celeste + "█    █" + rojo + "-:::::\r\n" + ".:-=++*" + celeste
							+ "█    █" + rojo + "=-----\r\n" + ":+-:=#%" + celeste + "█    █" + rojo + "======\r\n"
							+ ":+--==+" + celeste + "█    █" + rojo + "=+====\r\n" + ":-==::+" + celeste + "█    █"
							+ rojo + "==--+=\r\n" + "-=-===#" + celeste + "█    █" + rojo + "=++#**\r\n" + "=###++*"
							+ celeste + "█    █" + rojo + "*#=%**\r\n" + ".-*#***" + celeste + "█    █" + rojo
							+ "%%++*#\r\n" + ".:....." + celeste + "█    █" + rojo + "#+=++-\r\n" + "....:.." + celeste
							+ "█    █" + rojo + "##+=%%\r\n" + ".:+=+-:" + celeste + "█    █" + rojo + "%##@%%\r\n"
							+ ".:=+=--" + celeste + "█    █" + rojo + "%%=%%%\r\n" + ".:=====" + celeste + "█    █"
							+ rojo + "+**#%#\r\n" + ".--=+*+" + celeste + "█    █" + rojo + "===-=+\r\n" + ".---=:="
							+ celeste + "█    █" + rojo + "=+=:::\r\n" + "..:-+#%" + celeste + "█    █" + rojo
							+ "=++=-:\r\n" + "..=-+*#" + celeste + "█    █" + rojo + "*+====\r\n" + "..:.:" + amarillo
							+ "人\u001B[0m      " + amarillo + "生" + rojo + ".-::. \u001B[0m");

					randomNumeroCalidad = Math.random();
					Thread.sleep(1000);

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (randomNumeroCalidad >= 0.5) {

						animacionComun AnimacionComun = new animacionComun();
						AnimacionComun.ejecutar();

						Thread.sleep(1500);
						randomNumeroComun = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroComun >= 0.94444) {

							System.out.println("                      \r\n" + "    ............     \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     .  \r\n"
									+ " .{ {} } / /      .  \r\n" + " .{ {} }{ {} }    .  \r\n"
									+ " . `--'  `--'     .  \r\n" + " .                .  \r\n"
									+ " ..................  \r\n" + " .....--PUCCI-.....  \r\n"
									+ " ..................  \r\n" + " ..EST-51..HOB-89..  \r\n"
									+ " ..POP-90..BON-86..  \r\n" + " ..MNT-89..SUE-80..  \r\n"
									+ "   ......==......    \r\n" + "        ....         \r\n"
									+ "                      ");
							Thread.sleep(1500);
							if (comun1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección.");
								comun1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.88888) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--MARCOS--.... \r\n"
									+ " .................. \r\n" + " ..EST-56..HOB-86.. \r\n"
									+ " ..POP-63..BON-93.. \r\n" + " ..MNT-87..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....    \r\n" + "");
							Thread.sleep(1500);
							if (comun2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.83332) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--JAVIER--.... \r\n"
									+ " .................. \r\n" + " ..EST-81..HOB-79.. \r\n"
									+ " ..POP-80..BON-87.. \r\n" + " ..MNT-73..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....     \r\n" + "");
							Thread.sleep(1500);
							if (comun3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.77776) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GABO--..... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-91.. \r\n"
									+ " ..POP-48..BON-91.. \r\n" + " ..MNT-70..SUE-72.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.7222) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JAUME—..... \r\n"
									+ " .................. \r\n" + " ..EST-60..HOB-92.. \r\n"
									+ " ..POP-78..BON-84.. \r\n" + " ..MNT-72..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.66664) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .--.     . \r\n"
									+ " .{ {} }{ {} }    . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IZAN--..... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-91..BON-84.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.61108) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---. .---.     . \r\n"
									+ " .`-`} }`-`} }    . \r\n" + " .  / /   / /     . \r\n"
									+ " . `-'   `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-65.. \r\n"
									+ " ..POP-39..BON-78.. \r\n" + " ..MNT-70..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.55552) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " .{ {} }' `-' '   . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-94..HOB-69.. \r\n"
									+ " ..POP-48..BON-82.. \r\n" + " ..MNT-71..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.49996) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---`     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IVÁN--..... \r\n"
									+ " .................. \r\n" + " ..EST-77..HOB-62.. \r\n"
									+ " ..POP-93..BON-80.. \r\n" + " ..MNT-82..SUE-75.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.4444) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--BRUNO—..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-73.. \r\n"
									+ " ..POP-83..BON-89.. \r\n" + " ..MNT-78..SUE-70.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun10 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun10 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.38884) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IKER--..... \r\n"
									+ " .................. \r\n" + " ..EST-83..HOB-81.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun11 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun11 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.33328) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--LUIS--..... \r\n"
									+ " .................. \r\n" + " ..EST-53..HOB-74.. \r\n"
									+ " ..POP-89..BON-84.. \r\n" + " ..MNT-79..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun12 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun12 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.27772) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--NACHO—..... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-70.. \r\n"
									+ " ..POP-87..BON-89.. \r\n" + " ..MNT-75..SUE-85.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun13 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun13 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.22216) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }  / /     . \r\n"
									+ " . `--'  `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JOSE--..... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-78.. \r\n"
									+ " ..POP-84..BON-86.. \r\n" + " ..MNT-72..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun14 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun14 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.1666) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GAEL--..... \r\n"
									+ " .................. \r\n" + " ..EST-64..HOB-79.. \r\n"
									+ " ..POP-86..BON-90.. \r\n" + " ..MNT-90..SUE-77.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun15 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun15 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.11104) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---.  .--.     . \r\n"
									+ " .`-`} }{ {} }    . \r\n" + " .  / / { {} }    . \r\n"
									+ " . `-'   `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--ALEJANDRO-... \r\n"
									+ " .................. \r\n" + " ..EST-41..HOB-95.. \r\n"
									+ " ..POP-79..BON-80.. \r\n" + " ..MNT-70..SUE-71.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun16 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun16 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.05548) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--FERRÁN--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-72.. \r\n"
									+ " ..POP-84..BON-85.. \r\n" + " ..MNT-89..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun17 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun17 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' '   . \r\n"
									+ " . `-'   `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-97..HOB-80.. \r\n"
									+ " ..POP-86..BON-82.. \r\n" + " ..MNT-84..SUE-81.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);

							if (comun18 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun18 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}
					}

					else if (randomNumeroCalidad >= 0.25) {

						animacionEspecial AnimacionEspecial = new animacionEspecial();
						AnimacionEspecial.ejecutar();

						Thread.sleep(1500);
						randomNumeroEspecial = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroEspecial >= 0.93333333334) {

							System.out.println(magenta + "Sobresaliente\u001B[0m");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .--.     . \r\n" + " .{ {} }{ {} }    . \r\n"
											+ " .{ {} } `/ /   " + magenta + " █" + verde + ". \r\n" + " . `--'  `-'  "
											+ magenta + "  ██" + verde + ". \r\n" + " .            " + magenta + "████"
											+ verde + ". \r\n" + " .................. \r\n" + " .....--GABO--..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-93.. \r\n"
											+ " ..POP-53..BON-95.. \r\n" + " ..MNT-80..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.86666666668) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'    `-'  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-74.. \r\n"
									+ " ..POP-49..BON-82.. \r\n" + " ..MNT-79..SUE-89.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.80000000002) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'  `--'   " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-79.. \r\n"
									+ " ..POP-58..BON-85.. \r\n" + " ..MNT-79..SUE-87.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.73333333336) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n" + " . `/ / | }   "
											+ magenta + "   █" + verde + ". \r\n" + " . `-'  `-'     " + magenta + "██"
											+ verde + ". \r\n" + " .            " + magenta + "████" + verde + ". \r\n"
											+ " .................. \r\n" + " .....--BRUNO-..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-78.. \r\n"
											+ " ..POP-86..BON-91.. \r\n" + " ..MNT-79..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.6666666667) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `-'  `----`  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-84.. \r\n"
									+ " ..POP-89..BON-86.. \r\n" + " ..MNT-87..SUE-83.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.60000000004) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-59..HOB-89.. \r\n"
											+ " ..POP-99..BON-90.. \r\n" + " ..MNT-91..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.53333333338) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + azul + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--JAVIER--.... \r\n"
											+ " .................. \r\n" + " ..EST-88..HOB-82.. \r\n"
											+ " ..POP-90..BON-94.. \r\n" + " ..MNT-76..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.46666666672) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-87.. \r\n"
											+ " ..POP-99..BON-88.. \r\n" + " ..MNT-89..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.40000000006) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--JAUME-..... \r\n"
											+ " .................. \r\n" + " ..EST-67..HOB-91.. \r\n"
											+ " ..POP-88..BON-86.. \r\n" + " ..MNT-80..SUE-95.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.3333333334) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " .{ {} }  / /    " + azul + "█" + verde + ". \r\n" + " . `--'  `-'    "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IVÁN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-68.. \r\n"
											+ " ..POP-99..BON-83.. \r\n" + " ..MNT-85..SUE-77.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.26666666674) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-60..HOB-91.. \r\n"
											+ " ..POP-96..BON-92.. \r\n" + " ..MNT-99..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.20000000008) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + rojo + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IKER--..... \r\n"
											+ " .................. \r\n" + " ..EST-87..HOB-84.. \r\n"
											+ " ..POP-84..BON-81.. \r\n" + " ..MNT-96..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.13333333342) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--FERRÁN--.... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-76.. \r\n"
											+ " ..POP-89..BON-87.. \r\n" + " ..MNT-99..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.06666666676) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--MARCOS--.... \r\n"
											+ " .................. \r\n" + " ..EST-65..HOB-93.. \r\n"
											+ " ..POP-72..BON-97.. \r\n" + " ..MNT-97..SUE-88.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\n\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-..-.    . \r\n" + " .{ {} }| || |    . \r\n"
											+ " . `/ /  `-| }   " + rojo + "█" + verde + ". \r\n" + " . `-'     `-'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-91.. \r\n"
											+ " ..POP-95..BON-89.. \r\n" + " ..MNT-96..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}
					}

					else if (randomNumeroCalidad >= 0.1) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoPOWER = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoPOWER >= 0.75) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--.  .---.   █. \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' ' ██. \r\n"
									+ " . `-'   `---' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--𝒩𝒜𝒞ℋ𝒪--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-86.. \r\n"
									+ " ..POP-79..BON-88.. \r\n" + " ..MNT-90..SUE-93.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoPOWER >= 0.50) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .---.    █. \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  ██. \r\n"
									+ " . `-'  `----` ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--ℱℰℛℛ𝒜𝒩-.... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-79.. \r\n"
									+ " ..POP-90..BON-92.. \r\n" + " ..MNT-98..SUE-82.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0.25) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'    ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--ℐ𝒱𝒜𝒩-..... \r\n"
									+ " .................. \r\n" + " ..EST-87..HOB-71.. \r\n"
									+ " ..POP-99..BON-89.. \r\n" + " ..MNT-90..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--𝒥𝒪𝒮ℰ--..... \r\n"
									+ " .................. \r\n" + " ..EST-90..HOB-86.. \r\n"
									+ " ..POP-93..BON-96.. \r\n" + " ..MNT-81..SUE-88.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}
					}

					else if (randomNumeroCalidad >= 0.0075) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoMEGA = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoMEGA >= 0.75) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓛𝓤𝓘𝓢" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "78" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "98" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "92" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "89" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "83" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.5) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ....--" + celeste
									+ "𝓙𝓐𝓥𝓘𝓔𝓡" + magenta + "--.... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "96" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "91" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "94" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "93" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "80" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoMEGA2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.25) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ..--" + celeste
									+ "𝓐𝓛𝓔𝓙𝓐𝓝𝓓𝓡𝓞" + magenta + "--.. \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "71" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "90" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "88" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "92" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓖𝓐𝓔𝓛" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "74" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "83" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "99" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "98" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}
						}
					}

					else if (randomNumeroCalidad >= 0.0025) {

						animacionDiablo AnimacionDiablo = new animacionDiablo();
						AnimacionDiablo.ejecutar();

						Thread.sleep(1500);
						randomNumeroDiablo = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroDiablo >= 0.75) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(rojo + "Remontada");
							Thread.sleep(1500);
							System.out.println(rojo + "\r\n" + "\r\n" + "    ....." + blanco + "⛧" + rojo
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " . .--.  .--.  ███. \r\n"
									+ " .{ {} }{ {} }   █. \r\n" + " . `/ /  `/ /   ██. \r\n"
									+ " . `-'   `-'  ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n"
									+ " ....." + blanco + "--𝖕𝖚𝖈𝖈𝖎--" + rojo + "..... \r\n"
									+ "   .............   \r\n" + " .." + blanco + "EST" + rojo + "-" + blanco + "99"
									+ rojo + ".." + blanco + "HOB" + rojo + "-" + blanco + "99" + rojo + ".. \r\n"
									+ "  ." + blanco + "POP" + rojo + "-" + blanco + "99" + rojo + ".." + blanco + "BON"
									+ rojo + "-" + blanco + "99" + rojo + ".  \r\n" + " .." + blanco + "MNT" + rojo
									+ "-" + blanco + "99" + rojo + ".." + blanco + "SUE" + rojo + "-" + blanco + "90"
									+ rojo + ".. \r\n" + "     ...☠︎☠︎...     \r\n" + "        ....        \r\n"
									+ "\u001B[0m ");

							if (diabloRemontada1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloRemontada1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}

						}

						else if (randomNumeroDiablo >= 0.5) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(rojo + "Remontada");
							Thread.sleep(1500);
							System.out.println(rojo + "\r\n" + "\r\n" + "    ....." + blanco + "⛧" + rojo
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " . .--.  .--.  ███. \r\n"
									+ " .{ {} }{ {} }   █. \r\n" + " . `/ / { {} }  ██. \r\n"
									+ " . `-'   `--' ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n"
									+ " ....." + blanco + "--𝖏𝖆𝖚𝖒𝖊--" + rojo + "..... \r\n"
									+ "   .............   \r\n" + " .." + blanco + "EST" + rojo + "-" + blanco + "99"
									+ rojo + ".." + blanco + "HOB" + rojo + "-" + blanco + "99" + rojo + ".. \r\n"
									+ "  ." + blanco + "POP" + rojo + "-" + blanco + "94" + rojo + ".." + blanco + "BON"
									+ rojo + "-" + blanco + "88" + rojo + ".  \r\n" + " .." + blanco + "MNT" + rojo
									+ "-" + blanco + "81" + rojo + ".." + blanco + "SUE" + rojo + "-" + blanco + "99"
									+ rojo + ".. \r\n" + "     ...☠︎☠︎...     \r\n" + "        ....        \r\n"
									+ "\u001B[0m ");

							if (diabloRemontada2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloRemontada2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}

						else if (randomNumeroDiablo >= 0.25) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(azul + "Lunar");
							Thread.sleep(1500);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + blanco + "☾" + azul
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ azul + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + azul + "   █. \r\n" + " . "
									+ azul + "`/ /  `/ /" + azul + "   ██. \r\n" + " . " + azul + "`-'   `-'" + azul
									+ "  ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n" + " ....."
									+ blanco + "--𝔇𝔞𝔫𝔦𝔢𝔩--" + azul + "..... \r\n" + "   .............   \r\n"
									+ " .." + blanco + "EST" + azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB"
									+ azul + "-" + blanco + "95" + azul + ".. \r\n" + "  ." + blanco + "POP" + azul
									+ "-" + blanco + "99" + azul + ".." + blanco + "BON" + azul + "-" + blanco + "90"
									+ azul + ".  \r\n" + " .." + blanco + "MNT" + azul + "-" + blanco + "91" + azul
									+ ".." + blanco + "SUE" + azul + "-" + blanco + "92" + azul + ".. \r\n"
									+ "     ...✨✨...     \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (diabloLunar1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloLunar1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}

						else if (randomNumeroDiablo >= 0) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(azul + "Lunar");
							Thread.sleep(1500);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + blanco + "☾" + azul
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " ." + azul + " .--.  .--." + azul
									+ "  ███. \r\n" + " ." + azul + "{ {} }{ {} }" + azul + "   █. \r\n" + " . " + azul
									+ "`/ / { {} }" + azul + "  ██. \r\n" + " . " + azul + "`-'   `--'" + azul
									+ " ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n" + " ....."
									+ blanco + "--𝔊𝔞𝔟𝔬--" + azul + "..... \r\n" + "   .............   \r\n" + " .."
									+ blanco + "EST" + azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB" + azul
									+ "-" + blanco + "99" + azul + ".. \r\n" + "  ." + blanco + "POP" + azul + "-"
									+ blanco + "81" + azul + ".." + blanco + "BON" + azul + "-" + blanco + "99" + azul
									+ ".  \r\n" + " .." + blanco + "MNT" + azul + "-" + blanco + "87" + azul + ".."
									+ blanco + "SUE" + azul + "-" + blanco + "90" + azul + ".. \r\n"
									+ "     ...✨✨...     \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (diabloLunar2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloLunar2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}
					}

					else if (randomNumeroCalidad < 0.0025) {

						animacionFlashback AnimacionFlashback = new animacionFlashback();
						AnimacionFlashback.ejecutar();

						Thread.sleep(1500);
						randomNumeroFlashback = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFlashback >= 0.5) {

							Thread.sleep(3000);
							System.out.println(celeste + "\r\n" + "\r\n" + "    ...." + azul + "«««" + celeste
									+ ".....    \r\n" + "  .██████ ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ celeste + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + celeste + "   █. \r\n"
									+ " ." + azul + " `/ /  `/ /   " + celeste + "██. \r\n" + " ." + azul
									+ " `-'   `-'  " + celeste + "████. \r\n" + " .████████████████. \r\n"
									+ " .‹.‹.‹.‹.‹.‹.‹.‹.‹ \r\n" + " ..-«" + azul + "🄰🄻🄴🄹🄰🄽🄳🅁🄾" + celeste
									+ "«-... \r\n" + " .................. \r\n" + " .." + azul + "EST" + celeste + "-"
									+ azul + "72" + celeste + ".." + azul + "HOB" + celeste + "-" + azul + "99"
									+ celeste + ".. \r\n" + " .." + azul + "POP" + celeste + "-" + azul + "98" + celeste
									+ ".." + azul + "BON" + celeste + "-" + azul + "98" + celeste + ".. \r\n" + " .."
									+ azul + "MNT" + celeste + "-" + azul + "98" + celeste + ".." + azul + "SUE"
									+ celeste + "-" + azul + "98" + celeste + ".. \r\n" + "   ......" + azul + "《《"
									+ celeste + "......   \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (flashback1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								flashback1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2500€)");
								dinero = dinero + 2500;
								System.out.println("");

							}

						}

						else if (randomNumeroFlashback >= 0) {

							Thread.sleep(3000);
							System.out.println(celeste + "\r\n" + "\r\n" + "    ...." + azul + "«««" + celeste
									+ ".....    \r\n" + "  .██████ ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ celeste + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + celeste + "   █. \r\n"
									+ " ." + azul + " `/ /  `/ /   " + celeste + "██. \r\n" + " ." + azul
									+ " `-'   `-'  " + celeste + "████. \r\n" + " .████████████████. \r\n"
									+ " .‹.‹.‹.‹.‹.‹.‹.‹.‹ \r\n" + " .....-«" + azul + "🄸🄺🄴🅁" + celeste
									+ "«-..... \r\n" + " .................. \r\n" + " .." + azul + "EST" + celeste + "-"
									+ azul + "90" + celeste + ".." + azul + "HOB" + celeste + "-" + azul + "99"
									+ celeste + ".. \r\n" + " .." + azul + "POP" + celeste + "-" + azul + "94" + celeste
									+ ".." + azul + "BON" + celeste + "-" + azul + "99" + celeste + ".. \r\n" + " .."
									+ azul + "MNT" + celeste + "-" + azul + "95" + celeste + ".." + azul + "SUE"
									+ celeste + "-" + azul + "95" + celeste + ".. \r\n" + "   ......" + azul + "《《"
									+ celeste + "......   \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (flashback2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								flashback2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2500€)");
								dinero = dinero + 2500;
								System.out.println("");

							}
						}

					}

					System.out.println(
							"---------------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("(Introduce cualquier número para voler)");
					enter = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

				}

				else if (eleccionSobres == 5 && dinero >= 50) {

					dinero = dinero - 50;

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					System.out.println(celeste + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
							+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
							+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
							+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
							+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
							+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
							+ "..::.:-" + amarillo + "暗" + blanco + "██" + amarillo + "い" + celeste
							+ ".-::.:.. \u001B[0m");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(celeste + "..::::---" + blanco + "██" + celeste + "--::::::.\r\n" + "..:-=++*#"
							+ blanco + "██" + celeste + "*=-----:.\r\n" + ".:+-:=#%#" + blanco + "██" + celeste
							+ "+======:.\r\n" + ".:+--==+*" + blanco + "██" + celeste + "+=+====:.\r\n" + ".:-==::+*"
							+ blanco + "██" + celeste + "+==--+=:.\r\n" + ".-=-===#*" + blanco + "██" + celeste
							+ "=++#**=.\r\n" + ".=###++*=" + blanco + "██" + celeste + "=*#=%**=.\r\n" + ".-*%#***#"
							+ blanco + "██" + celeste + "%%++*#=.\r\n" + ".:......-" + blanco + "██" + celeste
							+ "%#+=++-=.\r\n" + ".....:..:" + blanco + "██" + celeste + "+##+=%%=.\r\n" + ".:+=++-:="
							+ blanco + "██" + celeste + "%%##@%%=.\r\n" + ".:=+*=--=" + blanco + "██" + celeste
							+ "*%%=%%%=.\r\n" + ".:======+" + blanco + "██" + celeste + "=+**#%#-.\r\n" + ".--=*+*+="
							+ blanco + "██" + celeste + "====-=+:.\r\n" + ".---=::=+" + blanco + "██" + celeste
							+ "==+=::::.\r\n" + "..:-*+#%%" + blanco + "██" + celeste + "+=++=-::.\r\n" + "..=--+*##"
							+ blanco + "██" + celeste + "*+====--.\r\n" + "...::.:" + amarillo + "暗  " + amarillo + "い"
							+ celeste + ".-::.:.\u001B[0m ");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(celeste + ".::::--" + blanco + "█    █" + celeste + "-:::::\r\n" + ".:-=++*"
							+ blanco + "█    █" + celeste + "=-----\r\n" + ":+-:=#%" + blanco + "█    █" + celeste
							+ "======\r\n" + ":+--==+" + blanco + "█    █" + celeste + "=+====\r\n" + ":-==::+" + blanco
							+ "█    █" + celeste + "==--+=\r\n" + "-=-===#" + blanco + "█    █" + celeste + "=++#**\r\n"
							+ "=###++*" + blanco + "█    █" + celeste + "*#=%**\r\n" + ".-*#***" + blanco + "█    █"
							+ celeste + "%%++*#\r\n" + ".:....." + blanco + "█    █" + celeste + "#+=++-\r\n"
							+ "....:.." + blanco + "█    █" + celeste + "##+=%%\r\n" + ".:+=+-:" + blanco + "█    █"
							+ celeste + "%##@%%\r\n" + ".:=+=--" + blanco + "█    █" + celeste + "%%=%%%\r\n"
							+ ".:=====" + blanco + "█    █" + celeste + "+**#%#\r\n" + ".--=+*+" + blanco + "█    █"
							+ celeste + "===-=+\r\n" + ".---=:=" + blanco + "█    █" + celeste + "=+=:::\r\n"
							+ "..:-+#%" + blanco + "█    █" + celeste + "=++=-:\r\n" + "..=-+*#" + blanco + "█    █"
							+ celeste + "*+====\r\n" + "..:.:" + amarillo + "暗\u001B[0m     " + amarillo + "い" + celeste
							+ ".-::.. \u001B[0m");

					randomNumeroCalidad = Math.random();
					Thread.sleep(1000);

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (randomNumeroCalidad >= 0.5) {

						animacionComun AnimacionComun = new animacionComun();
						AnimacionComun.ejecutar();

						Thread.sleep(1500);
						randomNumeroComun = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroComun >= 0.94444) {

							System.out.println("                      \r\n" + "    ............     \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     .  \r\n"
									+ " .{ {} } / /      .  \r\n" + " .{ {} }{ {} }    .  \r\n"
									+ " . `--'  `--'     .  \r\n" + " .                .  \r\n"
									+ " ..................  \r\n" + " .....--PUCCI-.....  \r\n"
									+ " ..................  \r\n" + " ..EST-51..HOB-89..  \r\n"
									+ " ..POP-90..BON-86..  \r\n" + " ..MNT-89..SUE-80..  \r\n"
									+ "   ......==......    \r\n" + "        ....         \r\n"
									+ "                      ");
							Thread.sleep(1500);
							if (comun1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección.");
								comun1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.88888) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--MARCOS--.... \r\n"
									+ " .................. \r\n" + " ..EST-56..HOB-86.. \r\n"
									+ " ..POP-63..BON-93.. \r\n" + " ..MNT-87..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....    \r\n" + "");
							Thread.sleep(1500);
							if (comun2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.83332) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--JAVIER--.... \r\n"
									+ " .................. \r\n" + " ..EST-81..HOB-79.. \r\n"
									+ " ..POP-80..BON-87.. \r\n" + " ..MNT-73..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....     \r\n" + "");
							Thread.sleep(1500);
							if (comun3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.77776) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GABO--..... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-91.. \r\n"
									+ " ..POP-48..BON-91.. \r\n" + " ..MNT-70..SUE-72.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.7222) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JAUME—..... \r\n"
									+ " .................. \r\n" + " ..EST-60..HOB-92.. \r\n"
									+ " ..POP-78..BON-84.. \r\n" + " ..MNT-72..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.66664) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .--.     . \r\n"
									+ " .{ {} }{ {} }    . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IZAN--..... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-91..BON-84.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.61108) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---. .---.     . \r\n"
									+ " .`-`} }`-`} }    . \r\n" + " .  / /   / /     . \r\n"
									+ " . `-'   `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-65.. \r\n"
									+ " ..POP-39..BON-78.. \r\n" + " ..MNT-70..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.55552) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " .{ {} }' `-' '   . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-94..HOB-69.. \r\n"
									+ " ..POP-48..BON-82.. \r\n" + " ..MNT-71..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.49996) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---`     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IVÁN--..... \r\n"
									+ " .................. \r\n" + " ..EST-77..HOB-62.. \r\n"
									+ " ..POP-93..BON-80.. \r\n" + " ..MNT-82..SUE-75.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.4444) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--BRUNO—..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-73.. \r\n"
									+ " ..POP-83..BON-89.. \r\n" + " ..MNT-78..SUE-70.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun10 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun10 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.38884) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IKER--..... \r\n"
									+ " .................. \r\n" + " ..EST-83..HOB-81.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun11 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun11 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.33328) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--LUIS--..... \r\n"
									+ " .................. \r\n" + " ..EST-53..HOB-74.. \r\n"
									+ " ..POP-89..BON-84.. \r\n" + " ..MNT-79..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun12 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun12 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.27772) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--NACHO—..... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-70.. \r\n"
									+ " ..POP-87..BON-89.. \r\n" + " ..MNT-75..SUE-85.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun13 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun13 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.22216) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }  / /     . \r\n"
									+ " . `--'  `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JOSE--..... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-78.. \r\n"
									+ " ..POP-84..BON-86.. \r\n" + " ..MNT-72..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun14 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun14 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.1666) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GAEL--..... \r\n"
									+ " .................. \r\n" + " ..EST-64..HOB-79.. \r\n"
									+ " ..POP-86..BON-90.. \r\n" + " ..MNT-90..SUE-77.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun15 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun15 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.11104) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---.  .--.     . \r\n"
									+ " .`-`} }{ {} }    . \r\n" + " .  / / { {} }    . \r\n"
									+ " . `-'   `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--ALEJANDRO-... \r\n"
									+ " .................. \r\n" + " ..EST-41..HOB-95.. \r\n"
									+ " ..POP-79..BON-80.. \r\n" + " ..MNT-70..SUE-71.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun16 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun16 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.05548) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--FERRÁN--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-72.. \r\n"
									+ " ..POP-84..BON-85.. \r\n" + " ..MNT-89..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun17 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun17 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' '   . \r\n"
									+ " . `-'   `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-97..HOB-80.. \r\n"
									+ " ..POP-86..BON-82.. \r\n" + " ..MNT-84..SUE-81.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);

							if (comun18 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun18 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

					}

					else if (randomNumeroCalidad >= 0.25) {

						animacionEspecial AnimacionEspecial = new animacionEspecial();
						AnimacionEspecial.ejecutar();

						Thread.sleep(1500);
						randomNumeroEspecial = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroEspecial >= 0.93333333334) {

							System.out.println(magenta + "Sobresaliente\u001B[0m");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .--.     . \r\n" + " .{ {} }{ {} }    . \r\n"
											+ " .{ {} } `/ /   " + magenta + " █" + verde + ". \r\n" + " . `--'  `-'  "
											+ magenta + "  ██" + verde + ". \r\n" + " .            " + magenta + "████"
											+ verde + ". \r\n" + " .................. \r\n" + " .....--GABO--..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-93.. \r\n"
											+ " ..POP-53..BON-95.. \r\n" + " ..MNT-80..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.86666666668) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'    `-'  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-74.. \r\n"
									+ " ..POP-49..BON-82.. \r\n" + " ..MNT-79..SUE-89.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.80000000002) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `--'  `--'   " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-79.. \r\n"
									+ " ..POP-58..BON-85.. \r\n" + " ..MNT-79..SUE-87.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.73333333336) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n" + " . `/ / | }   "
											+ magenta + "   █" + verde + ". \r\n" + " . `-'  `-'     " + magenta + "██"
											+ verde + ". \r\n" + " .            " + magenta + "████" + verde + ". \r\n"
											+ " .................. \r\n" + " .....--BRUNO-..... \r\n"
											+ " .................. \r\n" + " ..EST-99..HOB-78.. \r\n"
											+ " ..POP-86..BON-91.. \r\n" + " ..MNT-79..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.6666666667) {

							System.out.println("");
							System.out.println(magenta + "Sobresaliente");
							Thread.sleep(1500);
							System.out.println(verde + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + magenta + " █" + verde
									+ ". \r\n" + " . `-'  `----`  " + magenta + "██" + verde + ". \r\n"
									+ " .            " + magenta + "████" + verde + ". \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-99..HOB-84.. \r\n"
									+ " ..POP-89..BON-86.. \r\n" + " ..MNT-87..SUE-83.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialSobresaliente5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialSobresaliente5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.60000000004) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-59..HOB-89.. \r\n"
											+ " ..POP-99..BON-90.. \r\n" + " ..MNT-91..SUE-82.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}

						}

						else if (randomNumeroEspecial >= 0.53333333338) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + azul + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--JAVIER--.... \r\n"
											+ " .................. \r\n" + " ..EST-88..HOB-82.. \r\n"
											+ " ..POP-90..BON-94.. \r\n" + " ..MNT-76..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.46666666672) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-87.. \r\n"
											+ " ..POP-99..BON-88.. \r\n" + " ..MNT-89..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.40000000006) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + azul + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--JAUME-..... \r\n"
											+ " .................. \r\n" + " ..EST-67..HOB-91.. \r\n"
											+ " ..POP-88..BON-86.. \r\n" + " ..MNT-80..SUE-95.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.3333333334) {

							System.out.println("");
							System.out.println(azul + "Reconocimiento");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " .{ {} }  / /    " + azul + "█" + verde + ". \r\n" + " . `--'  `-'    "
											+ azul + "██" + verde + ". \r\n" + " .            " + azul + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IVÁN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-68.. \r\n"
											+ " ..POP-99..BON-83.. \r\n" + " ..MNT-85..SUE-77.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialReconocimiento5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialReconocimiento5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.26666666674) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .---.     . \r\n" + " .{ {} }`-`} }    . \r\n"
											+ " . `/ / { {.-.   " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--PUCCI-..... \r\n"
											+ " .................. \r\n" + " ..EST-60..HOB-91.. \r\n"
											+ " ..POP-96..BON-92.. \r\n" + " ..MNT-99..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.20000000008) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-.       . \r\n" + " .{ {} }{ |       . \r\n"
											+ " . `/ / | }      " + rojo + "█" + verde + ". \r\n" + " . `-'  `-'     "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IKER--..... \r\n"
											+ " .................. \r\n" + " ..EST-87..HOB-84.. \r\n"
											+ " ..POP-84..BON-81.. \r\n" + " ..MNT-96..SUE-83.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.13333333342) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--FERRÁN--.... \r\n"
											+ " .................. \r\n" + " ..EST-78..HOB-76.. \r\n"
											+ " ..POP-89..BON-87.. \r\n" + " ..MNT-99..SUE-81.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0.06666666676) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--.  .---.    . \r\n" + " .{ {} }. .-. .   . \r\n"
											+ " . `/ / ' `-' '  " + rojo + "█" + verde + ". \r\n" + " . `-'   `---'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " ....--MARCOS--.... \r\n"
											+ " .................. \r\n" + " ..EST-65..HOB-93.. \r\n"
											+ " ..POP-72..BON-97.. \r\n" + " ..MNT-97..SUE-88.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\n\\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

						else if (randomNumeroEspecial >= 0) {

							System.out.println("");
							System.out.println(rojo + "Momentum");
							Thread.sleep(1500);
							System.out.println(
									verde + "\r\n" + "\r\n" + "    ............    \r\n" + "  .              .   \r\n"
											+ " . .--. .-..-.    . \r\n" + " .{ {} }| || |    . \r\n"
											+ " . `/ /  `-| }   " + rojo + "█" + verde + ". \r\n" + " . `-'     `-'  "
											+ rojo + "██" + verde + ". \r\n" + " .            " + rojo + "████" + verde
											+ ". \r\n" + " .................. \r\n" + " .....--IZAN--..... \r\n"
											+ " .................. \r\n" + " ..EST-80..HOB-91.. \r\n"
											+ " ..POP-95..BON-89.. \r\n" + " ..MNT-96..SUE-84.. \r\n"
											+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (especialMomentum5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								especialMomentum5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2.5€)");
								dinero = dinero + 2.5;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.1) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoPOWER = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoPOWER >= 0.75) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--.  .---.   █. \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' ' ██. \r\n"
									+ " . `-'   `---' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--𝒩𝒜𝒞ℋ𝒪--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-86.. \r\n"
									+ " ..POP-79..BON-88.. \r\n" + " ..MNT-90..SUE-93.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoPOWER >= 0.50) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .---.    █. \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  ██. \r\n"
									+ " . `-'  `----` ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " ....--ℱℰℛℛ𝒜𝒩-.... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-79.. \r\n"
									+ " ..POP-90..BON-92.. \r\n" + " ..MNT-98..SUE-82.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0.25) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'    ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--ℐ𝒱𝒜𝒩-..... \r\n"
									+ " .................. \r\n" + " ..EST-87..HOB-71.. \r\n"
									+ " ..POP-99..BON-89.. \r\n" + " ..MNT-90..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

						else if (randomNumeroFanaticoPOWER >= 0) {

							System.out.println("");
							System.out.println(magenta + "POWER\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .           ███.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-' ███. \r\n" + " .██        ██████. \r\n"
									+ " .................. \r\n" + " .....--𝒥𝒪𝒮ℰ--..... \r\n"
									+ " .................. \r\n" + " ..EST-90..HOB-86.. \r\n"
									+ " ..POP-93..BON-96.. \r\n" + " ..MNT-81..SUE-88.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoPOWER4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoPOWER4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(12.5€)");
								dinero = dinero + 12.5;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.0035) {

						animacionFanatico AnimacionFanatico = new animacionFanatico();
						AnimacionFanatico.ejecutar();

						Thread.sleep(1500);
						randomNumeroFanaticoMEGA = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFanaticoMEGA >= 0.75) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓛𝓤𝓘𝓢" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "78" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "98" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "92" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "89" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "83" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.5) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ....--" + celeste
									+ "𝓙𝓐𝓥𝓘𝓔𝓡" + magenta + "--.... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "96" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "91" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "94" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "93" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "80" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);
							if (fanaticoMEGA2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0.25) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--. .---.    " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }`-`} }    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `----` " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " ..--" + celeste
									+ "𝓐𝓛𝓔𝓙𝓐𝓝𝓓𝓡𝓞" + magenta + "--.. \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "71" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "90" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "90" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "88" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "92" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}

						}

						else if (randomNumeroFanaticoMEGA >= 0) {

							System.out.println("");
							System.out.println(celeste + "MEGA\u001B[0m");
							Thread.sleep(1500);
							System.out.println(magenta + "\r\n" + "\r\n" + "    ............    \r\n" + "  .           "
									+ celeste + "███" + magenta + ".   \r\n" + " . .--.  .---.   " + celeste + "█"
									+ magenta + ". \r\n" + " .{ {} }{ {`-'    . \r\n" + " . `/ / .-.} }  " + celeste
									+ "██" + magenta + ". \r\n" + " . `-'  `---'  " + celeste + "███" + magenta
									+ ". \r\n" + " ." + celeste + "██" + magenta + "        " + celeste + "██████"
									+ magenta + ". \r\n" + " .................. \r\n" + " .....--" + celeste
									+ "𝓖𝓐𝓔𝓛" + magenta + "--..... \r\n" + " .................. \r\n" + " .."
									+ celeste + "EST" + magenta + "-" + celeste + "74" + magenta + ".." + celeste
									+ "HOB" + magenta + "-" + celeste + "83" + magenta + ".. \r\n" + " .." + celeste
									+ "POP" + magenta + "-" + celeste + "99" + magenta + "" + ".." + celeste + "BON"
									+ magenta + "-" + celeste + "99" + magenta + ".. \r\n" + " .." + celeste + "MNT"
									+ magenta + "-" + celeste + "98" + magenta + ".." + celeste + "SUE" + magenta + "-"
									+ celeste + "84" + magenta + ".. \r\n" + "   ......==......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(1500);

							if (fanaticoMEGA4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								fanaticoMEGA4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(25€)");
								dinero = dinero + 25;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad >= 0.001) {

						animacionFlashback AnimacionFlashback = new animacionFlashback();
						AnimacionFlashback.ejecutar();

						Thread.sleep(1500);
						randomNumeroFlashback = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFlashback >= 0.5) {

							Thread.sleep(3000);
							System.out.println(celeste + "\r\n" + "\r\n" + "    ...." + azul + "«««" + celeste
									+ ".....    \r\n" + "  .██████ ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ celeste + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + celeste + "   █. \r\n"
									+ " ." + azul + " `/ /  `/ /   " + celeste + "██. \r\n" + " ." + azul
									+ " `-'   `-'  " + celeste + "████. \r\n" + " .████████████████. \r\n"
									+ " .‹.‹.‹.‹.‹.‹.‹.‹.‹ \r\n" + " ..-«" + azul + "🄰🄻🄴🄹🄰🄽🄳🅁🄾" + celeste
									+ "«-... \r\n" + " .................. \r\n" + " .." + azul + "EST" + celeste + "-"
									+ azul + "72" + celeste + ".." + azul + "HOB" + celeste + "-" + azul + "99"
									+ celeste + ".. \r\n" + " .." + azul + "POP" + celeste + "-" + azul + "98" + celeste
									+ ".." + azul + "BON" + celeste + "-" + azul + "98" + celeste + ".. \r\n" + " .."
									+ azul + "MNT" + celeste + "-" + azul + "98" + celeste + ".." + azul + "SUE"
									+ celeste + "-" + azul + "98" + celeste + ".. \r\n" + "   ......" + azul + "《《"
									+ celeste + "......   \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (flashback1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								flashback1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2500€)");
								dinero = dinero + 2500;
								System.out.println("");

							}

						}

						else if (randomNumeroFlashback >= 0) {

							Thread.sleep(3000);
							System.out.println(celeste + "\r\n" + "\r\n" + "    ...." + azul + "«««" + celeste
									+ ".....    \r\n" + "  .██████ ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ celeste + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + celeste + "   █. \r\n"
									+ " ." + azul + " `/ /  `/ /   " + celeste + "██. \r\n" + " ." + azul
									+ " `-'   `-'  " + celeste + "████. \r\n" + " .████████████████. \r\n"
									+ " .‹.‹.‹.‹.‹.‹.‹.‹.‹ \r\n" + " .....-«" + azul + "🄸🄺🄴🅁" + celeste
									+ "«-..... \r\n" + " .................. \r\n" + " .." + azul + "EST" + celeste + "-"
									+ azul + "90" + celeste + ".." + azul + "HOB" + celeste + "-" + azul + "99"
									+ celeste + ".. \r\n" + " .." + azul + "POP" + celeste + "-" + azul + "94" + celeste
									+ ".." + azul + "BON" + celeste + "-" + azul + "99" + celeste + ".. \r\n" + " .."
									+ azul + "MNT" + celeste + "-" + azul + "95" + celeste + ".." + azul + "SUE"
									+ celeste + "-" + azul + "95" + celeste + ".. \r\n" + "   ......" + azul + "《《"
									+ celeste + "......   \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (flashback2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								flashback2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2500€)");
								dinero = dinero + 2500;
								System.out.println("");

							}
						}

					}

					else if (randomNumeroCalidad < 0.001) {

						animacionOmega AnimacionOmega = new animacionOmega();
						AnimacionOmega.ejecutar();

						Thread.sleep(2500);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						System.out.println(blanco + "            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓            \r\n" + "         ▓▓▓▓▓▓---"
								+ blanco + "ℙ𝕦𝕔𝕔𝕚" + blanco + "---▓▓▓▓▓▓         \r\n"
								+ "       ▓▓▓▓▓               ▓▓▓▓▓       \r\n"
								+ "     ▓▓▓▓▓                  ▓▓▓▓▓▓    \r\n" + "    ▓▓▓▓▓----" + blanco + "𝔼𝕊𝕋"
								+ blanco + "-" + blanco + "𝟡𝟡" + blanco + "-" + blanco + "ℍ𝕆𝔹" + blanco + "-"
								+ amarillo + "𝟏𝟎𝟎" + blanco + "----▓▓▓▓▓   \r\n" + "    ▓▓▓▓ " + amarillo
								+ " ███   █████   █████ " + blanco + "  ▓▓▓▓   \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███  █     █ █     █" + blanco + "  ▓▓▓▓▓  \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███  █     █ █     █" + blanco + "  ▓▓▓▓▓  \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███   █████   █████ " + blanco + "  ▓▓▓▓▓  \r\n" + "    ▓▓▓▓▓--" + blanco + "ℙ𝕆ℙ"
								+ blanco + "-" + amarillo + "𝟏𝟎𝟎" + blanco + "------" + blanco + "𝔹𝕆ℕ" + blanco
								+ "-" + blanco + "𝟡𝟡" + blanco + "--▓▓▓▓▓   \r\n"
								+ "     ▓▓▓▓▓---------------------▓▓▓▓▓    \r\n" + "      ▓▓▓▓▓--" + blanco + "𝕄ℕ𝕋"
								+ blanco + "-" + amarillo + "𝟏𝟎𝟎" + blanco + "--" + blanco + "𝕊𝕌𝔼" + blanco + "-"
								+ blanco + "𝟡𝟡" + blanco + "--▓▓▓▓▓     \r\n"
								+ "       ▓▓▓▓▓▓              ▓▓▓▓▓▓      \r\n"
								+ "▓▓▓      ▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓     ▓▓▓\r\n"
								+ "▓▓           ▓▓▓        ▓▓▓          ▓▓\r\n"
								+ "▓▓▓▓      ▓▓▓▓▓▓        ▓▓▓▓▓▓     ▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓  ▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓  ▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\u001B[0m");
						if (omega1 == false) {

							System.out.println("\nSe te ha añadido la carta a tu colección");
							omega1 = true;
							System.out.println("");
						}

						else {

							System.out.println(
									"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(5000€)");
							dinero = dinero + 5000;
							System.out.println("");

						}

					}

					System.out.println(
							"---------------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("(Introduce cualquier número para voler)");
					enter = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

				}

				else if (eleccionSobres == 6 && dinero >= 2000) {

					dinero = dinero - 2000;

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					System.out.println(rojo + "..::::-------::::::.\r\n" + "..:-=++*###*=-----:.\r\n"
							+ ".:+-:=#%#%#+======:.\r\n" + ".:+--==+**++=+====:.\r\n" + ".:-==::+*+++==--+=:.\r\n"
							+ ".-=-===#*=+==++#**=.\r\n" + ".=###++*=+==*#=%**=.\r\n" + ".-*%#***#%%%%%++*#=.\r\n"
							+ ".:......-##%#+=++-=.\r\n" + ".....:..:*++##+=%%=.\r\n" + ".:+=++-:=%%%%##@%%=.\r\n"
							+ ".:=+*=--=++*%%=%%%=.\r\n" + ".:======+===+**#%#-.\r\n" + ".--=*+*+=======-=+:.\r\n"
							+ ".---=::=+====+=::::.\r\n" + "..:-*+#%%%*+=++=-::.\r\n" + "..=--+*####*+====--.\r\n"
							+ "..::.:-" + blanco + "運" + rojo + "██" + blanco + "運" + rojo + ".-::.:.. \u001B[0m");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(rojo + "..::::---" + rojo + "██" + rojo + "--::::::.\r\n" + "..:-=++*#" + rojo
							+ "██" + rojo + "*=-----:.\r\n" + ".:+-:=#%#" + rojo + "██" + rojo + "+======:.\r\n"
							+ ".:+--==+*" + rojo + "██" + rojo + "+=+====:.\r\n" + ".:-==::+*" + rojo + "██" + rojo
							+ "+==--+=:.\r\n" + ".-=-===#*" + rojo + "██" + rojo + "=++#**=.\r\n" + ".=###++*=" + rojo
							+ "██" + rojo + "=*#=%**=.\r\n" + ".-*%#***#" + rojo + "██" + rojo + "%%++*#=.\r\n"
							+ ".:......-" + rojo + "██" + rojo + "%#+=++-=.\r\n" + ".....:..:" + rojo + "██" + rojo
							+ "+##+=%%=.\r\n" + ".:+=++-:=" + rojo + "██" + rojo + "%%##@%%=.\r\n" + ".:=+*=--=" + rojo
							+ "██" + rojo + "*%%=%%%=.\r\n" + ".:======+" + rojo + "██" + rojo + "=+**#%#-.\r\n"
							+ ".--=*+*+=" + rojo + "██" + rojo + "====-=+:.\r\n" + ".---=::=+" + rojo + "██" + rojo
							+ "==+=::::.\r\n" + "..:-*+#%%" + rojo + "██" + rojo + "+=++=-::.\r\n" + "..=--+*##" + rojo
							+ "██" + rojo + "*+====--.\r\n" + "...::.:-" + blanco + "運" + blanco + "運" + rojo
							+ ".-::.:.\u001B[0m ");

					Thread.sleep(500);
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println(rojo + ".::::--" + rojo + "█    █" + rojo + "-:::::\r\n" + ".:-=++*" + rojo
							+ "█    █" + rojo + "=-----\r\n" + ":+-:=#%" + rojo + "█    █" + rojo + "======\r\n"
							+ ":+--==+" + rojo + "█    █" + rojo + "=+====\r\n" + ":-==::+" + rojo + "█    █" + rojo
							+ "==--+=\r\n" + "-=-===#" + rojo + "█    █" + rojo + "=++#**\r\n" + "=###++*" + rojo
							+ "█    █" + rojo + "*#=%**\r\n" + ".-*#***" + rojo + "█    █" + rojo + "%%++*#\r\n"
							+ ".:....." + rojo + "█    █" + rojo + "#+=++-\r\n" + "....:.." + rojo + "█    █" + rojo
							+ "##+=%%\r\n" + ".:+=+-:" + rojo + "█    █" + rojo + "%##@%%\r\n" + ".:=+=--" + rojo
							+ "█    █" + rojo + "%%=%%%\r\n" + ".:=====" + rojo + "█    █" + rojo + "+**#%#\r\n"
							+ ".--=+*+" + rojo + "█    █" + rojo + "===-=+\r\n" + ".---=:=" + rojo + "█    █" + rojo
							+ "=+=:::\r\n" + "..:-+#%" + rojo + "█    █" + rojo + "=++=-:\r\n" + "..=-+*#" + rojo
							+ "█    █" + rojo + "*+====\r\n" + "..:..:" + blanco + "運\u001B[0m    " + blanco + "運"
							+ rojo + ".-::. \u001B[0m");

					randomNumeroCalidad = Math.random();
					Thread.sleep(1000);

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (randomNumeroCalidad >= 0.1) {

						animacionComun AnimacionComun = new animacionComun();
						AnimacionComun.ejecutar();

						Thread.sleep(1500);
						randomNumeroComun = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroComun >= 0.94444) {

							System.out.println("                      \r\n" + "    ............     \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     .  \r\n"
									+ " .{ {} } / /      .  \r\n" + " .{ {} }{ {} }    .  \r\n"
									+ " . `--'  `--'     .  \r\n" + " .                .  \r\n"
									+ " ..................  \r\n" + " .....--PUCCI-.....  \r\n"
									+ " ..................  \r\n" + " ..EST-51..HOB-89..  \r\n"
									+ " ..POP-90..BON-86..  \r\n" + " ..MNT-89..SUE-80..  \r\n"
									+ "   ......==......    \r\n" + "        ....         \r\n"
									+ "                      ");
							Thread.sleep(1500);
							if (comun1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección.");
								comun1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.88888) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--MARCOS--.... \r\n"
									+ " .................. \r\n" + " ..EST-56..HOB-86.. \r\n"
									+ " ..POP-63..BON-93.. \r\n" + " ..MNT-87..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....    \r\n" + "");
							Thread.sleep(1500);
							if (comun2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.83332) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--JAVIER--.... \r\n"
									+ " .................. \r\n" + " ..EST-81..HOB-79.. \r\n"
									+ " ..POP-80..BON-87.. \r\n" + " ..MNT-73..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....     \r\n" + "");
							Thread.sleep(1500);
							if (comun3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.77776) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GABO--..... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-91.. \r\n"
									+ " ..POP-48..BON-91.. \r\n" + " ..MNT-70..SUE-72.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.7222) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JAUME—..... \r\n"
									+ " .................. \r\n" + " ..EST-60..HOB-92.. \r\n"
									+ " ..POP-78..BON-84.. \r\n" + " ..MNT-72..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.66664) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .--.     . \r\n"
									+ " .{ {} }{ {} }    . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IZAN--..... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-91..BON-84.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.61108) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---. .---.     . \r\n"
									+ " .`-`} }`-`} }    . \r\n" + " .  / /   / /     . \r\n"
									+ " . `-'   `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--AMIR--..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-65.. \r\n"
									+ " ..POP-39..BON-78.. \r\n" + " ..MNT-70..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.55552) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " .{ {} }' `-' '   . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--CRISTIAN--... \r\n"
									+ " .................. \r\n" + " ..EST-94..HOB-69.. \r\n"
									+ " ..POP-48..BON-82.. \r\n" + " ..MNT-71..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.49996) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---`     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IVÁN--..... \r\n"
									+ " .................. \r\n" + " ..EST-77..HOB-62.. \r\n"
									+ " ..POP-93..BON-80.. \r\n" + " ..MNT-82..SUE-75.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.4444) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--BRUNO—..... \r\n"
									+ " .................. \r\n" + " ..EST-95..HOB-73.. \r\n"
									+ " ..POP-83..BON-89.. \r\n" + " ..MNT-78..SUE-70.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun10 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun10 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.38884) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--IKER--..... \r\n"
									+ " .................. \r\n" + " ..EST-83..HOB-81.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-86..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun11 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun11 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.33328) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }{ {.-.    . \r\n"
									+ " . `--'  `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--LUIS--..... \r\n"
									+ " .................. \r\n" + " ..EST-53..HOB-74.. \r\n"
									+ " ..POP-89..BON-84.. \r\n" + " ..MNT-79..SUE-80.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun12 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun12 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.27772) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .-..-.    . \r\n"
									+ " .{ {} }| || |    . \r\n" + " .{ {} } `-| }    . \r\n"
									+ " . `--'    `-'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--NACHO—..... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-70.. \r\n"
									+ " ..POP-87..BON-89.. \r\n" + " ..MNT-75..SUE-85.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun13 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun13 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.22216) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--. .---.     . \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " .{ {} }  / /     . \r\n"
									+ " . `--'  `-'      . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--JOSE--..... \r\n"
									+ " .................. \r\n" + " ..EST-85..HOB-78.. \r\n"
									+ " ..POP-84..BON-86.. \r\n" + " ..MNT-72..SUE-84.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun14 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun14 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.1666) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.   .-.     . \r\n"
									+ " .{ {} } / /      . \r\n" + " .{ {} }{ {} }    . \r\n"
									+ " . `--'  `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " .....--GAEL--..... \r\n"
									+ " .................. \r\n" + " ..EST-64..HOB-79.. \r\n"
									+ " ..POP-86..BON-90.. \r\n" + " ..MNT-90..SUE-77.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun15 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun15 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.11104) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " ..---.  .--.     . \r\n"
									+ " .`-`} }{ {} }    . \r\n" + " .  / / { {} }    . \r\n"
									+ " . `-'   `--'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ...--ALEJANDRO-... \r\n"
									+ " .................. \r\n" + " ..EST-41..HOB-95.. \r\n"
									+ " ..POP-79..BON-80.. \r\n" + " ..MNT-70..SUE-71.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun16 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun16 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0.05548) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }{ {`-'    . \r\n" + " .{ {} }.-.} }    . \r\n"
									+ " . `--' `---'     . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--FERRÁN--.... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-72.. \r\n"
									+ " ..POP-84..BON-85.. \r\n" + " ..MNT-89..SUE-78.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);
							if (comun17 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun17 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

						else if (randomNumeroComun >= 0) {

							System.out.println("\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .              .   \r\n" + " . .--.  .---.    . \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' '   . \r\n"
									+ " . `-'   `---'    . \r\n" + " .                . \r\n"
									+ " .................. \r\n" + " ....--DANIEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-97..HOB-80.. \r\n"
									+ " ..POP-86..BON-82.. \r\n" + " ..MNT-84..SUE-81.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "");
							Thread.sleep(1500);

							if (comun18 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								comun18 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(0.5€)");
								dinero = dinero + 0.5;
								System.out.println("");

							}

						}

					} else if (randomNumeroCalidad >= 0.05) {

						animacionIcono AnimacionIcono = new animacionIcono();
						AnimacionIcono.ejecutar();

						Thread.sleep(1500);
						randomNumeroIcono = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroIcono >= 0.88888888889) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....-ENRIQUE--.... \r\n"
									+ " .................. \r\n" + " ..EST-87..HOB-87.. \r\n"
									+ " ..POP-81..BON-98.. \r\n" + " ..MNT-91..SUE-91.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}

						}

						else if (randomNumeroIcono >= 0.77777777778) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " .....--XEMA--..... \r\n"
									+ " .................. \r\n" + " ..EST-67..HOB-85.. \r\n"
									+ " ..POP-97..BON-80.. \r\n" + " ..MNT-93..SUE-94.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.66666666667) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--MIGUEL--.... \r\n"
									+ " .................. \r\n" + " ..EST-89..HOB-97.. \r\n"
									+ " ..POP-81..BON-77.. \r\n" + " ..MNT-88..SUE-86.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.55555555556) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--HECTOR--.... \r\n"
									+ " .................. \r\n" + " ..EST-63..HOB-84.. \r\n"
									+ " ..POP-95..BON-87.. \r\n" + " ..MNT-94..SUE-92.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.44444444445) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--BRANDON-.... \r\n"
									+ " .................. \r\n" + " ..EST-71..HOB-92.. \r\n"
									+ " ..POP-92..BON-76.. \r\n" + " ..MNT-88..SUE-97.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.33333333334) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .---.    █. \r\n"
									+ " .{ {} }`-`} }    . \r\n" + " . `/ / { {.-.  ██. \r\n"
									+ " . `-'   `---'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--SALAZAR-.... \r\n"
									+ " .................. \r\n" + " ..EST-70..HOB-94.. \r\n"
									+ " ..POP-94..BON-86.. \r\n" + " ..MNT-90..SUE-90.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono6 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono6 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.22222222223) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-..-.   █. \r\n"
									+ " .{ {} }| || |    . \r\n" + " . `/ /  `-| }  ██. \r\n"
									+ " . `-'     `-'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--JORGE--..... \r\n"
									+ " .................. \r\n" + " ..EST-69..HOB-93.. \r\n"
									+ " ..POP-91..BON-98.. \r\n" + " ..MNT-87..SUE-93.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono7 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono7 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0.11111111112) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--.  .---.   █. \r\n"
									+ " .{ {} }. .-. .   . \r\n" + " . `/ / ' `-' ' ██. \r\n"
									+ " . `-'   `---'████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ....--MANUEL-..... \r\n"
									+ " .................. \r\n" + " ..EST-71..HOB-92.. \r\n"
									+ " ..POP-79..BON-91.. \r\n" + " ..MNT-80..SUE-95.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono8 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono8 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

						else if (randomNumeroIcono >= 0) {

							System.out.println(amarillo + "\r\n" + "\r\n" + "    ............    \r\n"
									+ "  .█          ██.   \r\n" + " . .--. .-.      █. \r\n"
									+ " .{ {} }{ |       . \r\n" + " . `/ / | }     ██. \r\n"
									+ " . `-'  `-'   ████. \r\n" + " .██     █████████. \r\n"
									+ " .................. \r\n" + " ......--PAU-...... \r\n"
									+ " .................. \r\n" + " ..EST-74..HOB-85.. \r\n"
									+ " ..POP-81..BON-89.. \r\n" + " ..MNT-93..SUE-92.. \r\n"
									+ "   ......==......   \r\n" + "        ....        \r\n" + "\u001B[0m ");
							Thread.sleep(3000);
							if (icono9 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								icono9 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(125€)");
								dinero = dinero + 125;
								System.out.println("");

							}
						}

					} else if (randomNumeroCalidad >= 0.02) {

						animacionSOTY AnimacionSOTY = new animacionSOTY();
						AnimacionSOTY.ejecutar();

						Thread.sleep(1500);
						randomNumeroSOTY = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroSOTY >= 0.8) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--. .---.  " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }`-`} }   " + azul + "█. \r\n" + " ." + amarillo + " `/ /   / /   " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'   `-'  " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐏𝐔𝐂𝐂𝐈--" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "70" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "99" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "99" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "98" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "88" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY1 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}

						}

						else if (randomNumeroSOTY >= 0.6) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .---. " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {`-'   " + azul + "█. \r\n" + " ." + amarillo + " `/ / .-.} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `---' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ...." + amarillo
									+ "--𝐌𝐀𝐑𝐂𝐎𝐒--" + azul + ".... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "72" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "98" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "81" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "99" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "91" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY2 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY >= 0.4) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .--.  " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {} }   " + azul + "█. \r\n" + " ." + amarillo + " `/ / { {} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'   `--' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ......" + amarillo
									+ "--𝐈𝐙𝐀𝐍-" + azul + "...... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "84" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "98" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "99" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "90" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "99"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "87" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY3 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY3 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY >= 0.2) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .---. " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }{ {`-'   " + azul + "█. \r\n" + " ." + amarillo + " `/ / .-.} }  " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `---' " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐆𝐀𝐁𝐎--" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "99" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "97" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "74" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "99" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "84"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "86" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY4 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY4 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

						else if (randomNumeroSOTY > 0) {

							Thread.sleep(3000);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + amarillo + "♛" + azul
									+ ".....  \r\n" + "  ." + azul + "█        " + azul + "█████.   \r\n" + " ."
									+ amarillo + " .--.  .-.   " + azul + "███. \r\n" + " ." + amarillo
									+ "{ {} }/ /.     " + azul + "█. \r\n" + " ." + amarillo + " `/ /{ {} }   " + azul
									+ "██. \r\n" + " ." + amarillo + " `-'  `--'  " + azul + "████. \r\n"
									+ " .████   █████████. \r\n" + " .................. \r\n" + " ....." + amarillo
									+ "--𝐉𝐀𝐕𝐈𝐄𝐑-" + azul + "..... \r\n" + " .................. \r\n" + " .."
									+ amarillo + "EST" + azul + "-" + amarillo + "94" + azul + ".." + amarillo + "HOB"
									+ azul + "-" + amarillo + "86" + azul + ".. \r\n" + " .." + amarillo + "POP" + azul

									+ "-" + amarillo + "95" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo
									+ "98" + azul + ".. \r\n" + " .." + amarillo + "MNT" + azul + "-" + amarillo + "82"
									+ azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "90" + azul + ".. \r\n"
									+ "   ......" + amarillo + "==" + azul + "......   \r\n"
									+ "        ....        \r\n" + "\u001B[0m ");

							if (SOTY5 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								SOTY5 = true;
								System.out.println("");

							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(250€)");
								dinero = dinero + 250;
								System.out.println("");

							}
						}

					} else if (randomNumeroCalidad >= 0.01) {

						animacionDiablo AnimacionDiablo = new animacionDiablo();
						AnimacionDiablo.ejecutar();

						Thread.sleep(1500);
						randomNumeroDiablo = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroDiablo >= 0.75) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(rojo + "Remontada");
							Thread.sleep(1500);
							System.out.println(rojo + "\r\n" + "\r\n" + "    ....." + blanco + "⛧" + rojo
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " . .--.  .--.  ███. \r\n"
									+ " .{ {} }{ {} }   █. \r\n" + " . `/ /  `/ /   ██. \r\n"
									+ " . `-'   `-'  ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n"
									+ " ....." + blanco + "--𝖕𝖚𝖈𝖈𝖎--" + rojo + "..... \r\n"
									+ "   .............   \r\n" + " .." + blanco + "EST" + rojo + "-" + blanco + "99"
									+ rojo + ".." + blanco + "HOB" + rojo + "-" + blanco + "99" + rojo + ".. \r\n"
									+ "  ." + blanco + "POP" + rojo + "-" + blanco + "99" + rojo + ".." + blanco + "BON"
									+ rojo + "-" + blanco + "99" + rojo + ".  \r\n" + " .." + blanco + "MNT" + rojo
									+ "-" + blanco + "99" + rojo + ".." + blanco + "SUE" + rojo + "-" + blanco + "90"
									+ rojo + ".. \r\n" + "     ...☠︎☠︎...     \r\n" + "        ....        \r\n"
									+ "\u001B[0m ");

							if (diabloRemontada1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloRemontada1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}

						}

						else if (randomNumeroDiablo >= 0.5) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(rojo + "Remontada");
							Thread.sleep(1500);
							System.out.println(rojo + "\r\n" + "\r\n" + "    ....." + blanco + "⛧" + rojo
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " . .--.  .--.  ███. \r\n"
									+ " .{ {} }{ {} }   █. \r\n" + " . `/ / { {} }  ██. \r\n"
									+ " . `-'   `--' ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n"
									+ " ....." + blanco + "--𝖏𝖆𝖚𝖒𝖊--" + rojo + "..... \r\n"
									+ "   .............   \r\n" + " .." + blanco + "EST" + rojo + "-" + blanco + "99"
									+ rojo + ".." + blanco + "HOB" + rojo + "-" + blanco + "99" + rojo + ".. \r\n"
									+ "  ." + blanco + "POP" + rojo + "-" + blanco + "94" + rojo + ".." + blanco + "BON"
									+ rojo + "-" + blanco + "88" + rojo + ".  \r\n" + " .." + blanco + "MNT" + rojo
									+ "-" + blanco + "81" + rojo + ".." + blanco + "SUE" + rojo + "-" + blanco + "99"
									+ rojo + ".. \r\n" + "     ...☠︎☠︎...     \r\n" + "        ....        \r\n"
									+ "\u001B[0m ");

							if (diabloRemontada2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloRemontada2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}

						else if (randomNumeroDiablo >= 0.25) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(azul + "Lunar");
							Thread.sleep(1500);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + blanco + "☾" + azul
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ azul + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + azul + "   █. \r\n" + " . "
									+ azul + "`/ /  `/ /" + azul + "   ██. \r\n" + " . " + azul + "`-'   `-'" + azul
									+ "  ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n" + " ....."
									+ blanco + "--𝔇𝔞𝔫𝔦𝔢𝔩--" + azul + "..... \r\n" + "   .............   \r\n"
									+ " .." + blanco + "EST" + azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB"
									+ azul + "-" + blanco + "95" + azul + ".. \r\n" + "  ." + blanco + "POP" + azul
									+ "-" + blanco + "99" + azul + ".." + blanco + "BON" + azul + "-" + blanco + "90"
									+ azul + ".  \r\n" + " .." + blanco + "MNT" + azul + "-" + blanco + "91" + azul
									+ ".." + blanco + "SUE" + azul + "-" + blanco + "92" + azul + ".. \r\n"
									+ "     ...✨✨...     \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (diabloLunar1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloLunar1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}

						else if (randomNumeroDiablo >= 0) {

							Thread.sleep(3000);
							System.out.println("");
							System.out.println(azul + "Lunar");
							Thread.sleep(1500);
							System.out.println(azul + "\r\n" + "\r\n" + "    ....." + blanco + "☾" + azul
									+ ".....     \r\n" + "  .████   ██████.   \r\n" + " ." + azul + " .--.  .--." + azul
									+ "  ███. \r\n" + " ." + azul + "{ {} }{ {} }" + azul + "   █. \r\n" + " . " + azul
									+ "`/ / { {} }" + azul + "  ██. \r\n" + " . " + azul + "`-'   `--'" + azul
									+ " ████. \r\n" + " .█████ ██████████. \r\n" + "   .............. \r\n" + " ....."
									+ blanco + "--𝔊𝔞𝔟𝔬--" + azul + "..... \r\n" + "   .............   \r\n" + " .."
									+ blanco + "EST" + azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB" + azul
									+ "-" + blanco + "99" + azul + ".. \r\n" + "  ." + blanco + "POP" + azul + "-"
									+ blanco + "81" + azul + ".." + blanco + "BON" + azul + "-" + blanco + "99" + azul
									+ ".  \r\n" + " .." + blanco + "MNT" + azul + "-" + blanco + "87" + azul + ".."
									+ blanco + "SUE" + azul + "-" + blanco + "90" + azul + ".. \r\n"
									+ "     ...✨✨...     \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (diabloLunar2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								diabloLunar2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(750€)");
								dinero = dinero + 750;
								System.out.println("");

							}
						}

					} else if (randomNumeroCalidad >= 0.0025) {

						animacionFlashback AnimacionFlashback = new animacionFlashback();
						AnimacionFlashback.ejecutar();

						Thread.sleep(1500);
						randomNumeroFlashback = Math.random();
						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						if (randomNumeroFlashback >= 0.5) {

							Thread.sleep(3000);
							System.out.println(celeste + "\r\n" + "\r\n" + "    ...." + azul + "«««" + celeste
									+ ".....    \r\n" + "  .██████ ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ celeste + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + celeste + "   █. \r\n"
									+ " ." + azul + " `/ /  `/ /   " + celeste + "██. \r\n" + " ." + azul
									+ " `-'   `-'  " + celeste + "████. \r\n" + " .████████████████. \r\n"
									+ " .‹.‹.‹.‹.‹.‹.‹.‹.‹ \r\n" + " ..-«" + azul + "🄰🄻🄴🄹🄰🄽🄳🅁🄾" + celeste
									+ "«-... \r\n" + " .................. \r\n" + " .." + azul + "EST" + celeste + "-"
									+ azul + "72" + celeste + ".." + azul + "HOB" + celeste + "-" + azul + "99"
									+ celeste + ".. \r\n" + " .." + azul + "POP" + celeste + "-" + azul + "98" + celeste
									+ ".." + azul + "BON" + celeste + "-" + azul + "98" + celeste + ".. \r\n" + " .."
									+ azul + "MNT" + celeste + "-" + azul + "98" + celeste + ".." + azul + "SUE"
									+ celeste + "-" + azul + "98" + celeste + ".. \r\n" + "   ......" + azul + "《《"
									+ celeste + "......   \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (flashback1 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								flashback1 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2500€)");
								dinero = dinero + 2500;
								System.out.println("");

							}

						}

						else if (randomNumeroFlashback >= 0) {

							Thread.sleep(3000);
							System.out.println(celeste + "\r\n" + "\r\n" + "    ...." + azul + "«««" + celeste
									+ ".....    \r\n" + "  .██████ ██████.   \r\n" + " ." + azul + " .--.  .--.  "
									+ celeste + "███. \r\n" + " ." + azul + "{ {} }{ {} }" + celeste + "   █. \r\n"
									+ " ." + azul + " `/ /  `/ /   " + celeste + "██. \r\n" + " ." + azul
									+ " `-'   `-'  " + celeste + "████. \r\n" + " .████████████████. \r\n"
									+ " .‹.‹.‹.‹.‹.‹.‹.‹.‹ \r\n" + " .....-«" + azul + "🄸🄺🄴🅁" + celeste
									+ "«-..... \r\n" + " .................. \r\n" + " .." + azul + "EST" + celeste + "-"
									+ azul + "90" + celeste + ".." + azul + "HOB" + celeste + "-" + azul + "99"
									+ celeste + ".. \r\n" + " .." + azul + "POP" + celeste + "-" + azul + "94" + celeste
									+ ".." + azul + "BON" + celeste + "-" + azul + "99" + celeste + ".. \r\n" + " .."
									+ azul + "MNT" + celeste + "-" + azul + "95" + celeste + ".." + azul + "SUE"
									+ celeste + "-" + azul + "95" + celeste + ".. \r\n" + "   ......" + azul + "《《"
									+ celeste + "......   \r\n" + "        ....        \r\n" + "\u001B[0m ");

							if (flashback2 == false) {

								System.out.println("\nSe te ha añadido la carta a tu colección");
								flashback2 = true;
								System.out.println("");
							}

							else {
								System.out.println(
										"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(2500€)");
								dinero = dinero + 2500;
								System.out.println("");

							}
						}

					} else if (randomNumeroCalidad < 0.0025) {

						animacionOmega AnimacionOmega = new animacionOmega();
						AnimacionOmega.ejecutar();

						Thread.sleep(2500);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

						System.out.println(blanco + "            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓            \r\n" + "         ▓▓▓▓▓▓---"
								+ blanco + "ℙ𝕦𝕔𝕔𝕚" + blanco + "---▓▓▓▓▓▓         \r\n"
								+ "       ▓▓▓▓▓               ▓▓▓▓▓       \r\n"
								+ "     ▓▓▓▓▓                  ▓▓▓▓▓▓    \r\n" + "    ▓▓▓▓▓----" + blanco + "𝔼𝕊𝕋"
								+ blanco + "-" + blanco + "𝟡𝟡" + blanco + "-" + blanco + "ℍ𝕆𝔹" + blanco + "-"
								+ amarillo + "𝟏𝟎𝟎" + blanco + "----▓▓▓▓▓   \r\n" + "    ▓▓▓▓ " + amarillo
								+ " ███   █████   █████ " + blanco + "  ▓▓▓▓   \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███  █     █ █     █" + blanco + "  ▓▓▓▓▓  \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███  █     █ █     █" + blanco + "  ▓▓▓▓▓  \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███   █████   █████ " + blanco + "  ▓▓▓▓▓  \r\n" + "    ▓▓▓▓▓--" + blanco + "ℙ𝕆ℙ"
								+ blanco + "-" + amarillo + "𝟏𝟎𝟎" + blanco + "------" + blanco + "𝔹𝕆ℕ" + blanco
								+ "-" + blanco + "𝟡𝟡" + blanco + "--▓▓▓▓▓   \r\n"
								+ "     ▓▓▓▓▓---------------------▓▓▓▓▓    \r\n" + "      ▓▓▓▓▓--" + blanco + "𝕄ℕ𝕋"
								+ blanco + "-" + amarillo + "𝟏𝟎𝟎" + blanco + "--" + blanco + "𝕊𝕌𝔼" + blanco + "-"
								+ blanco + "𝟡𝟡" + blanco + "--▓▓▓▓▓     \r\n"
								+ "       ▓▓▓▓▓▓              ▓▓▓▓▓▓      \r\n"
								+ "▓▓▓      ▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓     ▓▓▓\r\n"
								+ "▓▓           ▓▓▓        ▓▓▓          ▓▓\r\n"
								+ "▓▓▓▓      ▓▓▓▓▓▓        ▓▓▓▓▓▓     ▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓  ▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓  ▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\u001B[0m");
						if (omega1 == false) {

							System.out.println("\nSe te ha añadido la carta a tu colección");
							omega1 = true;
							System.out.println("");
						}

						else {

							System.out.println(
									"\nComo ya habías conseguido la carta, te sumaremos la mitad del valor de la carta(5000€)");
							dinero = dinero + 5000;
							System.out.println("");

						}

					}

					System.out.println(
							"---------------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("(Introduce cualquier número para voler)");
					enter = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

				}

				else {

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					System.out.println("Error");
					System.out.println("");
					System.out.println("");
					System.out.println("");
				}
			}

			else if (eleccion == 2) {

				while (aaa < 70) {
					System.out.println("");
					aaa++;
				}
				aaa = 0;

				animacionAbriendoLibro AnimacionAbriendoLibro = new animacionAbriendoLibro();
				AnimacionAbriendoLibro.ejecutar();

				System.out.println("    ____________________   ____________________\r\n"
						+ ".-/|                    \\ /                    |\\-.\r\n"
						+ "|||| Elige la calidad de |                     ||||\r\n"
						+ "||||      la carta:      |                     ||||\r\n"
						+ "||||                     |                     ||||\r\n"
						+ "|||| 1.Común             |                     ||||\r\n" + "|||| 2." + verde
						+ "Especial\u001B[0m          |                     ||||\r\n" + "|||| 3." + magenta
						+ "Fanatico\u001B[0m          |                     ||||\r\n" + "|||| 4." + amarillo
						+ "Icono\u001B[0m             |                     ||||\r\n" + "|||| 5." + azul
						+ "SOTY\u001B[0m              |                     ||||\r\n" + "|||| 6." + rojo
						+ "Diablo\u001B[0m            |                     ||||\r\n" + "|||| 7." + celeste
						+ "Flashback\u001B[0m         |                     ||||\r\n" + "|||| 8." + blanco
						+ "Ω\u001B[0m                 |                     ||||\r\n" + "|||| 9." + amarillo
						+ "LEYENDA\u001B[0m           |                     ||||\r\n" + "|||| 0." + rojo + "U"
						+ amarillo + "N" + verde + "I" + azul + "C" + magenta
						+ "O\u001B[0m             |                     ||||\r\n"
						+ "||||____________________ | ____________________||||\r\n"
						+ "||/===================\\  |  /===================\\||\r\n"
						+ " `--------------------~__~__-------------------''");
				System.out.println("");
				eleccionColeccion = sc.nextInt();
				while (aaa < 70) {
					System.out.println("");
					aaa++;
				}
				aaa = 0;

				if (eleccionColeccion == 1) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||  1.Pucci            | 10.Bruno            ||||\r\n"
							+ "||||  2.Marcos           | 11.Iker             ||||\r\n"
							+ "||||  3.Javier           | 12.Luis             ||||\r\n"
							+ "||||  4.Gabo             | 13.Nacho            ||||\r\n"
							+ "||||  5.Jaume            | 14.José             ||||\r\n"
							+ "||||  6.Izan             | 15.Gael             ||||\r\n"
							+ "||||  7.Amir             | 16.Alejandro        ||||\r\n"
							+ "||||  8.Cristian         | 17.Ferrán           ||||\r\n"
							+ "||||  9.Iván             | 18.Daniel           ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionComun = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionComun == 1) {

						if (comun1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Pucci              |   .              .  ||||\r\n"
									+ "||||                     |  . .--.   .-.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} } / /      . ||||\r\n"
									+ "||||                     |  .{ {} }{ {} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `--'     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--PUCCI-..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-51..HOB-89.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-90..BON-86.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-89..SUE-80.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;
						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionComun == 2) {

						if (comun2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Marcos             |   .              .  ||||\r\n"
									+ "||||                     |  . .--. .---.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }`-`} }    . ||||\r\n"
									+ "||||                     |  .{ {} }{ {.-.    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `---'    . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ....--MARCOS--.... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-56..HOB-86.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-63..BON-93.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-87..SUE-78.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionComun == 3) {

						if (comun3 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Javier             |   .              .  ||||\r\n"
									+ "||||                     |  . .--.  .---.    . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }{ {`-'    . ||||\r\n"
									+ "||||                     |  .{ {} }.-.} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--' `---'     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ....--JAVIER--.... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-81..HOB-79.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-80..BON-87.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-73..SUE-80.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 4) {

						if (comun4 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Gabo               |   .              .  ||||\r\n"
									+ "||||                     |  . .--. .---.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }`-`} }    . ||||\r\n"
									+ "||||                     |  .{ {} }{ {.-.    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `---'    . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--GABO--..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-89..HOB-91.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-48..BON-91.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-70..SUE-72.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionComun == 5) {

						if (comun5 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Jaume              |   .              .  ||||\r\n"
									+ "||||                     |  . .--. .-..-.    . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }| || |    . ||||\r\n"
									+ "||||                     |  .{ {} } `-| }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'    `-'    . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--JAUME—..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-60..HOB-92.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-78..BON-84.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-72..SUE-90.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 6) {

						if (comun6 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Izan               |   .              .  ||||\r\n"
									+ "||||                     |  . .--.  .--.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }{ {} }    . ||||\r\n"
									+ "||||                     |  .{ {} }{ {} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `--'     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--IZAN--..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-74..HOB-85.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-91..BON-84.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-86..SUE-80.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 7) {

						if (comun7 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Amir               |   .              .  ||||\r\n"
									+ "||||                     |  ..---. .---.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .`-`} }`-`} }    . ||||\r\n"
									+ "||||                     |  .  / /   / /     . ||||\r\n"
									+ "||||  ████████████████   |  . `-'   `-'      . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--AMIR--..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-95..HOB-65.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-39..BON-78.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-70..SUE-86.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 8) {

						if (comun8 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Cristian           |   .              .  ||||\r\n"
									+ "||||                     |  . .--.  .---.    . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }. .-. .   . ||||\r\n"
									+ "||||                     |  .{ {} }' `-' '   . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `---'    . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ...--CRISTIAN--... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-94..HOB-69.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-48..BON-82.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-71..SUE-84.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 9) {

						if (comun9 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Iván               |   .              .  ||||\r\n"
									+ "||||                     |  . .--. .---.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }`-`} }    . ||||\r\n"
									+ "||||                     |  .{ {} }.-.} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--' `---`     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--IVÁN--..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-77..HOB-62.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-93..BON-80.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-82..SUE-75.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 10) {

						if (comun10 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Bruno              |   .              .  ||||\r\n"
									+ "||||                     |  . .--.   .-.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} } / /      . ||||\r\n"
									+ "||||                     |  .{ {} }{ {} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `--'     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--BRUNO—..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-95..HOB-73.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-83..BON-89.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-78..SUE-70.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 11) {

						if (comun11 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Iker               |   .              .  ||||\r\n"
									+ "||||                     |  . .--.   .-.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} } / /      . ||||\r\n"
									+ "||||                     |  .{ {} }{ {} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `--'     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--IKER--..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-83..HOB-81.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-81..BON-77.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-86..SUE-80.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 12) {

						if (comun12 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Luis               |   .              .  ||||\r\n"
									+ "||||                     |  . .--. .---.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }`-`} }    . ||||\r\n"
									+ "||||                     |  .{ {} }{ {.-.    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `---'    . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--LUIS--..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-53..HOB-74.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-89..BON-84.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-79..SUE-80.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");
							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

					else if (eleccionColeccionComun == 13) {

						if (comun13 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Nacho              |   .              .  ||||\r\n"
									+ "||||                     |  . .--. .-..-.    . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }| || |    . ||||\r\n"
									+ "||||                     |  .{ {} } `-| }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'    `-'    . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--NACHO—..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-70..HOB-70.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-87..BON-89.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-75..SUE-85.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionComun == 14) {

						if (comun14 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Jose               |   .              .  ||||\r\n"
									+ "||||                     |  . .--. .---.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }`-`} }    . ||||\r\n"
									+ "||||                     |  .{ {} }  / /     . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `-'      . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--JOSE--..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-85..HOB-78.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-84..BON-86.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-72..SUE-84.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionComun == 15) {

						if (comun15 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Gael               |   .              .  ||||\r\n"
									+ "||||                     |  . .--.   .-.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} } / /      . ||||\r\n"
									+ "||||                     |  .{ {} }{ {} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--'  `--'     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  .....--GAEL--..... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-64..HOB-79.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-86..BON-90.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-90..SUE-77.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionComun == 16) {

						if (comun16 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Alejandro          |   .              .  ||||\r\n"
									+ "||||                     |  ..---.  .--.     . ||||\r\n"
									+ "||||  Valor = 1€         |  .`-`} }{ {} }    . ||||\r\n"
									+ "||||                     |  .  / / { {} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `-'   `--'     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ...--ALEJANDRO-... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-41..HOB-95.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-79..BON-80.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-70..SUE-71.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionComun == 17) {

						if (comun17 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Ferrán             |   .              .  ||||\r\n"
									+ "||||                     |  . .--.  .---.    . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }{ {`-'    . ||||\r\n"
									+ "||||                     |  .{ {} }.-.} }    . ||||\r\n"
									+ "||||  ████████████████   |  . `--' `---'     . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ....--FERRÁN--.... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-74..HOB-72.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-84..BON-85.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-89..SUE-78.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					} else if (eleccionColeccionComun == 18) {

						if (comun18 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||  Daniel             |   .              .  ||||\r\n"
									+ "||||                     |  . .--.  .---.    . ||||\r\n"
									+ "||||  Valor = 1€         |  .{ {} }. .-. .   . ||||\r\n"
									+ "||||                     |  . `/ / ' `-' '   . ||||\r\n"
									+ "||||  ████████████████   |  . `-'   `---'    . ||||\r\n"
									+ "||||  █              █   |  .                . ||||\r\n"
									+ "||||  █  ██████████  █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ....--DANIEL--.... ||||\r\n"
									+ "||||  █  ██          █   |  .................. ||||\r\n"
									+ "||||  █  ██      ██  █   |  ..EST-97..HOB-80.. ||||\r\n"
									+ "||||  █  ██████████  █   |  ..POP-86..BON-82.. ||||\r\n"
									+ "||||  █              █   |  ..MNT-84..SUE-81.. ||||\r\n"
									+ "||||  ████████████████   |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
						System.out.println("Error");
					}

				}

				else if (eleccionColeccion == 2) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + verde + "1."
							+ magenta + "Gabo\u001B[0m             | " + verde + "11." + rojo
							+ "Pucci\u001B[0m            ||||\r\n" + "||||  " + verde + "2." + magenta
							+ "Amir\u001B[0m             | " + verde + "12." + rojo
							+ "Iker\u001B[0m             ||||\r\n" + "||||  " + verde + "3." + magenta
							+ "Cristian\u001B[0m         | " + verde + "13." + rojo
							+ "Ferran\u001B[0m           ||||\r\n" + "||||  " + verde + "4." + magenta
							+ "Bruno\u001B[0m            | " + verde + "14." + rojo
							+ "Marcos\u001B[0m           ||||\r\n" + "||||  " + verde + "5." + magenta
							+ "Daniel\u001B[0m           | " + verde + "15." + rojo
							+ "Izan\u001B[0m             ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + verde + "6." + azul
							+ "Pucci\u001B[0m            |                     ||||\r\n" + "||||  " + verde + "7."
							+ azul + "Javier\u001B[0m           |                     ||||\r\n" + "||||  " + verde
							+ "8." + azul + "Izan\u001B[0m             |                     ||||\r\n" + "||||  "
							+ verde + "9." + azul + "Jaume\u001B[0m            |                     ||||\r\n"
							+ "||||  " + verde + "10." + azul
							+ "Ivan\u001B[0m            |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionEspecial = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionEspecial == 1) {

						if (especialSobresaliente1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Gabo\u001B[0m               |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "Sobresaliente\u001B[0m      |  " + verde + ". .--.  .--.     .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }{ {} }    .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ".{ {} } `/ /   " + magenta + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  "
									+ verde + "████████████████\u001B[0m   |  " + verde + ". `--'  `-'  " + magenta
									+ "  ██" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + magenta + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--GABO--.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-99..HOB-93..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-53..BON-95..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-80..SUE-82..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 2) {

						if (especialSobresaliente2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Amir\u001B[0m               |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "Sobresaliente\u001B[0m      |  " + verde + ". .--. .-..-.    .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }| || |    .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ".{ {} } `-| }  " + magenta + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  "
									+ verde + "████████████████\u001B[0m   |  " + verde + ". `--'    `-'" + magenta
									+ "  ██" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + magenta + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--AMIR--.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-99..HOB-74..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-49..BON-82..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-79..SUE-89..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 3) {

						if (especialSobresaliente3 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Cristian\u001B[0m           |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "Sobresaliente\u001B[0m      |  " + verde + ". .--.   .-.     .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} } / /      .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ".{ {} }{ {} }  " + magenta + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  "
									+ verde + "████████████████\u001B[0m   |  " + verde + ". `--'  `--' " + magenta
									+ "  ██" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + magenta + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "...--CRISTIAN--...\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-99..HOB-79..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-58..BON-85..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-79..SUE-87..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 4) {

						if (especialSobresaliente4 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Bruno\u001B[0m              |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "Sobresaliente\u001B[0m      |  " + verde + ". .--. .-.       .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / | }     " + magenta + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  "
									+ verde + "████████████████\u001B[0m   |  " + verde + ". `-'  `-'   " + magenta
									+ "  ██" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + magenta + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--BRUNO-.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-99..HOB-78..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-86..BON-91..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-79..SUE-81..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 5) {

						if (especialSobresaliente5 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Daniel\u001B[0m             |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "Sobresaliente\u001B[0m      |  " + verde + ". .--. .---.     .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }`-`} }    .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / .-.} }  " + magenta + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  "
									+ verde + "████████████████\u001B[0m   |  " + verde + ". `-'  `----`" + magenta
									+ "  ██" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + magenta + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "....--DANIEL--....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-99..HOB-84..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-89..BON-86..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-87..SUE-83..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 6) {

						if (especialReconocimiento1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Pucci\u001B[0m              |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + azul
									+ "Reconocimiento\u001B[0m     |  " + verde + ". .--.  .---.    .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }. .-. .   .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / ' `-' ' " + azul + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'   `---'" + azul + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + azul + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--PUCCI-.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-59..HOB-89..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-99..BON-90..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-91..SUE-82..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 7) {

						if (especialReconocimiento2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Javier\u001B[0m             |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + azul
									+ "Reconocimiento\u001B[0m     |  " + verde + ". .--. .-.       .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / | }     " + azul + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'  `-'   " + azul + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + azul + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "....--JAVIER--....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-88..HOB-82..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-90..BON-94..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-76..SUE-84..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 8) {

						if (especialReconocimiento3 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Izan\u001B[0m               |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + azul
									+ "Reconocimiento\u001B[0m     |  " + verde + ". .--. .---.     .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }`-`} }    .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / { {.-.  " + azul + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'   `---'" + azul + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + azul + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--IZAN--.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-78..HOB-87..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-99..BON-88..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-89..SUE-83..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 9) {

						if (especialReconocimiento4 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Jaume\u001B[0m              |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + azul
									+ "Reconocimiento\u001B[0m     |  " + verde + ". .--.  .---.    .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }. .-. .   .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / ' `-' ' " + azul + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'   `---'" + azul + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + azul + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--JAUME-.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-67..HOB-91..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-88..BON-86..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-80..SUE-95..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 10) {

						if (especialReconocimiento5 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Ivan\u001B[0m               |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + azul
									+ "Reconocimiento\u001B[0m     |  " + verde + ". .--. .---.     .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }`-`} }    .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ".{ {} }  / /   " + azul + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `--'  `-'  " + azul + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + azul + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--IVÁN--.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-80..HOB-68..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-99..BON-83..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-85..SUE-77..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 11) {

						if (especialMomentum1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Pucci\u001B[0m              |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + rojo
									+ "Momentum\u001B[0m           |  " + verde + ". .--. .---.     .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }`-`} }    .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / { {.-.  " + rojo + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'   `---'" + rojo + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + rojo + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--PUCCI-.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-60..HOB-91..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-96..BON-92..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-99..SUE-83..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 12) {

						if (especialMomentum2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Iker\u001B[0m               |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + rojo
									+ "Momentum\u001B[0m           |  " + verde + ". .--. .-.       .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / | }     " + rojo + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'  `-'   " + rojo + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + rojo + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--IKER--.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-87..HOB-84..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-84..BON-81..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-96..SUE-83..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 13) {

						if (especialMomentum3 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Ferran\u001B[0m             |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + rojo
									+ "Momentum\u001B[0m           |  " + verde + ". .--.  .---.    .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }. .-. .   .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / ' `-' ' " + rojo + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'   `---'" + rojo + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + rojo + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "....--FERRÁN--....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-78..HOB-76..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-89..BON-87..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-99..SUE-81..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;
						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 14) {

						if (especialMomentum4 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Marcos\u001B[0m             |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + rojo
									+ "Momentum\u001B[0m           |  " + verde + ". .--.  .---.    .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }. .-. .   .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ / ' `-' ' " + rojo + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'   `---'" + rojo + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + rojo + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "....--MARCOS--....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-65..HOB-93..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-72..BON-97..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-97..SUE-88..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionEspecial == 15) {

						if (especialMomentum5 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + verde + "............\u001B[0m    |\\-.\r\n"
									+ "||||  " + verde + "Izan\u001B[0m               |   " + verde
									+ ".              .\u001B[0m  ||||\r\n" + "||||  " + rojo
									+ "Momentum\u001B[0m           |  " + verde + ". .--. .-..-.    .\u001B[0m ||||\r\n"
									+ "||||  " + verde + "Valor = 5€\u001B[0m         |  " + verde
									+ ".{ {} }| || |    .\u001B[0m ||||\r\n" + "||||                     |  " + verde
									+ ". `/ /  `-| }  " + rojo + " █" + verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |  " + verde + ". `-'     `-'" + rojo + "  ██"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█              █\u001B[0m   |  " + verde + ".            " + rojo + "████"
									+ verde + ".\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ ".....--IZAN--.....\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█   █████      █\u001B[0m   |  " + verde + "..................\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█   ███    ██  █\u001B[0m   |  " + verde
									+ "..EST-80..HOB-91..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "█ ███████████  █\u001B[0m   |  " + verde + "..POP-95..BON-89..\u001B[0m ||||\r\n"
									+ "||||  " + verde + "█              █\u001B[0m   |  " + verde
									+ "..MNT-96..SUE-84..\u001B[0m ||||\r\n" + "||||  " + verde
									+ "████████████████\u001B[0m   |    " + verde + "......==......\u001B[0m   ||||\r\n"
									+ "||||____________________ | ________" + verde + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
						System.out.println("Error");

					}

				}

				else if (eleccionColeccion == 3) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + magenta
							+ "1.Nacho\u001B[0m            |                     ||||\r\n" + "||||  " + magenta
							+ "2.Ferran\u001B[0m           |                     ||||\r\n" + "||||  " + magenta
							+ "3.Ivan\u001B[0m             |                     ||||\r\n" + "||||  " + magenta
							+ "4.Jose\u001B[0m             |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + magenta + "5."
							+ celeste + "Luis\u001B[0m             |                     ||||\r\n" + "||||  " + magenta
							+ "6." + celeste + "Javier\u001B[0m           |                     ||||\r\n" + "||||  "
							+ magenta + "7." + celeste + "Alejandro\u001B[0m        |                     ||||\r\n"
							+ "||||  " + magenta + "8." + celeste
							+ "Gael\u001B[0m             |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionFanatico = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionFanatico == 1) {

						if (fanaticoPOWER1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + magenta
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + magenta
									+ "Nacho\u001B[0m              |   " + magenta + ".           " + magenta + "███"
									+ magenta + ".\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "POWER\u001B[0m              |  " + magenta + ". .--.  .---.   " + magenta + "█"
									+ magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "Valor = 25€\u001B[0m        |  " + magenta
									+ ".{ {} }. .-. .   .\u001B[0m ||||\r\n" + "||||                     |  " + magenta
									+ ". `/ / ' `-' ' " + magenta + "██" + magenta + ".\u001B[0m ||||\r\n" + "||||  "
									+ magenta + "████████████████\u001B[0m   |  " + magenta + ". `-'   `---'" + magenta
									+ " ███" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + "." + magenta + "██        "
									+ magenta + "██████" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  ██████████  █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███    ██  █\u001B[0m   |  " + magenta
									+ "....--𝒩𝒜𝒞ℋ𝒪--....\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   █████      █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███        █\u001B[0m   |  " + magenta
									+ "..EST-74..HOB-86..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  █████       █\u001B[0m   |  " + magenta
									+ "..POP-79..BON-88..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta
									+ "..MNT-90..SUE-93..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "████████████████\u001B[0m   |    " + magenta
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ magenta + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionFanatico == 2) {

						if (fanaticoPOWER2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + magenta
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + magenta
									+ "Ferran\u001B[0m             |   " + magenta + ".           " + magenta + "███"
									+ magenta + ".\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "POWER\u001B[0m              |  " + magenta + ". .--. .---.    " + magenta + "█"
									+ magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "Valor = 25€\u001B[0m        |  " + magenta
									+ ".{ {} }`-`} }    .\u001B[0m ||||\r\n" + "||||                     |  " + magenta
									+ ". `/ / .-.} }  " + magenta + "██" + magenta + ".\u001B[0m ||||\r\n" + "||||  "
									+ magenta + "████████████████\u001B[0m   |  " + magenta + ". `-'  `----`" + magenta
									+ " ███" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + "." + magenta + "██        "
									+ magenta + "██████" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  ██████████  █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███    ██  █\u001B[0m   |  " + magenta
									+ "....--ℱℰℛℛ𝒜𝒩-....\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   █████      █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███        █\u001B[0m   |  " + magenta
									+ "..EST-85..HOB-79..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  █████       █\u001B[0m   |  " + magenta
									+ "..POP-90..BON-92..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta
									+ "..MNT-98..SUE-82..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "████████████████\u001B[0m   |    " + magenta
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ magenta + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionFanatico == 3) {

						if (fanaticoPOWER3 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + magenta
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + magenta
									+ "Ivan\u001B[0m               |   " + magenta + ".           " + magenta + "███"
									+ magenta + ".\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "POWER\u001B[0m              |  " + magenta + ". .--. .-.      " + magenta + "█"
									+ magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "Valor = 25€\u001B[0m        |  " + magenta
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + magenta
									+ ". `/ / | }     " + magenta + "██" + magenta + ".\u001B[0m ||||\r\n" + "||||  "
									+ magenta + "████████████████\u001B[0m   |  " + magenta + ". `-'  `-'   " + magenta
									+ " ███" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + "." + magenta + "██        "
									+ magenta + "██████" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  ██████████  █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███    ██  █\u001B[0m   |  " + magenta
									+ ".....--ℐ𝒱𝒜𝒩--....\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   █████      █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███        █\u001B[0m   |  " + magenta
									+ "..EST-87..HOB-71..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  █████       █\u001B[0m   |  " + magenta
									+ "..POP-99..BON-89..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta
									+ "..MNT-90..SUE-80..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "████████████████\u001B[0m   |    " + magenta
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ magenta + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionFanatico == 4) {

						if (fanaticoPOWER4 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + magenta
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + magenta
									+ "Jose\u001B[0m               |   " + magenta + ".           " + magenta + "███"
									+ magenta + ".\u001B[0m  ||||\r\n" + "||||  " + magenta
									+ "POWER\u001B[0m              |  " + magenta + ". .--. .-..-.   " + magenta + "█"
									+ magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "Valor = 25€\u001B[0m        |  " + magenta
									+ ".{ {} }| || |    .\u001B[0m ||||\r\n" + "||||                     |  " + magenta
									+ ". `/ /  `-| }  " + magenta + "██" + magenta + ".\u001B[0m ||||\r\n" + "||||  "
									+ magenta + "████████████████\u001B[0m   |  " + magenta + ". `-'     `-'" + magenta
									+ " ███" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + "." + magenta + "██        "
									+ magenta + "██████" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  ██████████  █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███    ██  █\u001B[0m   |  " + magenta
									+ ".....--𝒥𝒪𝒮ℰ--.....\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   █████      █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███        █\u001B[0m   |  " + magenta
									+ "..EST-90..HOB-86..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  █████       █\u001B[0m   |  " + magenta
									+ "..POP-93..BON-96..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta
									+ "..MNT-81..SUE-88..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "████████████████\u001B[0m   |    " + magenta
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ magenta + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;
						}

					}

					else if (eleccionColeccionFanatico == 5) {

						if (fanaticoMEGA1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + magenta
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + magenta
									+ "Luis\u001B[0m               |   " + magenta + ".           " + celeste + "███"
									+ magenta + ".\u001B[0m  ||||\r\n" + "||||  " + celeste
									+ "MEGA\u001B[0m               |  " + magenta + ". .--. .---.    " + celeste + "█"
									+ magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "Valor = 50€\u001B[0m        |  " + magenta
									+ ".{ {} }`-`} }    .\u001B[0m ||||\r\n" + "||||                     |  " + magenta
									+ ". `/ / .-.} }  " + celeste + "██" + magenta + ".\u001B[0m ||||\r\n" + "||||  "
									+ magenta + "████████████████\u001B[0m   |  " + magenta + ". `-'  `----`" + celeste
									+ " ███" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + "." + celeste + "██        "
									+ celeste + "██████" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  ██████████  █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███    ██  █\u001B[0m   |  " + magenta + ".....--" + celeste + "𝓛𝓤𝓘𝓢"
									+ magenta + "--.....\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   █████      █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███        █\u001B[0m   |  " + magenta + ".." + celeste + "EST" + magenta
									+ "-" + celeste + "78" + magenta + ".." + celeste + "HOB" + magenta + "-" + celeste
									+ "90" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  █████       █\u001B[0m   |  " + magenta + ".." + celeste + "POP" + magenta
									+ "-" + celeste + "98" + magenta + ".." + celeste + "BON" + magenta + "-" + celeste
									+ "92" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + ".." + celeste + "MNT" + magenta
									+ "-" + celeste + "89" + magenta + ".." + celeste + "SUE" + magenta + "-" + celeste
									+ "83" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "████████████████\u001B[0m   |    " + magenta
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ magenta + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionFanatico == 6) {

						if (fanaticoMEGA2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + magenta
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + magenta
									+ "Javier\u001B[0m             |   " + magenta + ".           " + celeste + "███"
									+ magenta + ".\u001B[0m  ||||\r\n" + "||||  " + celeste
									+ "MEGA\u001B[0m               |  " + magenta + ". .--.  .---.   " + celeste + "█"
									+ magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "Valor = 50€\u001B[0m        |  " + magenta
									+ ".{ {} }{ {`-'    .\u001B[0m ||||\r\n" + "||||                     |  " + magenta
									+ ". `/ / .-.} }  " + celeste + "██" + magenta + ".\u001B[0m ||||\r\n" + "||||  "
									+ magenta + "████████████████\u001B[0m   |  " + magenta + ". `-'  `---' " + celeste
									+ " ███" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + "." + celeste + "██        "
									+ celeste + "██████" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  ██████████  █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███    ██  █\u001B[0m   |  " + magenta + "....--" + celeste + "𝓙𝓐𝓥𝓘𝓔𝓡"
									+ magenta + "--....\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   █████      █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███        █\u001B[0m   |  " + magenta + ".." + celeste + "EST" + magenta
									+ "-" + celeste + "96" + magenta + ".." + celeste + "HOB" + magenta + "-" + celeste
									+ "91" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  █████       █\u001B[0m   |  " + magenta + ".." + celeste + "POP" + magenta
									+ "-" + celeste + "94" + magenta + ".." + celeste + "BON" + magenta + "-" + celeste
									+ "93" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + ".." + celeste + "MNT" + magenta
									+ "-" + celeste + "80" + magenta + ".." + celeste + "SUE" + magenta + "-" + celeste
									+ "84" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "████████████████\u001B[0m   |    " + magenta
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ magenta + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionFanatico == 7) {

						if (fanaticoMEGA3 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + magenta
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + magenta
									+ "Alejandro\u001B[0m          |   " + magenta + ".           " + celeste + "███"
									+ magenta + ".\u001B[0m  ||||\r\n" + "||||  " + celeste
									+ "MEGA\u001B[0m               |  " + magenta + ". .--. .---.    " + celeste + "█"
									+ magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "Valor = 50€\u001B[0m        |  " + magenta
									+ ".{ {} }`-`} }    .\u001B[0m ||||\r\n" + "||||                     |  " + magenta
									+ ". `/ / .-.} }  " + celeste + "██" + magenta + ".\u001B[0m ||||\r\n" + "||||  "
									+ magenta + "████████████████\u001B[0m   |  " + magenta + ". `-'  `----`" + celeste
									+ " ███" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + "." + celeste + "██        "
									+ celeste + "██████" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  ██████████  █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███    ██  █\u001B[0m   |  " + magenta + "..--" + celeste
									+ "𝓐𝓛𝓔𝓙𝓐𝓝𝓓𝓡𝓞" + magenta + "-..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   █████      █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███        █\u001B[0m   |  " + magenta + ".." + celeste + "EST" + magenta
									+ "-" + celeste + "71" + magenta + ".." + celeste + "HOB" + magenta + "-" + celeste
									+ "99" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  █████       █\u001B[0m   |  " + magenta + ".." + celeste + "POP" + magenta
									+ "-" + celeste + "90" + magenta + ".." + celeste + "BON" + magenta + "-" + celeste
									+ "90" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + ".." + celeste + "MNT" + magenta
									+ "-" + celeste + "88" + magenta + ".." + celeste + "SUE" + magenta + "-" + celeste
									+ "92" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "████████████████\u001B[0m   |    " + magenta
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ magenta + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionFanatico == 8) {

						if (fanaticoMEGA4 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + magenta
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + magenta
									+ "Gael\u001B[0m               |   " + magenta + ".           " + celeste + "███"
									+ magenta + ".\u001B[0m  ||||\r\n" + "||||  " + celeste
									+ "MEGA\u001B[0m               |  " + magenta + ". .--.  .---.   " + celeste + "█"
									+ magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "Valor = 50€\u001B[0m        |  " + magenta
									+ ".{ {} }{ {`-'    .\u001B[0m ||||\r\n" + "||||                     |  " + magenta
									+ ". `/ / .-.} }  " + celeste + "██" + magenta + ".\u001B[0m ||||\r\n" + "||||  "
									+ magenta + "████████████████\u001B[0m   |  " + magenta + ". `-'  `---' " + celeste
									+ " ███" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + "." + celeste + "██        "
									+ celeste + "██████" + magenta + ".\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  ██████████  █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███    ██  █\u001B[0m   |  " + magenta + ".....--" + celeste + "𝓖𝓐𝓔𝓛"
									+ magenta + "--.....\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   █████      █\u001B[0m   |  " + magenta
									+ "..................\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█   ███        █\u001B[0m   |  " + magenta + ".." + celeste + "EST" + magenta
									+ "-" + celeste + "74" + magenta + ".." + celeste + "HOB" + magenta + "-" + celeste
									+ "83" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█  █████       █\u001B[0m   |  " + magenta + ".." + celeste + "POP" + magenta
									+ "-" + celeste + "99" + magenta + ".." + celeste + "BON" + magenta + "-" + celeste
									+ "99" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "█              █\u001B[0m   |  " + magenta + ".." + celeste + "MNT" + magenta
									+ "-" + celeste + "98" + magenta + ".." + celeste + "SUE" + magenta + "-" + celeste
									+ "84" + magenta + "..\u001B[0m ||||\r\n" + "||||  " + magenta
									+ "████████████████\u001B[0m   |    " + magenta
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ magenta + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
						System.out.println("Error");
					}

				}

				else if (eleccionColeccion == 4) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  1." + amarillo
							+ "Enrique\u001B[0m          |                     ||||\r\n" + "||||  2." + amarillo
							+ "Xema\u001B[0m             |                     ||||\r\n" + "||||  3." + amarillo
							+ "Miguel\u001B[0m           |                     ||||\r\n" + "||||  4." + amarillo
							+ "Hector\u001B[0m           |                     ||||\r\n" + "||||  5." + amarillo
							+ "Brandon\u001B[0m          |                     ||||\r\n" + "||||  6." + amarillo
							+ "Salazar\u001B[0m          |                     ||||\r\n" + "||||  7." + amarillo
							+ "Jorge\u001B[0m            |                     ||||\r\n" + "||||  8." + amarillo
							+ "Manuel\u001B[0m           |                     ||||\r\n" + "||||  9." + amarillo
							+ "Pau\u001B[0m              |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionIcono = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionIcono == 1) {

						if (icono1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Enrique\u001B[0m            |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--. .-..-.   █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }| || |    .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ /  `-| }  ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'     `-'████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "....-ENRIQUE--....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-87..HOB-87..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-81..BON-98..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-91..SUE-91..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionIcono == 2) {

						if (icono2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Xema\u001B[0m               |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--. .-.      █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ / | }     ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'  `-'   ████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ ".....--XEMA--.....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-67..HOB-85..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-97..BON-80..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-93..SUE-94..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionIcono == 3) {

						if (icono3 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Miguel\u001B[0m             |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--. .-.      █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ / | }     ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'  `-'   ████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "....--MIGUEL--....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-89..HOB-97..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-81..BON-77..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-88..SUE-86..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionIcono == 4) {

						if (icono4 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Hector\u001B[0m             |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--. .-.      █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ / | }     ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'  `-'   ████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "....--HECTOR--....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-63..HOB-84..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-95..BON-87..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-94..SUE-92..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionIcono == 5) {

						if (icono5 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Brandon\u001B[0m            |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--. .-.      █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ / | }     ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'  `-'   ████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "....--BRANDON-....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-71..HOB-92..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-92..BON-76..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-88..SUE-97..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionIcono == 6) {

						if (icono6 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Salazar\u001B[0m            |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--. .---.    █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }`-`} }    .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ / { {.-.  ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'   `---'████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "....--SALAZAR-....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-70..HOB-94..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-94..BON-86..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-90..SUE-90..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionIcono == 7) {

						if (icono7 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Jorge\u001B[0m              |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--. .-..-.   █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }| || |    .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ /  `-| }  ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'     `-'████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "....--JORGE-......\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-69..HOB-93..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-91..BON-98..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-87..SUE-93..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionIcono == 8) {

						if (icono8 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Manuel\u001B[0m             |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--.  .---.   █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }. .-. .   .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ / ' `-' ' ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'   `---'████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "....--MANUEL-.....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-71..HOB-92..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-79..BON-91..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-80..SUE-95..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionIcono == 9) {

						if (icono9 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo
									+ "............\u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Pau\u001B[0m                |   " + amarillo
									+ ".█           ██.\u001B[0m  ||||\r\n" + "||||                     |  " + amarillo
									+ ". .--. .-.      █.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "Valor = 250€\u001B[0m       |  " + amarillo
									+ ".{ {} }{ |       .\u001B[0m ||||\r\n" + "||||                     |  " + amarillo
									+ ". `/ / | }     ██.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo
									+ ". `-'  `-'   ████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ ".██     █████████.\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "......--PAU-......\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█      ██      █\u001B[0m   |  " + amarillo
									+ "..EST-74..HOB-85..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█     ████     █\u001B[0m   |  " + amarillo
									+ "..POP-81..BON-89..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo
									+ "..MNT-93..SUE-92..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo
									+ "......==......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
						System.out.println("Error");

					}

				}

				else if (eleccionColeccion == 5) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + amarillo + "1."
							+ azul + "Pucci\u001B[0m            |                     ||||\r\n" + "||||  " + amarillo
							+ "2." + azul + "Marcos\u001B[0m           |                     ||||\r\n" + "||||  "
							+ amarillo + "3." + azul + "Izan\u001B[0m             |                     ||||\r\n"
							+ "||||  " + amarillo + "4." + azul
							+ "Gabo\u001B[0m             |                     ||||\r\n" + "||||  " + amarillo + "5."
							+ azul + "Javier\u001B[0m           |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionSOTY = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionSOTY == 1) {

						if (SOTY1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + azul + "....." + amarillo + "♛" + azul
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Pucci\u001B[0m              |   " + azul + ".█        " + azul + "█████" + azul
									+ ".\u001B[0m  ||||\r\n" + "||||                     |  " + azul + "." + amarillo
									+ " .--. .---.  " + azul + "███" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "Valor = 500€\u001B[0m       |  " + azul + "." + amarillo + "{ {} }`-`} }   "
									+ azul + "█.\u001B[0m ||||\r\n" + "||||                     |  " + azul + "."
									+ amarillo + " `/ /   / /  " + azul + " ██" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + azul + "████████████████\u001B[0m   |  " + azul + "." + amarillo
									+ " `-'   `-'  " + azul + "████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + "." + azul + "████   " + azul
									+ "█████████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█   █████████  █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█  ██        █ █\u001B[0m   |  " + azul + "....." + amarillo
									+ "--𝐏𝐔𝐂𝐂𝐈--" + azul + ".....\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█    ██████    █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█ █        ██  █\u001B[0m   |  " + azul + ".." + amarillo
									+ "EST" + azul + "-" + amarillo + "70" + azul + ".." + amarillo + "HOB" + azul + "-"
									+ amarillo + "99" + azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█  █████████   █\u001B[0m   |  " + azul + ".." + amarillo + "POP" + azul + "-"
									+ amarillo + "99" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo + "98"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + ".." + amarillo + "MNT" + azul + "-"
									+ amarillo + "99" + azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "88"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "████████████████\u001B[0m   |    " + azul + "......" + amarillo + "==" + azul
									+ "......\u001B[0m   ||||\r\n" + "||||____________________ | ________" + azul
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionSOTY == 2) {

						if (SOTY2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + azul + "....." + amarillo + "♛" + azul
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Marcos\u001B[0m             |   " + azul + ".█        " + azul + "█████" + azul
									+ ".\u001B[0m  ||||\r\n" + "||||                     |  " + azul + "." + amarillo
									+ " .--.  .---. " + azul + "███" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "Valor = 500€\u001B[0m       |  " + azul + "." + amarillo + "{ {} }{ {`-'   "
									+ azul + "█.\u001B[0m ||||\r\n" + "||||                     |  " + azul + "."
									+ amarillo + " `/ / .-.} } " + azul + " ██" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + azul + "████████████████\u001B[0m   |  " + azul + "." + amarillo
									+ " `-'  `---' " + azul + "████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + "." + azul + "████   " + azul
									+ "█████████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█   █████████  █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█  ██        █ █\u001B[0m   |  " + azul + "...." + amarillo
									+ "--𝐌𝐀𝐑𝐂𝐎𝐒--" + azul + "....\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█    ██████    █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█ █        ██  █\u001B[0m   |  " + azul + ".." + amarillo
									+ "EST" + azul + "-" + amarillo + "72" + azul + ".." + amarillo + "HOB" + azul + "-"
									+ amarillo + "98" + azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█  █████████   █\u001B[0m   |  " + azul + ".." + amarillo + "POP" + azul + "-"
									+ amarillo + "81" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo + "99"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + ".." + amarillo + "MNT" + azul + "-"
									+ amarillo + "99" + azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "91"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "████████████████\u001B[0m   |    " + azul + "......" + amarillo + "==" + azul
									+ "......\u001B[0m   ||||\r\n" + "||||____________________ | ________" + azul
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionSOTY == 3) {

						if (SOTY3 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + azul + "....." + amarillo + "♛" + azul
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Izan\u001B[0m               |   " + azul + ".█        " + azul + "█████" + azul
									+ ".\u001B[0m  ||||\r\n" + "||||                     |  " + azul + "." + amarillo
									+ " .--.  .--.  " + azul + "███" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "Valor = 500€\u001B[0m       |  " + azul + "." + amarillo + "{ {} }{ {} }   "
									+ azul + "█.\u001B[0m ||||\r\n" + "||||                     |  " + azul + "."
									+ amarillo + " `/ / { {} } " + azul + " ██" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + azul + "████████████████\u001B[0m   |  " + azul + "." + amarillo
									+ " `-'   `--' " + azul + "████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + "." + azul + "████   " + azul
									+ "█████████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█   █████████  █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█  ██        █ █\u001B[0m   |  " + azul + "......" + amarillo
									+ "--𝐈𝐙𝐀𝐍-" + azul + "......\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█    ██████    █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█ █        ██  █\u001B[0m   |  " + azul + ".." + amarillo
									+ "EST" + azul + "-" + amarillo + "84" + azul + ".." + amarillo + "HOB" + azul + "-"
									+ amarillo + "98" + azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█  █████████   █\u001B[0m   |  " + azul + ".." + amarillo + "POP" + azul + "-"
									+ amarillo + "99" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo + "90"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + ".." + amarillo + "MNT" + azul + "-"
									+ amarillo + "99" + azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "87"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "████████████████\u001B[0m   |    " + azul + "......" + amarillo + "==" + azul
									+ "......\u001B[0m   ||||\r\n" + "||||____________________ | ________" + azul
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionSOTY == 4) {

						if (SOTY4 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + azul + "....." + amarillo + "♛" + azul
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Gabo\u001B[0m               |   " + azul + ".█        " + azul + "█████" + azul
									+ ".\u001B[0m  ||||\r\n" + "||||                     |  " + azul + "." + amarillo
									+ " .--.  .---. " + azul + "███" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "Valor = 500€\u001B[0m       |  " + azul + "." + amarillo + "{ {} }{ {`-'   "
									+ azul + "█.\u001B[0m ||||\r\n" + "||||                     |  " + azul + "."
									+ amarillo + " `/ / .-.} } " + azul + " ██" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + azul + "████████████████\u001B[0m   |  " + azul + "." + amarillo
									+ " `-'  `---' " + azul + "████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + "." + azul + "████   " + azul
									+ "█████████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█   █████████  █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█  ██        █ █\u001B[0m   |  " + azul + "....." + amarillo
									+ "--𝐆𝐀𝐁𝐎--" + azul + ".....\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█    ██████    █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█ █        ██  █\u001B[0m   |  " + azul + ".." + amarillo
									+ "EST" + azul + "-" + amarillo + "99" + azul + ".." + amarillo + "HOB" + azul + "-"
									+ amarillo + "97" + azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█  █████████   █\u001B[0m   |  " + azul + ".." + amarillo + "POP" + azul + "-"
									+ amarillo + "74" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo + "99"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + ".." + amarillo + "MNT" + azul + "-"
									+ amarillo + "84" + azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "86"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "████████████████\u001B[0m   |    " + azul + "......" + amarillo + "==" + azul
									+ "......\u001B[0m   ||||\r\n" + "||||____________________ | ________" + azul
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionSOTY == 5) {

						if (SOTY5 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + azul + "....." + amarillo + "♛" + azul
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + amarillo
									+ "Javier\u001B[0m             |   " + azul + ".█        " + azul + "█████" + azul
									+ ".\u001B[0m  ||||\r\n" + "||||                     |  " + azul + "." + amarillo
									+ " .--.  .-.   " + azul + "███" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "Valor = 500€\u001B[0m       |  " + azul + "." + amarillo + "{ {} }/ /.     "
									+ azul + "█.\u001B[0m ||||\r\n" + "||||                     |  " + azul + "."
									+ amarillo + " `/ /{ {} }  " + azul + " ██" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + azul + "████████████████\u001B[0m   |  " + azul + "." + amarillo
									+ " `-'  `--'  " + azul + "████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + "." + azul + "████   " + azul
									+ "█████████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█   █████████  █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█  ██        █ █\u001B[0m   |  " + azul + "....." + amarillo
									+ "--𝐉𝐀𝐕𝐈𝐄𝐑-" + azul + ".....\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█    ██████    █\u001B[0m   |  " + azul + "..................\u001B[0m ||||\r\n"
									+ "||||  " + azul + "█ █        ██  █\u001B[0m   |  " + azul + ".." + amarillo
									+ "EST" + azul + "-" + amarillo + "94" + azul + ".." + amarillo + "HOB" + azul + "-"
									+ amarillo + "86" + azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█  █████████   █\u001B[0m   |  " + azul + ".." + amarillo + "POP" + azul + "-"
									+ amarillo + "95" + azul + ".." + amarillo + "BON" + azul + "-" + amarillo + "98"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + ".." + amarillo + "MNT" + azul + "-"
									+ amarillo + "82" + azul + ".." + amarillo + "SUE" + azul + "-" + amarillo + "90"
									+ azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "████████████████\u001B[0m   |    " + azul + "......" + amarillo + "==" + azul
									+ "......\u001B[0m   ||||\r\n" + "||||____________________ | ________" + azul
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
						System.out.println("Error");

					}

				}

				else if (eleccionColeccion == 6) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + blanco + "1."
							+ rojo + "Pucci\u001B[0m            |                     ||||\r\n" + "||||  " + blanco
							+ "2." + rojo + "Jaume\u001B[0m            |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + blanco + "3."
							+ azul + "Daniel\u001B[0m           |                     ||||\r\n" + "||||  " + blanco
							+ "4." + azul + "Gabo\u001B[0m             |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionDiablo = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionDiablo == 1) {

						if (diabloRemontada1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + rojo + "....." + blanco + "⛧" + rojo
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + blanco
									+ "Pucci\u001B[0m              |   " + rojo + ".████   " + rojo + "███████" + rojo
									+ ".\u001B[0m  ||||\r\n" + "||||" + rojo + "  Remontada\u001B[0m          |  "
									+ rojo + "." + rojo + " .--.  .--.  " + rojo + "███" + rojo + ".\u001B[0m ||||\r\n"
									+ "||||  " + blanco + "Valor = 1500€\u001B[0m      |  " + rojo + "." + rojo
									+ "{ {} }{ {} }   " + rojo + "█.\u001B[0m ||||\r\n" + "||||                     |  "
									+ rojo + "." + rojo + " `/ /  `/ /  " + rojo + " ██" + rojo + ".\u001B[0m ||||\r\n"
									+ "||||  " + rojo + "████████████████\u001B[0m   |  " + rojo + "." + rojo
									+ " `-'   `-'  " + rojo + "████" + rojo + ".\u001B[0m ||||\r\n" + "||||  " + rojo
									+ "█              █\u001B[0m   |  " + rojo + "." + rojo + "████ " + rojo
									+ "███████████" + rojo + ".\u001B[0m ||||\r\n" + "||||  " + rojo
									+ "█      ██      █\u001B[0m   |  " + rojo + "  ..............  \u001B[0m ||||\r\n"
									+ "||||  " + rojo + "█      ██      █\u001B[0m   |  " + rojo + "....." + blanco
									+ "--𝖕𝖚𝖈𝖈𝖎--" + rojo + ".....\u001B[0m ||||\r\n" + "||||  " + rojo
									+ "█      ██      █\u001B[0m   |  " + rojo + "  .............   \u001B[0m ||||\r\n"
									+ "||||  " + rojo + "█    ██████    █\u001B[0m   |  " + rojo + ".." + blanco + "EST"
									+ rojo + "-" + blanco + "99" + rojo + ".." + blanco + "HOB" + rojo + "-" + blanco
									+ "99" + rojo + "..\u001B[0m ||||\r\n" + "||||  " + rojo
									+ "█      ██      █\u001B[0m   |  " + rojo + " ." + blanco + "POP" + rojo + "-"
									+ blanco + "99" + rojo + ".." + blanco + "BON" + rojo + "-" + blanco + "99" + rojo
									+ ". \u001B[0m ||||\r\n" + "||||  " + rojo + "█              █\u001B[0m   |  "
									+ rojo + ".." + blanco + "MNT" + rojo + "-" + blanco + "99" + rojo + ".." + blanco
									+ "SUE" + rojo + "-" + blanco + "90" + rojo + "..\u001B[0m ||||\r\n" + "||||  "
									+ rojo + "████████████████\u001B[0m   |    " + rojo + "  ..." + rojo + "☠︎☠︎" + rojo
									+ "...  \u001B[0m   ||||\r\n" + "||||____________________ | ________" + rojo
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionDiablo == 2) {

						if (diabloRemontada2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + rojo + "....." + blanco + "⛧" + rojo
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + blanco
									+ "Juame\u001B[0m              |   " + rojo + ".████   " + rojo + "███████" + rojo
									+ ".\u001B[0m  ||||\r\n" + "||||" + rojo + "  Remontada\u001B[0m          |  "
									+ rojo + "." + rojo + " .--.  .--.  " + rojo + "███" + rojo + ".\u001B[0m ||||\r\n"
									+ "||||  " + blanco + "Valor = 1500€\u001B[0m      |  " + rojo + "." + rojo
									+ "{ {} }{ {} }   " + rojo + "█.\u001B[0m ||||\r\n" + "||||                     |  "
									+ rojo + "." + rojo + " `/ / { {} } " + rojo + " ██" + rojo + ".\u001B[0m ||||\r\n"
									+ "||||  " + rojo + "████████████████\u001B[0m   |  " + rojo + "." + rojo
									+ " `-'   `--' " + rojo + "████" + rojo + ".\u001B[0m ||||\r\n" + "||||  " + rojo
									+ "█              █\u001B[0m   |  " + rojo + "." + rojo + "████ " + rojo
									+ "███████████" + rojo + ".\u001B[0m ||||\r\n" + "||||  " + rojo
									+ "█      ██      █\u001B[0m   |  " + rojo + "  ..............  \u001B[0m ||||\r\n"
									+ "||||  " + rojo + "█      ██      █\u001B[0m   |  " + rojo + "....." + blanco
									+ "--𝖏𝖆𝖚𝖒𝖊--" + rojo + ".....\u001B[0m ||||\r\n" + "||||  " + rojo
									+ "█      ██      █\u001B[0m   |  " + rojo + "  .............   \u001B[0m ||||\r\n"
									+ "||||  " + rojo + "█    ██████    █\u001B[0m   |  " + rojo + ".." + blanco + "EST"
									+ rojo + "-" + blanco + "99" + rojo + ".." + blanco + "HOB" + rojo + "-" + blanco
									+ "99" + rojo + "..\u001B[0m ||||\r\n" + "||||  " + rojo
									+ "█      ██      █\u001B[0m   |  " + rojo + " ." + blanco + "POP" + rojo + "-"
									+ blanco + "94" + rojo + ".." + blanco + "BON" + rojo + "-" + blanco + "88" + rojo
									+ ". \u001B[0m ||||\r\n" + "||||  " + rojo + "█              █\u001B[0m   |  "
									+ rojo + ".." + blanco + "MNT" + rojo + "-" + blanco + "81" + rojo + ".." + blanco
									+ "SUE" + rojo + "-" + blanco + "99" + rojo + "..\u001B[0m ||||\r\n" + "||||  "
									+ rojo + "████████████████\u001B[0m   |    " + rojo + "  ..." + rojo + "☠︎☠︎" + rojo
									+ "...  \u001B[0m   ||||\r\n" + "||||____________________ | ________" + rojo
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionDiablo == 3) {

						if (diabloLunar1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + azul + "....." + blanco + "☾" + azul
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + blanco
									+ "Daniel\u001B[0m             |   " + azul + ".████   " + azul + "███████" + azul
									+ ".\u001B[0m  ||||\r\n" + "||||" + azul + "  Lunar\u001B[0m              |  "
									+ azul + "." + azul + " .--.  .--.  " + azul + "███" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + blanco + "Valor = 1500€\u001B[0m      |  " + azul + "." + azul
									+ "{ {} }{ {} }   " + azul + "█.\u001B[0m ||||\r\n" + "||||                     |  "
									+ azul + "." + azul + " `/ /  `/ /  " + azul + " ██" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + azul + "████████████████\u001B[0m   |  " + azul + "." + azul
									+ " `-'   `-'  " + azul + "████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + "." + azul + "█████ " + azul
									+ "██████████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█      ██      █\u001B[0m   |  " + azul + "  ..............  \u001B[0m ||||\r\n"
									+ "||||  " + azul + "█      ██      █\u001B[0m   |  " + azul + "....." + blanco
									+ "--𝔇𝔞𝔫𝔦𝔢𝔩--" + azul + ".....\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█      ██      █\u001B[0m   |  " + azul + "  .............   \u001B[0m ||||\r\n"
									+ "||||  " + azul + "█    ██████    █\u001B[0m   |  " + azul + ".." + blanco + "EST"
									+ azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB" + azul + "-" + blanco
									+ "95" + azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█      ██      █\u001B[0m   |  " + azul + " ." + blanco + "POP" + azul + "-"
									+ blanco + "99" + azul + ".." + blanco + "BON" + azul + "-" + blanco + "90" + azul
									+ ". \u001B[0m ||||\r\n" + "||||  " + azul + "█              █\u001B[0m   |  "
									+ azul + ".." + blanco + "MNT" + azul + "-" + blanco + "91" + azul + ".." + blanco
									+ "SUE" + azul + "-" + blanco + "92" + azul + "..\u001B[0m ||||\r\n" + "||||  "
									+ azul + "████████████████\u001B[0m   |    " + azul + "  ..." + azul + "✨✨" + azul
									+ "...  \u001B[0m   ||||\r\n" + "||||____________________ | ________" + azul
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionDiablo == 4) {

						if (diabloLunar2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + azul + "....." + blanco + "☾" + azul
									+ "..... \u001B[0m    |\\-.\r\n" + "||||  " + blanco
									+ "Gabo\u001B[0m               |   " + azul + ".████   " + azul + "███████" + azul
									+ ".\u001B[0m  ||||\r\n" + "||||" + azul + "  Lunar\u001B[0m              |  "
									+ azul + "." + azul + " .--.  .--.  " + azul + "███" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + blanco + "Valor = 1500€\u001B[0m      |  " + azul + "." + azul
									+ "{ {} }{ {} }   " + azul + "█.\u001B[0m ||||\r\n" + "||||                     |  "
									+ azul + "." + azul + " `/ / { {} } " + azul + " ██" + azul + ".\u001B[0m ||||\r\n"
									+ "||||  " + azul + "████████████████\u001B[0m   |  " + azul + "." + azul
									+ " `-'   `--' " + azul + "████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█              █\u001B[0m   |  " + azul + "." + azul + "█████ " + azul
									+ "██████████" + azul + ".\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█      ██      █\u001B[0m   |  " + azul + "  ..............  \u001B[0m ||||\r\n"
									+ "||||  " + azul + "█      ██      █\u001B[0m   |  " + azul + "....." + blanco
									+ "--𝔊𝔞𝔟𝔬--" + azul + ".....\u001B[0m  ||||\r\n" + "||||  " + azul
									+ "█      ██      █\u001B[0m   |  " + azul + "  .............   \u001B[0m ||||\r\n"
									+ "||||  " + azul + "█    ██████    █\u001B[0m   |  " + azul + ".." + blanco + "EST"
									+ azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB" + azul + "-" + blanco
									+ "99" + azul + "..\u001B[0m ||||\r\n" + "||||  " + azul
									+ "█      ██      █\u001B[0m   |  " + azul + " ." + blanco + "POP" + azul + "-"
									+ blanco + "81" + azul + ".." + blanco + "BON" + azul + "-" + blanco + "99" + azul
									+ ". \u001B[0m ||||\r\n" + "||||  " + azul + "█              █\u001B[0m   |  "
									+ azul + ".." + blanco + "MNT" + azul + "-" + blanco + "87" + azul + ".." + blanco
									+ "SUE" + azul + "-" + blanco + "90" + azul + "..\u001B[0m ||||\r\n" + "||||  "
									+ azul + "████████████████\u001B[0m   |    " + azul + "  ..." + azul + "✨✨" + azul
									+ "...  \u001B[0m   ||||\r\n" + "||||____________________ | ________" + azul
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
						System.out.println("Error");

					}

				}

				else if (eleccionColeccion == 7) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + azul + "1."
							+ celeste + "Alejandro\u001B[0m        |                     ||||\r\n" + "||||  " + azul
							+ "2." + celeste + "Iker\u001B[0m             |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionFlashback = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionFlashback == 1) {

						if (flashback1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + celeste + "...." + azul + "«««" + celeste
									+ ".... \u001B[0m    |\\-.\r\n" + "||||  " + celeste
									+ "Alejandro\u001B[0m          |   " + celeste + ".██████ " + celeste + "███████"
									+ celeste + ".\u001B[0m  ||||\r\n" + "||||" + blanco + "                     |  "
									+ celeste + "." + azul + " .--.  .--.  " + celeste + "███" + celeste
									+ ".\u001B[0m ||||\r\n" + "||||  " + celeste + "Valor = 5000€\u001B[0m      |  "
									+ celeste + "." + azul + "{ {} }{ {} }   " + celeste + "█.\u001B[0m ||||\r\n"
									+ "||||                     |  " + celeste + "." + azul + " `/ /  `/ /  " + celeste
									+ " ██" + celeste + ".\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "████████████████\u001B[0m   |  " + celeste + "." + azul + " `-'   `-'  "
									+ celeste + "████" + celeste + ".\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█              █\u001B[0m   |  " + celeste + "." + celeste + "████" + celeste
									+ "████████████" + celeste + ".\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█     ██  ██   █\u001B[0m   |  " + celeste
									+ ".‹.‹.‹.‹.‹.‹.‹.‹.‹\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█    ██  ██    █\u001B[0m   |  " + celeste + "..-«" + azul + "🄰🄻🄴🄹🄰🄽🄳🅁🄾"
									+ celeste + "«-...\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█   ██  ██     █\u001B[0m   |  " + celeste
									+ "..................\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█    ██  ██    █\u001B[0m   |  " + celeste + ".." + azul + "EST" + celeste + "-"
									+ azul + "72" + celeste + ".." + azul + "HOB" + celeste + "-" + azul + "99"
									+ celeste + "..\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█     ██  ██   █\u001B[0m   |  " + celeste + " ." + azul + "POP" + celeste + "-"
									+ azul + "98" + celeste + ".." + azul + "BON" + celeste + "-" + azul + "98"
									+ celeste + ". \u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█              █\u001B[0m   |  " + celeste + ".." + azul + "MNT" + celeste + "-"
									+ azul + "98" + celeste + ".." + azul + "SUE" + celeste + "-" + azul + "98"
									+ celeste + "..\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "████████████████\u001B[0m   |    " + celeste + "......" + azul + "《《" + celeste
									+ "......\u001B[0m   ||||\r\n" + "||||____________________ | ________" + celeste
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionFlashback == 2) {

						if (flashback2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + celeste + "...." + azul + "«««" + celeste
									+ ".... \u001B[0m    |\\-.\r\n" + "||||  " + celeste
									+ "Iker\u001B[0m               |   " + celeste + ".██████ " + celeste + "███████"
									+ celeste + ".\u001B[0m  ||||\r\n" + "||||" + blanco + "                     |  "
									+ celeste + "." + azul + " .--.  .--.  " + celeste + "███" + celeste
									+ ".\u001B[0m ||||\r\n" + "||||  " + celeste + "Valor = 5000€\u001B[0m      |  "
									+ celeste + "." + azul + "{ {} }{ {} }   " + celeste + "█.\u001B[0m ||||\r\n"
									+ "||||                     |  " + celeste + "." + azul + " `/ /  `/ /  " + celeste
									+ " ██" + celeste + ".\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "████████████████\u001B[0m   |  " + celeste + "." + azul + " `-'   `-'  "
									+ celeste + "████" + celeste + ".\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█              █\u001B[0m   |  " + celeste + "." + celeste + "████" + celeste
									+ "████████████" + celeste + ".\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█     ██  ██   █\u001B[0m   |  " + celeste
									+ ".‹.‹.‹.‹.‹.‹.‹.‹.‹\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█    ██  ██    █\u001B[0m   |  " + celeste + ".....-«" + azul + "🄸🄺🄴🅁"
									+ celeste + "«-.....\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█   ██  ██     █\u001B[0m   |  " + celeste
									+ "..................\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█    ██  ██    █\u001B[0m   |  " + celeste + ".." + azul + "EST" + celeste + "-"
									+ azul + "90" + celeste + ".." + azul + "HOB" + celeste + "-" + azul + "99"
									+ celeste + "..\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█     ██  ██   █\u001B[0m   |  " + celeste + " ." + azul + "POP" + celeste + "-"
									+ azul + "94" + celeste + ".." + azul + "BON" + celeste + "-" + azul + "99"
									+ celeste + ". \u001B[0m ||||\r\n" + "||||  " + celeste
									+ "█              █\u001B[0m   |  " + celeste + ".." + azul + "MNT" + celeste + "-"
									+ azul + "95" + celeste + ".." + azul + "SUE" + celeste + "-" + azul + "95"
									+ celeste + "..\u001B[0m ||||\r\n" + "||||  " + celeste
									+ "████████████████\u001B[0m   |    " + celeste + "......" + azul + "《《" + celeste
									+ "......\u001B[0m   ||||\r\n" + "||||____________________ | ________" + celeste
									+ "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
						System.out.println("Error");

					}

				}

				else if (eleccionColeccion == 8) {

					if (omega1 == true) {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}
						aaa = 0;

						animacionCerrandoLibro AnimacionCerrandoLibro = new animacionCerrandoLibro();
						AnimacionCerrandoLibro.ejecutar();

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}
						aaa = 0;

						Thread.sleep(1000);

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}
						aaa = 0;

						System.out.println(blanco + "            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓            \r\n" + "         ▓▓▓▓▓▓---"
								+ blanco + "ℙ𝕦𝕔𝕔𝕚" + blanco + "---▓▓▓▓▓▓         \r\n"
								+ "       ▓▓▓▓▓               ▓▓▓▓▓       \r\n"
								+ "     ▓▓▓▓▓                  ▓▓▓▓▓▓    \r\n" + "    ▓▓▓▓▓----" + blanco + "𝔼𝕊𝕋"
								+ blanco + "-" + blanco + "𝟡𝟡" + blanco + "-" + blanco + "ℍ𝕆𝔹" + blanco + "-"
								+ amarillo + "𝟏𝟎𝟎" + blanco + "----▓▓▓▓▓   \r\n" + "    ▓▓▓▓ " + amarillo
								+ " ███   █████   █████ " + blanco + "  ▓▓▓▓   \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███  █     █ █     █" + blanco + "  ▓▓▓▓▓  \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███  █     █ █     █" + blanco + "  ▓▓▓▓▓  \r\n" + "   ▓▓▓▓▓ " + amarillo
								+ " ███   █████   █████ " + blanco + "  ▓▓▓▓▓  \r\n" + "    ▓▓▓▓▓--" + blanco + "ℙ𝕆ℙ"
								+ blanco + "-" + amarillo + "𝟏𝟎𝟎" + blanco + "------" + blanco + "𝔹𝕆ℕ" + blanco
								+ "-" + blanco + "𝟡𝟡" + blanco + "--▓▓▓▓▓   \r\n"
								+ "     ▓▓▓▓▓---------------------▓▓▓▓▓    \r\n" + "      ▓▓▓▓▓--" + blanco + "𝕄ℕ𝕋"
								+ blanco + "-" + amarillo + "𝟏𝟎𝟎" + blanco + "--" + blanco + "𝕊𝕌𝔼" + blanco + "-"
								+ blanco + "𝟡𝟡" + blanco + "--▓▓▓▓▓     \r\n"
								+ "       ▓▓▓▓▓▓              ▓▓▓▓▓▓      \r\n"
								+ "▓▓▓      ▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓     ▓▓▓\r\n"
								+ "▓▓           ▓▓▓        ▓▓▓          ▓▓\r\n"
								+ "▓▓▓▓      ▓▓▓▓▓▓        ▓▓▓▓▓▓     ▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓  ▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓  ▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\u001B[0m");

						System.out.println("");
						System.out.println("	     Valor = 10000€");

						System.out.println("");
						System.out.println(" (Introduce cualquier número para voler)");
						enter = sc.nextInt();

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;

					}

					else {

						System.out.println("            No tienes esta carta");
						System.out.println("");
						System.out.println("");

						System.out.println("");
						System.out.println("      (Introduce cualquier número para voler)");
						enter = sc.nextInt();

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}

						aaa = 0;
					}

				}

				else if (eleccionColeccion == 9) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + blanco + "1."
							+ amarillo + "Victor\u001B[0m           |                     ||||\r\n" + "||||  " + blanco
							+ "2." + amarillo + "Roger\u001B[0m            |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionLeyenda = sc.nextInt();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionLeyenda == 1) {

						if (leyenda1 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo + "...." + blanco + "☬✟☬" + amarillo
									+ ".... \u001B[0m    |\\-.\r\n" + "||||  " + blanco
									+ "Victor\u001B[0m             |   " + amarillo + ".██████████████" + amarillo
									+ ".\u001B[0m  ||||\r\n" + "||||" + blanco + "                     |  " + amarillo
									+ "." + blanco + " .--.  .--.  " + amarillo + "███" + amarillo
									+ ".\u001B[0m ||||\r\n" + "||||  " + blanco + "                   |  " + amarillo
									+ "." + blanco + "{ {} }{ {} }   " + amarillo + "█.\u001B[0m ||||\r\n"
									+ "||||                     |  " + amarillo + "." + blanco + " `/ /  `/ /  "
									+ amarillo + " ██" + amarillo + ".\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo + "." + blanco + " `-'   `-'  "
									+ amarillo + "████" + amarillo + ".\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo + "." + amarillo + "████" + amarillo
									+ "████████████" + amarillo + ".\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█  ████        █\u001B[0m   |  " + amarillo + "........" + blanco + "⚜"
									+ amarillo + "........\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█   ██         █\u001B[0m   |  " + amarillo + ".....♰♱" + blanco + "𝕍𝕚𝕔𝕥𝕠𝕣"
									+ amarillo + "♱♰.....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█   ██         █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█   ██     ██  █\u001B[0m   |  " + amarillo + ".." + blanco + "EST" + amarillo
									+ "-" + blanco + "98" + amarillo + ".." + blanco + "HOB" + amarillo + "-" + blanco
									+ "99" + amarillo + "..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█  ██████████  █\u001B[0m   |  " + amarillo + ".." + blanco + "POP" + amarillo
									+ "-" + blanco + "96" + amarillo + ".." + blanco + "BON" + amarillo + "-" + blanco
									+ "99" + amarillo + "..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo + ".." + blanco + "MNT" + amarillo
									+ "-" + blanco + "97" + amarillo + ".." + blanco + "SUE" + amarillo + "-" + blanco
									+ "99" + amarillo + "..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo + "......" + blanco + "✟✟"
									+ amarillo + "......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionLeyenda == 2) {

						if (leyenda2 == true) {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    " + amarillo + "...." + blanco + "☬✟☬" + amarillo
									+ ".... \u001B[0m    |\\-.\r\n" + "||||  " + blanco
									+ "Roger\u001B[0m              |   " + amarillo + ".██████████████" + amarillo
									+ ".\u001B[0m  ||||\r\n" + "||||" + blanco + "                     |  " + amarillo
									+ "." + blanco + " .--.  .--.  " + amarillo + "███" + amarillo
									+ ".\u001B[0m ||||\r\n" + "||||  " + blanco + "                   |  " + amarillo
									+ "." + blanco + "{ {} }{ {} }   " + amarillo + "█.\u001B[0m ||||\r\n"
									+ "||||                     |  " + amarillo + "." + blanco + " `/ /  `/ /  "
									+ amarillo + " ██" + amarillo + ".\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |  " + amarillo + "." + blanco + " `-'   `-'  "
									+ amarillo + "████" + amarillo + ".\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo + "." + amarillo + "████" + amarillo
									+ "████████████" + amarillo + ".\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█  ████        █\u001B[0m   |  " + amarillo + "........" + blanco + "⚜"
									+ amarillo + "........\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█   ██         █\u001B[0m   |  " + amarillo + ".....♰♱" + blanco + "ℝ𝕠𝕘𝕖𝕣"
									+ amarillo + "♱♰.....\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█   ██         █\u001B[0m   |  " + amarillo
									+ "..................\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█   ██     ██  █\u001B[0m   |  " + amarillo + ".." + blanco + "EST" + amarillo
									+ "-" + blanco + "99" + amarillo + ".." + blanco + "HOB" + amarillo + "-" + blanco
									+ "97" + amarillo + "..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█  ██████████  █\u001B[0m   |  " + amarillo + ".." + blanco + "POP" + amarillo
									+ "-" + blanco + "97" + amarillo + ".." + blanco + "BON" + amarillo + "-" + blanco
									+ "99" + amarillo + "..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "█              █\u001B[0m   |  " + amarillo + ".." + blanco + "MNT" + amarillo
									+ "-" + blanco + "96" + amarillo + ".." + blanco + "SUE" + amarillo + "-" + blanco
									+ "99" + amarillo + "..\u001B[0m ||||\r\n" + "||||  " + amarillo
									+ "████████████████\u001B[0m   |    " + amarillo + "......" + blanco + "✟✟"
									+ amarillo + "......\u001B[0m   ||||\r\n" + "||||____________________ | ________"
									+ amarillo + "....\u001B[0m________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("    ____________________   ____________________\r\n"
									+ ".-/|                    \\ /    ............    |\\-.\r\n"
									+ "||||No tienes esta carta |   .              .  ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .     Vacío      . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .                . ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ....          .... ||||\r\n"
									+ "||||                     |  .................. ||||\r\n"
									+ "||||                     |  ..EST-  ..HOB-  .. ||||\r\n"
									+ "||||                     |  ..POP-  ..BON-  .. ||||\r\n"
									+ "||||                     |  ..MNT-  ..SUE-  .. ||||\r\n"
									+ "||||                     |    ......==......   ||||\r\n"
									+ "||||____________________ | ________....________||||\r\n"
									+ "||/===================\\  |  /===================\\||\r\n"
									+ " `--------------------~__~__-------------------''");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}
					}

				}

				else if (eleccionColeccion == 0) {

					animacionMoviendoLibro AnimacionMoviendoLibro = new animacionMoviendoLibro();
					AnimacionMoviendoLibro.ejecutar();
					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;
					System.out.println("    ____________________   ____________________\r\n"
							+ ".-/|                    \\ /                    |\\-.\r\n"
							+ "||||   Elige la carta:   |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n" + "||||  " + blanco + "1."
							+ rojo + "Jaume\u001B[0m            |                     ||||\r\n" + "||||  " + blanco
							+ "2." + amarillo + "Iker\u001B[0m             |                     ||||\r\n" + "|||| "
							+ blanco + " 3." + verde + "Javier\u001B[0m           |                     ||||\r\n"
							+ "||||  " + blanco + "4." + azul
							+ "Gabo\u001B[0m             |                     ||||\r\n" + "||||  " + blanco + "5."
							+ magenta + "Marcos\u001B[0m           |                     ||||\r\n" + "||||  " + blanco
							+ "                   |                     ||||\r\n" + "||||  " + blanco + "6." + rojo
							+ "E" + amarillo + "l" + verde + "e" + azul + "n" + magenta
							+ "a\u001B[0m            |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||                     |                     ||||\r\n"
							+ "||||____________________ | ____________________||||\r\n"
							+ "||/===================\\  |  /===================\\||\r\n"
							+ " `--------------------~__~__-------------------''");

					eleccionColeccionUnico = sc.nextInt();

					while (aaa < 70) {
						System.out.println("");
						aaa++;
					}
					aaa = 0;

					if (eleccionColeccionUnico == 1) {

						if (unico1 == true) {

							animacionCerrandoLibro AnimacionCerrandoLibro = new animacionCerrandoLibro();
							AnimacionCerrandoLibro.ejecutar();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							Thread.sleep(1000);

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							System.out.println(rojo
									+ "                                               /T /I          \r\n"
									+ "                                              / |/ | .-~/    \r\n"
									+ "                                          T\\ Y  I  |/  /  _  \r\n"
									+ "                         /T               | \\I  |  I  Y.-~/  \r\n"
									+ "                        I l   /I       T\\ |  |  l  |  T  /   \r\n"
									+ "                 __  | \\l   \\l  \\I l __l  l   \\   `  _. |    \r\n"
									+ "                 \\ ~-l  `\\   `\\  \\  \\\\ ~\\  \\   `. .-~   |    \r\n"
									+ "                  \\   ~-. \"-.  `  \\  ^._ ^. \"-.  /  \\   |    \r\n"
									+ "                .--~-._  ~-  `  _  ~-_.-\"-.\" ._ /._ .\" ./    \r\n"
									+ "                 >--.  ~-.   ._  ~>-\"    \"\\\\   7   7   ]     \r\n"
									+ "                ^.___~\"--._    ~-{  .-~ .  `\\ Y . /    |     \r\n"
									+ "                 <__ ~\"-.  ~       /_/   \\   \\I  Y   : |\r\n"
									+ "                   ^-.__           ~(_/   \\   >._:   | l______     \r\n"
									+ "                       ^--.,___.-~\"  /_/   !  `-.~\"--l_ /     ~\"-.  \r\n"
									+ "                              (_/ .  ~(   /'     \"~\"--,Y   -=b-. _) \r\n"
									+ "                               (_/ .  \\  :           / l      c\"~o \\\r\n"
									+ "   ....." + blanco + "🦅" + rojo
									+ ".....                 \\ /    `.    .     .^   \\_.-~\"~--.  ) \r\n"
									+ " .██████████████.                (_/ .   `  /     /       !       )/  \r\n"
									+ ". " + blanco + ".--.  .--." + rojo
									+ "  ███.                / / _.   '.   .':      /        ' \r\n" + "." + blanco
									+ "{ {} }{ {} }" + rojo
									+ "  ██.                 ~(_/ .   /    _  `  .-<_          \r\n" + ". " + blanco
									+ "`/ /  `/ /" + rojo
									+ "  ███.                  /_/ . ' .-~\" `.  / \\  \\          ,z=.\r\n" + ". "
									+ blanco + "`-'   `-'" + rojo
									+ "  ████.                  ~( /   '  :   | K   \"-.~-.______//\r\n"
									+ ".████████████████.                    \"-,.    l   I/ \\_    __{--->._(==.\r\n"
									+ "..................                     //(     \\  <    ~\"~\"     //\r\n"
									+ " ....--" + blanco + "𝕵𝖆𝖚𝖒𝖊" + rojo
									+ "--...                     /' /\\     \\  \\     ,v=.  ((\r\n"
									+ "..................                  .^. / /\\     \"  }__ //===-  `\r\n" + ".."
									+ blanco + "EST" + rojo + "-" + blanco + "99" + rojo + ".." + blanco + "HOB" + rojo
									+ "-" + blanco + "99" + rojo + "..                / / ' '  \"-.,__ {---(==-\r\n"
									+ ".." + blanco + "POP" + rojo + "-" + blanco + "99" + rojo + ".." + blanco + "BON"
									+ rojo + "-" + blanco + "98" + rojo
									+ "..              .^ '       :  T  ~\"   ll\r\n" + ".." + blanco + "MNT" + rojo
									+ "-" + blanco + "97" + rojo + ".." + blanco + "SUE" + rojo + "-" + blanco + "98"
									+ rojo + "..             / .  .  . : | :!        \\\\ \r\n"
									+ "  .....🪶🪶.....               (_/  /   | | j-\"          ~^\r\n"
									+ "       ....                      ~-<_(_.^-~\"      \u001B[0m");

							System.out.println("");
							System.out.println(" (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("            No tienes esta carta");
							System.out.println("");
							System.out.println("");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionUnico == 2) {

						if (unico2 == true) {

							animacionCerrandoLibro AnimacionCerrandoLibro = new animacionCerrandoLibro();
							AnimacionCerrandoLibro.ejecutar();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							Thread.sleep(1000);

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							System.out.println(amarillo + "\r\n" + "\r\n" + "                        /\\\r\n"
									+ "                        ||\r\n" + "                        ||\r\n"
									+ "                        ||\r\n"
									+ "                        ||                                               ~-----~\r\n"
									+ "                        ||                                            /===--  ---~~~\r\n"
									+ "                        ||                   ;'                 /==~- --   -    ---~~~\r\n"
									+ "                        ||                (/ ('              /=----         ~~_  --(  '\r\n"
									+ "                        ||             ' / ;'             /=----               \\__~\r\n"
									+ "     '                ~==_=~          '('             ~-~~      ~~~~        ~~~--\\~'\r\n"
									+ "     \\\\                (c_\\_        .i.             /~--    ~~~--   -~     (     '\r\n"
									+ "      `\\               (}| /       / : \\           / ~~------~     ~~\\   (\r\n"
									+ "      \\ '               ||/ \\      |===|          /~/             ~~~ \\ \\(\r\n"
									+ "      ``~\\              ~~\\  )~.~_ >._.< _~-~     |`_          ~~-~     )\\\r\n"
									+ "       '-~                 {  /  ) \\___/ (   \\   |` ` _       ~~         '\r\n"
									+ "       \\ -~\\                -<__/  -   -  L~ -;   \\\\    \\ _ _/\r\n"
									+ "       `` ~~=\\                  {    :    }\\ ,\\    ||   _ :(\r\n"
									+ "        \\  ~~=\\__                \\ _/ \\_ /  )  } _//   ( `|'\r\n"
									+ "        ``    , ~\\--~=\\           \\     /  / _/ / '    (   '\r             \n"
									+ "         \\`    } ~ ~~ -~=\\   _~_  / \\ / \\ )^ ( // :_  / '            ....."
									+ blanco + "🔥" + amarillo + ".....          \r\n"
									+ "         |    ,          _~-'   '~~__-_  / - |/     \\ (            .██████████████.           \r\n"
									+ "          \\  ,_--_     _/              \\_'---', -~ .   \\          . " + blanco
									+ ".--.  .--." + amarillo + "  ███.          \r\n"
									+ "           )/      /\\ / /\\   ,~,         \\__ _}     \\_  \"~_       ."
									+ blanco + "{ {} }{ {} }" + amarillo + "  ██.                   \r\n"
									+ "           ,      { ( _ )'} ~ - \\_    ~\\  (-:-)       \"\\   ~      . "
									+ blanco + "`/ /  `/ /" + amarillo + "  ███.                 \r\n"
									+ "                  /'' ''  )~ \\~_ ~\\   )->  \\ :|    _,       \"     . "
									+ blanco + "`-'   `-'" + amarillo + "  ████.                 \r\n"
									+ "                 (\\  _/)''} | \\~_ ~  /~(   | :)   /          }    .████████████████.                \r\n"
									+ "                <``  >;,,/  )= \\~__ {{{ '  \\ =(  ,   ,       ;    ..................                   \r\n"
									+ "               {o_o }_/     |v  '~__  _    )-v|  \"  :       ,\"     ....--"
									+ blanco + "𝕴𝖐𝖊𝖗" + amarillo + "--.....               \r\n"
									+ "               {/\"\\_)       {_/'  \\~__ ~\\_ \\\\_} '  {        /~\\   ..................                   \r\n"
									+ "               ,/!          '_/    '~__ _-~ \\_' :  '      ,\"  ~   .." + blanco
									+ "EST" + amarillo + "-" + blanco + "99" + amarillo + ".." + blanco + "HOB"
									+ amarillo + "-" + blanco + "99" + amarillo + "..          \r\n"
									+ "              (''`                  /,'~___~    | /     ,\"  \\ ~'  .." + blanco
									+ "POP" + amarillo + "-" + blanco + "98" + amarillo + ".." + blanco + "BON"
									+ amarillo + "-" + blanco + "98" + amarillo + "..                 \r\n"
									+ "             '/, )                 (-)  '~____~\";     ,\"     , }  .." + blanco
									+ "MNT" + amarillo + "-" + blanco + "99" + amarillo + ".." + blanco + "SUE"
									+ amarillo + "-" + blanco + "97" + amarillo + "..                  \r\n"
									+ "           /,')                    / \\         /  ,~-\"       '~'    .....⚔️⚔️.....           \r\n"
									+ "       (  ''/                     / ( '       /  /          '~'          ....       \r\n"
									+ "    ~ ~  ,, /) ,                 (/( \\)      ( -)          /~'                      \r\n"
									+ "  (  ~~ )`  ~}                   '  \\)'     _/ /           ~'                       \r\n"
									+ " { |) /`,--.(  }'                    '     (  /          /~'                        \r\n"
									+ "(` ~ ( c|~~| `}   )                        '/:\\         ,'                             \r\n"
									+ " ~ )/``) )) '|),                          (/ | \\)                                    \r\n"
									+ "  (` (-~(( `~`'  )                        ' (/ '\r\n"
									+ "   `~'    )'`')                              '\r\n" + "     ` ``\r\n"
									+ "\u001B[0m");

							System.out.println("");
							System.out.println(" (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("            No tienes esta carta");
							System.out.println("");
							System.out.println("");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionUnico == 3) {

						if (unico3 == true) {

							animacionCerrandoLibro AnimacionCerrandoLibro = new animacionCerrandoLibro();
							AnimacionCerrandoLibro.ejecutar();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							Thread.sleep(1000);

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							System.out.println(verde
									+ "           _/          ,          .                                          \r\n"
									+ "       , -' )         ( \\-------.,')            (\\_________________________  \r\n"
									+ "     , ,-/ |          /\\_) )     \\/            ,' _.----------------------,\\ \r\n"
									+ "   ,',  /, |         /      >--. ,)           / /\\\\                          \r\n"
									+ "  / ,  //|,'        /'     '\\--'\\\\)          /,'  \\\\     `         `   ,     \r\n"
									+ " / ,  // ||       ,'     (.--^( `')         //     \\\\                \\       \r\n"
									+ "( ,  //  ||,___,-'    (___\\\\  '^^^'        //       \\\\              ,        \r\n"
									+ " \\  //   ||--.__     (     \\`^--)  _____.-'/         \\\\   `                  \r\n"
									+ "  >'/    ||,        (       \\|_(\\-'      ,'           \\\\         \\,          \r\n"
									+ " /,'     ||          \\           \\      /              \\\\                    \r\n"
									+ "(/       ||           \\           )  ,'(     `     `    \\\\      ,            \r\n"
									+ " `       ||\\           \\      ) ,'  /_  )                \\\\    \\             \r\n"
									+ "         || `.          `.    ,'   /( `.\\  \\ , \\ \\,       \\\\   ,             \r\n"
									+ "   `     || (_`.          ` .'   .'  )  `)'            ,   \\\\                \r\n"
									+ "         ||  (_ `-v-------  ^--v' , )                      '\\\\,              \r\n"
									+ "         ||    (    , _,-  /  -./ )'                         `)              \r\n"
									+ "     `   '|     ),  ,'    '     )'                                           \r\n"
									+ "        ' ;    /  ,'          ,'                                             \r\n"
									+ "       /,'    /  /      '    /     , - --- .                                 \r\n"
									+ "       \\|    /  (          ,'   '           `.                               \r\n"
									+ "       ('  ,'    `.    \"  / ,'                \\                              \r\n"
									+ "         ,'        \\    ,/,'        '`)   (_   )                             \r\n"
									+ "        /           \\ , /'          ,      /  /                              \r\n"
									+ "       .             )  ,       ,         '  /        ....." + blanco + "🐉"
									+ verde + ".....      \r\n"
									+ "                      )      ,              /       .██████████████.         \r\n"
									+ "       .            ' `|   ,'              /       . " + blanco + ".--.  .--."
									+ verde + "  ███.                 \r\n"
									+ "                    '  |  /              ,'        ." + blanco + "{ {} }{ {} }"
									+ verde + "  ██.                   \r\n"
									+ "        |\\             | <    ______,---'          . " + blanco + "`/ /  `/ /"
									+ verde + "  ███.                    \r\n"
									+ "        ` \\            ','   (                     . " + blanco + "`-'   `-'"
									+ verde + "  ████.                    \r\n"
									+ "         \\ '          /(____ ,`-._,-.              .████████████████.                    \r\n"
									+ "          `.         /      `._, )---)             ..................                  \r\n"
									+ "            `-------'\\         `/ \\                 ....--" + blanco
									+ "𝕵𝖆𝖛𝖎𝖊𝖗" + verde + "–-....                    \r\n"
									+ "               )   )  \\          ` \\               ..................                    \r\n"
									+ "              /  '(    `.         `                .." + blanco + "EST" + verde
									+ "-" + blanco + "99" + verde + ".." + blanco + "HOB" + verde + "-" + blanco + "98"
									+ verde + "..                   \r\n"
									+ "         ___,' _, /      `.         .              .." + blanco + "POP" + verde
									+ "-" + blanco + "99" + verde + ".." + blanco + "BON" + verde + "-" + blanco + "99"
									+ verde + "..                  \r\n"
									+ "        ('.---/ \\(          .      '|              .." + blanco + "MNT" + verde
									+ "-" + blanco + "97" + verde + ".." + blanco + "SUE" + verde + "-" + blanco + "98"
									+ verde + "..                   \r\n"
									+ "        /'    `|^'           .     ,                 .....🐲🐲.....                \r\n"
									+ "                             .     /                      ....           \r\n"
									+ "                                  '                                          \r\n"
									+ "                            '    '                                           \r\n"
									+ "                          ,'  ,                                              \r\n"
									+ "                         (_ '                  \u001B[0m");

							System.out.println("");
							System.out.println(" (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("            No tienes esta carta");
							System.out.println("");
							System.out.println("");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionUnico == 4) {

						if (unico4 == true) {

							animacionCerrandoLibro AnimacionCerrandoLibro = new animacionCerrandoLibro();
							AnimacionCerrandoLibro.ejecutar();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							Thread.sleep(1000);

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							System.out.println(azul
									+ "                                              ____                           \r\n"
									+ "  ___                                      .-~. /_\"-._                      \r\n"
									+ "`-._~-.                                    /_ \"                             \r\n"
									+ "      \\  \\                                / : \\~ .  ` ')                  \r\n"
									+ "      ]  |                              /  |  Y< ~-.__j                      \r\n"
									+ "     /   !                        _.--~T : l  l<  VVVV         ....." + blanco
									+ "🦖" + azul + ".....    \r\n"
									+ "    /   /                 ____.--~ .   ` l /~\\ \\A|           .██████████████.    \r\n"
									+ "   /   /             .-~~\"        /| .    ',-~\\ \\A|         . " + blanco
									+ ".--.  .--." + azul + "  ███.    \r\n"
									+ "  /   /             /     .^   \\ Y~Y \\.^>/l_   \"--'         ." + blanco
									+ "{ {} }{ {} }" + azul + "  ██.    \r\n"
									+ " /   Y           .-\"(  .  l__  j_j l_/ /~_.-~    .          . " + blanco
									+ "`/ /  `/ /" + azul + "  ███.    \r\n"
									+ "Y    l          /    \\  )    ~~~.\" / `/\"~ / \\.__/l_         . " + blanco
									+ "`-'   `-'" + azul + "  ████.    \r\n"
									+ "|     \\     _.-\"      ~-{__     l  :  l._Z~-.___.--~        .████████████████.    \r\n"
									+ "|      ~---~           /   ~~\"---\\_  ' __[>                 ..................    \r\n"
									+ "l  .                _.^   ___     _>-y~                      ....--" + blanco
									+ "𝕲𝖆𝖇𝖔" + azul + "--....   \r\n"
									+ " \\  \\     .      .-~   .-~   ~>--\"  /                       ..................    \r\n"
									+ "  \\  ~---\"            /     ./  _.-'                        .." + blanco
									+ "EST" + azul + "-" + blanco + "99" + azul + ".." + blanco + "HOB" + azul + "-"
									+ blanco + "99" + azul + "..    \r\n"
									+ "   \"-.,_____.,_  _.--~\\     _.-~                            .." + blanco
									+ "POP" + azul + "-" + blanco + "97" + azul + ".." + blanco + "BON" + azul + "-"
									+ blanco + "99" + azul + "..    \r\n"
									+ "               ~~     (   _}                                .." + blanco + "MNT"
									+ azul + "-" + blanco + "98" + azul + ".." + blanco + "SUE" + azul + "-" + blanco
									+ "98" + azul + "..    \r\n"
									+ "                      `. ~(                                   .....🌋🌋.....    \r\n"
									+ "                        )  \\                                       ....\r\n"
									+ "                  /,`--'~\\--'~\\\u001B[0m");

							System.out.println("");
							System.out.println(" (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("            No tienes esta carta");
							System.out.println("");
							System.out.println("");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionUnico == 5) {

						if (unico5 == true) {

							animacionCerrandoLibro AnimacionCerrandoLibro = new animacionCerrandoLibro();
							AnimacionCerrandoLibro.ejecutar();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							Thread.sleep(1000);

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							System.out.println(magenta + "                                                 ,/\r\n"
									+ "                                                //\r\n"
									+ "                                              ,//\r\n"
									+ "                                  ___   /|   |//\r\n"
									+ "                              `__/\\_ --(/|___/-/\r\n"
									+ "                           \\|\\_-\\___ __-_`- /-/ \\.\r\n"
									+ "                          |\\_-___,-\\_____--/_)' ) \\\r\n"
									+ "                           \\ -_ /     __ \\( `( __`\\|\r\n"
									+ "                           `\\__|      |\\)\\ ) /(/|\r\n"
									+ "   ,._____.,            ',--//-|      \\         /\r\n"
									+ "  /     __. \\,          / /,---|       \\       /\r\n"
									+ " / /    _. \\  \\        `/`_/ _,'        |     |\r\n"
									+ "|  | ( (  \\   |      ,/\\'__/'/          |     |\r\n"
									+ "|  \\  \\`--, `_/_------______/           \\(   )/\r\n"
									+ "| | \\  \\_. \\,                            \\___/\\\r\n"
									+ "| |  \\_   \\  \\                                 \\\r\n"
									+ "\\ \\    \\_ \\   \\   /                             \\\r\n"
									+ " \\ \\  \\._  \\__ \\_|       |                       \\\r\n"
									+ "  \\ \\___  \\      \\       |                        \\       ....." + blanco
									+ "🦄" + magenta + ".....         \r\n"
									+ "   \\__ \\__ \\  \\_ |       \\                         |    .██████████████.                      \r\n"
									+ "   |  \\_____ \\  ____      |                        |   . " + blanco
									+ ".--.  .--." + magenta + "  ███.                       \r\n"
									+ "   | \\  \\__ ---' .__\\     |        |               |   ." + blanco
									+ "{ {} }{ {} }" + magenta + "  ██.                      \r\n"
									+ "   \\  \\__ ---   /   )     |        \\              /    . " + blanco
									+ "`/ /  `/ /" + magenta + "  ███.                    \r\n"
									+ "    \\   \\____/ / ()(      \\          `---_       /|    . " + blanco
									+ "`-'   `-'" + magenta + "  ████.                      \r\n"
									+ "     \\__________/(,--__    \\_________.    |    ./ |    .████████████████.                      \r\n"
									+ "       |     \\ \\  `---_\\--,           \\   \\_,./   |    ..................                            \r\n"
									+ "       |      \\  \\_ ` \\    /`---_______-\\   \\\\    /     ...--" + blanco
									+ "𝕸𝖆𝖗𝖈𝖔𝖘" + magenta + "--....                           \r\n"
									+ "        \\      \\.___,`|   /              \\   \\\\   \\    ..................                      \r\n"
									+ "         \\     |  \\_ \\|   \\              (   |:    |   .." + blanco + "EST"
									+ magenta + "-" + blanco + "97" + magenta + ".." + blanco + "HOB" + magenta + "-"
									+ blanco + "99" + magenta + "..                     \r\n"
									+ "          \\    \\      \\    |             /  / |    ;   .." + blanco + "POP"
									+ magenta + "-" + blanco + "97" + magenta + ".." + blanco + "BON" + magenta + "-"
									+ blanco + "99" + magenta + "..                      \r\n"
									+ "           \\    \\      \\    \\          ( `_'   \\  |    .." + blanco + "MNT"
									+ magenta + "-" + blanco + "99" + magenta + ".." + blanco + "SUE" + magenta + "-"
									+ blanco + "99" + magenta + "..                        \r\n"
									+ "            \\.   \\      \\.   \\          `__/   |  |      .....🌈🌈.....                     \r\n"
									+ "              \\   \\       \\.  \\                |  |           ....                \r\n"
									+ "               \\   \\        \\  \\               (  )\r\n"
									+ "                \\   |        \\  |              |  |\r\n"
									+ "                 |  \\         \\ \\              I  `\r\n"
									+ "                 ( __;        ( _;            ('-_';\r\n"
									+ "                 |___\\        \\___:            \\___:\u001B[0m");

							System.out.println("");
							System.out.println(" (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("            No tienes esta carta");
							System.out.println("");
							System.out.println("");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else if (eleccionColeccionUnico == 6) {

						if (unico6 == true) {

							animacionCerrandoLibro AnimacionCerrandoLibro = new animacionCerrandoLibro();
							AnimacionCerrandoLibro.ejecutar();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							Thread.sleep(1000);

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}
							aaa = 0;

							System.out.println(
									"                                                                               \r\n"
											+ "                                                                               \r\n"
											+ "                                                                               \r\n"
											+ "                                                                               \r\n"
											+ "                                                                               \r\n"
											+ "                                                                               \r\n"
											+ "                             " + rojo + "......" + blanco + "🦋" + rojo
											+ ".......                                         \r\n"
											+ "                           " + amarillo + "." + blanco
											+ "█████████████████" + amarillo
											+ ".                                                   \r\n"
											+ "                          " + verde + "." + blanco + "██ " + rojo
											+ ".-. .---. .-. " + blanco + "██" + verde
											+ ".                                \r\n" + "                          "
											+ azul + "." + blanco + "██ " + amarillo + "{ |. .-. .{ | " + blanco + "██"
											+ azul + ".                                \r\n"
											+ "                          " + magenta + "." + blanco + "██" + verde
											+ " | }' `-' '| } " + blanco + "██" + magenta
											+ ".                                \r\n" + "                          "
											+ rojo + "." + blanco + "██" + azul + " `-' `---' `-' " + blanco + "██"
											+ rojo + ".                                \r\n"
											+ "                          " + amarillo + "." + blanco
											+ "███████████████████" + amarillo
											+ ".                                                   \r\n"
											+ "                          " + verde
											+ ".....................                                                     \r\n"
											+ "                            " + azul + "....--" + blanco + "𝕰𝖑𝖊𝖓𝖆"
											+ azul + "--.....                                                   \r\n"
											+ "                          " + magenta
											+ ".....................                                                \r\n"
											+ "" + rojo + "     __....__             " + rojo + ".." + blanco + "EST"
											+ rojo + "-" + blanco + "101" + rojo + "..." + blanco + "HOB" + rojo + "-"
											+ blanco + "101" + rojo + "..        " + rojo + "_..-'\"`\"\"+\"'-.\r\n"
											+ "   .\"`" + "" + "" + amarillo + "_____`\"-._          " + amarillo + ".."
											+ blanco + "POP" + amarillo + "-" + blanco + "101" + amarillo + "..."
											+ blanco + "BON" + amarillo + "-" + blanco + "101" + amarillo + "..   "
											+ amarillo + "_.-\"__...-----\\\"\"'\\\r\n" + "" + verde
											+ " ,'..._      '\"\"-.`._     " + verde + ".." + blanco + "MNT" + verde
											+ "-" + blanco + "101" + verde + "..." + blanco + "SUE" + verde + "-"
											+ blanco + "101" + verde + "..  " + verde + "_.'_.\"'        __..\\--|\r\n"
											+ "" + azul + "( :    \"..__     _,'.\"-._      " + azul + "...." + blanco
											+ "♥️♥️♥️" + azul + "....    " + azul + ",'_.'__`.----\"\"'     \\ /\r\n"
											+ "" + magenta + " . \\        `\",+'--.+`-..`.   " + blanco + "o   "
											+ magenta + ".....   " + blanco + "o  " + magenta
											+ ".'-\"   \\  _.\".-\"''\"\"\"`\"'/\r\n" + "" + rojo
											+ "  \\\"`.+\"'----+----.'       `.  " + blanco + ".   " + rojo + "...   "
											+ blanco + ".'" + rojo + " ,'       .'\" ___\"._____,'.\r\n" + "" + amarillo
											+ "   \\  .   __/......`.__      `. " + blanco + "`.  " + amarillo + ".  "
											+ blanco + "'" + amarillo + " .\" __..--'\"+'\"\"     \\    :-|\r\n" + ""
											+ verde + "    \\-:--\"  :      /__ `'\"-.._ \\  " + blanco + "\\   "
											+ blanco + "/ " + verde + "/.-'__..---\"\"`.\"'----.\\___; '\r\n" + ""
											+ azul + "     .: _..+.--\"'\"/   `\"--..__`_`. " + blanco + "\\ " + blanco
											+ "/ " + azul + "/.-'\"           `.     :   :7\r\n" + "" + magenta
											+ "     ':\"  .'    .'--------\"\"'   `." + blanco + "(   )" + magenta
											+ "'\"'\"'\"`----\"\"'`'--`-''\".--.'\r\n" + "" + rojo
											+ "      \\._.'-'\"\"/    ______        " + blanco + "/ ^ \\" + rojo
											+ " _....--------...__`._'_.\"\r\n" + "" + amarillo
											+ "       `.\\_`.\"_...\"\",---. `\"\"`'\"\": " + blanco + "/ \\" + amarillo
											+ " :____    .\"\"`\"._   \"-.\"\r\n" + "" + verde
											+ "         `\"\",._...'\"    '__..-''\"`" + blanco + "/   \\" + verde
											+ "'.   `\"-;      ,`\"\"\"`.`.\r\n" + "" + azul
											+ "          ,\".'    :      \\     .'." + blanco + "| \" |" + azul
											+ "\\ `.   /       `      \\ \\\r\n" + "" + magenta
											+ "         '.'...--\".       \\  ,' / " + blanco + "| - |" + magenta
											+ " .  \"-/       .\"`-.._  : .\r\n" + "" + rojo
											+ "        j\":     _,'_       .'  /  " + blanco + "| = |" + rojo
											+ " '   /       ,-\\     `.:.|\r\n" + "" + amarillo
											+ "        | .  _.'    ;      :  /   " + blanco + "} = {" + amarillo
											+ "  \\ j       _\\  `._    ' :\r\n" + "" + verde
											+ "        | ',\"     .'\".      ./    " + blanco + "`._,'" + verde
											+ "   ':      :  \\    \"._: j\r\n" + "" + azul
											+ "        '.':    ,\"   ,\".    .              \\     ,-.  `._    '\"|\r\n"
											+ "" + magenta
											+ "         \\ `  .'    /   :_  '               \\   :   \\    `._/ j\r\n"
											+ "" + rojo
											+ "          . `'     /   /  \\/                 .\"\".    \\      : |\r\n"
											+ "" + amarillo
											+ "          ; :     /   /   /                  \"   \\    \\     ; :\r\n"
											+ "" + verde
											+ "        ,'   \\__.'___/__.'                    `.__\\____\\__.'   `.\r\n"
											+ "" + azul
											+ "      .'  .'\".  _....-\"                          \"--...._  ,--.  `.\r\n"
											+ "" + magenta
											+ "      `--'    `\"                                         `\"    `--\"\u001B[0m");

							System.out.println("");
							System.out.println("     		 (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

						else {

							System.out.println("            No tienes esta carta");
							System.out.println("");
							System.out.println("");

							System.out.println("");
							System.out.println("      (Introduce cualquier número para voler)");
							enter = sc.nextInt();

							while (aaa < 70) {
								System.out.println("");
								aaa++;
							}

							aaa = 0;

						}

					}

					else {

						while (aaa < 70) {
							System.out.println("");
							aaa++;
						}
						aaa = 0;
						System.out.println("Error");
						System.out.println("");
						System.out.println("");

					}

				}

				else {

					System.out.println("Error");
					System.out.println("");
					System.out.println("");
				}

			}

			else if (eleccion == 3) {

				while (aaa < 70) {
					System.out.println("");
					aaa++;
				}
				aaa = 0;

				System.out.println(verde + "╔╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╗\r\n"
						+ "╠╬╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╬╣\r\n" + "╠╣" + azul
						+ " .---.   .--.   .----..-..-. .-. .----. " + verde + "╠╣\r\n" + "╠╣" + rojo
						+ "/  ___} / {} \\ { {__  | ||  `| |/  {}  \\" + verde + "╠╣\r\n" + "╠╣" + rojo
						+ "\\     }/  /\\  \\.-._} }| || |\\  |\\      /" + verde + "╠╣\r\n" + "╠╣" + azul
						+ " `---' `-'  `-'`----' `-'`-' `-' `----' " + verde + "╠╣\r\n"
						+ "╠╬╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╬╣\r\n"
						+ "╚╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╝\u001B[0m");
				System.out.println("Tienes " + dinero + "€");
				System.out.println("\n¿Donde planeas apostar?");
				System.out.println("");
				System.out.println("     ╔══════════════════╗\r\n" + "1.---║LA CIFRA ALEATORIA║\r\n"
						+ "     ╚══════════════════╝\u001B[0m");

				System.out.println("      _  _  _  _  _ \r\n" + "     (_)(_)(_)(_)(_)\r\n" + "     (_)         (_)\r\n"
						+ "2.---(_)COIN FLIP(_)\r\n" + "     (_) _  _  _ (_)\r\n" + "     (_)(_)(_)(_)(_)\u001B[0m");
				System.out.println("");
				System.out.println("     ╔─────╗\r\n" + "3.---│CUPON│\r\n" + "     ╚─────╝\u001B[0m");
				System.out.println("");
				System.out.println(
						"     ~~~~~~~\r\n" + "4.---~AYUDA~--->(SOLO SI TIENES 10€ O MENOS)\r\n" + "     ~~~~~~~");
				System.out.println("");
				eleccionApuesta = sc.nextInt();

				while (aaa < 70) {
					System.out.println("");
					aaa++;
				}
				aaa = 0;

				if (eleccionApuesta == 1) {

					while (aaa < 70) {
						System.out.println("");
						++aaa;
					}
					aaa = 0;

					System.out.println("╔────────╗\r\n" + "│██████╗ │\r\n" + "│╚════██╗│\r\n" + "│  ▄███╔╝│\r\n"
							+ "│  ▀▀══╝ │\r\n" + "│  ██╗   │\r\n" + "│  ╚═╝   │\r\n" + "╚────────╝");
					System.out.println("\nA continuación vamos a sacar un número aleatorio del 1 al 10.");
					System.out.println("Cuanto más cerca esté ese número del 0, más dinero conseguirás. ");
					System.out.println("\n¿Cuanto quieres apostar?");
					dineroApostado = sc.nextDouble();
					while (aaa < 70) {
						System.out.println("");
						++aaa;
					}
					aaa = 0;

					if (dinero >= dineroApostado) {

						dinero = dinero - dineroApostado;
						randomNumeroAzar = Math.random();
						System.out.println("Has sacado el número...");
						Thread.sleep(2000);
						while (aaa < 70) {
							System.out.println("");
							++aaa;
						}
						aaa = 0;

						if (randomNumeroAzar >= 0.9) {

							System.out.println(" ██╗ ██████╗ \r\n" + "███║██╔═████╗\r\n" + "╚██║██║██╔██║\r\n"
									+ " ██║████╔╝██║\r\n" + " ██║╚██████╔╝\r\n" + " ╚═╝ ╚═════╝ ");
							System.out.println("");

							System.out.println("Has perdido todo lo que has apostado.");
						}

						else if (randomNumeroAzar >= 0.8) {

							System.out.println(" █████╗ \r\n" + "██╔══██╗\r\n" + "╚██████║\r\n" + " ╚═══██║\r\n"
									+ " █████╔╝\r\n" + " ╚════╝ ");
							System.out.println("");
							System.out.println("Has perdido todo lo que has apostado.");
						}

						else if (randomNumeroAzar >= 0.7) {

							System.out.println(" █████╗ \r\n" + "██╔══██╗\r\n" + "╚█████╔╝\r\n" + "██╔══██╗\r\n"
									+ "╚█████╔╝\r\n" + " ╚════╝ ");
							System.out.println("");
							System.out.println("Has perdido todo lo que has apostado.");
						}

						else if (randomNumeroAzar >= 0.6) {

							System.out.println("███████╗\r\n" + "╚════██║\r\n" + "    ██╔╝\r\n" + "   ██╔╝ \r\n"
									+ "   ██║  \r\n" + "   ╚═╝  ");
							System.out.println("");
							System.out.println("Has perdido 3/4 partes de lo que has apostado.");
							dinero = dinero + (dineroApostado / 4);
						}

						else if (randomNumeroAzar >= 0.5) {

							System.out.println(" ██████╗ \r\n" + "██╔════╝ \r\n" + "███████╗ \r\n" + "██╔═══██╗\r\n"
									+ "╚██████╔╝\r\n" + " ╚═════╝ \r\n" + "");
							System.out.println("");
							System.out.println("Has perdido 3/4 partes de lo que has apostado.");
							dinero = dinero + (dineroApostado / 4);
						}

						else if (randomNumeroAzar >= 0.4) {

							System.out.println("███████╗\r\n" + "██╔════╝\r\n" + "███████╗\r\n" + "╚════██║\r\n"
									+ "███████║\r\n" + "╚══════╝");
							System.out.println("");
							System.out.println("Has perdido la mitad de lo que has apostado.");
							dinero = dinero + (dineroApostado / 2);
						}

						else if (randomNumeroAzar >= 0.3) {

							System.out.println("██╗  ██╗\r\n" + "██║  ██║\r\n" + "███████║\r\n" + "╚════██║\r\n"
									+ "     ██║\r\n" + "     ╚═╝");
							System.out.println("");
							System.out.println("No has perdido ni has ganado dinero.");
							dinero = dinero + dineroApostado;
						}

						else if (randomNumeroAzar >= 0.2) {

							System.out.println("██████╗ \r\n" + "╚════██╗\r\n" + " █████╔╝\r\n" + " ╚═══██╗\r\n"
									+ "██████╔╝\r\n" + "╚═════╝ ");
							System.out.println("");
							System.out.println("Has ganado el doble de lo que has apostado.");
							dinero = dinero + (2 * dineroApostado);
						}

						else if (randomNumeroAzar >= 0.1) {

							System.out.println("██████╗ \r\n" + "╚════██╗\r\n" + " █████╔╝\r\n" + "██╔═══╝ \r\n"
									+ "███████╗\r\n" + "╚══════╝");
							System.out.println("");
							System.out.println("Has ganado el cuádruple de lo que has apostado.");
							dinero = dinero + (4 * dineroApostado);
						}

						else if (randomNumeroAzar <= 0.1) {

							System.out.println(" ██╗\r\n" + "███║\r\n" + "╚██║\r\n" + " ██║\r\n" + " ██║\r\n" + " ╚═╝");
							System.out.println("");
							System.out.println("¡Has ganado el décuple de lo que has apostado!");
							dinero = dinero + (10 * dineroApostado);
						}

						else {

							System.out.println("Error");

						}
					}

					else {
						System.out.println("Error");
					}

					System.out.println("");
					System.out.println("");
					System.out.println("");
				}

				else if (eleccionApuesta == 2) {

					System.out.println("      ████████      " + "\r\n" + "   ██████████████   " + "\r\n"
							+ "  ████████████████  " + "\r\n" + "  ██████????██████  \r\n" + "  ████████████████  \r\n"
							+ "  ████████████████  \r\n" + "   ██████████████   \r\n" + "      ████████      ");
					System.out.println("");
					System.out.println("A continuación, vamos a lanzar una moneda en el aire.");
					System.out.println("Tienes que elegir CARA o CRUZ.");
					System.out.println(
							"Cuando elijas una de las opciones y la moneda revela esa parte, ganarás el doble que has apostado.");
					System.out.println("En cambio, si revela la otra parte, perderás todo.");
					System.out.println("¿Cuánto quieres apostar?");
					dineroApostado2 = sc.nextDouble();

					if (dineroApostado2 <= dinero) {

						System.out.println("Ahora, ¿que eliges?");
						System.out.println("1.Cara");
						System.out.println("2.Cruz");
						eleccionCoinFlip = sc.nextInt();

						if (eleccionCoinFlip == 1) {

							System.out.println("Has elegido CARA.");
							randomCoinFlip = Math.random();
							Thread.sleep(1000);

							if (randomCoinFlip <= 0.5) {

								animacionMoneda AnimacionMoneda = new animacionMoneda();
								AnimacionMoneda.ejecutar();

								System.out.println("      ████████      " + "\r\n" + "   ██████████████   " + "\r\n"
										+ "  ████████████████  " + "\r\n" + "  ██████CARA██████  \r\n"
										+ "  ████████████████  \r\n" + "  ████████████████  \r\n"
										+ "   ██████████████   \r\n" + "      ████████      ");

								System.out.println("");
								System.out.println("¡Has ganado!");
								System.out.println("Has conseguido " + dineroApostado2 + "€ más.");
								dinero = dinero + dineroApostado2;

							}

							else if (randomCoinFlip > 0.5) {

								animacionMoneda AnimacionMoneda = new animacionMoneda();
								AnimacionMoneda.ejecutar();

								System.out.println("      ████████      " + "\r\n" + "   ██████████████   " + "\r\n"
										+ "  ████████████████  " + "\r\n" + "  ██████CRUZ██████  \r\n"
										+ "  ████████████████  \r\n" + "  ████████████████  \r\n"
										+ "   ██████████████   \r\n" + "      ████████      ");

								System.out.println("");
								System.out.println("Has perdido todo el dinero que has apostado.");
								dinero = dinero - dineroApostado2;

							}

						}

						else if (eleccionCoinFlip == 2) {

							System.out.println("Has elegido CRUZ.");
							randomCoinFlip = Math.random();
							Thread.sleep(1000);

							if (randomCoinFlip <= 0.5) {

								animacionMoneda AnimacionMoneda = new animacionMoneda();
								AnimacionMoneda.ejecutar();

								System.out.println("      ████████      " + "\r\n" + "   ██████████████   " + "\r\n"
										+ "  ████████████████  " + "\r\n" + "  ██████CARA██████  \r\n"
										+ "  ████████████████  \r\n" + "  ████████████████  \r\n"
										+ "   ██████████████   \r\n" + "      ████████      ");

								System.out.println("");
								System.out.println("Has perdido todo el dinero que has apostado.");
								dinero = dinero - dineroApostado2;

							}

							else if (randomCoinFlip > 0.5) {

								animacionMoneda AnimacionMoneda = new animacionMoneda();
								AnimacionMoneda.ejecutar();
								System.out.println("      ████████      " + "\r\n" + "   ██████████████   " + "\r\n"
										+ "  ████████████████  " + "\r\n" + "  ██████CRUZ██████  \r\n"
										+ "  ████████████████  \r\n" + "  ████████████████  \r\n"
										+ "   ██████████████   \r\n" + "      ████████      ");

								System.out.println("");
								System.out.println("¡Has ganado!");
								System.out.println("Has conseguido " + dineroApostado2 + "€ más.");
								dinero = dinero + dineroApostado2;

							}

						}

						System.out.println("");
						System.out.println("");
						System.out.println("");
					}

					else {
						System.out.println("Error");
						System.out.println("");
						System.out.println("");
					}
					System.out.println("");
					System.out.println("");
					System.out.println("");
				}

				else if (eleccionApuesta == 3) {

					while (aaa < 70) {
						System.out.println("");
						++aaa;
					}
					aaa = 0;

					System.out.println("/======================================================================\\\r\n"
							+ "||  / ____/ / / / __ \\/ __ \\/ | / / / ____/ __ \\/ __ \\/  _/ ____/ __ \\||\r\n"
							+ "|| / /   / / / / /_/ / / / /  |/ / / /   / / / / / / // // / __/ / / /||\r\n"
							+ "||/ /___/ /_/ / ____/ /_/ / /|  / / /___/ /_/ / /_/ // // /_/ / /_/ / ||\r\n"
							+ "||\\____/\\____/_/    \\____/_/ |_/  \\____/\\____/_____/___/\\____/\\____/  ||\r\n"
							+ "\\======================================================================/");

					System.out.println("");
					System.out.println(
							"Los códigos especiales se consiguen a través del pago en efectivo al desarrollador.");
					System.out.println("");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO 100000€--->0.99€                       |");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO 100000€--->0.99€                       |");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO " + amarillo + "LEYENDA VICTOR\u001B[0m y " + amarillo
							+ "LEYENDA ROGER\u001B[0m--->4.99€|");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO " + rojo + "U" + amarillo + "N" + verde + "I" + azul + "C" + magenta
							+ "O " + rojo + "JAUME\u001B[0m--->7.49€                   |");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO " + rojo + "U" + amarillo + "N" + verde + "I" + azul + "C" + magenta
							+ "O " + amarillo + "IKER\u001B[0m--->7.49€                    |");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO " + rojo + "U" + amarillo + "N" + verde + "I" + azul + "C" + magenta
							+ "O " + verde + "JAVIER\u001B[0m--->7.49€                  |");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO " + rojo + "U" + amarillo + "N" + verde + "I" + azul + "C" + magenta
							+ "O " + azul + "GABO\u001B[0m--->7.49€                    |");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO " + rojo + "U" + amarillo + "N" + verde + "I" + azul + "C" + magenta
							+ "O " + magenta + "MARCOS\u001B[0m--->7.49€                  |");
					System.out.println("------------------------------------------------");
					System.out.println("|CODIGO " + rojo + "U" + amarillo + "N" + verde + "I" + azul + "C" + magenta
							+ "O " + rojo + "E" + amarillo + "L" + verde + "E" + azul + "N" + magenta
							+ "A\u001B[0m--->9.99€                   |");
					System.out.println("------------------------------------------------");
					System.out.println("");
					System.out.println("\nIntroduce el código:");
					code = sc.nextInt();

					while (aaa < 70) {
						System.out.println("");
						++aaa;
					}
					aaa = 0;

					if (code == 14320989) {

						if (cupon10001 == false) {
							System.out.println("¡Felicidades! Has obtenido 100000€");
							dinero = dinero + 100000;
							cupon10001 = true;

						}

						else {

							System.out.println("Ya has canjeado este código");
						}

					}

					else if (code == 69696969) {

						if (cupon10002 == false) {
							System.out.println("¡Felicidades! Has obtenido 100000€");
							dinero = dinero + 100000;
							cupon10002 = true;

						}

						else {

							System.out.println("Ya has canjeado este código");
						}

					}

					else if (code == 30102007) {

						if (cuponLeyenda == false) {
							System.out.println("¡Felicidades! Has conseguido a " + amarillo + "𝕍𝕀ℂ𝕋𝕆ℝ\u001B[0m y a "
									+ amarillo + "ℝ𝕆𝔾𝔼ℝ\u001B[0m");
							leyenda1 = true;
							leyenda2 = true;
							cuponLeyenda = true;
						}

						else {

							System.out.println("Ya has canjeado este código");

						}

					}

					else if (code == 10841622) {

						if (cuponUnico1 == false) {
							System.out.println("¡Felicidades! Has conseguido a " + rojo + "JAUME\u001B[0m");
							unico1 = true;
							cuponUnico1 = true;
						}

						else {

							System.out.println("Ya has canjeado este código");

						}

					}

					else if (code == 94434895) {

						if (cuponUnico2 == false) {
							System.out.println("¡Felicidades! Has conseguido a " + amarillo + "IKER\u001B[0m");
							unico2 = true;
							cuponUnico2 = true;
						}

						else {

							System.out.println("Ya has canjeado este código");

						}

					}

					else if (code == 60342794) {

						if (cuponUnico3 == false) {
							System.out.println("¡Felicidades! Has conseguido a " + verde + "JAVIER\u001B[0m");
							unico3 = true;
							cuponUnico3 = true;
						}

						else {

							System.out.println("Ya has canjeado este código");

						}

					}

					else if (code == 81253700) {

						if (cuponUnico4 == false) {
							System.out.println("¡Felicidades! Has conseguido a " + azul + "GABO\u001B[0m");
							unico4 = true;
							cuponUnico4 = true;
						}

						else {

							System.out.println("Ya has canjeado este código");

						}

					}

					else if (code == 98912503) {

						if (cuponUnico5 == false) {
							System.out.println("¡Felicidades! Has conseguido a " + magenta + "MARCOS\u001B[0m");
							unico5 = true;
							cuponUnico5 = true;
						}

						else {

							System.out.println("Ya has canjeado este código");

						}

					}

					else if (code == 39011869) {

						if (cuponUnico6 == false) {
							System.out.println("¡Felicidades! Has conseguido a " + rojo + "E" + amarillo + "L" + verde
									+ "E" + azul + "N" + magenta + "A\u001B[0m");
							unico6 = true;
							cuponUnico6 = true;
						}

						else {

							System.out.println("Ya has canjeado este código");

						}

					}

					else {

						System.out.println("Error");

					}

					System.out.println("");
					System.out.println("");
					System.out.println("");

				}

				else if (eleccionApuesta == 4 && dinero <= 10) {

					while (aaa < 70) {
						System.out.println("");
						++aaa;
					}
					aaa = 0;

					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" + "~   _____  ____  _____  ___ ~\r\n"
							+ "~  / _ \\ \\/ / / / / _ \\/ _ |~\r\n" + "~ / __ |\\  / /_/ / // / __ |~\r\n"
							+ "~/_/ |_|/_/\\____/____/_/ |_|~\r\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Como ahora mismo tienes menos del dinero necesario para abrir un sobre,...");
					System.out.println("¡Te vamos a dar 20€ para que no te quedes estancado en el juego!");

					dinero = dinero + 20;

					System.out.println("");
					System.out.println("");

				}

				else {
					System.out.println("Error");
					System.out.println("");
					System.out.println("");

				}

			}

			else {

				System.out.println("Error");
				System.out.println("");
				System.out.println("");

			}

		}

		sc.close();

	}

}
