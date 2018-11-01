package net.proselyte.basepatterns.behavioral.Observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> positions);
}
