/*
 * Copyright 2010, 2011, 2012, 2013 mapsforge.org
 * Copyright 2014 Ludwig M Brinckmann
 * Copyright 2016 devemux86
 * Copyright 2018 iPSAlex
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.mapsforge.map.layer.download.tilesource;

import org.mapsforge.core.model.Tile;

import java.net.MalformedURLException;
import java.net.URL;

public interface TileSource {
    /**
     * @return the Authorization (may be null).
     */
    String getAuthorization();

    /**
     * Returns the default time-to-live (TTL) for cached tiles.
     */
    long getDefaultTimeToLive();

    /**
     * @return the maximum number of parallel requests which this {@code TileSource} supports.
     */
    int getParallelRequestsLimit();

    /**
     * @return the HTTP referer (may be null).
     */
    String getReferer();

    /**
     * @return the download URL for the given {@code Tile}.
     */
    URL getTileUrl(Tile tile) throws MalformedURLException;

    /**
     * @return the connect timeout value in milliseconds.
     */
    int getTimeoutConnect();

    /**
     * @return the read timeout value in milliseconds.
     */
    int getTimeoutRead();

    /**
     * @return the HTTP user agent (may be null).
     */
    String getUserAgent();

    /**
     * @return the maximum zoom level which this {@code TileSource} supports.
     */
    byte getZoomLevelMax();

    /**
     * @return the minimum zoom level which this {@code TileSource} supports.
     */
    byte getZoomLevelMin();

    /**
     * @return the if the {@code TileSource} supports transparent images.
     */
    boolean hasAlpha();

    /**
     * @return whether or not to follow HTTP redirects.
     */
    boolean isFollowRedirects();
}
