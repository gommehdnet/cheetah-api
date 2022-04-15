package net.gommehd.cheetah.event.cache;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

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