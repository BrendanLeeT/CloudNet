/*
 * Copyright (c) Tarek Hosni El Alaoui 2017
 */

package de.dytanic.cloudnetcore.api.event.server;

import de.dytanic.cloudnet.event.async.AsyncEvent;
import de.dytanic.cloudnet.event.async.AsyncPosterAdapter;
import de.dytanic.cloudnetcore.network.components.ProxyServer;
import lombok.Getter;

/**
 * Calls if a proxy server was removed from the network and whitelist
 */
@Getter
public class ProxyRemoveEvent extends AsyncEvent<ProxyRemoveEvent> {

    private ProxyServer proxyServer;

    public ProxyRemoveEvent(ProxyServer proxyServer)
    {
        super(new AsyncPosterAdapter<>());
        this.proxyServer = proxyServer;
    }
}