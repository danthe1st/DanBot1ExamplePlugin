package io.github.danthe1st.danbot1.plugin.commands;

import io.github.danthe1st.danbot1.commands.BotCommand;
import io.github.danthe1st.danbot1.commands.Command;
import io.github.danthe1st.danbot1.commands.CommandType;
import io.github.danthe1st.danbot1.util.STATIC;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

@BotCommand(aliases = "hello")
public class HelloWorld implements Command {

	public void action(String[] args, MessageReceivedEvent event) {
		STATIC.msg(event.getTextChannel(), "Hello World");
	}

	@Override
	public String help(String s) {
		return "sends a Message with the content \"Hello World\"" +
				"*Syntax*: "+s+"hello";
	}

	public CommandType getCommandType() {
		return CommandType.USER;
	}
}
