package liam.TABOT.Commands;

import liam.TABOT.TABOT;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ProjectDueDate extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(TABOT.prefix + "project")) {
			event.getChannel().sendMessage("There are # of days until the project is due. Get working!").queue();
		}
	}
}
