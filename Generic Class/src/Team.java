import java.util.ArrayList;

//For extending more then one class For generic class will be
//public class Team<T extends Player & OtherClass & otherInteface>
//we can also extend interface but interface name should come after class.
public class Team<T extends Player> implements  Comparable<Team<T>>{
    String name;
    int played;
    int won;
    int lost;
    int tied;
    private ArrayList<T> members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(T player){
        if (members.contains(player)){
            System.out.println("Already exists");
        }else{
            members.add(player);
            System.out.println("Added : "+player.getName());
        }
    }

    public void matchResults(Team<T> opponent,int ourScore,int opponentScore){
        if (ourScore>opponentScore){
            won++;
            System.out.println(name +" won ." );
        }else if(ourScore<opponentScore){
            lost++;
            System.out.println(name+" lost ." );
        }else {
            tied++;
            System.out.println("Match tied between : "+name+" & "+opponent.name);
        }
        if (opponent!=null){
            opponent.matchResults(null,opponentScore,ourScore);
        }
    }

    public int ranking(){
        return won*2+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking()>team.ranking()){
            return -1;
        }else if (this.ranking()<team.ranking()){
            return 1;

        }else
            return 0;
    }

    //We can also use Collection.sort(Arraylist)
    // to sort the arraylist if we have any arraylist of teams with ranking.
    //because we have implemented the compareTo() method
    // and Collection.sort() uses compareTo() of Comparable interface to sort LISTs.
}

