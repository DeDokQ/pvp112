package part1.Singleton;

public class Client {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Первое обращение");
        ProgramLogger.getProgramLogger().addLogInfo("Второе обращение");
        ProgramLogger.getProgramLogger().addLogInfo("Третье обращение");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
