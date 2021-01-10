package com.micron.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-05 09:42:54
 * @remarks 有一個學校，轄下有多個學院和總部，現要求打印出總部員工ID和各學院員工ID
 */
// 客戶端
public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("~~~使用迪米特法則~~~");
        CollegeManager collegeManager = new CollegeManager();
        UniversityManager universityManager = new UniversityManager();
        universityManager.printAllEmployee(collegeManager);
    }
}

// 學校總部員工類
class UniversityEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}

// 學院員工類
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}

// 學校總部員工的管理類
// UniversityManager的直接朋友: UniversityEmployee、CollegeManager
// CollegeEmployee不是直接朋友，而是一個陌生類(因為是存在於printAllEmployee()的局部變量)，違背了迪米特法則
class UniversityManager {
    // 返回學院的所有員工
    public List<UniversityEmployee> getAllEmployee() {
        ArrayList<UniversityEmployee> universityEmployees = new ArrayList<UniversityEmployee>();
        // 這裡我們新增5個學院員工到employees
        for (int i = 0; i < 5; i++) {
            UniversityEmployee universityEmployee = new UniversityEmployee();
            universityEmployee.setId("學校總部員工id = " + new Integer(i).toString());
            universityEmployees.add(universityEmployee);
        }
        return universityEmployees;
    }

    // 該方法完成輸出學校總部員工ID與學院員工ID
    void printAllEmployee(CollegeManager collegeManager) {
        // 將輸出學院員工的方法，封裝到CollegeManger中
        collegeManager.printAllEmployee();

        // 輸出總部員工
        List<UniversityEmployee> universityEmployees = this.getAllEmployee();
        System.out.println("-----學校總部員工-----");
        for (UniversityEmployee ue : universityEmployees) {
            System.out.println(ue.getId());
        }
    }
}

// 管理學院員工的管理類
class CollegeManager {
    // 返回學院的所有員工
    public List<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> collegeEmployees = new ArrayList<CollegeEmployee>();
        // 這裡我們新增10個學院員工到collegeEmployees
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("學院員工id = " + new Integer(i).toString());
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }

    // 將輸出學院員工的方法，封裝到CollegeManger中
    public void printAllEmployee() {
        List<CollegeEmployee> collegeEmployees = getAllEmployee();
        System.out.println("-----學院員工-----");
        for (CollegeEmployee ce : collegeEmployees) {
            System.out.println(ce.getId());
        }
    }
}

