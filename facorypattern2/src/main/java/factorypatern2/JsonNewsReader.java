package factorypatern2;

import java.util.ArrayList;
import java.util.List;

public class JsonNewsReader extends NewsReader {

    public JsonNewsReader(String url) {
        super(url);
    }

    @Override
    public List<NewsItem> getTop5() {
        ArrayList<NewsItem> items = new ArrayList<>();
        items.add(new NewsItem("Vest 1 JSON", "http://vest-json.com/vest-1", "...", "Ove je neka vest 1", "2025-05-18 10.:25:00"));
        items.add(new NewsItem("Vest 2 JSON", "http://vest-json.com/vest-2", "...", "Ove je neka vest 2", "2025-05-18 10.:26:00"));
        items.add(new NewsItem("Vest 3 JSON", "http://vest-json.com/vest-3", "...", "Ove je neka vest 3", "2025-05-18 10.:27:00"));
        items.add(new NewsItem("Vest 4 JSON", "http://vest-json.com/vest-4", "...", "Ove je neka vest 4", "2025-05-18 10.:28:00"));
        items.add(new NewsItem("Vest 5 JSON", "http://vest-json.com/vest-5", "...", "Ove je neka vest 5", "2025-05-18 10.:29:00"));
        return items;
    }

    @Override
    public List<NewsItem> getTop10() {
        return new ArrayList<>();
    }

}
