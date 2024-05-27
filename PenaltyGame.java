import javax.swing.JOptionPane;

public class PenaltyGame {
	public static void main(String[] args) {
		String[] menu = { "JOGAR", "COMO JOGAR", "CREDITOS", "SAIR" };

		String comeco = "";

		//loop do menu
		while (!comeco.equals("SAIR")) {
			comeco = (String) JOptionPane.showInputDialog(null, "Bem vindo ao Penalty World Cup!!", "Penalty World Cup",
					JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
			switch (comeco) {
			case "JOGAR" -> {
				Jogar();
				break;
			}
			case "COMO JOGAR" -> {
				ComoJogar();
			}
			case "CREDITOS" -> {
				Creditos();
			}
			case "sair" -> {
				break;
			}
			}
		}
	}

	public static void Jogar() {
		String p1 = JOptionPane.showInputDialog(null, "Informe o nome do jogador 1:", "Penalty World Cup",
				JOptionPane.INFORMATION_MESSAGE);
		String p2 = JOptionPane.showInputDialog(null, "Informe o nome do jogador 2:", "Penalty World Cup",
				JOptionPane.INFORMATION_MESSAGE);
		String[] times = { "BAGRES DE MUNIQUE", "AL MOSSAR", "BAR SEM LONA", "MANCHERSTER SITIO", "REAL MADRUGA",
				"JUMENTUS", "PATETICO DE MADRID", "INTER DE MEIÃO", "ATLETICO MANEIRO" };
		String escolha1 = (String) JOptionPane.showInputDialog(null, "Escolha um time, " + p1 + ":", "Seleção de Times",
				JOptionPane.QUESTION_MESSAGE, null, times, times[0]);
		String escolha2 = (String) JOptionPane.showInputDialog(null, "Escolha um time, " + p2 + ":", "Seleção de Times",
				JOptionPane.QUESTION_MESSAGE, null, times, times[0]);
		while (escolha2.equals(escolha1)) {
			escolha2 = (String) JOptionPane.showInputDialog(null,
					"Escolha Invalida!!\n um time diferente do " + p1 + ":", "Seleção de Times",
					JOptionPane.ERROR_MESSAGE, null, times, times[0]);
		}
		String chuta = " ";
		String defende = " ";

		int pontosUm = 0;
		int pontosDois = 0;
		String escolha1jogo = "";
		int i = 0;
		int j = 0;
		String[] escolha2jogo = new String[2];
		
		//Loop do jogo
		while ((pontosUm <= 5) || (pontosDois <= 5)) {
			
			//jogador Um
			if (i % 2 == 0) {
				String[] pG = { "p1", "p2", "p3", "p4", "p5", "p6" };
				String gol = " ____________\n" + "|" + pG[0] + "      " + pG[1] + "      " + pG[2] + "|\n" + "|" + pG[3]
						+ "      " + pG[4] + "      " + pG[5] + "|\n";
				chuta = p1;
				defende = p2;
				escolha2jogo[0] = " ";
				escolha2jogo[1] = " ";

				escolha1jogo = (String) JOptionPane.showInputDialog(null, gol + "Escolha local para chutar, " + chuta + ":",
						"Penalty World Cup", JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				escolha2jogo[0] = (String) JOptionPane.showInputDialog(null,
						gol + "Escolha local para defender, " + defende + ":", "Penalty World Cup",
						JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				if (escolha2jogo[0].equals("p5")) {
					escolha2jogo[1] = (String)JOptionPane.showInputDialog(null,
							gol + "Escolha mais um local para defender:, " + defende + ":", "Penalty World Cup",
							JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				}
				if (escolha2jogo[0].equals("p4")) {
					escolha2jogo[1] = (String)JOptionPane.showInputDialog(null,
							gol + "Escolha mais um local para defender:, " + defende + ":", "Penalty World Cup",
							JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				}
				if (escolha2jogo[0].equals("p6")) {
					escolha2jogo[1] = (String)JOptionPane.showInputDialog(null,
							gol + "Escolha mais um local para defender:, " + defende + ":", "Penalty World Cup",
							JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				}
				if (escolha1jogo != escolha2jogo[0] && escolha1jogo != escolha2jogo[1]) {
					pontosUm++;
					j = 0;
					for(j = 0; j < pG.length;j++) {
						if(escolha1jogo.equals(pG[j])&&((!escolha2jogo[0].equals(pG[j]))||(!escolha2jogo[1].equals(pG[j])))) {
							pG[j] = " ֎";
						}
					}
					gol = " ____________\n" + "|" + pG[0] + "      " + pG[1] + "      " + pG[2] + "|\n" + "|" + pG[3]
							+ "      " + pG[4] + "      " + pG[5] + "|\n";
					JOptionPane.showMessageDialog(null,
							gol + "\nGOOOOOOOOLL do " + escolha1 + "!!!\nPlacar:\n" + escolha1 + " " + pontosUm + "x"
									+ pontosDois + " " + escolha2,
							"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
				} else {
					j = 0;
					for(j = 0; j < pG.length;j++) {
						if(escolha2jogo[0].equals(pG[j])||escolha2jogo[1].equals(pG[j])) {
							pG[j] = " X";
						}
					}
					gol = "____________\n" + "|" + pG[0] + "      " + pG[1] + "      " + pG[2] + "|\n" + "|" + pG[3]
							+ "      " + pG[4] + "      " + pG[5] + "|\n";
					JOptionPane.showMessageDialog(null,
							gol + "\nDEFENDE O GOLEIRO do " + escolha2 + "!!!\nPlacar:\n" + escolha1 + " " + pontosUm
									+ "x" + pontosDois + " " + escolha2,
							"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
				}
				//jogador Dois
			} else {
				String[] pG = { "p1", "p2", "p3", "p4", "p5", "p6" };
				String gol = " ____________\n" + "|" + pG[0] + "      " + pG[1] + "      " + pG[2] + "|\n" + "|" + pG[3]
						+ "      " + pG[4] + "      " + pG[5] + "|\n";
				chuta = p2;
				defende = p1;
				escolha2jogo[0] = " ";
				escolha2jogo[1] = " ";

				escolha1jogo = (String) JOptionPane.showInputDialog(null, gol + "Escolha local para chutar, " + chuta + ":",
						"Penalty World Cup", JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				escolha2jogo[0] = (String) JOptionPane.showInputDialog(null,
						gol + "Escolha local para defender, " + defende + ":", "Penalty World Cup",
						JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				if (escolha2jogo[0].equals("p5")) {
					escolha2jogo[1] = (String) JOptionPane.showInputDialog(null,
							gol + "Escolha mais um local para defender:, " + defende + ":", "Penalty World Cup",
							JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				}
				if (escolha2jogo[0].equals("p4")) {
					escolha2jogo[1] = (String) JOptionPane.showInputDialog(null,
							gol + "Escolha mais um local para defender:, " + defende + ":", "Penalty World Cup",
							JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				}
				if (escolha2jogo[0].equals("p6")) {
					escolha2jogo[1] = (String) JOptionPane.showInputDialog(null,
							gol + "Escolha mais um local para defender:, " + defende + ":", "Penalty World Cup",
							JOptionPane.QUESTION_MESSAGE, null, pG, pG[0]);
				}
				if (escolha1jogo != escolha2jogo[0] && escolha1jogo != escolha2jogo[1]) {
					pontosDois++;
					j = 0;
					for(j = 0; j < pG.length;j++) {
						if(escolha1jogo.equals(pG[j])&&((!escolha2jogo[0].equals(pG[j]))||(!escolha2jogo[1].equals(pG[j])))) {
							pG[j] = " ֎";
						}
					}
					gol = "____________\n" + "|" + pG[0] + "      " + pG[1] + "      " + pG[2] + "|\n" + "|" + pG[3]
							+ "      " + pG[4] + "      " + pG[5] + "|\n";
					JOptionPane.showMessageDialog(null,
							gol + "\nGOOOOOOOOLL do " + escolha1 + "!!!\nPlacar:\n" + escolha1 + " " + pontosUm + "x"
									+ pontosDois + " " + escolha2,
							"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
				} else {
					j = 0;
					for(j = 0; j < pG.length;j++) {
						if(escolha2jogo[0].equals(pG[j])||escolha2jogo[1].equals(pG[j])) {
							pG[j] = " X";
						}
					}
					gol = " ____________\n" + "|" + pG[0] + "      " + pG[1] + "      " + pG[2] + "|\n" + "|" + pG[3]
							+ "      " + pG[4] + "      " + pG[5] + "|\n";
					JOptionPane.showMessageDialog(null,
							gol + "\nDEFENDE O GOLEIRO do " + escolha2 + "!!!\nPlacar:\n" + escolha1 + " " + pontosUm
									+ "x" + pontosDois + " " + escolha2,
							"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			i++;
			//verificação dos pontos
			if ((((pontosUm == 5) && (pontosUm - 2) >= pontosDois))
					|| ((pontosUm > 5 && pontosDois > 5) && (pontosUm - 2) >= pontosDois)) {
				JOptionPane
						.showMessageDialog(null,
								"Vitoria do " + escolha1 + "!!!\nPlacar:\n" + escolha1 + " " + pontosUm + "x"
										+ pontosDois + " " + escolha2,
								"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			//verificação dos pontos
			
			if ((((pontosDois == 5 && (pontosDois - 2) >= pontosUm))
					|| ((pontosDois > 5 && pontosUm > 5) && (pontosDois - 2) >= pontosUm))) {
				JOptionPane
						.showMessageDialog(null,
								"Vitoria do " + escolha2 + "!!!\nPlacar:\n" + escolha1 + " " + pontosUm + "x"
										+ pontosDois + " " + escolha2,
								"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
	}

	public static void ComoJogar() {
		JOptionPane.showMessageDialog(null,
				"Bem vindo ao Penalty World Cup!!\nO jogo começa pedindo para o Jogador 1 e Jogador 2 escolherem seus nomes e times",
				"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"GAMEPLAY:\nApós ambos os Jogadores escolherem seus nomes e times, o jogo é iniciado. \nPrimeiro o Jogador 1 escolhe em que ponto do gol ele irá chutar.\nLogo em seguida vem a escolha do jogador 2, que escolhe onde irá defender",
				"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"DEFESA:\nCaso o Jogador que está defendendo escolher algum dos seguintes lugares:\np4;\np5;\np6;\nEle poderá escolher mais outro ponto para defender",
				"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"O jogo acaba assim que algum dos jogadores atingirem 5 gols.\nCaso os dois estejam com 5 pontos, o jogo vai até que um deles esteja a dois gols de diferença",
				"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void Creditos() {
		JOptionPane.showMessageDialog(null,
				"CREDITOS:\nIgor Santos Gomes\nLucas Escobar Santos\nMatheus Alves Nascimento\nProf° Bruno <3",
				"Penalty World Cup", JOptionPane.INFORMATION_MESSAGE);
	}
}
