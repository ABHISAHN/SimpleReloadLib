/*
 * This file is a part of project QuickShop, the name is ReloadStatus.java
 *  Copyright (C) PotatoCraft Studio and contributors
 *
 *  This program is free software: you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.ghostchu.simplereloadlib;

/**
 * The reloading status.
 */
public enum ReloadStatus {
    /**
     * Reload successes
     */
    SUCCESS,
    /**
     * The object that registered now no reference and has been GC by Java.
     */
    OUTDATED,
    /**
     * Reload require the application restart
     */
    REQUIRE_RESTART,
    /**
     * Reload has been scheduled, waiting next call to affect
     */
    SCHEDULED,
    /**
     * Oof, reloading exploded, wtf
     */
    EXCEPTION,

}
