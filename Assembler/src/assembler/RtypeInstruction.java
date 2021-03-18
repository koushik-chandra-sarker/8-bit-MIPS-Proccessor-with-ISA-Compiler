package assembler;

public class RtypeInstruction {

    String name;
    String opcode = "0000";
    String rs;
    String rt;
    String rd;
    String shamt;
    int shift;

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setShamt(int shift) {
        String binaryValue = Integer.toBinaryString(shift);
        if (shift < 2)
            binaryValue = "0" + binaryValue;

        shamt = binaryValue;


    }

    public RtypeInstruction(String name) {
        this.name = name;
//        this.shift = shift;
        //definingFunctAndShamt(shift);
    }


    public void definingOpCodeAndShamt(int shift) {
        if (name.equals("Add")) {
            opcode = "0000";
            setShamt(0);

        }
        if (name.equals("Sub")) {
            opcode = "0001";
            setShamt(0);
        }
        if (name.equals("Sll")) {
            opcode = "0010";
            setShamt(shift);

        }
        if (name.equals("Srl")) {
            opcode = "0011";
            setShamt(shift);
        }

        if (name.equals("And")) {
            opcode = "0100";
            setShamt(0);
        }
        if (name.equals("Or")) {
            opcode = "0101";
            setShamt(0);
        }
        if (name.equals("Xor")) {
            opcode = "0110";
            setShamt(0);
        }


    }

    public String getOpcode() {
        return opcode;
    }

    public String getRs() {
        return rs;
    }

    public String getRt() {
        return rt;
    }

    public String getRd() {
        return rd;
    }

    public String getShamt() {
        return shamt;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShamt(String shamt) {
        this.shamt = shamt;
    }


}

	
	
	
	
	
	
