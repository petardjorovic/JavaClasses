package factorypatern2;

import java.util.List;

abstract public class NewsReader {
    final private String url;

    public NewsReader(String url){
        this.url = url;
    }

    protected String getUrl() {
        return url;
    }

    abstract public List<NewsItem> getTop5();

    abstract public List<NewsItem> getTop10();
}
