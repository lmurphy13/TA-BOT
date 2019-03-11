package liam.TABOT.Commands;

import liam.TABOT.TABOT;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(TABOT.prefix + "info")) {
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("💾  TA-BOT Information 💾");
			info.setDescription("TA-BOT info here!");
			//info.addField("Creator", "Liam Murphy", false);
			info.setColor(0xf45642);
			info.setFooter("Created by Bagpiper513 - Liam Murphy", event.getMember().getUser().getAvatarUrl());
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
		} 
	}
}
