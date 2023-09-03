/**
 * Movie theatre ticket booking program.
 * Information about the show and show timings are from bookmyshow.com
 */
import java.util.*; // importing the java.util package that contains the Scanner class
public class Cinema 
{
    Scanner sc = new Scanner(System.in); // object creation for Scanner class
    static int user; // to store the user number
    static int x; // to store the choice of movie
    static int a; // to store whether user wants regular or the morning show
    static int choice; // to store the choice of timing
    static int count = 1; // to print the seats
    static int f; // to print 0 in the seat chart if the seat is already booked
    static int price; // to store the price per ticket of the selected show
    static int n; // to store the total number of seats, user wants to book
    static int[] book = new int[10]; // array to store the user's selected seats
    static int[] booked = new int[140]; // array to store the booked seats
    static int[] booked111 = new int[140];
    static int[] booked112 = new int[140];
    static int[] booked113 = new int[140];
    static int[] booked121 = new int[140];
    static int[] booked122 = new int[140];
    static int[] booked123 = new int[140];
    static int[] booked211 = new int[140];
    static int[] booked212 = new int[140];
    static int[] booked213 = new int[140];
    static int[] booked221 = new int[140];
    static int[] booked222 = new int[140];
    static int[] booked223 = new int[140];
    static int[] booked311 = new int[140];
    static int[] booked312 = new int[140];
    static int[] booked313 = new int[140];
    static int[] booked321 = new int[140];
    static int[] booked322 = new int[140];
    static int[] booked323 = new int[140]; // the arrays to store the total number of seats booked in a particular show 
    static char bk; // to store the seat type and thus the seat charge, for example, g for gold and seat price Rs.220
    static int tax; // to store the tax, the user needs to pay
    static int gold; // to store the number of seats in gold
    static int silver; // to store the number of seats in silver
    static int exe; // to store the number of seats in executive
    static int cc; // to store the price for the combo
    static int com; // to store the choice of combo
    static int exit; // to ask the user whether he or she wants to buy the ticket or not
    static int choices; // to store all the choices of the user and then store the tickets booked in that array which is associated with it
    static String s = ""; // to display the seats which are booked by the user
    static String time; // to display the selected timing in the ticket
    static String mov; // to display the selected movie in the ticket
    static String comb; // to display the combo in the ticket
    static String cat[] = new String[10]; // to display the seat type in the ticket, for example s for silver and e for executive
    public void Terms() // printing the terms and conditions
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("***** Terms and Conditions *****\n");
        System.out.println("-> Entry is allowed only for valid ticket holders.");
        System.out.println("-> Children above the age of 3 years require ticket.");
        System.out.println("-> In case a ticket is lost or misplaced, a duplicate ticket cannot be issued.");
        System.out.println("-> Tickets once purchased cannot be refunded, cancelled or exchanged.");
        System.out.println("-> Outside food and beverages are not allowed inside the cinema premises.");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------\n");
    }
    public void movie() // displaying the movies available and asking the user's choicee
    {
        System.out.println("Currently, we offer following movies :\nEnter 1 for : Munnabhai MBBS\nEnter 2 for : Phir Hera Pheri\nEnter 3 for : Bahubali 2 : The Conclusion\nEnter 4 to exit");
        System.out.print("Enter 5 to terminate the program\n\nEnter your choice : ");
        x = sc.nextInt();
        switch (x)
        {
            case 1:
                mov = "Munnabhai MBBS"; // storing the movie name to display in the ticket
                choices = x; // storing the user's choice
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("--------------------------------------------------------------------------------------------");
                timing(); // calling the method timing 
                break;
            case 2:
                mov = "Phir Hera Pheri";
                choices = x;
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("--------------------------------------------------------------------------------------------");
                timing();
                break;
            case 3:
                mov = "Bahubali 2 : The Conclusion";
                choices = x;
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("--------------------------------------------------------------------------------------------");
                timing();
                break;
            case 4:
                choices = 0;
                play(); // restarting the program for new user
                break;
            case 5: // to terminate the program
                System.exit(0);
            default: // for invalid input
                System.out.println("\nSorry, invalid input.\nPlease try again\n");
                movie();
        }
    }
    public void timing() // asking the user he/she wants the morning show or the regular show 
    {
        System.out.println("Which show do you prefer?\nEnter 1 for : Morning show\nEnter 2 for : Regular show\nEnter 3 to go back\nEnter 4 to exit");
        System.out.print("Enter 5 to terminate the program\n\nEnter your choice : ");
        a = sc.nextInt();
        switch (a) 
        {
            case 1:
                choices = (choices*10) + a; // soring the user's choice
                morning(); // calling the method morning
                break;
            case 2:
                choices = (choices*10) + a;
                reg();
                break;
            case 3:
                choices -= x; 
                movie(); // to go back
                break;
            case 4:
                choices = 0;
                play(); // to restart the program for new user
                break;
            case 5:
                System.exit(0); // to terminate the program
            default: // for invalid input
                System.out.println("\nSorry, invalid input.\nPlease try again\n");
                timing();
        }
    }
    public void morning() // if user chooses the morning show, this method will be implemented
    {
        switch (x)
        {
            case 1:
                munnmor();
                break;
            case 2: 
                phpmor();
                break;
            case 3:
                bahumor();
                break;
        }
    }
    public void reg() // if user chooses the regular show, this method will be implemented
    {
        switch (x) 
        {
            case 1: 
                munnreg();
                break;
            case 2:
                phpreg();
                break;
            case 3: 
                bahureg();
                break;
        }
    }
    public void error() // method to check whether there will be an error or not
    {
        while(choice > 6 || choice < 1)
        {
            System.out.println("\nInvalid choice! Choose again\n");
            choice = sc.nextInt();
        }
    }
    public void munnmor() // Munnabhai MBBS morning show
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The timings and the prices are as follows :\n");
        System.out.println("  Enter 1 for : 9:00 AM\nRs.140 for Gold\t\tRs.150 for Silver\tRs.160 for Executive");
        System.out.println("  Enter 2 for : 10:00 AM\nRs.140 for Gold\t\tRs.150 for Silver\tRs.160 for Executive");
        System.out.println("  Enter 3 for : 10:30 AM\nRs.140 for Gold\t\tRs.150 for Silver\tRs.160 for Executive\n\nEnter 4 to go back\nEnter 5 to exit");
        System.out.print("Enter 6 to terminate the program\n\nEnter your choice : ");
        choice = sc.nextInt();
        error(); // calling the method error()
        if(choice == 1)
        {
            time = "9:00 AM"; // storing the user's selected time to display in the ticket
            choices = (choices*10) + choice; // to store the user's choice
        }
        else if(choice == 2)
        {
            time = "10:00 AM";
            choices = (choices*10) + choice;
        }
        else if(choice == 3)
        {
            time = "10:30 AM";
            choices = (choices*10) + choice;
        }
        else if(choice == 4)
        {
            choices = (choices-a)/10;
            timing(); // to go back
        }
        else if(choice == 5)
        {
            choices = 0;
            play(); // to restart the program for new user
        }
        else if(choice == 6)
            System.exit(0); // to terminate the program
        seat(); // displaying the seat chart
    }
    public void phpmor() // Phir Hera Pheri Morning show
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The timings and the prices are as follows :\n");
        System.out.println("  Enter 1 for : 9:25 AM\nRs.140 for Gold\t\tRs.140 for Silver\tRs.160 for Executive");
        System.out.println("  Enter 2 for : 10:30 AM\nRs.140 for Gold\t\tRs.150 for Silver\tRs.160 for Executive");
        System.out.println("  Enter 3 for : 11:55 AM\nRs.140 for Gold\t\tRs.160 for Silver\tRs.160 for Executive\n\nEnter 4 to go back\nEnter 5 to exit");
        System.out.print("Enter 6 to terminate the program\n\nEnter your choice : ");
        choice = sc.nextInt();
        error();
        if(choice == 1)
        {
            time = "9:25 AM";
            choices = (choices*10) + choice;
        }
        else if(choice == 2)
        {
            time = "10:30 AM";
            choices = (choices*10) + choice;
        }
        else if(choice == 3)
        {
            time = "11:55 AM";
            choices = (choices*10) + choice;
        }
        else if(choice == 4)
        {
            choices = (choices-a)/10;
            timing();
        }
        else if(choice == 5)
        {
            choices = 0;
            play();
        }
        else if(choice == 6)
            System.exit(0);
        seat();    
    }
    public void bahumor() // Bahubali 2 : The Conclusion Morning show
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The timings and the prices are as follows :\n");
        System.out.println("  Enter 1 for : 8:50 AM\nRs.140 for Gold\t\tRs.140 for Silver\tRs.140 for Executive");
        System.out.println("  Enter 2 for : 10:30 AM\nRs.140 for Gold\t\tRs.150 for Silver\tRs.150 for Executive");
        System.out.println("  Enter 3 for : 11:45 AM\nRs.140 for Gold\t\tRs.160 for Silver\tRs.160 for Executive\n\nEnter 4 to go back\nEnter 5 to exit");
        System.out.print("Enter 6 to terminate the program\n\nEnter your choice : ");
        choice = sc.nextInt();
        error();
        if(choice == 1)
        {
            time = "8:50 AM";
            choices = (choices*10) + choice;
        }
        else if(choice == 2)
        {
            time = "10:30 AM";
            choices = (choices*10) + choice;
        }
        else if(choice == 3)
        {
            time = "11:45 AM";
            choices = (choices*10) + choice;
        }
        else if(choice == 4)
        {
            choices = (choices-a)/10;
            timing();
        }
        else if(choice == 5)
        {
            choices = 0;
            play();
        }
        else if(choice == 6)
            System.exit(0);
        seat();    
    }
    public void munnreg() // Munnabhai MBBS Regular show
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The timings and the prices are as follows :\n");
        System.out.println("  Enter 1 for : 1:00 PM\nRs.220 for Gold\t\tRs.180 for Silver\tRs.160 for Executive");
        System.out.println("  Enter 2 for : 3:05 PM\nRs.230 for Gold\t\tRs.200 for Silver\tRs.180 for Executive");
        System.out.println("  Enter 3 for : 9:00 PM\nRs.240 for Gold\t\tRs.220 for Silver\tRs.200 for Executive\n\nEnter 4 to go back\nEnter 5 to exit");
        System.out.print("Enter 6 to terminate the program\n\nEnter your choice : ");
        choice = sc.nextInt();
        error();
        if(choice == 1)
        {
            time = "1:00 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 2)
        {
            time = "3:05 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 3)
        {
            time = "9:00 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 4)
        {
            choices = (choice-a)/10;
            timing();
        }
        else if(choice == 5)
        {
            choices = 0;
            play();
        }
        else if(choice == 6)
            System.exit(0);
        seat();    
    }
    public void phpreg() // Phir Hera Pheri Regular show
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The timings and the prices are as follows :\n");
        System.out.println("  Enter 1 for : 1:05 PM\nRs.220 for Gold\t\tRs.180 for Silver\tRs.160 for Executive");
        System.out.println("  Enter 2 for : 7:15 PM\nRs.230 for Gold\t\tRs.200 for Silver\tRs.180 for Executive");
        System.out.println("  Enter 3 for : 9:15 PM\nRs.240 for Gold\t\tRs.220 for Silver\tRs.200 for Executive\n\nEnter 4 to go back\nEnter 5 to exit");
        System.out.print("Enter 6 to terminate the program\n\nEnter your choice : ");
        choice = sc.nextInt();
        error();
        if(choice == 1)
        {
            time = "1:05 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 2)
        {
            time = "7:15 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 3)
        {
            time = "9:15 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 4)
        {
            choices = (choices-a)/10;
            timing();
        }
        else if(choice == 5)
        {
            choices = 0;
            play();
        }
        else if(choice == 6)
            System.exit(0);
        seat();    
    }
    public void bahureg() // Bahubali 2 : The Conclusion Regular show
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The timing and the prices are as follows :\n");
        System.out.println("  Enter 1 for : 3:20 PM\nRs.200 for Gold\t\tRs.180 for Silver\tRs.160 for Executive");
        System.out.println("  Enter 2 for : 6:30 PM\nRs.230 for Gold\t\tRs.200 for Silver\tRs.180 for Executive");
        System.out.println("  Enter 3 for : 10:15 PM\nRs.240 for Gold\t\tRs.220 for Silver\tRs.200 for Executive\n\nEnter 4 to go back\nEnter 5 to exit");
        System.out.print("Enter 6 to terminate the program\n\nEnter your choice : ");
        choice = sc.nextInt();
        error();
        if(choice == 1)
        {
            time = "3:20 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 2)
        {
            time = "6:30 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 3)
        {
            time = "10:15 PM";
            choices = (choices*10) + choice;
        }
        else if(choice == 4)
        {
            choices = (choices-a)/10;
            timing();
        }
        else if(choice == 5)
        {
            choices = 0;
            play();
        }
        else if(choice == 6)
            System.exit(0);
        seat(); 
    }
    public void seatcount(int m) // to assign the earlier booked tickets to the particular array according the current user's choice and parameter is for the number of rows of seats
    {
        switch(choices)
        {
            case 111:
                for(int i = 0; i<140; i++)
                    booked[i] = booked111[i];
                break;
            case 112:
                for(int i = 0; i<140; i++)
                    booked[i] = booked112[i];
                break;
            case 113:
                for(int i = 0; i<140; i++)
                    booked[i] = booked113[i];
                break;
            case 121:
                for(int i = 0; i<140; i++)
                    booked[i] = booked121[i];
                break;
            case 122:
                for(int i = 0; i<140; i++)
                    booked[i] = booked122[i];
                break;
            case 123:
                for(int i = 0; i<140; i++)
                    booked[i] = booked123[i];
                break;
            case 211:
                for(int i = 0; i<140; i++)
                    booked[i] = booked211[i];
                break;
            case 212:
                for(int i = 0; i<140; i++)
                    booked[i] = booked212[i];
                break;
            case 213:
                for(int i = 0; i<140; i++)
                    booked[i] = booked213[i];
                break;
            case 221:
                for(int i = 0; i<140; i++)
                    booked[i] = booked221[i];
                break;
            case 222:
                for(int i = 0; i<140; i++)
                    booked[i] = booked222[i];
                break;
            case 223:
                for(int i = 0; i<140; i++)
                    booked[i] = booked223[i];
                break;
            case 311:
                for(int i = 0; i<140; i++)
                    booked[i] = booked311[i];
                break;
            case 312:
                for(int i = 0; i<140; i++)
                    booked[i] = booked312[i];
                break;
            case 313:
                for(int i = 0; i<140; i++)
                    booked[i] = booked313[i];
                break;
            case 321:
                for(int i = 0; i<140; i++)
                    booked[i] = booked321[i];
                break;
            case 322:
                for(int i = 0; i<140; i++)
                    booked[i] = booked322[i];
                break;
            case 323:
                for(int i = 0; i<140; i++)
                    booked[i] = booked323[i];
                break;
        }
        for (int i = 1; i <= m; ++i) // printing the seat chart
        {
            System.out.print("  __");
            for (int j = 1; j <= 7; ++j) 
            {
                f = count;
                if (j == 4)
                {
                    for(int z = 0; z<140; z++)
                    {
                        if(booked[z] == count)
                            f = 0;
                    }
                    System.out.print("\t" + f + "  __");
                }
                else if (j == 2)
                {
                    for(int z = 0; z<140; z++)
                    {
                        if(booked[z] == count)
                            f = 0;
                    }
                    System.out.print("\t" + f + "  __");
                }
                else
                {
                    for(int z = 0; z<140; z++)
                    {
                        if(booked[z] == count)
                            f = 0;
                    }
                    System.out.print("\t" + f);
                }
                count++;
            }
            System.out.print("   --\n");
        }
    }
    public void seat() // further continuation of the seat chart
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Gold (g)\n");
        seatcount(8); // 8 rows of gold
        System.out.println("\nSilver (s)\n");
        seatcount(6); // 6 rows of silver
        System.out.println("\nExecutive (e)\n");
        seatcount(6); // 6 rows of executive
        System.out.println("\nEntry --->\t\t\t\t\t\tExit -->");
        System.out.println("\n\n\t\t\tScreen this way");
        System.out.println("\n\t~~~~~~~~########    Booked seats are marked with 0   ########~~~~~~~~");
        System.out.println("\t~~~~~~~~########     Seats in GOLD ----> 1 to 56     ########~~~~~~~~");
        System.out.println("\t~~~~~~~~########    Seats in SILVER ----> 57 to 98   ########~~~~~~~~");
        System.out.println("\t~~~~~~~~######## Seats in EXECUTIVE -----> 99 to 140 ########~~~~~~~~");
        System.out.println("--------------------------------------------------------------------------------------------");
    }
    public void booking() // booking the ticket
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\nHow many tickets do you want to book ?\n(You can book a maximum of 10 tickets)");
        System.out.println("\n***** If you want to exit, enter 0, else enter the number of seats *****");
        System.out.print("***** If you want to terminate the program, enter 222, else enter the number the seats *****\n\nEnter your choice : ");
        n = sc.nextInt();
        if(n == 0) // if the input is 0, the program will restart for the new user
        {
            choices = 0;
            play();
        }
        else if(n == 222) // if the input is 222, the program will terminate
            System.exit(0);
        while (n > 10 || n < 0) // a maximum of 10 tickets can be booked by a single user, if the input is more than 10 or less than 1, it will again ask for the input
        {
            System.out.print("The ticket booking range is 1 to 10. Enter again : ");
            n = sc.nextInt();
        }
        System.out.println("\nChoose the seat (one by one) you wish to book (no ticket is booked for the children of age less than 3)");
        loop:
        for (int i = 0; i < n; ++i) 
        {
            System.out.print("\nType the seat number : ");
            book[i] = sc.nextInt();
            if (book[i] < 1 || book[i] > 140) // there are 140 seats in theatre, if the seat input is more than that then this block will be executed
            {
                System.out.println("The seat range is from 1 to 140.\nChoose again");
                --i;
                continue;
            }
            for(int j = 0; j<140 ; j++) // if the entered seat number is already booked, this block will be executed
            {
                if(booked[j] == book[i])
                {
                    System.out.println("Sorry, the ticket is already booked. Choose again");
                    i--;
                    continue loop;
                }
            }
            if (book[i] < 57) // to store the seat category and the number of seats booked in that particular category
            {
                bk = 'g';
                gold++;
                cat[i] = "g";
            }
            else if (book[i] < 99 && book[i] > 56)
            {
                bk = 's';
                silver++;
                cat[i] = "s";
            }
            else if (book[i] > 98)
            {
                bk = 'e';
                exe++;
                cat[i] = "e";
            }
            booked[i] = book[i];
            price();
            continue;
        }
    }
    public void price() // to store the seat charge according to the choice
    {
        if (a == 1) 
        {
            if(choice == 1)
                price += 140;
            else if(choice == 2)
                price +=150;
            else if(choice == 3)
                price += 160;
        }
        else if (a == 2)
        {
            if (choice == 1) 
            {
                if (bk == 'g')
                    price += 220; 
                else if (bk == 's') 
                    price += 180;
                else if (bk == 'e')
                    price += 160;
            } 
            else if (choice == 2) 
            {
                if (bk == 'g')
                    price += 230;
                else if (bk == 's')
                    price += 200;
                else if (bk == 'e')
                    price += 180;
            }
            else if (choice == 3) 
            {
                if (bk == 'g')
                    price += 240;
                else if (bk == 's')
                    price += 220;
                else if (bk == 'e')
                    price += 200;
            }
        }
    }
    public void bill() // asking the user if he/she wants the combo and then displaying the bill
    {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.println("Just go through our combos that you can enjoy while watching " + mov);
        System.out.println("Enter 1 for : Large cheese popcorn + Coke : \t Rs. 220");
        System.out.println("Enter 2 for : French Fries + Coke         : \t Rs. 150");
        System.out.println("Enter 3 for : 2pcs Samosa + Coke          : \t Rs. 160\nEnter 4 to exit\nEnter 5 to terminate the program");
        System.out.println("\n***** If you don't want to book the combo, press any key except the number key *****");
        System.out.print("\nEnter your choice : ");
        com = sc.next().charAt(0);
        switch(com)
        {
            case '1':
                cc = 220; // storing the combo charge
                comb = "Large cheese popcorn + Coke"; // storing the combo to display in the ticket
                break;
            case '2':
                cc = 150;
                comb = "French Fries + Coke";
                break;
            case '3':
                cc = 160;
                comb = "2pcs Samosa + Coke";
                break;
            case '4' :
                play(); // restarting the program for new user
                break;
            case '5':
                System.exit(0); // terminate the program
        }
        tax = n * 26; // calculating the tax
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\n\n########## Your bill ##########\n"); // displaying the bill
        System.out.println("Internet handling fees :\tRs. " + tax);
        System.out.println("Seats charge           :\tRs. " + price);
        System.out.println("Combo charge           :\tRs. " + cc);
        System.out.println("\n-----Total amount to be paid-----\n\tRs. " + (tax + price + cc)); 
        System.out.println("\n###############################\n");
        System.out.println("\n***** If you don't want to buy the ticket, press 0, else press any other key *****");
        System.out.println("***** If you want to terminate the program, press e, else press any other key *****");
        System.out.print("\nEnter your choice : ");
        exit = sc.next().charAt(0); // if the input is not 0 or e, the ticket will be printed
        if(exit == '0')
        {
            choices = 0;
            play(); // restarting the program for new user
        }
        else if(exit == 'e')
            System.exit(0); //terminating the program
    }       
    public void ticket() // printing the ticket
    {
        for(int i = 0; i<n-1; i++) // storing the tickets chosen by the user 
            s += book[i] + cat[i] + ", ";
        s += book[n-1] + cat[n-1];
        System.out.println("\n\n########## Ticket ##########\n");
        System.out.println("Movie                  :\t" + mov);
        System.out.println("Timing                 :\t" + time);
        System.out.println("Tickets in Gold        :\t" + gold);
        System.out.println("Tickets in Silver      :\t" + silver);
        System.out.println("Tickets in Executive   :\t" + exe);
        System.out.println("Combo                  :\t" + comb);
        System.out.println("Seats                  :\t" + s);
        System.out.println("\n############################\n");
        int j = 0; // counter variable for storing the booked seats in the respective array of the choices
        switch(choices) // storing the booked seats in the respective array according to the choices
            {
                case 111:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked111[i] == 0) // once 0 appears at the index number, it means that the remaining parts of the array are yet to be initialised 
                        {
                            booked111[i] = book[j]; // storing the booked seat at the non-initialised index number
                            j++;
                        } 
                        if(j > 9) // array book[] can store a maximum of 10 elements when the other array is initialised with all the 10 elements of book[], the control will come out
                            break;   
                    }
                    break;
                case 112:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked112[i] == 0)
                        {
                            booked112[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 113:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked113[i] == 0)
                        {
                            booked113[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;    
                    }
                    break;
                case 121:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked121[i] == 0)
                        {
                            booked121[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 122:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked122[i] == 0)
                        {
                            booked122[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 123:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked123[i] == 0)
                        {
                            booked123[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 211:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked211[i] == 0)
                        {
                            booked211[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 212:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked212[i] == 0)
                        {
                            booked212[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 213:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked213[i] == 0)
                        {
                            booked213[i] = booked[i];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 221:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked221[i] == 0)
                        {
                            booked221[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 222:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked222[i] == 0)
                        {
                            booked222[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 223:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked223[i] == 0)
                        {
                            booked223[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 311:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked311[i] == 0)
                        {
                            booked311[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            j = 0; break;
                    }
                    break;
                case 312:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked312[i] == 0)
                        {
                            booked312[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 313:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked313[i] == 0)
                        {
                            booked313[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 321:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked321[i] == 0)
                        {
                            booked321[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 322:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked322[i] == 0)
                        {
                            booked322[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
                case 323:
                    for(int i = 0; i<140; i++)
                    {
                        if(booked323[i] == 0)
                        {
                            booked323[i] = book[j];
                            j++;
                        }
                        if(j > 9)
                            break;
                    }
                    break;
            }
    }        
    public void play()
    {
        Cinema cin = new Cinema(); // object creation
        while(true)
        {
            int book[] = new int[10]; // re-initialising some of the the variables to 0
            user++;
            x = 0;
            a = 0;
            choice = 0;
            count = 1;
            price = 0;
            n = 0;
            tax = 0;
            gold = 0;
            silver = 0;
            exe = 0;
            cc = 0;
            com = 0;
            s = "";
            System.out.println("\n\n--------------------------------------------------------------------------------------------");
            System.out.println("\t\t////////////////////////// User : " + user + " //////////////////////////"); // printing the user number
            System.out.println("--------------------------------------------------------------------------------------------\n");
            System.out.println("\n\t\t\t***%%%%%% Welcome to 'FEEL' Cinema ! %%%%%%***\n"); // opening statement
            cin.Terms(); // method calling
            cin.movie();
            cin.booking();
            cin.bill();
            cin.ticket();
            System.out.println("\n\n\t\t\t***%%%%%% Thank You! Visit Again :) %%%%%%***"); // closing statement
        }
    }
    public static void main(String args[])
    {
        Cinema c = new Cinema();
        c.play();
    }
}