package gsls.system.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import gsls.api.mc.ItemsAPI;
import gsls.system.Main;

public class Navigator implements Listener{
	
	File warp = new File("plugins/GSLS/warps.yml");
	
	public static void setNavi(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3*9, "�aGames�cSelector");
		inv.setItem(0, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(1, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(2, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(3, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(4, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(5, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(6, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(7, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(8, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(9, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(10, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(12, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(14, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(16, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(17, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(18, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(19, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(20, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(21, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(22, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(23, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(24, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(25, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		inv.setItem(26, ItemsAPI.defItem(Material.STAINED_GLASS_PANE, 1, 15, ""));
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
			public void run() {
				inv.setItem(11, ItemsAPI.defItem(Material.BED, 1, 0, "�cBed�fWars"));
				inv.setItem(13, ItemsAPI.defItem(Material.PURPUR_BLOCK, 1, 0, "�9Master�bBuilders"));
				inv.setItem(15, ItemsAPI.defItem(Material.WOOD_SWORD, 1, 0, "�aGunGames"));
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 10, 1);
			}
		}, 5);
		p.openInventory(inv);
		p.updateInventory();
	}
	
	@EventHandler
	public void onClickInv(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
		if(e.getInventory().getName().equals("�aGames�cSelector")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) {
				e.setCancelled(true);
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("�cBed�fWars")){
				e.setCancelled(true);
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("�9Master�bBuilders")){
				e.setCancelled(true);
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("�aGunGames")){
				e.setCancelled(true);
			}else {
				e.setCancelled(false);
			}
		}
	}

}