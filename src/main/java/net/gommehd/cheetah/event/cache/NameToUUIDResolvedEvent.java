package net.gommehd.cheetah.event.cache;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class NameToUUIDResolvedEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final String name;
    private final UUID uuid;

    public NameToUUIDResolvedEvent(String name, UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}