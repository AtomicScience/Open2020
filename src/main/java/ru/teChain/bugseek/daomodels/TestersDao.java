package ru.teChain.bugseek.daomodels;


import org.springframework.stereotype.Component;
import ru.teChain.bugseek.models.Tester;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestersDao {
    private static int TestersCount;
    private List<Tester> Testers;
    {
        Testers = new ArrayList<>();

        /*BugReports.add(new BugReport(++BugReportsCount, "Tom"));
        BugReports.add(new BugReport(++BugReportsCount, "Bob"));
        BugReports.add(new BugReport(++BugReportsCount, "Mike"));
        BugReports.add(new BugReport(++BugReportsCount, "Katy"));*/
    }
    public List<Tester> index() {
        return Testers;
    }

    public Tester show(int id) {
        return Testers.stream().filter(Tester -> Tester.getId() == id).findAny().orElse(null);

    }
}
