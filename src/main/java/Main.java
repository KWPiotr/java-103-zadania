import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt").get();
        System.out.println(doc.body().text());
    }
}
