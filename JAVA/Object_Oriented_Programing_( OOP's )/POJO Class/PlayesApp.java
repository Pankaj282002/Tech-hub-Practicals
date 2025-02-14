import java.util.Scanner;
class Player
{
    	private int id, run, marks;
    	private String name;

    	public void setId(int id) 
	{
        		this.id = id;
    	}

    	public int getId() 
	{
        		return id;
    	}

    	public void setRun(int run) 
	{
        		this.run = run;
    	}

    	public int getRun() 
	{
        		return run;
    	}

    	public void setMarks(int marks) 
	{
        		this.marks = marks;
    	}

    	public int getMarks() 
	{
        		return marks;
    	}

    	public void setName(String name) 
	{
        		this.name = name;
    	}

    	public String getName() 
	{
        		return name;
    	}
}
public class PlayersApp
{
    	public static void main(String[] args) 
	{
        		boolean flag = true;
        		Scanner in = new Scanner(System.in);
        		Player p = new Player();

        		while (flag) 
		{
            			System.out.printf("\nChoose any one choice: ");
            			System.out.printf("\n1. Store data.\n");
            			System.out.printf("2. Display data.\n");
            			System.out.printf("3. Exit.\n");

            			int choice = in.nextInt();

            			switch (choice) 
			{
                				case 1:
                    				System.out.println("Enter the player's name: ");
                    				p.setName(in.next()); // Read entire name
                    				System.out.println("Enter the player's ID: ");
                    				p.setId(in.nextInt());
                    				System.out.println("Enter the player's run: ");
                    				p.setRun(in.nextInt());
                    				System.out.println("Enter the player's marks: ");
                    				p.setMarks(in.nextInt());
                    				break;
                				case 2:
                    				System.out.println("Player name: " + p.getName());
                    				System.out.println("Player ID: " + p.getId());
                    				System.out.println("Player run: " + p.getRun());
                    				System.out.println("Player marks: " + p.getMarks());
                    				break;

                				case 3:
                    				System.out.println("Program exited successfully.");
                    				flag = false;
                    				break;
                				default:
                    			System.out.println("Invalid choice. Please try again.");
            			}
        		}
    	}
}