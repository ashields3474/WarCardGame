public class Game { // make a game of War against an AI
    Card card;
    DeckOfCards deck;
    Card[] player1Hand = new Card [52]; //holds the first player's hand
    Card[] player2Hand = new Card [52];  //hold's the second player's hand

    public Game(){
    }

    public void setUp(){  //Shuffles the deck and then deals to the players' hands
        deck = new DeckOfCards();
        deck.shuffleDeck();    //Shuffle the deck
        for (int number = 0; number < 26; number++) { //deal half of the deck to each player
            card = deck.dealCard();
            player1Hand[number] = card;
            card = deck.dealCard();
            player2Hand[number] = card;
        }  // rest of the spaces = null
        game();
    }

    public void game(){
       int n = 0;
        while (player1Hand[n] != null){
            //player one, determine card
            Card player1Card = player1Hand[n]; //takes the next card in the Player1 deck
            String card1 = player1Card.toString(); //turns it into a sting object
            String[] rankAndSuit1 = card1.split(" "); //Splits the string into an array for comparing
            System.out.println("Player 1: " + rankAndSuit1[0] + " of " + rankAndSuit1[1]);

            //Give face cards a number value
            if (rankAndSuit1[0].equals("Jack")) {
                rankAndSuit1[0] = "11";
            }
            else if (rankAndSuit1[0].equals("Queen")) {
                rankAndSuit1[0] = "12";
            }
            else if (rankAndSuit1[0].equals("King")) {
                rankAndSuit1[0] = "13";
            }
            else if (rankAndSuit1[0].equals("Ace")) {
                rankAndSuit1[0] = "14";
            }

            //turn rank form a string to an integer
            int card1Rank = Integer.parseInt(rankAndSuit1[0]);

            //player 2, determine card, repeat code above for player two
            Card player2Card = player2Hand[n];
            String card2 = player2Card.toString();
            String[] rankAndSuit2 = card2.split(" ");
            System.out.println("Player 2: " + rankAndSuit2[0] + " of " + rankAndSuit2[1]);

            if (rankAndSuit2[0].equals("Jack")) {
                rankAndSuit2[0] = "11";
            }
            else if (rankAndSuit2[0].equals("Queen")) {
                rankAndSuit2[0] = "12";
            }
            else if (rankAndSuit2[0].equals("King")) {
                rankAndSuit2[0] = "13";
            }
            else if (rankAndSuit2[0].equals("Ace")) {
                rankAndSuit2[0] = "14";
            }

            int card2Rank = Integer.parseInt(rankAndSuit2[0]);


            //Determine winner
            int nullNumber = 0;
            int iteration = 0;
            if (card1Rank < card2Rank){ //if player 2 has a higher card
                System.out.println("Player 2 wins round " + (n + 1));
                while (nullNumber != 1){
                    if (player2Hand[iteration] == null){
                        player2Hand[iteration] = player1Card;
                    }
                    iteration++;
                }
                player1Hand[n] = null;
            }

            else if (card1Rank > card2Rank){ // if player 1 has a higher card
                System.out.println("Player 1 wins round " + (n + 1));
            }

            else { //If it's a tie
                war();
            }
        }

    }

    public void war(){ //take parameters, return final

    }

}



        //check to see which card is the winner
//add both cards to the winner's discard pile
    //remove losing card from loser's pile
//move all nulls to the end
//when main pile runs out, shuffle discard pile and make it the main pile
//when two cards are the same have each player deal three cards and then turn one over to see winner
//check cards to determine highest
//place all cards in the winner's discard pile
//continue until one player runs out of cards
