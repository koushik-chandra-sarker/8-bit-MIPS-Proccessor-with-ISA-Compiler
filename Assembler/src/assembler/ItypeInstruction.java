package assembler;

public class ItypeInstruction {

	String name;
	private String opcode="0000";
	private String rs;
	private String rt;
	private String constant;



	public void definingOpCode(String name) {
		if (name.equals("Lw")) {
			opcode = "0111";
		}
		if (name.equals("Sw")) {
			opcode = "1000";
		}
		if (name.equals("Addi")) {
			opcode = "1001";
		}
		if (name.equals("Beq")) {
			opcode = "1010";
		}

		if (name.equals("Bne")) {
			opcode = "1011";
		}

	}
	
	public String getOpcode(){
		return opcode;
	}
	public String getRs() {
		return rs;
	}
	public String getRt() {
		return rt;
	}
	public String getConstant() {
		return constant;
	}
	public void setRs(String rs) {
		this.rs = rs;
	}
	public void setRt(String rt) {
		this.rt = rt;
	}
	public void setConstant(String constant) {
		this.constant = constant;
	}
	
	
	
}
