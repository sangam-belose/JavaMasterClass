package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressPatternMatcher {

	public boolean isValidIpAddress(String ipString) {
		  final String IP_ADDRESS_PATTERN =
			"^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

		final Pattern pattern = Pattern.compile(IP_ADDRESS_PATTERN);

		Matcher matcher =  pattern.matcher(ipString);
		return matcher.matches();
	}
}
