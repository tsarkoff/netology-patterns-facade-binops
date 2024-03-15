import jdk.jshell.spi.ExecutionControl;

public class BinOps {
    public static enum Operation {SUM, SUB, MULT, DIV, POW;}

    private String calcBin(String bin0, String bin1, Operation op) {
        int intA = Integer.parseInt(bin0, 2);
        int intB = Integer.parseInt(bin1, 2);
        return switch (op) {
            case SUM -> Integer.toBinaryString(intA + intB);
            case MULT -> Integer.toBinaryString(intA * intB);
            default -> throw new UnsupportedOperationException("Not implemented");
        };
    }
    public String sum(String a, String b) {
        return calcBin(a, b, Operation.SUM);
    }

    public String mult(String a, String b) {
        return calcBin(a, b, Operation.MULT);
    }
}