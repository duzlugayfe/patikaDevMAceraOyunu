package java102.genericsList;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        liste.printArray();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));       
        System.out.println("Indeks : " + liste.indexOf(20));       
        System.out.println("Indeks :" + liste.indexOf(100));       
        System.out.println("Indeks : " + liste.lastIndexOf(20));        
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);       
        MyList<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());        
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));        
        liste.clear();
        System.out.println(liste.toString());
        liste.printArray();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        MyList<String> stringList = new MyList<>();
        System.out.println("Liste Durumu : " + (stringList.isEmpty() ? "Boş" : "Dolu"));
        stringList.add("elma");
        stringList.add("ayva");
        stringList.add("erik");
        stringList.add("kavun");
        stringList.add("karpuz");
        stringList.add("mango");
        stringList.add("portakal");
        stringList.add("armut");
        stringList.add("mandalina");
        stringList.printArray();
        System.out.println("Liste Durumu : " + (stringList.isEmpty() ? "Boş" : "Dolu"));
        System.out.println("Indeks : " + stringList.indexOf("kivi"));
        System.out.println("Indeks :" + stringList.indexOf("hurma"));        
        System.out.println("Indeks : " + stringList.lastIndexOf("üzüm"));        
        Object[] stringDizi = stringList.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + stringDizi[0]);        
        MyList<String> altStringListem = stringList.subList(0, 3);
        System.out.println(altStringListem.toString());
        System.out.println("Listede Kavun değeri : " + stringList.contains("kavun"));
        System.out.println("Listede Portakal değeri : " + stringList.contains("portakal"));
        stringList.clear();
        System.out.println(stringList.toString());
        System.out.println("Dizideki Eleman Sayısı : " + stringList.size());
        System.out.println("Dizinin Kapasitesi : " + stringList.getCapacity());
        stringList.add("dut");
        stringList.add("böğürtlen");
        stringList.add("muğla");
        System.out.println("Dizideki Eleman Sayısı : " + stringList.size());
        System.out.println("Dizinin Kapasitesi : " + stringList.getCapacity());       
        stringList.add("nar");
        stringList.add("avakado");
        stringList.add("trunç");
        System.out.println("Dizideki Eleman Sayısı : " + stringList.size());
        System.out.println("Dizinin Kapasitesi : " + stringList.getCapacity());
        System.out.println(stringList.toString());
        stringList.remove(5);
        stringList.remove(7);
        stringList.printArray();
        System.out.println(stringList.toString());
        System.out.println("Dizideki Eleman Sayısı : " + stringList.size());
        System.out.println("Dizinin Kapasitesi : " + stringList.getCapacity());

    }
}
