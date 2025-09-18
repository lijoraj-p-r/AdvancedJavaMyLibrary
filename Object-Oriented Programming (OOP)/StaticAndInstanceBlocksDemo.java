class StaticAndInstanceBlocksDemo {

    // Static block 1
    static {
        System.out.println("Static Block 1: Starting program setup...");
    }

    // Static block 2
    static {
        System.out.println("Static Block 2: Loading configuration...");
    }

    // Instance block 1
    {
        System.out.println("Instance Block 1: Preparing object...");
    }

    // Instance block 2
    {
        System.out.println("Instance Block 2: Assigning default values...");
    }

    public static void main(String[] args) {
        System.out.println("Main Method: Program started.");

        StaticAndInstanceBlocksDemo obj1 = new StaticAndInstanceBlocksDemo();
        System.out.println("----------------------");
        StaticAndInstanceBlocksDemo obj2 = new StaticAndInstanceBlocksDemo();
    }
}
/*
Static Block 1: Starting program setup...
Static Block 2: Loading configuration...
Main Method: Program started.
Instance Block 1: Preparing object...
Instance Block 2: Assigning default values...
----------------------
Instance Block 1: Preparing object...
Instance Block 2: Assigning default values...
  */

