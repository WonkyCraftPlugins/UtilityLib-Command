package com.wonkglorg.utilitylib.command.annotation;

public @interface SubCommand{
	
	/**
	 * @return the name of the subcommand
	 */
	String name();
	
	/**
	 * @return the description of the subcommand
	 */
	String description() default "";
	
	/**
	 * @return the usage of the subcommand
	 */
	String usage() default "Usage : /<command> <subcommand>";
	
	/**
	 * @return the permission required to use the subcommand
	 */
	String permission() default "";
	
	/**
	 * @return the permission message to send if the player does not have permission
	 */
	String permissionMessage() default "You do not have permission to use this command!";
	
}
