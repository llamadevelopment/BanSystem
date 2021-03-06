package net.llamadevelopment.bansystem.components.event;

import cn.nukkit.event.Event;
import cn.nukkit.event.HandlerList;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EditBanReasonEvent extends Event {

    private final String player;
    private final String reason;
    private final String executor;
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

}
