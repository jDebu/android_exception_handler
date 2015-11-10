package com.emedinaa.appexception;

/**
 * Created by Glup on 9/11/15.
 */
import android.app.Application;
import android.content.Context;

import com.emedinaa.appexception.Report.ACRAReportSender;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;


import java.util.Objects;

import javax.xml.transform.Result;
@ReportsCrashes()
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ACRA.init(this);

        // instantiate the report sender with the email credentials.
        // these will be used to send the crash report
        ACRAReportSender reportSender = new ACRAReportSender("glupmovil@gmail.com", "glupmovil123");

        // register it with ACRA.
        ACRA.getErrorReporter().setReportSender(reportSender);
    }
}