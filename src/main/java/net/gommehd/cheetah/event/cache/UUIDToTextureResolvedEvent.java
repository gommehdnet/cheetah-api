package net.gommehd.cheetah.event.cache;

import net.gommehd.cheetah.cache.Textures;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class UUIDToTextureResolvedEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final UUID uuid;
    private Textures textures;

    public UUIDToTextureResolvedEvent(UUID uuid, Textures textures) {
        this.uuid = uuid;
        this.textures = textures;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Textures getTextures() {
        return textures;
    }

    public void setTextures(Textures textures) {
        this.textures = textures;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}