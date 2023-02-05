package MethodsAndArrays;

public class Cards {
    public static void main(String[] args) {
        String[] cartType = {"Maça","Karo","Kupa","Sinek"};
        String[] cardNumber = {"AS","2","3","4","5","6","7","8","9","10","J","Q","R"};
        int[] deck = new int[52];

        createDeck(deck);
        getDeck(deck,cartType,cardNumber);
        shuffleCards(deck);
        getDeck(deck,cartType,cardNumber);
        System.out.println("\n*********************************\n");
        System.out.println("\n*********************************\n**********KARIŞTIRMADAN ÖNCE**********");


        String[] deckOfCards = createDeck(cartType,cardNumber);
        getDeck(deckOfCards);
        System.out.println("\n**************KARIŞTIRMADAN SONRA*******************");
        shuffleCards(deckOfCards);
        getDeck(deckOfCards);

        distGamer(deckOfCards);



    }

    private static void shuffleCards(int[] deck) {
        int temp;
        for(int i = 0; i < deck.length; i++)
        {
            int randomIndex = (int)(Math.random() * deck.length);
            temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    private static void shuffleCards(String[] deck) {
        String temp;
        for(int i = 0; i < deck.length; i++)
        {
            int randomIndex = (int)(Math.random() * deck.length);
            temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static void getDeck(int[] deck, String[] cartType, String[] cardNumber) {
        for(int i = 0; i < deck.length; i++)
        {
            String types = cartType[deck[i] / 13];
            String numbers = cardNumber[deck[i] % 13];
            System.out.println(types + " " + numbers);
        }
    }
    private static void getDeck(String[] arr) {
        for(String s : arr)
        {
            System.out.println(s);
        }
    }


    private static void createDeck(int[] deck) {
        for(int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }
    }
    private static String[] createDeck(String[] arr, String[] arr2) {
        int lengthDeck = arr.length * arr2.length;
        String[] deckCards = new String[lengthDeck];
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                deckCards[index] = arr[i] + "-" + arr2[j];
                index++;
            }
        }
        return deckCards;
    }
    static void distGamer(String[] arr)
    {
        int gamer = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(gamer == 4 && i % 4 == 0)
            {
                break;
            }
            if(i % 4 == 0)
            {
                gamer++;
                System.out.print("\n" + gamer + ". oyuncunun eli :\t");
            }
            System.out.print(arr[i] + "\t\t");

        }
    }

}
