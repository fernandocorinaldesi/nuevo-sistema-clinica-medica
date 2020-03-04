package ar.com.clinicamedica.controller;

import ar.com.clinicamedica.moduleselector.SelectorOperations;
import ar.com.clinicamedica.swingloginview.LoginViewOperations;
import ar.com.clinicamedica.validations.LoginValidation;

public class LoginController implements LoginOperationsController {
	
	private LoginViewOperations login;
	private SelectorOperations selector;
	private LoginValidation loginVal;

	public LoginController(LoginViewOperations login,SelectorOperations selector,LoginValidation loginVal) {
		this.loginVal=loginVal;
		this.selector=selector;
		this.login = login;
		this.login.setController(this);
		this.selector.sendLogOut(this);
	}

	public void startView() {
		// TODO Auto-generated method stub
		login.startView();
	}
	public void sendLogOut() {
		
	}

	@Override
	public void checkCredentials(String user, String pass) {
          
        if(loginVal.adminVal(user, pass)){
        	selector.selectAdminMain();
        	login.close();
        }
        else if(loginVal.recepVal(user, pass)) {
        	selector.selectRecepcionistMain();
        	login.close();
        }
        else if(loginVal.medVal(user, pass)) {
        	selector.selectMedicMain();
        	login.close();
        }
        else {
        	login.showError("login incorrecto");
        }
        	
	}

	

	

}
