package com.zemiak;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int count = 551;
        Boolean[] lamps = new Boolean[count];

        // the first dwarf switched off all of the lamps
        for (int i = 0; i < count; i++) {
            lamps[i] = Boolean.FALSE;
        }

        // the second dwarf switched on/off every second lamp, the third every third, etc
        for (int dwarf = 2; dwarf < count; dwarf++) {
            for (int i = 1; i < count; i++) {
                if (i < 551 && i % dwarf == 0) {
                    lamps[i] = !lamps[i];
                    System.out.println("Dwarf " + dwarf + " turned " + (lamps[i] ? "on" : "off") + " the lamp " + i);
                }
            }
        }

        System.out.println("Lamps that are on: ");
        for (int i = 1; i < count; i++) {
            if (Boolean.TRUE.equals(lamps[i])) {
                System.out.print(i + ",");
            }
        }
        System.out.println("Done.");

        System.out.println("Lamps that are off: ");
        for (int i = 1; i < count; i++) {
            if (Boolean.FALSE.equals(lamps[i])) {
                System.out.print(i + ",");
            }
        }
        System.out.println("Done.");
    }
}
