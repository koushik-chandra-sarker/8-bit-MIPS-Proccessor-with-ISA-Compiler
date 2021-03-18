package assembler;

import java.util.ArrayList;
import java.util.Arrays;

public  class InstructionList {

	private static InstructionList instructionlist;
	private ArrayList<String> RtypeInstruction;
	private ArrayList<String> ItypeInstruction;
	private ArrayList<String> JtypeInstruction;
	

	public InstructionList(){
		RtypeInstruction=new ArrayList<String>();
		ItypeInstruction=new ArrayList<String>();
		JtypeInstruction=new ArrayList<String>();
		InstructionSet();
		
		
	}
	 public ArrayList<String> getRtypeInstruction() {
		return RtypeInstruction;
	}
	public ArrayList<String> getItypeInstruction() {
		return ItypeInstruction;
	}
	public ArrayList<String> getJtypeInstruction() {
		return JtypeInstruction;
	}
	
	public static synchronized InstructionList getInstructionList() {
	        if (instructionlist == null) {
	            instructionlist = new InstructionList();
	            
	        }
	        return instructionlist;
	}
	 
	public void InstructionSet(){
		//predefined Rtype instrution//
		
		RtypeInstruction.add("Add");
		RtypeInstruction.add("Sub");
		RtypeInstruction.add("Sll");
		RtypeInstruction.add("Srl");
		RtypeInstruction.add("Or");
		RtypeInstruction.add("And");
		RtypeInstruction.add("Xor");
		//predefined Itype instrcution
		ItypeInstruction.add("Lw");
		ItypeInstruction.add("Sw");
		ItypeInstruction.add("Addi");
		ItypeInstruction.add("Beq");
		ItypeInstruction.add("Bne");
		//Jump instruction;
		JtypeInstruction.add("Jump");
	}
	
}
