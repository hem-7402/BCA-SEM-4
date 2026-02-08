using System;

class HotelMenu
{
    // Method to print final bill
    static void FinalBill(int[,] select_item, int[] price, string[] menu)
    {
        int total = 0;

        Console.Clear();
        Console.WriteLine("***** FINAL BILL *****");
        Console.WriteLine("----------------------------------");
        Console.WriteLine("MENU\t\tQTY\tPRICE");
        Console.WriteLine("----------------------------------");

        for (int i = 0; i < menu.Length; i++)
        {
            if (select_item[i, 1] > 0)
            {
                Console.WriteLine("{0}\t{1}\t{2}",
                    menu[i],
                    select_item[i, 1],
                    price[i] * select_item[i, 1]);

                total += price[i] * select_item[i, 1];
            }
        }

        Console.WriteLine("----------------------------------");
        Console.WriteLine("TOTAL AMOUNT : {0}", total);
        Console.WriteLine("----------------------------------");
        Console.WriteLine("********** THANK YOU *************");
        Console.ReadKey();
    }

    static void Main()
    {
        string[] menu =
        {
            "MANCHURIAN",
            "PAV-BHAJI",
            "NOODLES     ",
            "MANCHOW SOUP"
        };

        int[] price = { 199, 149, 199, 99 };
        int[,] select_item = new int[menu.Length, 2];

        char check;

        do
        {
            Console.Clear();
            Console.WriteLine("***** HOTEL MENU *****");
            Console.WriteLine("1. MANCHURIAN - 199");
            Console.WriteLine("2. PAV-BHAJI  - 149");
            Console.WriteLine("3. NOODLES   - 199");
            Console.WriteLine("4. MANCHOW SOUP - 99");
            Console.WriteLine("5. Exit");
            Console.Write("\nEnter your choice: ");

            int choice = int.Parse(Console.ReadLine());

            switch (choice)
            {
                case 1:
                    select_item[0, 1]++;
                    Console.WriteLine("MANCHURIAN added");
                    break;

                case 2:
                    select_item[1, 1]++;
                    Console.WriteLine("PAV-BHAJI added");
                    break;

                case 3:
                    select_item[2, 1]++;
                    Console.WriteLine("NOODLES added");
                    break;

                case 4:
                    select_item[3, 1]++;
                    Console.WriteLine("MANCHOW SOUP added");
                    break;

                case 5:
                    FinalBill(select_item, price, menu);
                    return;

                default:
                    Console.WriteLine("Invalid Choice");
                    break;
            }

            Console.Write("\nDo you want to continue (y/n): ");
            check = char.Parse(Console.ReadLine());

            if (check == 'n' || check == 'N')
            {
                FinalBill(select_item, price, menu);
                return;
            }

        } while (check == 'y' || check == 'Y');
    }
}
