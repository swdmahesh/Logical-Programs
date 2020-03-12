/*Gambler
Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) 
or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. 
Run the experiment N times, averages the results, and prints them out.
I/P -> $Stake, $Goal and Number of times
Logic -> Play till the gambler is broke or has won
O/P -> Print Number of Wins and Percentage of Win and Loss.
*/
import java.lang.Math;
import java.util.Scanner;
public class Gambler
{
    public void play(int stake,int goal,int trails){
        int wins=0,cash;
        for(int i=0;i<trails;i++){
            cash=stake;
            while(cash>0&&cash<goal){
                if(Math.random()>0.5)
                    cash++;
                else
                cash--;
            }
            if(cash==goal)
            wins++;
        }
        System.out.println("Number of Wins : "+wins);
        System.out.println("Percentage of Win : "+((wins*100.0)/trails));
        System.out.println("Percentage of loss : "+(100-((wins*100.0)/trails)));
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int stake=sc.nextInt();
	    int goal=sc.nextInt();
	    int trails=sc.nextInt();
	    Gambler obj=new Gambler();
	    obj.play(stake,goal,trails);
	}
}
