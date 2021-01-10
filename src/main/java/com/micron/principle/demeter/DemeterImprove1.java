package com.micron.principle.demeter;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-05 16:07:16
 * @remarks TODO
 */
public class DemeterImprove1 {
    public static void main(String[] args) {
        CollegeManager collegeManager = new CollegeManager();
        UniversityManager universityManager = new UniversityManager();
        universityManager.printAllEmployee(collegeManager);
    }
}
