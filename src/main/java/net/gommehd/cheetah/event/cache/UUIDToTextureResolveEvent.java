package net.gommehd.cheetah.event.cache;

import net.gommehd.cheetah.cache.Textures;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

/**
 * Called when the minecraft server tries to resolve the textures of a player
 * because it is NOT already cached. The constraint of the cache are left over to the implementation.
 * Depending on the cheetah implementation this event is only called for skull heads.
 * The purpose of this event is it to give the minecraft server the texture,
 * so it does not have to make an expensive api request to mojang
 * @author David (_Esel)
 */
public class UUIDToTextureResolveEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final UUID uuid;
    private Textures textures;

    public UUIDToTextureResolveEvent(UUID uuid, Textures textures) {
        this.uuid = uuid;
        this.textures = textures;
    }

    /**
     * @return unique id of the player
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * @return null by default or the texture if a previous listener set it
     * via {@link UUIDToTextureResolvedEvent#setTextures(Textures)}
     */
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