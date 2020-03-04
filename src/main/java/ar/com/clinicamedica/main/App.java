package ar.com.clinicamedica.main;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import ar.com.clinicamedica.controller.LoginController;
import ar.com.clinicamedica.moduleselector.Selector;
import ar.com.clinicamedica.swingloginview.LoginView;
import ar.com.clinicamedica.validations.LoginValidation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
		}
		EventQueue.invokeLater(() -> {
			new LoginController(new LoginView(),new Selector(),new LoginValidation()).startView();
			;
		});
    }
}
