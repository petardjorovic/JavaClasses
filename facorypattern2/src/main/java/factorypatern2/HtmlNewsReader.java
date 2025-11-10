package factorypatern2;

import java.util.ArrayList;
import java.util.List;

public class HtmlNewsReader extends NewsReader {

    public HtmlNewsReader(String url) {
        super(url);
    }

    @Override
    public List<NewsItem> getTop5() {
        ArrayList<NewsItem> items = new ArrayList<>();
        items.add(new NewsItem("Vest 1 HTML", "http://vest-html.com/vest-1.html", "...", "Ove je neka vest 1", "2025-05-18 10.:25:00"));
        items.add(new NewsItem("Vest 2 HTML", "http://vest-html.com/vest-2.html", "...", "Ove je neka vest 2", "2025-05-18 10.:26:00"));
        items.add(new NewsItem("Vest 3 HTML", "http://vest-html.com/vest-3.html", "...", "Ove je neka vest 3", "2025-05-18 10.:27:00"));
        items.add(new NewsItem("Vest 4 HTML", "http://vest-html.com/vest-4.html", "...", "Ove je neka vest 4", "2025-05-18 10.:28:00"));
        items.add(new NewsItem("Vest 5 HTML", "http://vest-html.com/vest-5.html", "...", "Ove je neka vest 5", "2025-05-18 10.:29:00"));
        return items;
    }

    @Override
    public List<NewsItem> getTop10() {
        return new ArrayList<>(); 
    }

}
