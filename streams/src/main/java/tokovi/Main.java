package tokovi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final List<Test> testovi = new ArrayList<>();

        popuniListu(testovi);
        
        System.out.println("------------");
        final String subjectCode = "IR1PR1";
        double prosek = prosecanBrojPoenaNaTestovimaIzPredmeta(testovi, subjectCode);
        System.out.println("Prosecan broj poena je " + prosek);

        System.out.println("------------");
        prikaziRezultateTestovaZaPredmet(testovi, subjectCode);
        System.out.println("------------");

        testovi.stream().
                collect(
                    Collectors.groupingBy(
                        test -> test.getSubject()
                    )
                ).forEach((subject, lista) -> {
                    System.out.println("Testovi iz predmeta: " + subject.getName() + " [" + subject.getCode() + "]");
                    lista.stream().
                          sorted(
                            (testA,testB) -> 
                                testA.getStudent().getIndex().compareTo(testB.getStudent().getIndex())).
                          forEach(Main::prikaziTest);

                });

    }

    public static void popuniListu(final List<Test> testovi) {
        try {
            testovi.add(new Test(new Subject("Programiranje 1", "IR1PR1"), new Student("Pera", "Peric", "2008100940"), "2024-11-05", 24.5));
            testovi.add(new Test(new Subject("Programiranje 1", "IR1PR1"), new Student("Iva", "Ivanovic", "2008100954"), "2024-11-05", 19.0));
            testovi.add(new Test(new Subject("Programiranje 1", "IR1PR1"), new Student("Zoran", "Zoric", "2008100125"), "2024-11-05", 26.0));
            
            testovi.add(new Test(new Subject("Programiranje 2", "IR1PR2"), new Student("Pera", "Peric", "2008100940"), "2025-11-05", 22.0));
            testovi.add(new Test(new Subject("Programiranje 2", "IR1PR2"), new Student("Iva", "Ivanovic", "2008100954"), "2025-11-05", 23.0));

            testovi.add(new Test(new Subject("Baze podataka", "IR1BP"), new Student("Pera", "Peric", "2008100940"), "2024-10-01", 19.1));
            testovi.add(new Test(new Subject("Baze podataka", "IR1BP"), new Student("Iva", "Ivanovic", "2008100954"), "2025-10-01", 20.0));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double prosecanBrojPoenaNaTestovimaIzPredmeta(final List<Test> testovi, String subjectCode){
        return testovi.stream().
                       filter(test -> test.getSubject().getCode().equals(subjectCode)).
                       mapToDouble(Test::getMark).
                       average().
                       getAsDouble();
    }

    public static void prikaziTest(Test test){
        System.out.print(test.getStudent().getIndex() + "\t");
        System.out.print(test.getStudent().getForename() + " " + test.getStudent().getSurname() + "\t");
        System.out.println(test.getMark());
    }

    public static void prikaziRezultateTestovaZaPredmet(final List<Test> testovi, String subjectCode){
        testovi.stream().
                filter(test -> test.getSubject().getCode().equals(subjectCode)).
                sorted(
                    (testA,testB) -> 
                        testA.getStudent().getIndex().compareTo(testB.getStudent().getIndex())).
                forEach(Main::prikaziTest);
    }
}