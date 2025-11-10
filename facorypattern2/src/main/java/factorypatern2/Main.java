package factorypatern2;

import factorypatern2.NewsReaderFactory.NewsApiTypes;

public class Main {
    public static void main(String[] args) {
        String url = "http://sajt.com/api/vesti/";

        NewsReader nr = NewsReaderFactory.getNewsReader(url, null);

        if(nr == null){
            System.out.println("Nije podrzan tip news Reader klase.");
            return;
        }

        for(NewsItem ni : nr.getTop5()){
            System.out.println(ni);
        }
    }
}