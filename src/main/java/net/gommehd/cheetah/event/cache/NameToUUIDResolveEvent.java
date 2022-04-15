package net.gommehd.cheetah.event.cache;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

/**
 * Called when the minecraft server tries to resolve the profile of a player by name
 * Keep in mind that the implementation caches the profiles.
 * @author David (_Esel)
 */
public class NameToUUIDResolveEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final String name;
    private UUID uuid;

    public NameToUUIDResolveEvent(String name, UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    /**
     * @return null by default or the player uuid if a previous listener set it
     * via {@link NameToUUIDResolveEvent#setUuid(UUID)}
     */
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}