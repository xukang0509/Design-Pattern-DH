package com.shanhai._12_StatePattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/6 21:20
 */
public class Client {
    public static void main(String[] args) {
        Work emergencyProjects = new Work();

        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(15);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(17);

        //emergencyProjects.setWorkFinished(false);
        emergencyProjects.setWorkFinished(true);

        emergencyProjects.writeProgram();

        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(20);
        emergencyProjects.writeProgram();
    }
}
