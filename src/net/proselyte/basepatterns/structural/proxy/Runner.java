package net.proselyte.basepatterns.structural.proxy;

public class Runner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.websitename..");

        project.run();
    }
}
