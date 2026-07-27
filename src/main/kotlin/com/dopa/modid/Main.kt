package com.dopa.modid

import com.hypixel.hytale.logger.HytaleLogger
import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit
import java.util.logging.Level

class Main(init: JavaPluginInit) : JavaPlugin(init) {
    companion object {
        val LOGGER: HytaleLogger = HytaleLogger.forEnclosingClass()
    }

    override fun start() {
        LOGGER.at(Level.INFO).log("Starting DOPA!")
    }

    override fun setup() {
        LOGGER.at(Level.INFO).log("Setting up DOPA!")
    }

    override fun shutdown() {
        LOGGER.at(Level.INFO).log("Shutting down DOPA!")
    }
}
