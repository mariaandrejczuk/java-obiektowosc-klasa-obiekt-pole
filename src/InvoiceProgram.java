public class InvoiceProgram {
    public static void main(String[] args) {
        //faktura 1
        System.out.println("-----------Invoice 1 -----------");
        Invoice i1 = new Invoice();
        i1.number = 1;
        char[] description = {'b', 'o', 'o', 'k'};
        i1.description = description;
        i1.quantity = 2;
        i1.price = 32.10;
        i1.vat = 0.23;
        i1.fromNIP = 1231231233;
        i1.forNIP = 1118529366;

        System.out.println("Number: "+i1.number);
        System.out.print("Description: ");
        for(char c : i1.description){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Quantity: "+i1.quantity);
        System.out.println("Price: "+i1.price);
        System.out.println("VAT: "+i1.vat);
        System.out.println("From: "+i1.fromNIP);
        System.out.println("For: "+i1.forNIP);

        System.out.println();
        System.out.println("-----------Invoice 2 -----------");
        //faktura 2
        Invoice i2 = new Invoice();
        i2.number = 2;
        char[] description2 = {'l', 'a', 'p', 't', 'o', 'p'};
        i2.description = description2;
        i2.quantity = 1;
        i2.price = 4205.55;
        i2.vat = 0.23;
        i2.fromNIP = 1111231233;
        i2.forNIP = 1008529366;

        System.out.println("Number: "+i2.number);
        System.out.print("Description: ");
        for(char c : i2.description){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Quantity: "+i2.quantity);
        System.out.println("Price: "+i2.price);
        System.out.println("VAT: "+i2.vat);
        System.out.println("From: "+i2.fromNIP);
        System.out.println("For: "+i2.forNIP);

        //przypisanie faktur do tablicy
        System.out.println();
        System.out.println("------pętla FOREACH-------");
        Invoice[] invoices = new Invoice[2]; //tablica jednowymiarowa dwóch elementów - mamy 2 faktury
        invoices[0] = i1;
        invoices[1] = i2;

        for(Invoice invoice : invoices) {
            System.out.println("----------");
            System.out.println("Number: "+invoice.number);
            System.out.println("----------");
            System.out.print("Description: ");
            for(char c : invoice.description){
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Quantity: "+invoice.quantity);
            System.out.println("Price: "+invoice.price);
            System.out.println("VAT: "+invoice.vat);
            System.out.println("From: "+invoice.fromNIP);
            System.out.println("For: "+invoice.forNIP);
        }
    }
}
