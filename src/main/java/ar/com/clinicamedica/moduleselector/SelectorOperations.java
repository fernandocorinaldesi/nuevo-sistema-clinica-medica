package ar.com.clinicamedica.moduleselector;

import ar.com.clinicamedica.controller.LoginOperationsController;

public interface SelectorOperations {
	public void selectRecepcionistMain();
	public void selectMedicMain();
	public void selectAdminMain();
	public void sendLogOut(LoginOperationsController loginController);
	

}
