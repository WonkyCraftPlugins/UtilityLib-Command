package com.wonkglorg.utilitylib.command.annotation;

import java.time.temporal.ChronoUnit;

public @interface Cooldown{
	/**
	 * @return the cooldown time
	 */
	long cooldown() default 0;
	
	/**
	 * @return the time unit of the cooldown
	 */
	ChronoUnit timeUnit() default ChronoUnit.SECONDS;
	
	/**
	 * @return any permission that will bypass the cooldown
	 */
	String[] permissionBypass() default {};
	
}
