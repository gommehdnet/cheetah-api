/*
 * Copyright 2022 IndieLemon GmbH & Co. KG
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */

package net.gommehd.cheetah.event.cache;

import net.gommehd.cheetah.cache.Textures;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

/**
 * Called when a texture request was made.
 * The implementation desides
 * 1) if this event is only called for skull textures
 *    or if the event is called on join when we get texture
 *    information from mojang (in this case we also have no
 *    corresponding {@link UUIDToTextureResolveEvent}
 * 2) if this event is called when the texture was manipulated via {@link UUIDToTextureResolveEvent}
 */
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

    /**
     * Depending on the cheetah version this has no effect
     * (at least 1.8 completely ignores it)
     */
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