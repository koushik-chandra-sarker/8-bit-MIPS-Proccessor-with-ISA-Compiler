package assembler;

public class JtypeInstruction {
	private String opcode="1100";
	private String rt;

	
	public String getOpcode(){
		return opcode;
	}
	public String getRt() {
		return rt;
	}
	public void setRt(String rt) {
		while (rt.length()<8){
			rt = "0"+rt;
		}
		this.rt = rt;
	}


}
