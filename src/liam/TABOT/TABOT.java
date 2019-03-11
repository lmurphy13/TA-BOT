package liam.TABOT;

import javax.security.auth.login.LoginException;

import liam.TABOT.Commands.Clear;
import liam.TABOT.Commands.Commands;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class TABOT {
	public static JDA jda;
	public static String prefix = "/";
	
	public static void main(String[] args) throws LoginException {
		jda = new JDABuilder(AccountType.BOT).setToken("NTU0NTM3ODM4MjA1NTk5Nzg0.D2eFoA.7viSDmxwLryqYHUmX6lkV3DR2CE").buildAsync();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setGame(Game.watching("OS students cry"));
		
		jda.addEventListener(new Commands());
		jda.addEventListener(new Clear());
		
	}
	
}
