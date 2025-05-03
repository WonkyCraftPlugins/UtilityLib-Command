package com.wonkglorg.utilitylib.command.annotation;

public @interface Argument{
	/**
	 * @return the description of the argument
	 */
	String description() default "";
	
	/**
	 * @return the default value of the argument
	 */
	String defaultValue() default "";
	
	/**
	 * @return true if this argument is required, false if it is optional, this only works if it is not followed by any arguments
	 */
	boolean required() default true;
	
	/**
	 * @return the index this argument is at. must be a positive integer, if -1 is given it will be the first argument that is not already matched by another argument
	 */
	int index() default 0;
	
	/**
	 * @return the end range of the argument, -1 is given matches all remaining arguments (greedy)
	 */
	int length() default 1;
	
	
	/**
	 * @return the type of the argument, if not specified it will be determined by the type of the parameter
	 */
	String errorMessage() default "Invalid argument! Please check the command usage.";
}
