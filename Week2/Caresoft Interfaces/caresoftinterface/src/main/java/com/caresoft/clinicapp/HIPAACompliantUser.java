package com.caresoft.clinicapp;

public interface HIPAACompliantUser {
	abstract boolean assignPin(int pin);
	abstract boolean accessAutherized(Integer confirmAuthID);
	
}
