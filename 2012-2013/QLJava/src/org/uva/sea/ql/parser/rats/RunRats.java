package org.uva.sea.ql.parser.rats;

import xtc.parser.Rats;

public class RunRats {
	public static final String SRC_ROOT = "src";
	public static final String PACKAGE_DIR = "org/uva/sea/ql/parser/rats";
	public static final String GRAMMAR = SRC_ROOT + "/" + PACKAGE_DIR + "/QLParser.rats";
	public static final String OUTPUT_DIR = SRC_ROOT + "/" + PACKAGE_DIR;
	public static final String[] RATS_ARGS = { 
		"-in", SRC_ROOT, 
		"-out", OUTPUT_DIR,
		GRAMMAR};
	
	public static void main(String[] args) {
		Rats rats = new Rats();
		rats.run(RATS_ARGS);
	}

}
