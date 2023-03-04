package JUEGO;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Bienvenido a Piedra, Papel o Tijeras !");

        while (playerScore < 2 && computerScore < 2) {
            System.out.println("Elija su opción: 1 para Piedra, 2 para Papel, 3 para Tijeras: ");
            int playerChoice = scanner.nextInt();
            int computerChoice = random.nextInt(3) + 1;

            if (playerChoice == computerChoice) {
                System.out.println("Empate!");
            } else if (playerChoice == 1 && computerChoice == 3 ||
                    playerChoice == 2 && computerChoice == 1 ||
                    playerChoice == 3 && computerChoice == 2) {
                System.out.println("¡Ganaste esta ronda!");
                playerScore++;
            } else {
                System.out.println("La computadora ganó esta ronda.");
                computerScore++;
            }
        }

        if (playerScore == 2) {
            System.out.println("¡Felicitaciones! Ganaste el juego.");
        } else {
            System.out.println("Lo siento, perdiste el juego.");
        }

        scanner.close();
    }
}
