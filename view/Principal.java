package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		ProcessosController pcont = new ProcessosController();
		//pcont.os();
		
		String proc = "chrome.exe";
		pcont.callProcess(proc);
	}

}
