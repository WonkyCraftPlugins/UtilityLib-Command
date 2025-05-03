package com.wonkglorg.utilitylib.command.annotation;

import java.time.temporal.ChronoUnit;

public @interface Confirmation{
	String message() default "Are you sure? Type the command again to confirm.";
	
	String cancelMessage() default "Cancelled.";
	
	boolean sendCancelMessage() default true;
	
	long expiresAfter() default 0;
	
	ChronoUnit timeUnit() default ChronoUnit.SECONDS;
	
	String[] permissionBypass() default {};
}
