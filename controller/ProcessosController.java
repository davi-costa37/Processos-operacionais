package controller;

public class ProcessosController {
	public ProcessosController() {
		super();
	}
	
	public void os() {
		String os = System.getProperty("os.name");
		String ver = System.getProperty("os.version");
		String arch = System.getProperty("os.arch");
		System.out.println(os+" - "+ ver + " - "+arch);
	}
	
	@SuppressWarnings("deprecation")
	public void callProcess(String proc) {
		try {
			Runtime.getRuntime().exec(proc);
		} catch (Exception e) {
			String msg = e.getMessage();
			if(msg.contains("740")) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c");
				buffer.append(" ");
				buffer.append(proc);
				try {
					Runtime.getRuntime().exec(buffer.toString());
				}catch(Exception e1) {
					System.err.println(e1.getMessage());
				}
			} else {
				System.err.println(msg);
			}
		}
		
	}
}
