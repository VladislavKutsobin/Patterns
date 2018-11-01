package net.proselyte.basepatterns.behavioral.template;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebSiteTemplate welcome = new WelcomePage();
        WebSiteTemplate news = new NewsPage();

        welcome.showPage();
        System.out.println("\n----------------------------------\n");
        news.showPage();
    }
}
