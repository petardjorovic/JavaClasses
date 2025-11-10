package factorypatern2;

import java.util.ArrayList;
import java.util.List;

public class RssNewsReader extends NewsReader {

    public RssNewsReader(String url) {
        super(url);
    }

    @Override
    public List<NewsItem> getTop5() {
        ArrayList<NewsItem> items = new ArrayList<>();
        items.add(new NewsItem("Vest 1 RSS", "http://vest-xml.com/vest-1.rss", "...", "Ove je neka vest 1", "2025-05-18 10.:25:00"));
        items.add(new NewsItem("Vest 2 RSS", "http://vest-xml.com/vest-2.rss", "...", "Ove je neka vest 2", "2025-05-18 10.:26:00"));
        items.add(new NewsItem("Vest 3 RSS", "http://vest-xml.com/vest-3.rss", "...", "Ove je neka vest 3", "2025-05-18 10.:27:00"));
        items.add(new NewsItem("Vest 4 RSS", "http://vest-xml.com/vest-4.rss", "...", "Ove je neka vest 4", "2025-05-18 10.:28:00"));
        items.add(new NewsItem("Vest 5 RSS", "http://vest-xml.com/vest-5.rss", "...", "Ove je neka vest 5", "2025-05-18 10.:29:00"));
        return items;
    }

    @Override
    public List<NewsItem> getTop10() {
        return new ArrayList<>();
    }

}
