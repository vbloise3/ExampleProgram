/**
 * Created by vincebloise on 4/24/16.
 */

import stuff.*;

public class ExampleProgram {
    public static void main(String args[]) {
        System.out.printf("Example program, input parameter #1: %s\n", args[0]);
        SomeStuff theStuff = new SomeStuff();
        OtherStuff theOtherStuff = new OtherStuff("Bloise", "@ Amazon!");
        theStuff.setName("The Dude");
        theStuff.setValue(23);
        System.out.printf("The stuff #1: %s - %d\n", theStuff.getName(), theStuff.getValue());
        System.out.printf("The other stuff: %s %s\n", theOtherStuff.getTag(), theOtherStuff.getValue());
    }
}

