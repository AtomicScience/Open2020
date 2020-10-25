package ru.teChain.bugseek.daomodels;

import org.springframework.stereotype.Component;
import ru.teChain.bugseek.models.BugReport;

import java.util.ArrayList;
import java.util.List;

@Component
public class BugReportDao {
    private static int BugReportsCount;
    private List<BugReport> BugReports;

    {
        BugReports = new ArrayList<>();

        /*BugReports.add(new BugReport(++BugReportsCount, "Tom"));
        BugReports.add(new BugReport(++BugReportsCount, "Bob"));
        BugReports.add(new BugReport(++BugReportsCount, "Mike"));
        BugReports.add(new BugReport(++BugReportsCount, "Katy"));*/
    }
    public List<BugReport> index() {
        return BugReports;
    }

    public BugReport show(int id) {
        return BugReports.stream().filter(BugReport -> BugReport.getId() == id).findAny().orElse(null);

    }
}
