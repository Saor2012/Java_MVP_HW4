import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int bits = 0;
    private static int sizeHighBit = 0;
    private static int sizeLowBit = 0;
    public static void main(String []args) {
        //int c = 1231545656/8/1024/1024;
        //System.out.println(c);
        //Init();
    }
    public static int conventer(int foo, int number) {
        int result = -1;
        switch(foo) {
            case 1: setBits(number);
                System.out.println("Bits = " + (result = getBits()));
                break;
            case 2: setBytes(number);
                System.out.println("Bytes = " + (result = getBytes()));
                //System.out.println("Bits = " + (result = getBytes()));
                break;
            case 3: setKiloBytes(number);
                System.out.println("Kilobytes = " + (result = getKiloBytes()));
                //System.out.println("Bits = " + (result = getKiloBytes()));
                break;
            case 4: setMegaBytes(number);
                System.out.println("Megabytes = " + (result = getMegaBytes()));
                //System.out.println("Bits = " + (result = getMegaBytes()));
                break;
            case 5: setGigaBytes(number);
                System.out.println("Gigabytes = " + (result = getGigaBytes()));
                //System.out.println("Bits = " + (result = getGigaBytes()));
                break;
            default:
                System.out.println("Invalid function.");
        }
        return result;
    }
    public static void Init()  {
        try {
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            int a, k = 0;
            boolean state = false;
            String text = "";
            System.out.println("//(Handle integer number)");
            System.out.println("Conventor digital numbers");
            System.out.print("Enter number a: ");
            a = Integer.valueOf(text = br.readLine());
            System.out.println("Your first number = " + a);
            System.out.print("Enter the convertor function (from bits: 8 - to bits,\n b - to bytes, k - to kilobytes, m - to megabytes,\n g - to gigabytes): ");
            do {
                text = br.readLine();
                //if ((text != "/" || text != "*" || text != "+" || text != "-")) {
                //    System.out.println("Invalid function, enter a function.");
                //}
                state = (text.equals("8") || text.equals("b") || text.equals("k") || text.equals("m") || text.equals("g"));
                //System.out.println(text.equals("/"));
                //System.out.println(text.equals("*"));
                //System.out.println(text.equals("-"));
                //System.out.println(text.equals("+"));
                //System.out.println(state);
                if (!state) {
                    System.out.println("Invalid function.");
                    System.out.print("Enter the convertor function (8, b, k, m, g): ");
                } else {
                    if (text.equals("8")) k = 1;
                    else if (text.equals("b")) k = 2;
                    else if (text.equals("k")) k = 3;
                    else if (text.equals("m")) k = 4;
                    else if (text.equals("g")) k = 5;
                    else k = 0;
                }
            } while (!state);
            System.out.println("Your convertor function \"" + text + "\"");
            //System.out.println(k);

            //System.out.println("Number a = " + a + ", number b = " + b);
            System.out.println("Output number = " + conventer(k, a));
            //while(!(text = br.readLine()).equals("ESC")) {}
        } catch(Exception e) {
            System.out.println("Error " + e);
        }
    }
    // bits != 0 ? bits : size != 0 ? size : bits
    public static int getBits() {
        return sizeHighBit == 0 ? bits : sizeHighBit;
        //return sizeLowBit == 0 ? bits : sizeLowBit;
    }
    public static int getBytes() {
        //return sizeHighBit == 0 ? bits / 8 : sizeHighBit;
        return sizeLowBit == 0 ? bits / 8 : sizeLowBit;
    }
    public static int getKiloBytes() {
        //return sizeHighBit == 0 ? bits / 8 / 1024 : sizeHighBit;
        return sizeLowBit == 0 ? bits / 8 / 1024 : sizeLowBit;
    }
    public static int getMegaBytes() {
        //return sizeHighBit == 0 ? bits / 8 / 1024 / 1024 : sizeHighBit;
        return sizeLowBit == 0 ? bits / 8 / 1024 / 1024 : sizeLowBit;
    }
    public static int getGigaBytes() {
        //return sizeHighBit == 0 ? bits / 8 / 1024 / 1024 / 1024 : sizeHighBit;
        return sizeLowBit == 0 ? bits / 8 / 1024 / 1024 / 1024 : sizeLowBit;
    }
    public static void setBits(int bit) {
        bits = bit;
        //System.out.println(bit + " " + bits);
    }
    public static void setBytes(int bit) {
        sizeHighBit = bit * 8;
        sizeLowBit = bit / 8;
        //System.out.println(bit + " " + sizeLowBit);
    }
    public static void setKiloBytes(int bit) {
        sizeHighBit = bit * 8 * 1024;
        sizeLowBit = bit / 8 / 1024;
        //System.out.println(bit + " " + sizeLowBit);
    }
    public static void setMegaBytes(int bit) {
        sizeHighBit = bit * 8 * 1024 * 1024;
        sizeLowBit = bit / 8 / 1024 / 1024;
        //System.out.println(bit + " " + sizeLowBit);
    }
    public static void setGigaBytes(int bit) {
        sizeHighBit = bit * 8 * 1024 * 1024 * 1024;
        sizeLowBit = bit / 8 / 1024 / 1024 / 1024;
        //System.out.println(bit + " " + sizeLowBit);
    }
}
