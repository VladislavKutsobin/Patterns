package net.proselyte.basepatterns.behavioral.template;

import com.sun.org.apache.xpath.internal.SourceTree;

public class NewsPage extends WebSiteTemplate{
    @Override
    public void showContent() {
        System.out.println("News");
    }
}
