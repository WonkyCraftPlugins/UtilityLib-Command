package com.wonkglorg.utilitylib.command.annotation;

public @interface Command{
	String name();
	
	String[] aliases() default {};
	
	String description() default "";
	
	String usage() default "Usage : /<command>";
	
	String permission() default "";
	
	String permissionMessage() default "You do not have permission to use this command!";
}
