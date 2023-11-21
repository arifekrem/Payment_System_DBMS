package src.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DatabaseOperations {

    private static void executeShellScript(String scriptPath) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", scriptPath);

        try {
            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void createTables() {
        executeShellScript("shell_scripts/create_tables.sh");
    }

    public static void dropTables() {
        executeShellScript("shell_scripts/drop_tables.sh");
    }

    public static void populateTables() {
        executeShellScript("shell_scripts/populate_tables.sh");
    }

    public static void queryTables() {
        executeShellScript("shell_scripts/query_tables.sh");
    }
}
