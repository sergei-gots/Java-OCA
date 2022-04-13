package Homework;

public class Lesson2 {

    static public void main(String args[]) {
    
        byte b10 = 12;
        byte b02 = 0B1100;
        byte b08 = 014;
        byte b0x = 0xC;
        
        System.out.println("b10="+b10+
                        ", b02="+b02+
                        ", b08="+b08+
                        ", b0x="+b0x + ';');

        short s10 = 1300;
        short s02 = 0B0_0101_0001_0100;
        
        short s08 = 02424;
        short s0x = 0x514;
        
        System.out.println("s10="+s10+
                        ", s02="+s02+
                        ", s08="+s08+
                        ", s0x="+s0x + ';');

        int n10 = 0;
        int n02 = 0B000;
        
        int n08 = 0_000;
        int n0x = 0x00;
        
        System.out.println("n10="+n10+
                        ", n02="+n02+
                        ", n08="+n08+
                        ", n0x="+n0x + ';');

        long lng10 = 123_456_789;
        long lng02 = 0B0_0111_0101_1011_1100_1101_0001_0101;
        long lng02_0 = 0B0_0_111_010_110_111_100_110_100_010_101;
        
        long lng08 = 0_00726746425;
        long lng0x = 0x075BCD15;
        
        System.out.println("lng10="+lng10+
                        ", lng02="+lng02+
                        ", lng08="+lng08+
                        ", lng0x="+lng0x + ';');

        float fPi = 3.141_592_653_484F;
        float f_g = 9.8F;
        
        double dPi = 3.141_592_653_484;
        double d_g = 10;
        
        boolean boolPi = (fPi == dPi);
        boolean bool_g = (f_g != d_g);
        
        System.out.println("fPi="+ fPi +
                        ", dPi="+ dPi+
                        ", f_g="+ dPi +
                        ", d_g="+ d_g + ';');

        System.out.println("fPi==dPi: "+ boolPi +
                        ", f_g!=d_g: "+ bool_g + ';');
        
        char c1 = 'c';
        char c2 = '\u0029';
        char c3 = 41;
        char c4 = 0b0_0010_1001;
        
        System.out.println("c1=" + c1 +
                        ", c2=" + c2 +
                        ", c3=" + c3 +
                        ", c4=" + c4 + ';');

        
    }
}
