package net.proselyte.basepatterns;

public class some {
    public static void main(String[] args) {
        Test test = new Test();
        test.setNumber((short) 2);
    }
}

class Test {
    short number;
    public void setNumber(short number) {
        this.number =  number;
    }
}
