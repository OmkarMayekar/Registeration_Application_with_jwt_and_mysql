package com.snapshotprojects.Bingofy.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public enum ResponseFlag {

	REGISTRATION_SUCCESSFULL("User registered successfully"),
	REGISTRATION_UNSUCCESSFULL("User was not registered successfully"),USER_WITH_SAME_USERNAME_ALREADY_EXISTS("User with same username already exists"), USER_WITH_SAME_EMAIL_ALREADY_EXISTS("User with same e-mail already exists"),
	EXT_BAD_REQUEST("External error - Bad request"), INVALID_CREDS("Invalid_credentials"),USERS_GIVEN_ACCESS("Users are given access to ownser's list"),USERS_NOT_GIVEN_ACCESS("Users are given access to ownser's list"),
	EXT_TECH_ISSUE("External error - PIPL technical issue"), INTERNAL_ERROR("Internal error"), UNKNOWN("UNKNOWN");

	private String serviceResponseFlag;

	/*
	 * public static final Set<Object> SERVICE_ERROR_FLAG =
	 * Collections.unmodifiableSet(new HashSet<>( Arrays.asList(new
	 * ResponseFlag[]{EXT_BAD_REQUEST, EXT_CALLS_EXCEEDED, EXT_TECH_ISSUE,
	 * INTERNAL_ERROR})));
	 */

	ResponseFlag(String serviceResponseFlag) {
		this.serviceResponseFlag = serviceResponseFlag;
	}

	public String getserviceResponseFlag() {
		return this.serviceResponseFlag;
	}

	public static ResponseFlag getserviceResponseFlagByFlag(String flag) {
		if (null == flag) {
			return UNKNOWN;
		}
		return Arrays.stream(ResponseFlag.values())
				.filter(ddf -> ddf.getserviceResponseFlag().equalsIgnoreCase(flag.trim())).findFirst()
				.orElse(ResponseFlag.UNKNOWN);
	}
}
