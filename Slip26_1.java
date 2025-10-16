class Item {

    int ino;

    String iname;

    double iprice;

    static int count = 0;

    public Item() 

    {

        count++;

    }

    public Item(int ino, String iname, double iprice) 

    {

        this.ino = ino;

        this.iname = iname;

        this.iprice = iprice;

     	count++;

    }

    public static int getObjectCount() 

    {

        return count;

    }

   public void displayItemDetails() 

   {

        System.out.println("Item Details:");

        System.out.println("Item Number: " + ino);

        System.out.println("Item Name: " + iname);

        System.out.println("Item Price: $" + iprice);

        System.out.println();

    }

}

class Slip26_1

{

    public static void main(String[] args) 

    {

        Item item1 = new Item(101, "Laptop", 850.00);

        item1.displayItemDetails();

        System.out.println("Objects created: " + Item.getObjectCount());

        System.out.println();

        Item item2 = new Item(102, "Smartphone", 650.00);

        item2.displayItemDetails();

        System.out.println("Objects created: " + Item.getObjectCount());

        System.out.println();

        Item item3 = new Item(103, "Tablet", 300.00);

        item3.displayItemDetails();

        System.out.println("Objects created: " + Item.getObjectCount());

    }

}
