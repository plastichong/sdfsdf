package generic.printer;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter.getMaterial());


        GenericPrinter<Powder> PowderPrinter = new GenericPrinter<>();
        PowderPrinter.setMaterial(new Powder());
        System.out.println(PowderPrinter.getMaterial());


    }
}
