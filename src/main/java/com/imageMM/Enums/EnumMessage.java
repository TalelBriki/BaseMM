package com.imageMM.Enums;


import java.util.HashMap;
import java.util.Map;

public enum EnumMessage {

	ERREUR_QUERY("Query failed",-3),
	SUCCESS_CREATION("objet créé avec succes",1),
	SUCCESS_UPDATE("successfully updated",2)
    

	;

	private static final Map<Integer, EnumMessage> BY_CODE = new HashMap<>();
	private static final Map<String, EnumMessage> BY_LABEL = new HashMap<>();

	static {
		for (EnumMessage e : values()) {
			BY_LABEL.put(e.label, e);
			BY_CODE.put(e.code, e);
		}
	}

	public final String label;
	public final Integer code;

	private EnumMessage(String label, Integer code) {
		this.label = label;
		this.code = code;
	}

	public static EnumMessage valueOfLabel(String label) {
		return BY_LABEL.get(label);
	}

	public static EnumMessage valueOfCode(Integer number) {
		return BY_CODE.get(number);
	}

}