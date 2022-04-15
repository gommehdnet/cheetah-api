package org.bukkit.event.player;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * This event is similar to papers PlayerStartSpectatingEntityEvent and PlayerStopSpectatingEntityEvent
 * @author David (_Esel)
 */
public class PlayerSpectateEntityEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private boolean cancelled;
    private Entity entity;

    public PlayerSpectateEntityEvent(Player player, Entity entity) {
        super(player);
        this.entity = entity;
    }

    /**
     * @return the entity that the player will spectate
     * or null if the player stops spectating
     */
    public Entity getEntity() {
        return this.entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
