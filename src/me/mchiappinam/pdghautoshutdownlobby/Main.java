package me.mchiappinam.pdghautoshutdownlobby;

import java.util.Calendar;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoShutdownLobby] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoShutdownLobby] §2Acesse: http://pdgh.net/");
	}
	
	@Override
    public void onEnable() {
		getServer().setWhitelist(false);
		
		//Fechar
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
					if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==06)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==00) {
			                getServer().dispatchCommand(getServer().getConsoleSender(), "save-all");
							getServer().setWhitelist(true);
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O LOBBY §c§lAGORA§6!");
							getServer().broadcastMessage(" ");
							for (Player p : getServer().getOnlinePlayers()) {
				                p.kickPlayer("§3§lCalma! Nao se suicide! Nao pegue a faca!\n§3§l--§6§lREINICIANDO O SERVIDOR§3§l--\n\n' '\nO");
					        }
							getServer().shutdown();
						}
					}
			}
		}, 0, 20*21);
		
		//Anuncio
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
					if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==05)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==58) {
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O LOBBY EM §c§l2 §6MINUTOS!");
							getServer().broadcastMessage(" ");
			}
					}
			}
		}, 0, 20*61);
		
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
					if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==05)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==59) {
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O LOBBY EM §c§l1 §6MINUTO!");
							getServer().broadcastMessage(" ");
			}
					}
			}
		}, 0, 20*61);
		getServer().setWhitelist(false);
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoShutdownLobby] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoShutdownLobby] §2Acesse: http://pdgh.net/");
	}
}
