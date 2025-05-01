package com.example.springboot;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class GetElementFromURL {
    public static String Get() {
        String url = "https://www.whitehouse.gov/";
        try {
            String html = URLReader.getHTML(url);
            Document doc = Jsoup.parse(html);

            // Example: Get all elements with class "myClass"
             Elements elements = doc.getElementsByClass("wp-block-whitehouse-header__administration");
             for (Element el : elements) {
                return el.text();
             }

        } catch (IOException e) {
            return e.getMessage();
        }
        return "failed to find element";
    }
}