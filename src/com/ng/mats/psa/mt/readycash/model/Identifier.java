package com.ng.mats.psa.mt.readycash.model;

public class Identifier {
	private final String identifier;

	public Identifier(String identifier) {
		this.identifier = identifier;
	}

	public Identifier() {
		this(java.util.UUID.randomUUID().toString());
	}

	public String toString() {
		return identifier;
	}

}
