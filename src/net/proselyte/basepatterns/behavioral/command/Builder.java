package net.proselyte.basepatterns.behavioral.command;

public class Builder {
    public void buyMaterials() {
        System.out.println("Builder is buying construction materials..");
    }

    public void useMaterials() {
        System.out.println("Builder is using construction materials..");
    }

    public void trashMaterials() {
        System.out.println("Builder is throwing out the trash");
    }
}
