package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AppiumServer {
    private final AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
    private AppiumDriverLocalService server;
    private int port=4723;
    private final String appiumLogsLoc = "appium-logs";
    private final String logFileName = "logs";

    public AppiumServer() {
        //this.port = Utilities.getAvailablePort();
        this.serviceBuilder.usingPort(port);
        this.server = AppiumDriverLocalService.buildService(serviceBuilder);
        this.server.start();
    }

    public void stop() {
        this.server.stop();
    }

    public AppiumDriverLocalService get(){
        return this.server;
    }

    /*public void redirectLog() {
        this.server.clearOutPutStreams();
        File directory = new File(Utilities.getProjectDirectory() + this.appiumLogsLoc);

        Utilities.makeDirIfItDoNotExist(directory);

        try {
            this.server.addOutPutStream(new FileOutputStream(Utilities.getProjectDirectory() + this.appiumLogsLoc + Utilities.generateFileName(logFileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }*/
}
