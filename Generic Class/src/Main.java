/*
Created by Shivam Shukla.
 */

public class Main {
    public static void main(String[] args) {
        FootballPlayer ronaldo=new FootballPlayer("Ronaldo");
        Team<FootballPlayer> footballPlayerTeam=new Team<>("Madraid");
        footballPlayerTeam.addPlayer(ronaldo);

        BasketballPlayer bob=new BasketballPlayer("Bob");
        Team<BasketballPlayer> basketballPlayerTeam=new Team<>("Romaina");
        basketballPlayerTeam.addPlayer(bob);

        SoccerPlayer andrew=new SoccerPlayer("Andrew");
        Team<SoccerPlayer> soccerPlayerTeam=new Team<>("Backhemius");
        soccerPlayerTeam.addPlayer(andrew);

        Team<FootballPlayer> footballPlayerTeam1=new Team<>("Xyz");
        FootballPlayer messi=new FootballPlayer("Messi");
        footballPlayerTeam1.addPlayer(messi);

        footballPlayerTeam.matchResults(footballPlayerTeam1,7,2);
        System.out.println("Football team ranking : "+footballPlayerTeam.ranking());
        System.out.println(footballPlayerTeam.compareTo(footballPlayerTeam1));

    }
}
