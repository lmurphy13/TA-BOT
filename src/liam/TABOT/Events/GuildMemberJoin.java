package liam.TABOT.Events;

import java.util.Random;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class GuildMemberJoin extends ListenerAdapter {
	
	String[] messages = {
			"Never gonna give [member] up. Never gonna let [member] down!",
			"Hey [member]! Have you gotten TA-BOT results yet?",
			"Welcome [member]. Dennis is watching you.",
			"Welcome to the Debbie Fan Club, [member]!"
	};
	
	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		Random rand = new Random();
		int number = rand.nextInt(messages.length);
		
		EmbedBuilder join = new EmbedBuilder();
		join.setColor(0x66d8ff);
		join.setDescription(messages[number].replace("member", event.getMember().getAsMention()));
		
		event.getGuild().getDefaultChannel().sendMessage(join.build()).queue();
		
		// Add role
		event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRolesByName("Member", true)).complete();
		
	}
}

