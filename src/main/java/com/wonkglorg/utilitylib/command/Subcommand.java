package com.wonkglorg.utilitylib.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class Subcommand extends Arguments implements TabExecutor{
	
	private final int index;
	
	/**
	 * Instantiates a new Subcommand.
	 * @param index The index of the argument in the command
	 */
	protected Subcommand(int index) {
		this.index = index;
	}
	
	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
		if(args.length <= index){
			return false;
		}
		setArgs(args);
		return execute(sender, command, label, args);
	}
	
	@Override
	public @Nullable List<String> onTabComplete(@NotNull CommandSender sender,
												@NotNull Command command,
												@NotNull String label,
												@NotNull String[] args) {
		if(args.length <= index){
			return List.of();
		}
		setArgs(args);
		return tabComplete((Player) sender, command, label, args);
	}
	
	/**
	 * When executing the command, this method is called to perform the action.
	 * @param sender The sender of the command
	 * @param command The command being executed
	 * @param label The label of the command
	 * @param args The arguments passed to the command
	 * @return True if the command was executed successfully, false otherwise
	 */
	protected abstract boolean execute(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args);
	
	/**
	 * When tab completing, this method is called to get the list of possible completions.
	 * @param player The sender of the command
	 * @param command The command being executed
	 * @param label The label of the command
	 * @param args The arguments passed to the command
	 * @return A list of possible completions
	 */
	protected abstract List<String> tabComplete(@NotNull Player player, @NotNull Command command, @NotNull String label, @NotNull String[] args);
	
	public int getIndex() {
		return index;
	}
	
}