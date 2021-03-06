package org.darkstorm.darkbot.mcspambot.commands;

import org.darkstorm.darkbot.mcspambot.MinecraftBotWrapper;
import org.darkstorm.darkbot.minecraftbot.util.Util;

public class CalcCommand extends AbstractCommand {

	public CalcCommand(MinecraftBotWrapper bot) {
		super(bot, "calc", "JavaScript interpreter", "<script>", ".*");
	}

	@Override
	public void execute(String[] args) {
		String text = Util.join(args, " ");
		bot.say(Util.eval(text).toString());
	}
}
