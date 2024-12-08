

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.AttendanceData;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class AttendanceProcessor {

    public static List<AttendanceData> processAttendanceFile(String filePath) throws IOException {
        List<AttendanceData> attendanceList = new ArrayList<>();
        Map<String, AttendanceData> attendanceMap = new HashMap<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (String line : lines) {
            String[] parts = line.split(" ");

            if (parts.length == 3) {
                String attendanceId = parts[0];
                String dateWork = parts[1];
                String time = parts[2];

                AttendanceData attendanceData = attendanceMap.getOrDefault(attendanceId, new AttendanceData(attendanceId));
                attendanceData.addData(dateWork, time);

                attendanceMap.put(attendanceId, attendanceData);
            }
        }

        attendanceList.addAll(attendanceMap.values());
        return attendanceList;
    }

    public static void main(String[] args) {
        try {
            List<AttendanceData> attendanceList = processAttendanceFile("C:/Users/LENOVO/Desktop/data.txt");
            for (AttendanceData ad : attendanceList) {
                System.out.println(ad);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
