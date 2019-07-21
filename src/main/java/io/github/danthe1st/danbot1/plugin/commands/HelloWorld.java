package io.github.danthe1st.danbot1.plugin.commands;

import static io.github.danthe1st.danbot1.util.LanguageController.translate;

import io.github.danthe1st.danbot1.commands.BotCommand;
import io.github.danthe1st.danbot1.commands.Command;
import io.github.danthe1st.danbot1.commands.CommandType;
import io.github.danthe1st.danbot1.util.STATIC;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

@BotCommand(aliases = "hello")
public class HelloWorld implements Command {

	public void action(String[] args, MessageReceivedEvent event) {
		STATIC.msg(event.getTextChannel(),translate(event.getGuild(),"Hello"));
	}

	@Override
	public String help() {
		return "HelloHelp";
	}

	public CommandType getCommandType() {
		return CommandType.USER;
	}
}
