import java.util.*;

public class cricketEX {
    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        Random random_number = new Random();
        int user_batting;
        int user_balling;

        int user_wicket = 0;
        int System_wicket = 0;
        System.out.println(
                "Ladies and Gentlemen, a great match between the user and the system. Let's see who will win the match");
        System.out.println("How many overs do you want to play?");
        int over = ha.nextInt();
        System.out.println("Total 5 wickets in each team");
        System.out.println("It's toss time. What is your call?");
        System.out.print("Head (0), Tail (1): ");
        int user = ha.nextInt();

        int Computer_toss = random_number.nextInt(2);
        int SystemScore = 0;
        int userScore = 0;
        if (Computer_toss == user) {
            System.out.println("Congratulations, you won the toss");
            System.out.println("What do you want to choose, batting or bowling first? [(1): bat or (2): ball]");
            int option = ha.nextInt();

            if (option == 1) {
                System.out.println("You chose batting first (System will bowl to you)");
                System.out.println(
                        "Enter 1: One run, 2: Two runs, 3: Three runs, 4: Four runs, 5: Five runs, 6: Six runs");

                for (int i = 1; i <= over; i++) {

                    for (int j = 1; j <= 6; j++) {
                        System.out.print("Bat:");
                        user_batting = ha.nextInt();
                        int Computer_bowling = (int) (Math.random() * 6) + 1;
                        if (user_batting != Computer_bowling) {
                            System.out.println(
                                    "You hit:" + user_batting + " runs" + ", System chose:"
                                            + Computer_bowling);
                            userScore = user_batting + userScore;
                        }

                        else if (user_batting == Computer_bowling) {
                            user_wicket++;
                            System.out.println(
                                    "Oops, you're out because your choice and the computer's choice are the same. You:"
                                            + user_batting + ", System chose:" + Computer_bowling);
                        } else if (user_wicket == 5) {
                            break;
                        }
                        if (j == 6) {
                            if (i > 1 && user_wicket > 1) {
                                System.out.println("After completing " + i + " overs, the score is " + userScore
                                        + " runs" + " with the loss of " + user_wicket + " wickets");
                            } else if (i > 1 && user_wicket < 1) {
                                System.out.println("After completing " + i + " over, the score is " + userScore
                                        + " runs " + " with the loss of " + user_wicket + " wicket");
                            } else if (i == 1 && user_wicket > 1) {
                                System.out
                                        .println("After completing " + i + " over, the score is " + userScore + " runs"
                                                + " with the loss of " + user_wicket + " wickets");
                            } else if (i == 1 && user_wicket < 1) {
                                System.out
                                        .println("After completing " + i + " over, the score is " + userScore + " runs"
                                                + " with the loss of " + user_wicket + " wickets");

                            }

                        }
                    }

                }

                System.out.println("Total score: " + userScore);

                System.out
                        .println("2nd innings start in a few sec,\"now it your turn to bowling and defand your Score\""
                                + "(Target):" + (userScore + 1)
                                + "\nchoose same number as system choose for taking wicket");

                for (int m = 1; m <= over; m++) {

                    for (int n = 1; n <= 6; n++) {
                        System.out.print("Ball:");
                        user_balling = ha.nextInt();
                        int Computer_batting = (int) (Math.random() * 6) + 1;

                        if (user_balling != Computer_batting) {
                            System.out.println(
                                    "System hit:" + Computer_batting + " runs" + ", You chose:" + user_balling);
                            SystemScore = Computer_batting + SystemScore;

                        }

                        if (user_balling == Computer_batting) {
                            System_wicket++;
                            System.out.println(
                                    "Yes,you got it," + System_wicket
                                            + " wickets gone of System because your choice and the computer's choice are the same. You:"
                                            + user_balling + ", System chose:" + Computer_batting);
                        }
                        if (System_wicket == 5) {
                            break;
                        }
                        if (n == 6) {
                            if (m > 1 && System_wicket > 1) {
                                System.out.println("After completing " + m + " overs, the score is " + SystemScore
                                        + " runs" + " with the loss of " + System_wicket + " wickets");
                            } else if (m > 1 && System_wicket < 1) {
                                System.out.println("After completing " + m + " over, the score is " + SystemScore
                                        + " runs " + " with the loss of " + System_wicket + " wicket");
                            } else if (m == 1 && System_wicket > 1) {
                                System.out.println(
                                        "After completing " + m + " over, the score is " + SystemScore + " runs"
                                                + " with the loss of " + System_wicket + " wickets");
                            } else if (m == 1 && System_wicket < 1) {
                                System.out.println(
                                        "After completing " + m + " over, the score is " + SystemScore + " runs"
                                                + " with the loss of " + System_wicket + " wickets");

                            }

                        }
                    }

                }
                if (userScore > SystemScore) {
                    System.out.println("Congratulation you Won the game by:" + (userScore - SystemScore) + " runs");

                }
                if (userScore < SystemScore) {
                    System.out.println("Oo you lose the game by:" + (5 - System_wicket)
                            + "wickets,but nice try.Best of Luck for next game");

                }
                if (userScore == SystemScore) {
                    System.out.println("Oo it is tie score between You and the System" + userScore + "-" + SystemScore
                            + "runs,Well played");

                }

            }
            if (option == 2) {
                System.out.println(
                        "You chose bowling first (System will bat first...) \nchoose same number as system choose for taking wicket");
                System.out.println(
                        "Enter 1: One run, 2: Two runs, 3: Three runs, 4: Four runs, 5: Five runs, 6: Six runs");

                for (int i = 1; i <= over; i++) {

                    for (int j = 1; j <= 6; j++) {
                        System.out.print("Ball:");
                        user_balling = ha.nextInt();
                        int Computer_batting = (int) (Math.random() * 6) + 1;

                        if (user_balling != Computer_batting) {
                            System.out.println(
                                    "System hit:" + Computer_batting + " runs" + ", You chose:" + user_balling);
                            SystemScore = Computer_batting + SystemScore;

                        }

                        if (user_balling == Computer_batting) {
                            System_wicket++;
                            System.out.println(
                                    "Yes,you got it," + System_wicket
                                            + " wickets gone of System because your choice and the computer's choice are the same. You:"
                                            + user_balling + ", System chose:" + Computer_batting);
                        }
                        if (System_wicket == 5) {
                            break;
                        }
                        if (j == 6) {// changed done
                            if (i > 1 && System_wicket > 1) {
                                System.out.println("After completing " + i + " overs, the score is " + SystemScore
                                        + " runs" + " with the loss of " + System_wicket + " wickets");
                            } else if (i > 1 && System_wicket < 1) {
                                System.out.println("After completing " + i + " over, the score is " + SystemScore
                                        + " runs " + " with the loss of " + System_wicket + " wicket");
                            } else if (i == 1 && System_wicket > 1) {
                                System.out.println(
                                        "After completing " + i + " over, the score is " + SystemScore + " runs"
                                                + " with the loss of " + System_wicket + " wickets");
                            } else if (i == 1 && System_wicket < 1) {
                                System.out.println(
                                        "After completing " + i + " over, the score is " + SystemScore + " runs"
                                                + " with the loss of " + System_wicket + " wickets");

                            }

                        }
                    }

                }

                System.out.println("Total score: " + SystemScore);

                System.out
                        .println(
                                "2nd innings start in a few sec,\"now it your turn to batting and the chasing the Score\""
                                        + "(Target):" + (userScore + 1));

                for (int m = 1; m <= over; m++) {

                    for (int n = 1; n <= 6; n++) {
                        System.out.print("Bat:");
                        user_batting = ha.nextInt();
                        int Computer_bowling = (int) (Math.random() * 6) + 1;
                        if (user_batting != Computer_bowling) {
                            System.out.println(
                                    "You hit:" + user_batting + " runs" + ", System chose:"
                                            + Computer_bowling);
                            userScore = user_batting + userScore;
                        }

                        else if (user_batting == Computer_bowling) {
                            user_wicket++;
                            System.out.println(
                                    "Oops, you're out because your choice and the computer's choice are the same. You:"
                                            + user_batting + ", System chose:" + Computer_bowling);
                        } else if (user_wicket == 5) {
                            break;
                        }
                        if (n == 6) {// changed done
                            if (n > 1 && user_wicket > 1) {
                                System.out.println("After completing " + m + " overs, the score is " + userScore
                                        + " runs" + " with the loss of " + user_wicket + " wickets");
                            } else if (n > 1 && user_wicket < 1) {
                                System.out.println("After completing " + m + " over, the score is " + userScore
                                        + " runs " + " with the loss of " + user_wicket + " wicket");
                            } else if (n == 1 && user_wicket > 1) {
                                System.out
                                        .println("After completing " + m + " over, the score is " + userScore + " runs"
                                                + " with the loss of " + user_wicket + " wickets");
                            } else if (n == 1 && user_wicket < 1) {
                                System.out
                                        .println("After completing " + m + " over, the score is " + userScore + " runs"
                                                + " with the loss of " + user_wicket + " wickets");

                            }

                        }
                    }

                }

                if (userScore > SystemScore) {
                    System.out.println("Congratulation you Won the game by:" + (5 - System_wicket) + " wickets");

                }
                if (userScore < SystemScore) {
                    System.out.println("You lose the game by:" + (SystemScore - userScore)
                            + " runs" + ",but nice try.Best of Luck for next game");

                }
                if (userScore == SystemScore) {
                    System.out.println("Oo it is tie score between You and the System" + userScore + "-" + SystemScore
                            + "runs,Well played");

                }

            }

        }
        if (Computer_toss != user) {
            System.out.println("O sorry,you lose the toss");
            int Computer_choose = random_number.nextInt(2);
            if (Computer_choose == 0) {
                System.out.println("And the computer won the toss and choose to bat first");
                System.out.println(
                        "You do bowling first (System will bat first...) \nchoose same number as system choose for taking wicket");
                System.out.println(
                        "Enter 1: One run, 2: Two runs, 3: Three runs, 4: Four runs, 5: Five runs, 6: Six runs");

                for (int i = 1; i <= over; i++) {

                    for (int j = 1; j <= 6; j++) {
                        System.out.print("Ball:");
                        user_balling = ha.nextInt();
                        int Computer_batting = (int) (Math.random() * 6) + 1;

                        if (user_balling != Computer_batting) {
                            System.out.println(
                                    "System hit:" + Computer_batting + " runs" + ", You chose:" + user_balling);
                            SystemScore = Computer_batting + SystemScore;

                        }

                        if (user_balling == Computer_batting) {
                            System_wicket++;
                            System.out.println(
                                    "Yes,you got it," + System_wicket
                                            + " wickets gone of System because your choice and the computer's choice are the same. You:"
                                            + user_balling + ", System chose:" + Computer_batting);
                        }
                        if (System_wicket == 5) {
                            break;
                        }
                        if (j == 6) {// changed done
                            if (i > 1 && System_wicket > 1) {
                                System.out.println("After completing " + i + " overs, the score is " + SystemScore
                                        + " runs" + " with the loss of " + System_wicket + " wickets");
                            } else if (i > 1 && System_wicket < 1) {
                                System.out.println("After completing " + i + " over, the score is " + SystemScore
                                        + " runs " + " with the loss of " + System_wicket + " wicket");
                            } else if (i == 1 && System_wicket > 1) {
                                System.out.println(
                                        "After completing " + i + " over, the score is " + SystemScore + " runs"
                                                + " with the loss of " + System_wicket + " wickets");
                            } else if (i == 1 && System_wicket < 1) {
                                System.out.println(
                                        "After completing " + i + " over, the score is " + SystemScore + " runs"
                                                + " with the loss of " + System_wicket + " wickets");

                            }

                        }
                    }

                }

                System.out.println("Total score: " + SystemScore);

                System.out
                        .println(
                                "2nd innings start in a few sec,\"now it your turn to batting and the chasing the Score\""
                                        + "(Target):" + (userScore + 1));

                for (int m = 1; m <= over; m++) {

                    for (int n = 1; n <= 6; n++) {
                        System.out.print("Bat:");
                        user_batting = ha.nextInt();
                        int Computer_bowling = (int) (Math.random() * 6) + 1;
                        if (user_batting != Computer_bowling) {
                            System.out.println(
                                    "You hit:" + user_batting + " runs" + ", System chose:"
                                            + Computer_bowling);
                            userScore = user_batting + userScore;
                        }

                        else if (user_batting == Computer_bowling) {
                            user_wicket++;
                            System.out.println(
                                    "Oops, you're out because your choice and the computer's choice are the same. You:"
                                            + user_batting + ", System chose:" + Computer_bowling);
                        } else if (user_wicket == 5) {
                            break;
                        }
                        if (n == 6) {// changed done
                            if (n > 1 && user_wicket > 1) {
                                System.out.println("After completing " + m + " overs, the score is " + userScore
                                        + " runs" + " with the loss of " + user_wicket + " wickets");
                            } else if (n > 1 && user_wicket < 1) {
                                System.out.println("After completing " + m + " over, the score is " + userScore
                                        + " runs " + " with the loss of " + user_wicket + " wicket");
                            } else if (n == 1 && user_wicket > 1) {
                                System.out
                                        .println("After completing " + m + " over, the score is " + userScore + " runs"
                                                + " with the loss of " + user_wicket + " wickets");
                            } else if (n == 1 && user_wicket < 1) {
                                System.out
                                        .println("After completing " + m + " over, the score is " + userScore + " runs"
                                                + " with the loss of " + user_wicket + " wickets");

                            }

                        }
                    }

                }

                if (userScore > SystemScore) {
                    System.out.println("Congratulation you Won the game by:" + (5 - System_wicket) + " wickets");

                }
                if (userScore < SystemScore) {
                    System.out.println("You lose the game by:" + (SystemScore - userScore)
                            + " runs" + ",but nice try.Best of Luck for next game");

                }
                if (userScore == SystemScore) {
                    System.out.println("Oo it is tie score between You and the System" + userScore + "-" + SystemScore
                            + "runs,Well played");

                }

            }
            if (Computer_choose == 1) {
                System.out.println("And the computer won the toss and choose to ball first");
                System.out
                        .println("If your chooce number and System choose number are same then it consider as wicket");
                System.out.println(
                        "Enter 1: One run, 2: Two runs, 3: Three runs, 4: Four runs, 5: Five runs, 6: Six runs");

                for (int i = 1; i <= over; i++) {

                    for (int j = 1; j <= 6; j++) {
                        System.out.print("Bat:");
                        user_batting = ha.nextInt();
                        int Computer_bowling = (int) (Math.random() * 6) + 1;
                        if (user_batting != Computer_bowling) {
                            System.out.println(
                                    "You hit:" + user_batting + " runs" + ", System chose:"
                                            + Computer_bowling);
                            userScore = user_batting + userScore;
                        }

                        else if (user_batting == Computer_bowling) {
                            user_wicket++;
                            System.out.println(
                                    "Oops, you're out because your choice and the computer's choice are the same. You:"
                                            + user_batting + ", System chose:" + Computer_bowling);
                        } else if (user_wicket == 5) {
                            break;
                        }
                        if (j == 6) {
                            if (i > 1 && user_wicket > 1) {
                                System.out.println("After completing " + i + " overs, the score is " + userScore
                                        + " runs" + " with the loss of " + user_wicket + " wickets");
                            } else if (i > 1 && user_wicket < 1) {
                                System.out.println("After completing " + i + " over, the score is " + userScore
                                        + " runs " + " with the loss of " + user_wicket + " wicket");
                            } else if (i == 1 && user_wicket > 1) {
                                System.out
                                        .println("After completing " + i + " over, the score is " + userScore + " runs"
                                                + " with the loss of " + user_wicket + " wickets");
                            } else if (i == 1 && user_wicket < 1) {
                                System.out
                                        .println("After completing " + i + " over, the score is " + userScore + " runs"
                                                + " with the loss of " + user_wicket + " wickets");

                            }

                        }
                    }

                }

                System.out.println("Total score: " + userScore);

                System.out
                        .println("2nd innings start in a few sec,\"now it your turn to bowling and defand your Score\""
                                + "(Target):" + (userScore + 1)
                                + "\nchoose same number as system choose for taking wicket");

                for (int m = 1; m <= over; m++) {

                    for (int n = 1; n <= 6; n++) {
                        System.out.print("Ball:");
                        user_balling = ha.nextInt();
                        int Computer_batting = (int) (Math.random() * 6) + 1;

                        if (user_balling != Computer_batting) {
                            System.out.println(
                                    "System hit:" + Computer_batting + " runs" + ", You chose:" + user_balling);
                            SystemScore = Computer_batting + SystemScore;

                        }

                        if (user_balling == Computer_batting) {
                            System_wicket++;
                            System.out.println(
                                    "Yes,you got it," + System_wicket
                                            + " wickets gone of System because your choice and the computer's choice are the same. You:"
                                            + user_balling + ", System chose:" + Computer_batting);
                        }
                        if (System_wicket == 5) {
                            break;
                        }
                        if (n == 6) {
                            if (m > 1 && System_wicket > 1) {
                                System.out.println("After completing " + m + " overs, the score is " + SystemScore
                                        + " runs" + " with the loss of " + System_wicket + " wickets");
                            } else if (m > 1 && System_wicket < 1) {
                                System.out.println("After completing " + m + " over, the score is " + SystemScore
                                        + " runs " + " with the loss of " + System_wicket + " wicket");
                            } else if (m == 1 && System_wicket > 1) {
                                System.out.println(
                                        "After completing " + m + " over, the score is " + SystemScore + " runs"
                                                + " with the loss of " + System_wicket + " wickets");
                            } else if (m == 1 && System_wicket < 1) {
                                System.out.println(
                                        "After completing " + m + " over, the score is " + SystemScore + " runs"
                                                + " with the loss of " + System_wicket + " wickets");

                            }

                        }
                    }

                }
                if (userScore > SystemScore) {
                    System.out.println("Congratulation you Won the game by:" + (userScore - SystemScore) + " runs");

                }
                if (userScore < SystemScore) {
                    System.out.println("Oo you lose the game by:" + (5 - System_wicket)
                            + "wickets,but nice try.Best of Luck for next game");

                }
                if (userScore == SystemScore) {
                    System.out.println("Oo it is tie score between You and the System" + userScore + "-" + SystemScore
                            + "runs,Well played");

                }

            }

        }

    }

}
