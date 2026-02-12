using System;
class HotelMenu{
    static void ShowBill(int[] select_item, int[] price, string[] menu){
        int total=0;

        Console.Clear();
        Console.WriteLine("************ CURRENT BILL ************");
        Console.WriteLine("--------------------------------------");
        Console.WriteLine("MENU\t\tQTY\tPRICE");
        Console.WriteLine("--------------------------------------");

        for (int i = 0; i < menu.Length; i++){
            if (select_item[i] > 0){
                int itemTotal = price[i] * select_item[i];
                Console.WriteLine(menu[i] + "\t" + select_item[i] + "\t" + itemTotal);
                total += itemTotal;
            }
        }

        Console.WriteLine("--------------------------------------");
        Console.WriteLine("TOTAL AMOUNT : {0}", total);
        Console.WriteLine("--------------------------------------");
        Console.WriteLine("Press any key to continue...");
        Console.ReadLine();
    }

    static void FinalBill(int[] select_item, int[] price, string[] menu){
        ShowBill(select_item, price, menu);
        Console.WriteLine("\n********** THANK YOU *************");
    }

    static void Main(){
        string[] menu = {
            "MANCHURIAN",
            "PAV-BHAJI",
            "NOODLES\t",
            "MANCHOW SOUP"
        };

        int[] price = { 199, 149, 199, 99 };
        int[] select_item = new int[menu.Length];

        char check;

        do{
            Console.Clear();
            Console.WriteLine("-------- HOTEL MENU --------");
            Console.WriteLine("1. MANCHURIAN - 199");
            Console.WriteLine("2. PAV-BHAJI  - 149");
            Console.WriteLine("3. NOODLES    - 199");
            Console.WriteLine("4. MANCHOW SOUP - 99");
            Console.WriteLine("5. Update Order");
            Console.WriteLine("6. Show Bill");
            Console.WriteLine("7. Exit");
            Console.Write("\nEnter your choice: ");

            int choice = int.Parse(Console.ReadLine());

            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                    Console.Write("Enter quantity: ");
                    int qty = int.Parse(Console.ReadLine());
                    select_item[choice - 1] += qty;
                    Console.WriteLine("Item added successfully!");
                    break;

                case 5:
                    Console.WriteLine("\n--- Update Order ---");
                    for (int i = 0; i < menu.Length; i++)
                    {
                        Console.WriteLine((i + 1) + ". " + menu[i] +
                            " (Current Qty: " + select_item[i] + ")");
                    }

                    Console.Write("Select item to update: ");
                    int updateChoice = int.Parse(Console.ReadLine());

                    if (updateChoice >= 1 && updateChoice <= menu.Length)
                    {
                        Console.Write("Enter new quantity (0 to remove): ");
                        int newQty = int.Parse(Console.ReadLine());
                        select_item[updateChoice - 1] = newQty;
                        Console.WriteLine("Order Updated!");
                    }
                    else
                    {
                        Console.WriteLine("Invalid choice!");
                    }
                    break;

                case 6:
                    ShowBill(select_item, price, menu);
                    break;

                case 7:
                    FinalBill(select_item, price, menu);
                    return;

                default:
                    Console.WriteLine("Invalid Choice");
                    break;
            }

            Console.Write("\nDo you want to continue (y/n): ");
            check = char.Parse(Console.ReadLine());

            if (check == 'n' || check == 'N'){
                FinalBill(select_item, price, menu);
                return;
            }

        } while (check == 'y' || check == 'Y');
    }
}