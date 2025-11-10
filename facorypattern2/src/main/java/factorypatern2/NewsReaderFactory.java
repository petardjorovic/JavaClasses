package factorypatern2;

final public class NewsReaderFactory {
   public enum NewsApiTypes { JSON, HTML, RSS }

   private NewsReaderFactory(){}


    static NewsReader getNewsReader(String url, NewsApiTypes newsApiType){
        if(newsApiType == null){
            return null;
        }
        switch (newsApiType) {
            case JSON:
                return new JsonNewsReader(url);
            case HTML:
                return new HtmlNewsReader(url);
            case RSS:
                return new RssNewsReader(url);
        }
        return null;
    }
}
