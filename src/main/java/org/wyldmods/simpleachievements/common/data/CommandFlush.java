package org.wyldmods.simpleachievements.common.data;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;

public class CommandFlush extends CommandBase
{
	@Override
	public String getCommandName()
	{
		return "flushAchievements";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
		return "/flushAchievements - Clears all cached achievement data";
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring)
	{
		DataManager.INSTANCE.flush();
	}

	@Override
	public int compareTo(Object o)
	{
		if (o instanceof ICommand)
		{
			return this.compareTo((ICommand) o);
		}
		else
		{
			return 0;
		}
	}
}
