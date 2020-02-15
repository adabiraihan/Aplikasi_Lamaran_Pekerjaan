/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import LowonganPekerjaan.Database;
import Controller.ControllerMainMenu;
import LowonganPekerjaan.Aplikasi;

/**
 *
 * @author MODOFWAR
 */
public class Driver {

    public static void main(String[] args) {

        Aplikasi app = new Aplikasi();
        ControllerMainMenu cmm = new ControllerMainMenu(app);
    }

}
