/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.DoctorManagement;
import Model.Doctor;

/**
 *
 * @author fpt
 */
public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        
        new DoctorManagement(doctor).run();
    }
    
}
