package sk.michal.gameControl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleGameControls implements GameControls{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String putPassword() {
        String password;
        System.out.println("Put a password: ");
        password = scanner.next().trim();

        Pattern pattern = Pattern.compile("\\w{3,8}");
        Matcher matcher = pattern.matcher(password);

        if(!matcher.matches()){
            System.out.println("You must give password about length 3 signs and max 8 signs");
            password = putPassword();
        }
        return password;
    }

    @Override
    public String chooseHero() {
        System.out.println("Choose a hero. Put A for Warrior B for Hunter.");
        return scanner.nextLine();
    }

    @Override
    public int setMoveCount() {
        System.out.println("How much move in a game?");
        int countofMove;
        try{
            countofMove = scanner.nextInt();
            scanner.nextLine();
        }catch (Exception ex){
            System.out.println("Cannot get a number. Did you really give a number?");
            countofMove = setMoveCount();
        }
        return countofMove;
    }

    @Override
    public void printResultOfGame() {

        scanner.close();

    }
}
